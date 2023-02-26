import { ParserRuleContext } from 'antlr4ts';
import { StatementsContext } from './antlr/CypherParser';

export interface Position {
  line: number;
  character: number;
}

export function createPosition(line: number, character: number): Position {
  return {
    line: line,
    character: character,
  };
}

export enum CompletionItemKind {
  Text = 1,
  Method = 2,
  Function = 3,
  Constructor = 4,
  Field = 5,
  Variable = 6,
  Class = 7,
  Interface = 8,
  Module = 9,
  Property = 10,
  Unit = 11,
  Value = 12,
  Enum = 13,
  Keyword = 14,
  Snippet = 15,
  Color = 16,
  File = 17,
  Reference = 18,
  Folder = 19,
  EnumMember = 20,
  Constant = 21,
  Struct = 22,
  Event = 23,
  Operator = 24,
  TypeParameter = 25,
}

export interface CompletionItem {
  /**
   * The label of this completion item. By default
   * also the text that is inserted when selecting
   * this completion.
   */
  label: string;
  /**
   * The kind of this completion item. Based of the kind
   * an icon is chosen by the editor.
   */
  kind?: CompletionItemKind;
}

export interface ParameterInformation {
  /**
   * The label of this parameter information.
   *
   * Either a string or an inclusive start and exclusive end offsets within its containing
   * signature label. (see SignatureInformation.label). The offsets are based on a UTF-16
   * string representation as `Position` and `Range` does.
   *
   * *Note*: a label of type string should be a substring of its containing signature label.
   * Its intended use case is to highlight the parameter label part in the `SignatureInformation.label`.
   */
  label: string;
  /**
   * The human-readable doc-comment of this signature. Will be shown
   * in the UI but can be omitted.
   */
  documentation?: string;
}

export interface SignatureInformation {
  /**
   * The label of this signature. Will be shown in
   * the UI.
   */
  label: string;

  documentation?: string;
  /**
   * The parameters of this signature.
   */
  parameters?: ParameterInformation[];
  /**
   * The index of the active parameter.
   *
   * If provided, this is used in place of `SignatureHelp.activeParameter`.
   *
   * @since 3.16.0
   */
  activeParameter?: number;
}

export function createSignatureInformation(
  label: string,
  documentation?: string,
  ...parameters: ParameterInformation[]
): SignatureInformation {
  return {
    label: label,
    documentation: documentation,
    parameters: parameters,
  };
}

export function findStopNode(root: StatementsContext) {
  let children = root.children;
  let current: ParserRuleContext = root;

  while (children && children.length > 0) {
    let index = children.length - 1;
    let child = children[index];

    while (
      index > 0 &&
      (child === root.EOF() ||
        child.text === '' ||
        child.text.startsWith('<missing'))
    ) {
      index--;
      child = children[index];
    }
    current = child as ParserRuleContext;
    children = current.children;
  }

  return current;
}

export function findParent(
  leaf: ParserRuleContext | undefined,
  condition: (node: ParserRuleContext) => boolean,
) {
  let current: ParserRuleContext | undefined = leaf;

  while (current && !condition(current)) {
    current = current.parent;
  }

  return current;
}
