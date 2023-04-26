import { SignatureInformation } from 'vscode-languageserver-types';
import { DbInfo } from '../dbInfo';

export class MockDbInfo implements DbInfo {
  public procedureSignatures: Map<string, SignatureInformation>;
  public functionSignatures: Map<string, SignatureInformation>;
  public labels: string[];
  public relationshipTypes: string[];
  public properties: string[];

  constructor(
    labels: string[] = [],
    relationshipTypes: string[] = [],
    properties: string[] = [],
    procedureSignatures: Map<string, SignatureInformation> = new Map(),
    functionSignatures: Map<string, SignatureInformation> = new Map(),
  ) {
    this.labels = labels;
    this.relationshipTypes = relationshipTypes;
    this.properties = properties;
    this.procedureSignatures = procedureSignatures;
    this.functionSignatures = functionSignatures;
  }
}
