import {
  CompletionItem,
  CompletionItemKind,
  Position,
} from 'vscode-languageserver-types';

import {
  CharStreams,
  CommonTokenStream,
  ParserRuleContext,
  TerminalNode,
  Token,
} from 'antlr4';

import CypherLexer from './generated-parser/CypherLexer';

import CypherParser, {
  Expression2Context,
  LabelExpression4Context,
  LabelExpression4IsContext,
  NodePatternContext,
  ProcedureNameContext,
  RelationshipPatternContext,
  StatementsContext,
} from './generated-parser/CypherParser';

import { CodeCompletionCore } from 'antlr4-c3';
import { DbInfo } from './dbInfo';
import {
  findParent,
  findRightmostClause,
  findStopNode,
  getTokens,
} from './helpers';

export function positionIsParsableToken(lastToken: Token, position: Position) {
  const tokenLength = lastToken.text?.length ?? 0;
  return (
    lastToken.column + tokenLength === position.character &&
    lastToken.line - 1 === position.line
  );
}

function isLabel(p: ParserRuleContext) {
  return (
    p instanceof LabelExpression4Context ||
    p instanceof LabelExpression4IsContext
  );
}

export function autocomplete(
  textUntilPosition: string,
  position: Position,
  dbInfo: DbInfo,
): CompletionItem[] {
  const inputStream = CharStreams.fromString(textUntilPosition);

  const lexer = new CypherLexer(inputStream);
  const tokenStream = new CommonTokenStream(lexer);
  const wholeFileParser = new CypherParser(tokenStream);
  wholeFileParser.removeErrorListeners();
  const start = new Date().getTime();
  const tree = wholeFileParser.statements();
  console.log('Time passed first parse: ', new Date().getTime() - start);

  const tokens = getTokens(tokenStream);
  const lastToken = tokens[tokens.length - 2];

  if (!positionIsParsableToken(lastToken, position)) {
    return [];
  } else {
    const stopNode = findStopNode(tree);

    if (
      findParent(
        findParent(stopNode, isLabel),
        (p) => p instanceof NodePatternContext,
      )
    ) {
      return dbInfo.labels.map((t) => {
        return {
          label: t,
          kind: CompletionItemKind.TypeParameter,
        };
      });
    } else if (
      findParent(
        findParent(stopNode, isLabel),
        (p) => p instanceof RelationshipPatternContext,
      )
    ) {
      return dbInfo.relationshipTypes.map((t) => {
        return {
          label: t,
          kind: CompletionItemKind.TypeParameter,
        };
      });
    } else if (findParent(stopNode, (p) => p instanceof NodePatternContext)) {
      return [];
    } else {
      // Completes expressions that are prefixes of function names as function names
      const expr = findParent(stopNode, (p) => p instanceof Expression2Context);

      if (expr) {
        return Array.from(dbInfo.functionSignatures.keys())
          .filter((functionName) => {
            return functionName.startsWith(expr.getText());
          })
          .map((t) => {
            return {
              label: t,
              kind: CompletionItemKind.Function,
            };
          });
      } else if (
        findParent(stopNode, (p) => p instanceof ProcedureNameContext)
      ) {
        return Array.from(dbInfo.procedureSignatures.keys()).map((t) => {
          return {
            label: t,
            kind: CompletionItemKind.Function,
          };
        });
      } else {
        let autoCompletions: CompletionItem[] = [];
        // Minus EOF
        const lastStatement = tree.getChild(tree.getChildCount() - 2);
        if (lastStatement instanceof TerminalNode) {
          const keywordsStream = CharStreams.fromString(
            lastStatement.symbol.text,
          );
          const keywordsLexer = new CypherLexer(keywordsStream);
          const keywordsTokenStream = new CommonTokenStream(keywordsLexer);
          const lastStatementParser = new CypherParser(keywordsTokenStream);
          lastStatementParser.removeErrorListeners();

          const start = new Date().getTime();
          autoCompletions = completeKeywords(
            lastStatementParser,
            lastStatementParser.statements(),
            keywordsTokenStream,
          );
          const elapsed = new Date().getTime() - start;
          console.log('Time spent in terminal node auto-completion: ', elapsed);
        }
        const start = new Date().getTime();
        autoCompletions = autoCompletions.concat(
          completeKeywords(wholeFileParser, tree, tokenStream),
        );
        const elapsed = new Date().getTime() - start;
        console.log('Time spent in wholeFileParser auto-completion: ', elapsed);

        return autoCompletions;
      }
    }
  }
}

function completeKeywords(
  parser: CypherParser,
  root: StatementsContext,
  tokenStream: CommonTokenStream,
): CompletionItem[] {
  // If we are not completing a label of a procedure name,
  // we need to use the antlr completion
  const codeCompletion = new CodeCompletionCore(parser);

  // TODO Nacho Why did it have to be -2 here?
  // Is it because of the end of file?
  const caretIndex = tokenStream.tokens.length - 2;

  if (caretIndex >= 0) {
    // TODO Nacho Can this be extracted for more performance?
    const allPosibleTokens: Map<number | undefined, string> = new Map();

    parser.symbolicNames.forEach(function (value, key) {
      allPosibleTokens.set(key, value);
    });
    // We need this to ignore the list of tokens from:
    // * unescapedSymbolicNameString, because a lot of keywords are allowed there
    // * escapedSymbolicNameString, to avoid showing ESCAPED_SYMBOLIC_NAME
    //
    // That way we do not populate tokens that are coming from those rules and those
    // are collected as rule names instead
    codeCompletion.preferredRules = new Set<number>()
      .add(CypherParser.RULE_unescapedSymbolicNameString)
      .add(CypherParser.RULE_escapedSymbolicNameString);

    // TODO Nacho Exclude minus, plus, comma, arrow_left_head, lparen etc
    const rightMostClause = findRightmostClause(root);
    const autoCompleteCtx = rightMostClause ? rightMostClause : root;

    const candidates = codeCompletion.collectCandidates(
      caretIndex,
      autoCompleteCtx,
    );
    const tokens = candidates.tokens.entries();
    const tokenCandidates = Array.from(tokens).map((value) => {
      const [tokenNumber, followUpList] = value;
      return [tokenNumber]
        .concat(followUpList)
        .map((value) => allPosibleTokens.get(value))
        .join(' ');
    });

    const tokenCompletions: CompletionItem[] = tokenCandidates.map((t) => {
      return {
        label: t,
        kind: CompletionItemKind.Keyword,
      };
    });

    return tokenCompletions;
  } else {
    return [];
  }
}
