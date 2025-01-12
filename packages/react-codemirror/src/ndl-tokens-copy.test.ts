import { tokens } from '@neo4j-ndl/base';
import { tokens as tokensCopy } from './ndl-tokens-copy';

/*
 * Needle has some odd package configuration that made playwright stop working
 * so for now we inline a copy of the tokens we need. Use this test to make
 * sure the tokens are still up to date.
 */
test('copy of tokens is up to date', () => {
  expect(tokens).toEqual(tokensCopy);
});
