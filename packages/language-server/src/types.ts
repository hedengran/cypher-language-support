// These settings are defined in the package.json
export type Neo4jSettings = {
  trace: {
    server: 'off' | 'messages' | 'verbose';
  };
  connect?: boolean;
  password?: string;
  URL?: string;
  user?: string;
};
