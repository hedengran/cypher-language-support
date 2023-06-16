import { CharStreams, CommonTokenStream } from 'antlr4';

import CypherLexer from './generated-parser/CypherLexer';

import CypherParser from './generated-parser/CypherParser';

export function parseStringTime(input: string): number {
  const start = performance.now();
  const inputStream = CharStreams.fromString(input);
  const lexer = new CypherLexer(inputStream);
  const tokenStream = new CommonTokenStream(lexer);
  const parser = new CypherParser(tokenStream);
  // eslint-disable-next-line @typescript-eslint/no-unsafe-member-access
  //parser._interp.predictionMode = PredictionMode.LL;
  //parser.buildParseTrees = false;
  parser.removeErrorListeners();
  parser.statements();
  const end = performance.now();
  return end - start;
}
