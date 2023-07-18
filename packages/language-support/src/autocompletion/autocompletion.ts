import { CompletionItem, Position } from 'vscode-languageserver-types';

import { DbInfo } from '../dbInfo';
import { parserWrapper } from '../parserWrapper';
import {
  autoCompleteKeywords,
  autoCompleteStructurally,
  autoCompleteStructurallyAddingChar,
} from './helpers';

export function autocomplete(
  textUntilPosition: string,
  position: Position,
  dbInfo: DbInfo,
): CompletionItem[] {
  const parsingResult = parserWrapper.parse(textUntilPosition);
  // First try to complete using tree information:
  // whether we are in a node label, relationship type, function name, procedure name, etc
  let result = autoCompleteStructurally(parsingResult, position, dbInfo);

  /* For some queries, we need to add an extra character (namelly 'x') to 
      correctly parse the query. For example:

      MATCH (n:A|
    
    where :A gets correctly parsed as label, but | yields an error token
    :A|x on the contrary gets correctly parsed as label
  */
  result = result.concat(
    autoCompleteStructurallyAddingChar(textUntilPosition, position, dbInfo),
  );

  // Do normal keywords auto-completion
  result = result.concat(autoCompleteKeywords(parsingResult));

  result = result.filter((x) => x !== undefined);
  return result;
}
