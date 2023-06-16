import { Diagnostic } from 'vscode-languageserver-types';

import { parserCache } from '../parserCache';

export function validateSyntax(wholeFileText: string): Diagnostic[] {
  return parserCache.parse(wholeFileText).diagnostics;
}
