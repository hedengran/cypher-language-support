import { SignatureInformation } from './helpers';

export interface DbInfo {
  // TODO Nacho Should this be getters?
  procedureSignatures: Map<string, SignatureInformation>;
  functionSignatures: Map<string, SignatureInformation>;
  labels: string[];
  relationshipTypes: string[];
}
