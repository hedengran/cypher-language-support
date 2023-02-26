// Generated from /Users/ncordon/neo4j/intellisense/vscode-extension/server/src/antlr/CypherParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SINGLE_LINE_COMMENT=2, DECIMAL_DOUBLE=3, UNSIGNED_DECIMAL_INTEGER=4, 
		UNSIGNED_HEX_INTEGER=5, UNSIGNED_OCTAL_INTEGER=6, ACCESS=7, ACTIVE=8, 
		ADMIN=9, ADMINISTRATOR=10, ALIAS=11, ALIASES=12, ALL_SHORTEST_PATH=13, 
		ALL=14, ALTER=15, AND=16, ANY=17, AS=18, ASC=19, ASSERT=20, ASSIGN=21, 
		AT=22, BAR=23, BOOSTED=24, BREAK=25, BRIEF=26, BTREE=27, BUILT=28, BY=29, 
		CALL=30, CASE=31, CHANGE=32, COLON=33, COMMA=34, COMMAND=35, COMMANDS=36, 
		COMMIT=37, COMPOSITE=38, CONSTRAINT=39, CONSTRAINTS=40, CONTAINS=41, COPY=42, 
		CONTINUE=43, COUNT=44, CREATE=45, CSV=46, CURRENT=47, DATA=48, DATABASE=49, 
		DATABASES=50, DBMS=51, DEALLOCATE=52, DEFAULT_TOKEN=53, DEFINED=54, DELETE=55, 
		DENY=56, DESC=57, DESTROY=58, DETACH=59, DOLLAR=60, DISTINCT=61, DIVIDE=62, 
		DOT=63, DOTDOT=64, DRIVER=65, DROP=66, DRYRUN=67, DUMP=68, EACH=69, ENABLE=70, 
		ELEMENT=71, ELEMENTS=72, ELSE=73, ENCRYPTED=74, END=75, ENDS=76, EQ=77, 
		EXECUTABLE=78, EXECUTE=79, EXIST=80, EXISTENCE=81, EXISTS=82, ERROR=83, 
		FAIL=84, FALSE=85, FIELDTERMINATOR=86, FOR=87, FOREACH=88, FROM=89, FULLTEXT=90, 
		FUNCTION=91, FUNCTIONS=92, GE=93, GRANT=94, GRAPH=95, GRAPHS=96, GT=97, 
		HEADERS=98, HOME=99, IF=100, IMPERSONATE=101, IMMUTABLE=102, IN=103, INDEX=104, 
		INDEXES=105, INF=106, INFINITY=107, IS=108, JOIN=109, KEY=110, LABEL=111, 
		LABELS=112, AMPERSAND=113, EXCLAMATION_MARK=114, LBRACKET=115, LCURLY=116, 
		LE=117, LIMITROWS=118, LOAD=119, LOOKUP=120, LPAREN=121, LT=122, MANAGEMENT=123, 
		MATCH=124, MERGE=125, MINUS=126, PERCENT=127, NEQ=128, NEQ2=129, NAME=130, 
		NAMES=131, NAN=132, NEW=133, NODE=134, NODES=135, NONE=136, NOT=137, NOWAIT=138, 
		NULL=139, OF=140, ON=141, ONLY=142, OPTIONAL=143, OPTIONS=144, OPTION=145, 
		OR=146, ORDER=147, OUTPUT=148, PASSWORD=149, PASSWORDS=150, PERIODIC=151, 
		PLAINTEXT=152, PLUS=153, PLUSEQUAL=154, POINT=155, POPULATED=156, POW=157, 
		PRIMARY=158, PRIMARIES=159, PRIVILEGE=160, PRIVILEGES=161, PROCEDURE=162, 
		PROCEDURES=163, PROPERTIES=164, PROPERTY=165, QUESTION=166, RANGE=167, 
		RBRACKET=168, RCURLY=169, READ=170, REALLOCATE=171, REDUCE=172, RENAME=173, 
		REGEQ=174, REL=175, RELATIONSHIP=176, RELATIONSHIPS=177, REMOVE=178, REPLACE=179, 
		REPORT=180, REQUIRE=181, REQUIRED=182, RETURN=183, REVOKE=184, ROLE=185, 
		ROLES=186, ROW=187, ROWS=188, RPAREN=189, SCAN=190, SEC=191, SECOND=192, 
		SECONDARY=193, SECONDARIES=194, SECONDS=195, SEEK=196, SEMICOLON=197, 
		SERVER=198, SERVERS=199, SET=200, SETTING=201, SETTINGS=202, SHORTEST_PATH=203, 
		SHOW=204, SINGLE=205, SKIPROWS=206, START=207, STARTS=208, STATUS=209, 
		STOP=210, SUSPENDED=211, TARGET=212, TERMINATE=213, TEXT=214, THEN=215, 
		TIMES=216, TO=217, TOPOLOGY=218, TRANSACTION=219, TRANSACTIONS=220, TRAVERSE=221, 
		TRUE=222, TYPE=223, TYPES=224, UNION=225, UNIQUE=226, UNIQUENESS=227, 
		UNWIND=228, USE=229, USER=230, USERS=231, USING=232, VERBOSE=233, WAIT=234, 
		WHEN=235, WHERE=236, WITH=237, WRITE=238, XOR=239, YIELD=240, IDENTIFIER=241, 
		ARROW_LINE=242, ARROW_LEFT_HEAD=243, ARROW_RIGHT_HEAD=244, FORMAL_COMMENT=245, 
		STRING_LITERAL1=246, STRING_LITERAL2=247, MULTI_LINE_COMMENT=248, ESCAPED_SYMBOLIC_NAME=249, 
		MORE1=250, STRING1_OPEN=251, STRING2_OPEN=252, ESCAPED_SYMBOLIC_NAME_OPEN=253, 
		MORE3=254, MORE4=255, MORE5=256, MORE6=257, MORE7=258, MORE8=259, MORE9=260, 
		MORE10=261, MORE11=262, MORE24=263;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_singleQueryOrCommand = 2, 
		RULE_singleQueryOrCommandWithUseClause = 3, RULE_periodicCommitQueryHintFailure = 4, 
		RULE_regularQuery = 5, RULE_union = 6, RULE_singleQuery = 7, RULE_singleQueryWithUseClause = 8, 
		RULE_clause = 9, RULE_useClause = 10, RULE_returnClause = 11, RULE_returnBody = 12, 
		RULE_returnItem = 13, RULE_returnItems = 14, RULE_orderItem = 15, RULE_skip = 16, 
		RULE_limit = 17, RULE_whereClause = 18, RULE_withClause = 19, RULE_createClause = 20, 
		RULE_setClause = 21, RULE_setItem = 22, RULE_removeClause = 23, RULE_removeItem = 24, 
		RULE_deleteClause = 25, RULE_matchClause = 26, RULE_hints = 27, RULE_indexHintBody = 28, 
		RULE_mergeClause = 29, RULE_unwindClause = 30, RULE_callClause = 31, RULE_procedureName = 32, 
		RULE_procedureArgument = 33, RULE_procedureResultItem = 34, RULE_loadCSVClause = 35, 
		RULE_foreachClause = 36, RULE_subqueryClause = 37, RULE_subqueryInTransactionsParameters = 38, 
		RULE_subqueryInTransactionsBatchParameters = 39, RULE_subqueryInTransactionsErrorParameters = 40, 
		RULE_subqueryInTransactionsReportParameters = 41, RULE_patternList = 42, 
		RULE_pattern = 43, RULE_quantifier = 44, RULE_anonymousPattern = 45, RULE_shortestPathPattern = 46, 
		RULE_maybeQuantifiedRelationshipPattern = 47, RULE_everyPathPattern = 48, 
		RULE_everyPathPatternNonEmpty = 49, RULE_nodePattern = 50, RULE_parenthesizedPath = 51, 
		RULE_nodeLabels = 52, RULE_labelExpressionPredicate = 53, RULE_labelOrRelType = 54, 
		RULE_labelOrRelTypes = 55, RULE_properties = 56, RULE_relationshipPattern = 57, 
		RULE_leftArrow = 58, RULE_arrowLine = 59, RULE_rightArrow = 60, RULE_pathLength = 61, 
		RULE_pathLengthLiteral = 62, RULE_labelExpression = 63, RULE_labelExpressionName = 64, 
		RULE_labelExpression4 = 65, RULE_labelExpression4ExpectingBar = 66, RULE_labelExpression3 = 67, 
		RULE_labelExpression2 = 68, RULE_labelExpression1 = 69, RULE_expression = 70, 
		RULE_expression12 = 71, RULE_expression11 = 72, RULE_expression10 = 73, 
		RULE_expression9 = 74, RULE_expression8 = 75, RULE_expression7 = 76, RULE_comparisonExpression6 = 77, 
		RULE_expression6 = 78, RULE_expression5 = 79, RULE_expression4 = 80, RULE_expression3 = 81, 
		RULE_expression2 = 82, RULE_postFix1 = 83, RULE_property = 84, RULE_propertyExpression = 85, 
		RULE_expression1 = 86, RULE_literal = 87, RULE_caseExpression = 88, RULE_listComprehension = 89, 
		RULE_patternComprehension = 90, RULE_patternComprehensionPrefix = 91, 
		RULE_reduceExpression = 92, RULE_allExpression = 93, RULE_anyExpression = 94, 
		RULE_noneExpression = 95, RULE_singleExpression = 96, RULE_patternExpression = 97, 
		RULE_shortestPathExpression = 98, RULE_mapProjection = 99, RULE_mapProjectionItem = 100, 
		RULE_existsExpression = 101, RULE_countExpression = 102, RULE_stringLiteral = 103, 
		RULE_numberLiteral = 104, RULE_signedIntegerLiteral = 105, RULE_listLiteral = 106, 
		RULE_mapLiteral = 107, RULE_propertyKeyName = 108, RULE_parameter = 109, 
		RULE_functionInvocation = 110, RULE_functionName = 111, RULE_functionArgument = 112, 
		RULE_namespace = 113, RULE_variableList1 = 114, RULE_variable = 115, RULE_symbolicNameList1 = 116, 
		RULE_createCommand = 117, RULE_command = 118, RULE_commandWithUseGraph = 119, 
		RULE_dropCommand = 120, RULE_alterCommand = 121, RULE_showCommand = 122, 
		RULE_terminateCommand = 123, RULE_showAllCommand = 124, RULE_showNodeCommand = 125, 
		RULE_showRelationshipCommand = 126, RULE_showRelCommand = 127, RULE_showPropertyCommand = 128, 
		RULE_yieldItem = 129, RULE_yieldClause = 130, RULE_showIndexesAllowBrief = 131, 
		RULE_showIndexesNoBrief = 132, RULE_showConstraintsAllowBriefAndYield = 133, 
		RULE_showConstraintsAllowBrief = 134, RULE_showConstraintsAllowYield = 135, 
		RULE_showProcedures = 136, RULE_showFunctions = 137, RULE_showTransactions = 138, 
		RULE_terminateTransactions = 139, RULE_showOrTerminateTransactions = 140, 
		RULE_stringsOrExpression = 141, RULE_showSettings = 142, RULE_createConstraint = 143, 
		RULE_dropConstraint = 144, RULE_createIndex = 145, RULE_oldCreateIndex = 146, 
		RULE_createIndex_ = 147, RULE_createFulltextIndex = 148, RULE_createLookupIndex = 149, 
		RULE_dropIndex = 150, RULE_propertyList = 151, RULE_renameCommand = 152, 
		RULE_grantCommand = 153, RULE_revokeCommand = 154, RULE_enableServerCommand = 155, 
		RULE_alterServer = 156, RULE_renameServer = 157, RULE_dropServer = 158, 
		RULE_showServers = 159, RULE_allocationCommand = 160, RULE_deallocateDatabaseFromServers = 161, 
		RULE_reallocateDatabases = 162, RULE_createRole = 163, RULE_dropRole = 164, 
		RULE_renameRole = 165, RULE_showRoles = 166, RULE_grantRole = 167, RULE_revokeRole = 168, 
		RULE_createUser = 169, RULE_dropUser = 170, RULE_renameUser = 171, RULE_alterCurrentUser = 172, 
		RULE_alterUser = 173, RULE_setPassword = 174, RULE_passwordExpression = 175, 
		RULE_passwordChangeRequired = 176, RULE_userStatus = 177, RULE_homeDatabase = 178, 
		RULE_showUsers = 179, RULE_showCurrentUser = 180, RULE_showPrivileges = 181, 
		RULE_showRolePrivileges = 182, RULE_showUserPrivileges = 183, RULE_grantRoleManagement = 184, 
		RULE_revokeRoleManagement = 185, RULE_roleManagementPrivilege = 186, RULE_grantPrivilege = 187, 
		RULE_denyPrivilege = 188, RULE_revokePrivilege = 189, RULE_privilege = 190, 
		RULE_allPrivilege = 191, RULE_createPrivilege = 192, RULE_dropPrivilege = 193, 
		RULE_showPrivilege = 194, RULE_setPrivilege = 195, RULE_removePrivilege = 196, 
		RULE_writePrivilege = 197, RULE_databasePrivilege = 198, RULE_dbmsPrivilege = 199, 
		RULE_executeFunctionQualifier = 200, RULE_executeProcedureQualifier = 201, 
		RULE_settingQualifier = 202, RULE_globs = 203, RULE_qualifiedGraphPrivilegesWithProperty = 204, 
		RULE_qualifiedGraphPrivileges = 205, RULE_labelResource = 206, RULE_propertyResource = 207, 
		RULE_graphQualifier = 208, RULE_createDatabase = 209, RULE_options_ = 210, 
		RULE_createCompositeDatabase = 211, RULE_dropDatabase = 212, RULE_alterDatabase = 213, 
		RULE_startDatabase = 214, RULE_stopDatabase = 215, RULE_waitClause = 216, 
		RULE_showDatabase = 217, RULE_databaseScopeList = 218, RULE_graphScopeList = 219, 
		RULE_createAlias = 220, RULE_dropAlias = 221, RULE_alterAlias = 222, RULE_showAliases = 223, 
		RULE_symbolicAliasNameList = 224, RULE_symbolicAliasName = 225, RULE_symbolicNameOrStringParameterList = 226, 
		RULE_symbolicNameOrStringParameter = 227, RULE_glob = 228, RULE_globRecursive = 229, 
		RULE_globPart = 230, RULE_stringImage = 231, RULE_stringList = 232, RULE_stringToken = 233, 
		RULE_stringOrParameter = 234, RULE_mapOrParameter = 235, RULE_map = 236, 
		RULE_symbolicNamePositions = 237, RULE_symbolicNameString = 238, RULE_escapedSymbolicNameString = 239, 
		RULE_unescapedSymbolicNameString = 240, RULE_endOfFile = 241;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "singleQueryOrCommand", "singleQueryOrCommandWithUseClause", 
			"periodicCommitQueryHintFailure", "regularQuery", "union", "singleQuery", 
			"singleQueryWithUseClause", "clause", "useClause", "returnClause", "returnBody", 
			"returnItem", "returnItems", "orderItem", "skip", "limit", "whereClause", 
			"withClause", "createClause", "setClause", "setItem", "removeClause", 
			"removeItem", "deleteClause", "matchClause", "hints", "indexHintBody", 
			"mergeClause", "unwindClause", "callClause", "procedureName", "procedureArgument", 
			"procedureResultItem", "loadCSVClause", "foreachClause", "subqueryClause", 
			"subqueryInTransactionsParameters", "subqueryInTransactionsBatchParameters", 
			"subqueryInTransactionsErrorParameters", "subqueryInTransactionsReportParameters", 
			"patternList", "pattern", "quantifier", "anonymousPattern", "shortestPathPattern", 
			"maybeQuantifiedRelationshipPattern", "everyPathPattern", "everyPathPatternNonEmpty", 
			"nodePattern", "parenthesizedPath", "nodeLabels", "labelExpressionPredicate", 
			"labelOrRelType", "labelOrRelTypes", "properties", "relationshipPattern", 
			"leftArrow", "arrowLine", "rightArrow", "pathLength", "pathLengthLiteral", 
			"labelExpression", "labelExpressionName", "labelExpression4", "labelExpression4ExpectingBar", 
			"labelExpression3", "labelExpression2", "labelExpression1", "expression", 
			"expression12", "expression11", "expression10", "expression9", "expression8", 
			"expression7", "comparisonExpression6", "expression6", "expression5", 
			"expression4", "expression3", "expression2", "postFix1", "property", 
			"propertyExpression", "expression1", "literal", "caseExpression", "listComprehension", 
			"patternComprehension", "patternComprehensionPrefix", "reduceExpression", 
			"allExpression", "anyExpression", "noneExpression", "singleExpression", 
			"patternExpression", "shortestPathExpression", "mapProjection", "mapProjectionItem", 
			"existsExpression", "countExpression", "stringLiteral", "numberLiteral", 
			"signedIntegerLiteral", "listLiteral", "mapLiteral", "propertyKeyName", 
			"parameter", "functionInvocation", "functionName", "functionArgument", 
			"namespace", "variableList1", "variable", "symbolicNameList1", "createCommand", 
			"command", "commandWithUseGraph", "dropCommand", "alterCommand", "showCommand", 
			"terminateCommand", "showAllCommand", "showNodeCommand", "showRelationshipCommand", 
			"showRelCommand", "showPropertyCommand", "yieldItem", "yieldClause", 
			"showIndexesAllowBrief", "showIndexesNoBrief", "showConstraintsAllowBriefAndYield", 
			"showConstraintsAllowBrief", "showConstraintsAllowYield", "showProcedures", 
			"showFunctions", "showTransactions", "terminateTransactions", "showOrTerminateTransactions", 
			"stringsOrExpression", "showSettings", "createConstraint", "dropConstraint", 
			"createIndex", "oldCreateIndex", "createIndex_", "createFulltextIndex", 
			"createLookupIndex", "dropIndex", "propertyList", "renameCommand", "grantCommand", 
			"revokeCommand", "enableServerCommand", "alterServer", "renameServer", 
			"dropServer", "showServers", "allocationCommand", "deallocateDatabaseFromServers", 
			"reallocateDatabases", "createRole", "dropRole", "renameRole", "showRoles", 
			"grantRole", "revokeRole", "createUser", "dropUser", "renameUser", "alterCurrentUser", 
			"alterUser", "setPassword", "passwordExpression", "passwordChangeRequired", 
			"userStatus", "homeDatabase", "showUsers", "showCurrentUser", "showPrivileges", 
			"showRolePrivileges", "showUserPrivileges", "grantRoleManagement", "revokeRoleManagement", 
			"roleManagementPrivilege", "grantPrivilege", "denyPrivilege", "revokePrivilege", 
			"privilege", "allPrivilege", "createPrivilege", "dropPrivilege", "showPrivilege", 
			"setPrivilege", "removePrivilege", "writePrivilege", "databasePrivilege", 
			"dbmsPrivilege", "executeFunctionQualifier", "executeProcedureQualifier", 
			"settingQualifier", "globs", "qualifiedGraphPrivilegesWithProperty", 
			"qualifiedGraphPrivileges", "labelResource", "propertyResource", "graphQualifier", 
			"createDatabase", "options_", "createCompositeDatabase", "dropDatabase", 
			"alterDatabase", "startDatabase", "stopDatabase", "waitClause", "showDatabase", 
			"databaseScopeList", "graphScopeList", "createAlias", "dropAlias", "alterAlias", 
			"showAliases", "symbolicAliasNameList", "symbolicAliasName", "symbolicNameOrStringParameterList", 
			"symbolicNameOrStringParameter", "glob", "globRecursive", "globPart", 
			"stringImage", "stringList", "stringToken", "stringOrParameter", "mapOrParameter", 
			"map", "symbolicNamePositions", "symbolicNameString", "escapedSymbolicNameString", 
			"unescapedSymbolicNameString", "endOfFile"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'|'", 
			null, null, null, null, null, null, null, null, null, "':'", "','", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'$'", null, "'/'", "'.'", "'..'", null, null, null, null, null, null, 
			null, null, null, null, null, null, "'='", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'>='", null, 
			null, null, "'>'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'&'", "'!'", "'['", "'{'", "'<='", 
			null, null, null, "'('", "'<'", null, null, null, "'-'", "'%'", "'!='", 
			"'<>'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "'+='", null, null, "'^'", null, null, null, null, null, null, 
			null, null, "'?'", null, "']'", "'}'", null, null, null, null, "'=~'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "')'", null, null, null, null, null, null, null, "';'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'*'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'/*'", null, null, null, null, null, null, null, null, 
			null, null, null, null, "'``'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SINGLE_LINE_COMMENT", "DECIMAL_DOUBLE", "UNSIGNED_DECIMAL_INTEGER", 
			"UNSIGNED_HEX_INTEGER", "UNSIGNED_OCTAL_INTEGER", "ACCESS", "ACTIVE", 
			"ADMIN", "ADMINISTRATOR", "ALIAS", "ALIASES", "ALL_SHORTEST_PATH", "ALL", 
			"ALTER", "AND", "ANY", "AS", "ASC", "ASSERT", "ASSIGN", "AT", "BAR", 
			"BOOSTED", "BREAK", "BRIEF", "BTREE", "BUILT", "BY", "CALL", "CASE", 
			"CHANGE", "COLON", "COMMA", "COMMAND", "COMMANDS", "COMMIT", "COMPOSITE", 
			"CONSTRAINT", "CONSTRAINTS", "CONTAINS", "COPY", "CONTINUE", "COUNT", 
			"CREATE", "CSV", "CURRENT", "DATA", "DATABASE", "DATABASES", "DBMS", 
			"DEALLOCATE", "DEFAULT_TOKEN", "DEFINED", "DELETE", "DENY", "DESC", "DESTROY", 
			"DETACH", "DOLLAR", "DISTINCT", "DIVIDE", "DOT", "DOTDOT", "DRIVER", 
			"DROP", "DRYRUN", "DUMP", "EACH", "ENABLE", "ELEMENT", "ELEMENTS", "ELSE", 
			"ENCRYPTED", "END", "ENDS", "EQ", "EXECUTABLE", "EXECUTE", "EXIST", "EXISTENCE", 
			"EXISTS", "ERROR", "FAIL", "FALSE", "FIELDTERMINATOR", "FOR", "FOREACH", 
			"FROM", "FULLTEXT", "FUNCTION", "FUNCTIONS", "GE", "GRANT", "GRAPH", 
			"GRAPHS", "GT", "HEADERS", "HOME", "IF", "IMPERSONATE", "IMMUTABLE", 
			"IN", "INDEX", "INDEXES", "INF", "INFINITY", "IS", "JOIN", "KEY", "LABEL", 
			"LABELS", "AMPERSAND", "EXCLAMATION_MARK", "LBRACKET", "LCURLY", "LE", 
			"LIMITROWS", "LOAD", "LOOKUP", "LPAREN", "LT", "MANAGEMENT", "MATCH", 
			"MERGE", "MINUS", "PERCENT", "NEQ", "NEQ2", "NAME", "NAMES", "NAN", "NEW", 
			"NODE", "NODES", "NONE", "NOT", "NOWAIT", "NULL", "OF", "ON", "ONLY", 
			"OPTIONAL", "OPTIONS", "OPTION", "OR", "ORDER", "OUTPUT", "PASSWORD", 
			"PASSWORDS", "PERIODIC", "PLAINTEXT", "PLUS", "PLUSEQUAL", "POINT", "POPULATED", 
			"POW", "PRIMARY", "PRIMARIES", "PRIVILEGE", "PRIVILEGES", "PROCEDURE", 
			"PROCEDURES", "PROPERTIES", "PROPERTY", "QUESTION", "RANGE", "RBRACKET", 
			"RCURLY", "READ", "REALLOCATE", "REDUCE", "RENAME", "REGEQ", "REL", "RELATIONSHIP", 
			"RELATIONSHIPS", "REMOVE", "REPLACE", "REPORT", "REQUIRE", "REQUIRED", 
			"RETURN", "REVOKE", "ROLE", "ROLES", "ROW", "ROWS", "RPAREN", "SCAN", 
			"SEC", "SECOND", "SECONDARY", "SECONDARIES", "SECONDS", "SEEK", "SEMICOLON", 
			"SERVER", "SERVERS", "SET", "SETTING", "SETTINGS", "SHORTEST_PATH", "SHOW", 
			"SINGLE", "SKIPROWS", "START", "STARTS", "STATUS", "STOP", "SUSPENDED", 
			"TARGET", "TERMINATE", "TEXT", "THEN", "TIMES", "TO", "TOPOLOGY", "TRANSACTION", 
			"TRANSACTIONS", "TRAVERSE", "TRUE", "TYPE", "TYPES", "UNION", "UNIQUE", 
			"UNIQUENESS", "UNWIND", "USE", "USER", "USERS", "USING", "VERBOSE", "WAIT", 
			"WHEN", "WHERE", "WITH", "WRITE", "XOR", "YIELD", "IDENTIFIER", "ARROW_LINE", 
			"ARROW_LEFT_HEAD", "ARROW_RIGHT_HEAD", "FORMAL_COMMENT", "STRING_LITERAL1", 
			"STRING_LITERAL2", "MULTI_LINE_COMMENT", "ESCAPED_SYMBOLIC_NAME", "MORE1", 
			"STRING1_OPEN", "STRING2_OPEN", "ESCAPED_SYMBOLIC_NAME_OPEN", "MORE3", 
			"MORE4", "MORE5", "MORE6", "MORE7", "MORE8", "MORE9", "MORE10", "MORE11", 
			"MORE24"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CypherParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CypherParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CypherParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(484);
				statement();
				}
				}
				setState(487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CALL) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DELETE) | (1L << DENY) | (1L << DETACH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DROP - 66)) | (1L << (DRYRUN - 66)) | (1L << (ENABLE - 66)) | (1L << (FOREACH - 66)) | (1L << (GRANT - 66)) | (1L << (LOAD - 66)) | (1L << (MATCH - 66)) | (1L << (MERGE - 66)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (OPTIONAL - 143)) | (1L << (REALLOCATE - 143)) | (1L << (RENAME - 143)) | (1L << (REMOVE - 143)) | (1L << (RETURN - 143)) | (1L << (REVOKE - 143)) | (1L << (SET - 143)) | (1L << (SHOW - 143)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (START - 207)) | (1L << (STOP - 207)) | (1L << (TERMINATE - 207)) | (1L << (UNWIND - 207)) | (1L << (USE - 207)) | (1L << (USING - 207)) | (1L << (WITH - 207)))) != 0) );
			setState(489);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public UseClauseContext useClause() {
			return getRuleContext(UseClauseContext.class,0);
		}
		public SingleQueryOrCommandWithUseClauseContext singleQueryOrCommandWithUseClause() {
			return getRuleContext(SingleQueryOrCommandWithUseClauseContext.class,0);
		}
		public SingleQueryOrCommandContext singleQueryOrCommand() {
			return getRuleContext(SingleQueryOrCommandContext.class,0);
		}
		public PeriodicCommitQueryHintFailureContext periodicCommitQueryHintFailure() {
			return getRuleContext(PeriodicCommitQueryHintFailureContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CypherParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(491);
				periodicCommitQueryHintFailure();
				}
			}

			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(494);
				useClause();
				setState(495);
				singleQueryOrCommandWithUseClause();
				}
				break;
			case 2:
				{
				setState(497);
				singleQueryOrCommand();
				}
				break;
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(500);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryOrCommandContext extends ParserRuleContext {
		public CreateCommandContext createCommand() {
			return getRuleContext(CreateCommandContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public SingleQueryOrCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQueryOrCommand; }
	}

	public final SingleQueryOrCommandContext singleQueryOrCommand() throws RecognitionException {
		SingleQueryOrCommandContext _localctx = new SingleQueryOrCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleQueryOrCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(503);
				createCommand();
				}
				break;
			case 2:
				{
				setState(504);
				command();
				}
				break;
			case 3:
				{
				setState(505);
				singleQuery();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNION) {
					{
					{
					setState(506);
					union();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryOrCommandWithUseClauseContext extends ParserRuleContext {
		public CreateCommandContext createCommand() {
			return getRuleContext(CreateCommandContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleQueryWithUseClauseContext singleQueryWithUseClause() {
			return getRuleContext(SingleQueryWithUseClauseContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public SingleQueryOrCommandWithUseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQueryOrCommandWithUseClause; }
	}

	public final SingleQueryOrCommandWithUseClauseContext singleQueryOrCommandWithUseClause() throws RecognitionException {
		SingleQueryOrCommandWithUseClauseContext _localctx = new SingleQueryOrCommandWithUseClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleQueryOrCommandWithUseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(514);
				createCommand();
				}
				break;
			case 2:
				{
				setState(515);
				command();
				}
				break;
			case 3:
				{
				setState(516);
				singleQueryWithUseClause();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNION) {
					{
					{
					setState(517);
					union();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PeriodicCommitQueryHintFailureContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CypherParser.USING, 0); }
		public TerminalNode PERIODIC() { return getToken(CypherParser.PERIODIC, 0); }
		public TerminalNode COMMIT() { return getToken(CypherParser.COMMIT, 0); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER() { return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, 0); }
		public PeriodicCommitQueryHintFailureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodicCommitQueryHintFailure; }
	}

	public final PeriodicCommitQueryHintFailureContext periodicCommitQueryHintFailure() throws RecognitionException {
		PeriodicCommitQueryHintFailureContext _localctx = new PeriodicCommitQueryHintFailureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_periodicCommitQueryHintFailure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(USING);
			setState(526);
			match(PERIODIC);
			setState(527);
			match(COMMIT);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNSIGNED_DECIMAL_INTEGER) {
				{
				setState(528);
				match(UNSIGNED_DECIMAL_INTEGER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularQueryContext extends ParserRuleContext {
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public RegularQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularQuery; }
	}

	public final RegularQueryContext regularQuery() throws RecognitionException {
		RegularQueryContext _localctx = new RegularQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regularQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			singleQuery();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(532);
				union();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(UNION);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(539);
				match(ALL);
				}
			}

			setState(542);
			singleQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuery; }
	}

	public final SingleQueryContext singleQuery() throws RecognitionException {
		SingleQueryContext _localctx = new SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleQuery);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(544);
					clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(547); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryWithUseClauseContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public SingleQueryWithUseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQueryWithUseClause; }
	}

	public final SingleQueryWithUseClauseContext singleQueryWithUseClause() throws RecognitionException {
		SingleQueryWithUseClauseContext _localctx = new SingleQueryWithUseClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleQueryWithUseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					clause();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public UseClauseContext useClause() {
			return getRuleContext(UseClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public CreateClauseContext createClause() {
			return getRuleContext(CreateClauseContext.class,0);
		}
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public RemoveClauseContext removeClause() {
			return getRuleContext(RemoveClauseContext.class,0);
		}
		public MatchClauseContext matchClause() {
			return getRuleContext(MatchClauseContext.class,0);
		}
		public MergeClauseContext mergeClause() {
			return getRuleContext(MergeClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public UnwindClauseContext unwindClause() {
			return getRuleContext(UnwindClauseContext.class,0);
		}
		public CallClauseContext callClause() {
			return getRuleContext(CallClauseContext.class,0);
		}
		public SubqueryClauseContext subqueryClause() {
			return getRuleContext(SubqueryClauseContext.class,0);
		}
		public LoadCSVClauseContext loadCSVClause() {
			return getRuleContext(LoadCSVClauseContext.class,0);
		}
		public ForeachClauseContext foreachClause() {
			return getRuleContext(ForeachClauseContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(555);
				useClause();
				}
				break;
			case 2:
				{
				setState(556);
				returnClause();
				}
				break;
			case 3:
				{
				setState(557);
				createClause();
				}
				break;
			case 4:
				{
				setState(558);
				deleteClause();
				}
				break;
			case 5:
				{
				setState(559);
				setClause();
				}
				break;
			case 6:
				{
				setState(560);
				removeClause();
				}
				break;
			case 7:
				{
				setState(561);
				matchClause();
				}
				break;
			case 8:
				{
				setState(562);
				mergeClause();
				}
				break;
			case 9:
				{
				setState(563);
				withClause();
				}
				break;
			case 10:
				{
				setState(564);
				unwindClause();
				}
				break;
			case 11:
				{
				setState(565);
				callClause();
				}
				break;
			case 12:
				{
				setState(566);
				subqueryClause();
				}
				break;
			case 13:
				{
				setState(567);
				loadCSVClause();
				}
				break;
			case 14:
				{
				setState(568);
				foreachClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseClauseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(CypherParser.USE, 0); }
		public TerminalNode GRAPH() { return getToken(CypherParser.GRAPH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useClause; }
	}

	public final UseClauseContext useClause() throws RecognitionException {
		UseClauseContext _localctx = new UseClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_useClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(USE);
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(572);
				match(GRAPH);
				setState(573);
				expression();
				}
				break;
			case 2:
				{
				setState(574);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ReturnBodyContext returnBody() {
			return getRuleContext(ReturnBodyContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(RETURN);
			setState(578);
			returnBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnBodyContext extends ParserRuleContext {
		public ReturnItemsContext returnItems() {
			return getRuleContext(ReturnItemsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public SkipContext skip() {
			return getRuleContext(SkipContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ReturnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBody; }
	}

	public final ReturnBodyContext returnBody() throws RecognitionException {
		ReturnBodyContext _localctx = new ReturnBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(580);
				match(DISTINCT);
				}
				break;
			}
			setState(583);
			returnItems();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(584);
				match(ORDER);
				setState(585);
				match(BY);
				setState(586);
				orderItem();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(587);
					match(COMMA);
					setState(588);
					orderItem();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIPROWS) {
				{
				setState(596);
				skip();
				}
			}

			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMITROWS) {
				{
				setState(599);
				limit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expression();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(603);
				match(AS);
				setState(604);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnItemsContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public List<ReturnItemContext> returnItem() {
			return getRuleContexts(ReturnItemContext.class);
		}
		public ReturnItemContext returnItem(int i) {
			return getRuleContext(ReturnItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ReturnItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItems; }
	}

	public final ReturnItemsContext returnItems() throws RecognitionException {
		ReturnItemsContext _localctx = new ReturnItemsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(607);
				match(TIMES);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					returnItem();
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DECIMAL_DOUBLE:
			case UNSIGNED_DECIMAL_INTEGER:
			case UNSIGNED_HEX_INTEGER:
			case UNSIGNED_OCTAL_INTEGER:
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DOLLAR:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LBRACKET:
			case LCURLY:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case LPAREN:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case MINUS:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case PLUS:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(615);
				returnItem();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(616);
					match(COMMA);
					setState(617);
					returnItem();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			expression();
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESC:
				{
				setState(626);
				match(DESC);
				}
				break;
			case EOF:
			case ALTER:
			case ASC:
			case CALL:
			case COMMA:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LIMITROWS:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case RCURLY:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case RPAREN:
			case SEMICOLON:
			case SET:
			case SHOW:
			case SKIPROWS:
			case START:
			case STOP:
			case TERMINATE:
			case UNION:
			case UNWIND:
			case USE:
			case USING:
			case WHERE:
			case WITH:
				{
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC) {
					{
					setState(627);
					match(ASC);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipContext extends ParserRuleContext {
		public TerminalNode SKIPROWS() { return getToken(CypherParser.SKIPROWS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip; }
	}

	public final SkipContext skip() throws RecognitionException {
		SkipContext _localctx = new SkipContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(SKIPROWS);
			setState(633);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMITROWS() { return getToken(CypherParser.LIMITROWS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(LIMITROWS);
			setState(636);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(WHERE);
			setState(639);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public ReturnBodyContext returnBody() {
			return getRuleContext(ReturnBodyContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(WITH);
			setState(642);
			returnBody();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(643);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateClauseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public CreateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createClause; }
	}

	public final CreateClauseContext createClause() throws RecognitionException {
		CreateClauseContext _localctx = new CreateClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_createClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(CREATE);
			setState(647);
			patternList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public List<SetItemContext> setItem() {
			return getRuleContexts(SetItemContext.class);
		}
		public SetItemContext setItem(int i) {
			return getRuleContext(SetItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(SET);
			setState(650);
			setItem();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(651);
				match(COMMA);
				setState(652);
				setItem();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetItemContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CypherParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLUSEQUAL() { return getToken(CypherParser.PLUSEQUAL, 0); }
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public SetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setItem; }
	}

	public final SetItemContext setItem() throws RecognitionException {
		SetItemContext _localctx = new SetItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(658);
				propertyExpression();
				setState(659);
				match(EQ);
				setState(660);
				expression();
				}
				break;
			case 2:
				{
				setState(662);
				variable();
				setState(663);
				match(EQ);
				setState(664);
				expression();
				}
				break;
			case 3:
				{
				setState(666);
				variable();
				setState(667);
				match(PLUSEQUAL);
				setState(668);
				expression();
				}
				break;
			case 4:
				{
				setState(670);
				variable();
				setState(671);
				nodeLabels();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveClauseContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public List<RemoveItemContext> removeItem() {
			return getRuleContexts(RemoveItemContext.class);
		}
		public RemoveItemContext removeItem(int i) {
			return getRuleContext(RemoveItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public RemoveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeClause; }
	}

	public final RemoveClauseContext removeClause() throws RecognitionException {
		RemoveClauseContext _localctx = new RemoveClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_removeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(REMOVE);
			setState(676);
			removeItem();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(677);
				match(COMMA);
				setState(678);
				removeItem();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveItemContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public RemoveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeItem; }
	}

	public final RemoveItemContext removeItem() throws RecognitionException {
		RemoveItemContext _localctx = new RemoveItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_removeItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(684);
				propertyExpression();
				}
				break;
			case 2:
				{
				setState(685);
				variable();
				setState(686);
				nodeLabels();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETACH) {
				{
				setState(690);
				match(DETACH);
				}
			}

			setState(693);
			match(DELETE);
			setState(694);
			expression();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(695);
				match(COMMA);
				setState(696);
				expression();
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchClauseContext extends ParserRuleContext {
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public List<HintsContext> hints() {
			return getRuleContexts(HintsContext.class);
		}
		public HintsContext hints(int i) {
			return getRuleContext(HintsContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public MatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchClause; }
	}

	public final MatchClauseContext matchClause() throws RecognitionException {
		MatchClauseContext _localctx = new MatchClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
				{
				{
				setState(702);
				match(OPTIONAL);
				setState(703);
				match(MATCH);
				}
				}
				break;
			case MATCH:
				{
				setState(704);
				match(MATCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(707);
			patternList();
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(708);
					hints();
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(714);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintsContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CypherParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public IndexHintBodyContext indexHintBody() {
			return getRuleContext(IndexHintBodyContext.class,0);
		}
		public TerminalNode BTREE() { return getToken(CypherParser.BTREE, 0); }
		public TerminalNode TEXT() { return getToken(CypherParser.TEXT, 0); }
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public TerminalNode POINT() { return getToken(CypherParser.POINT, 0); }
		public TerminalNode JOIN() { return getToken(CypherParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public VariableList1Context variableList1() {
			return getRuleContext(VariableList1Context.class,0);
		}
		public TerminalNode SCAN() { return getToken(CypherParser.SCAN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public HintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hints; }
	}

	public final HintsContext hints() throws RecognitionException {
		HintsContext _localctx = new HintsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_hints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(USING);
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				{
				setState(718);
				match(INDEX);
				setState(719);
				indexHintBody();
				}
				break;
			case BTREE:
				{
				setState(720);
				match(BTREE);
				setState(721);
				match(INDEX);
				setState(722);
				indexHintBody();
				}
				break;
			case TEXT:
				{
				setState(723);
				match(TEXT);
				setState(724);
				match(INDEX);
				setState(725);
				indexHintBody();
				}
				break;
			case RANGE:
				{
				setState(726);
				match(RANGE);
				setState(727);
				match(INDEX);
				setState(728);
				indexHintBody();
				}
				break;
			case POINT:
				{
				setState(729);
				match(POINT);
				setState(730);
				match(INDEX);
				setState(731);
				indexHintBody();
				}
				break;
			case JOIN:
				{
				setState(732);
				match(JOIN);
				setState(733);
				match(ON);
				setState(734);
				variableList1();
				}
				break;
			case SCAN:
				{
				setState(735);
				match(SCAN);
				setState(736);
				variable();
				setState(737);
				labelOrRelType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintBodyContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public SymbolicNameList1Context symbolicNameList1() {
			return getRuleContext(SymbolicNameList1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode SEEK() { return getToken(CypherParser.SEEK, 0); }
		public IndexHintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintBody; }
	}

	public final IndexHintBodyContext indexHintBody() throws RecognitionException {
		IndexHintBodyContext _localctx = new IndexHintBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_indexHintBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(741);
				match(SEEK);
				}
				break;
			}
			setState(744);
			variable();
			setState(745);
			labelOrRelType();
			setState(746);
			match(LPAREN);
			setState(747);
			symbolicNameList1();
			setState(748);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeClauseContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<TerminalNode> ON() { return getTokens(CypherParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(CypherParser.ON, i);
		}
		public List<TerminalNode> MATCH() { return getTokens(CypherParser.MATCH); }
		public TerminalNode MATCH(int i) {
			return getToken(CypherParser.MATCH, i);
		}
		public List<SetClauseContext> setClause() {
			return getRuleContexts(SetClauseContext.class);
		}
		public SetClauseContext setClause(int i) {
			return getRuleContext(SetClauseContext.class,i);
		}
		public List<TerminalNode> CREATE() { return getTokens(CypherParser.CREATE); }
		public TerminalNode CREATE(int i) {
			return getToken(CypherParser.CREATE, i);
		}
		public MergeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeClause; }
	}

	public final MergeClauseContext mergeClause() throws RecognitionException {
		MergeClauseContext _localctx = new MergeClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mergeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(MERGE);
			setState(751);
			pattern();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(752);
				match(ON);
				setState(757);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATCH:
					{
					setState(753);
					match(MATCH);
					setState(754);
					setClause();
					}
					break;
				case CREATE:
					{
					setState(755);
					match(CREATE);
					setState(756);
					setClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnwindClauseContext extends ParserRuleContext {
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public UnwindClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwindClause; }
	}

	public final UnwindClauseContext unwindClause() throws RecognitionException {
		UnwindClauseContext _localctx = new UnwindClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unwindClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(UNWIND);
			setState(765);
			expression();
			setState(766);
			match(AS);
			setState(767);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallClauseContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public List<ProcedureResultItemContext> procedureResultItem() {
			return getRuleContexts(ProcedureResultItemContext.class);
		}
		public ProcedureResultItemContext procedureResultItem(int i) {
			return getRuleContext(ProcedureResultItemContext.class,i);
		}
		public List<ProcedureArgumentContext> procedureArgument() {
			return getRuleContexts(ProcedureArgumentContext.class);
		}
		public ProcedureArgumentContext procedureArgument(int i) {
			return getRuleContext(ProcedureArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CallClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callClause; }
	}

	public final CallClauseContext callClause() throws RecognitionException {
		CallClauseContext _localctx = new CallClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_callClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(CALL);
			setState(770);
			procedureName();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(771);
				match(LPAREN);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER) | (1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DOLLAR) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LBRACKET - 65)) | (1L << (LCURLY - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (LPAREN - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)) | (1L << (MINUS - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (PLUS - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (STRING_LITERAL1 - 194)) | (1L << (STRING_LITERAL2 - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
					{
					setState(772);
					procedureArgument();
					}
				}

				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(775);
					match(COMMA);
					setState(776);
					procedureArgument();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(RPAREN);
				}
			}

			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YIELD) {
				{
				setState(785);
				match(YIELD);
				setState(798);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(786);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(787);
					procedureResultItem();
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(788);
						match(COMMA);
						setState(789);
						procedureResultItem();
						}
						}
						setState(794);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(795);
						whereClause();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureNameContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			namespace();
			setState(803);
			symbolicNameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProcedureArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureArgument; }
	}

	public final ProcedureArgumentContext procedureArgument() throws RecognitionException {
		ProcedureArgumentContext _localctx = new ProcedureArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_procedureArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureResultItemContext extends ParserRuleContext {
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ProcedureResultItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureResultItem; }
	}

	public final ProcedureResultItemContext procedureResultItem() throws RecognitionException {
		ProcedureResultItemContext _localctx = new ProcedureResultItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedureResultItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			symbolicNameString();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(808);
				match(AS);
				setState(809);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadCSVClauseContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(CypherParser.LOAD, 0); }
		public TerminalNode CSV() { return getToken(CypherParser.CSV, 0); }
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode HEADERS() { return getToken(CypherParser.HEADERS, 0); }
		public TerminalNode FIELDTERMINATOR() { return getToken(CypherParser.FIELDTERMINATOR, 0); }
		public StringTokenContext stringToken() {
			return getRuleContext(StringTokenContext.class,0);
		}
		public LoadCSVClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadCSVClause; }
	}

	public final LoadCSVClauseContext loadCSVClause() throws RecognitionException {
		LoadCSVClauseContext _localctx = new LoadCSVClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loadCSVClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(LOAD);
			setState(813);
			match(CSV);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(814);
				match(WITH);
				setState(815);
				match(HEADERS);
				}
			}

			setState(818);
			match(FROM);
			setState(819);
			expression();
			setState(820);
			match(AS);
			setState(821);
			variable();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIELDTERMINATOR) {
				{
				setState(822);
				match(FIELDTERMINATOR);
				setState(823);
				stringToken();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachClauseContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CypherParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BAR() { return getToken(CypherParser.BAR, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public ForeachClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachClause; }
	}

	public final ForeachClauseContext foreachClause() throws RecognitionException {
		ForeachClauseContext _localctx = new ForeachClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_foreachClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(FOREACH);
			setState(827);
			match(LPAREN);
			setState(828);
			variable();
			setState(829);
			match(IN);
			setState(830);
			expression();
			setState(831);
			match(BAR);
			setState(833); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				clause();
				}
				}
				setState(835); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << CREATE) | (1L << DELETE) | (1L << DETACH))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (FOREACH - 88)) | (1L << (LOAD - 88)) | (1L << (MATCH - 88)) | (1L << (MERGE - 88)) | (1L << (OPTIONAL - 88)))) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & ((1L << (REMOVE - 178)) | (1L << (RETURN - 178)) | (1L << (SET - 178)) | (1L << (UNWIND - 178)) | (1L << (USE - 178)) | (1L << (WITH - 178)))) != 0) );
			setState(837);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryClauseContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public SubqueryInTransactionsParametersContext subqueryInTransactionsParameters() {
			return getRuleContext(SubqueryInTransactionsParametersContext.class,0);
		}
		public SubqueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryClause; }
	}

	public final SubqueryClauseContext subqueryClause() throws RecognitionException {
		SubqueryClauseContext _localctx = new SubqueryClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subqueryClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(CALL);
			setState(840);
			match(LCURLY);
			setState(841);
			regularQuery();
			setState(842);
			match(RCURLY);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(843);
				subqueryInTransactionsParameters();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryInTransactionsParametersContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public List<SubqueryInTransactionsBatchParametersContext> subqueryInTransactionsBatchParameters() {
			return getRuleContexts(SubqueryInTransactionsBatchParametersContext.class);
		}
		public SubqueryInTransactionsBatchParametersContext subqueryInTransactionsBatchParameters(int i) {
			return getRuleContext(SubqueryInTransactionsBatchParametersContext.class,i);
		}
		public List<SubqueryInTransactionsErrorParametersContext> subqueryInTransactionsErrorParameters() {
			return getRuleContexts(SubqueryInTransactionsErrorParametersContext.class);
		}
		public SubqueryInTransactionsErrorParametersContext subqueryInTransactionsErrorParameters(int i) {
			return getRuleContext(SubqueryInTransactionsErrorParametersContext.class,i);
		}
		public List<SubqueryInTransactionsReportParametersContext> subqueryInTransactionsReportParameters() {
			return getRuleContexts(SubqueryInTransactionsReportParametersContext.class);
		}
		public SubqueryInTransactionsReportParametersContext subqueryInTransactionsReportParameters(int i) {
			return getRuleContext(SubqueryInTransactionsReportParametersContext.class,i);
		}
		public SubqueryInTransactionsParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryInTransactionsParameters; }
	}

	public final SubqueryInTransactionsParametersContext subqueryInTransactionsParameters() throws RecognitionException {
		SubqueryInTransactionsParametersContext _localctx = new SubqueryInTransactionsParametersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subqueryInTransactionsParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(IN);
			setState(847);
			match(TRANSACTIONS);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (OF - 140)) | (1L << (ON - 140)) | (1L << (REPORT - 140)))) != 0)) {
				{
				setState(851);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OF:
					{
					setState(848);
					subqueryInTransactionsBatchParameters();
					}
					break;
				case ON:
					{
					setState(849);
					subqueryInTransactionsErrorParameters();
					}
					break;
				case REPORT:
					{
					setState(850);
					subqueryInTransactionsReportParameters();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryInTransactionsBatchParametersContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(CypherParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROW() { return getToken(CypherParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(CypherParser.ROWS, 0); }
		public SubqueryInTransactionsBatchParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryInTransactionsBatchParameters; }
	}

	public final SubqueryInTransactionsBatchParametersContext subqueryInTransactionsBatchParameters() throws RecognitionException {
		SubqueryInTransactionsBatchParametersContext _localctx = new SubqueryInTransactionsBatchParametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subqueryInTransactionsBatchParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(OF);
			setState(857);
			expression();
			setState(858);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryInTransactionsErrorParametersContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode ERROR() { return getToken(CypherParser.ERROR, 0); }
		public TerminalNode CONTINUE() { return getToken(CypherParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(CypherParser.BREAK, 0); }
		public TerminalNode FAIL() { return getToken(CypherParser.FAIL, 0); }
		public SubqueryInTransactionsErrorParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryInTransactionsErrorParameters; }
	}

	public final SubqueryInTransactionsErrorParametersContext subqueryInTransactionsErrorParameters() throws RecognitionException {
		SubqueryInTransactionsErrorParametersContext _localctx = new SubqueryInTransactionsErrorParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subqueryInTransactionsErrorParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(ON);
			setState(861);
			match(ERROR);
			setState(862);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (BREAK - 25)) | (1L << (CONTINUE - 25)) | (1L << (FAIL - 25)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryInTransactionsReportParametersContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(CypherParser.REPORT, 0); }
		public TerminalNode STATUS() { return getToken(CypherParser.STATUS, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SubqueryInTransactionsReportParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryInTransactionsReportParameters; }
	}

	public final SubqueryInTransactionsReportParametersContext subqueryInTransactionsReportParameters() throws RecognitionException {
		SubqueryInTransactionsReportParametersContext _localctx = new SubqueryInTransactionsReportParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subqueryInTransactionsReportParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(REPORT);
			setState(865);
			match(STATUS);
			setState(866);
			match(AS);
			setState(867);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public PatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternList; }
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			pattern();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870);
				match(COMMA);
				setState(871);
				pattern();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CypherParser.EQ, 0); }
		public AnonymousPatternContext anonymousPattern() {
			return getRuleContext(AnonymousPatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(877);
				variable();
				setState(878);
				match(EQ);
				setState(879);
				anonymousPattern();
				}
				break;
			case 2:
				{
				setState(881);
				anonymousPattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public List<TerminalNode> UNSIGNED_DECIMAL_INTEGER() { return getTokens(CypherParser.UNSIGNED_DECIMAL_INTEGER); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER(int i) {
			return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, i);
		}
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public TerminalNode COMMA() { return getToken(CypherParser.COMMA, 0); }
		public TerminalNode PLUS() { return getToken(CypherParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(884);
				match(LCURLY);
				setState(885);
				match(UNSIGNED_DECIMAL_INTEGER);
				setState(886);
				match(RCURLY);
				}
				break;
			case 2:
				{
				setState(887);
				match(LCURLY);
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED_DECIMAL_INTEGER) {
					{
					setState(888);
					match(UNSIGNED_DECIMAL_INTEGER);
					}
				}

				setState(891);
				match(COMMA);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED_DECIMAL_INTEGER) {
					{
					setState(892);
					match(UNSIGNED_DECIMAL_INTEGER);
					}
				}

				setState(895);
				match(RCURLY);
				}
				break;
			case 3:
				{
				setState(896);
				match(PLUS);
				}
				break;
			case 4:
				{
				setState(897);
				match(TIMES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousPatternContext extends ParserRuleContext {
		public ShortestPathPatternContext shortestPathPattern() {
			return getRuleContext(ShortestPathPatternContext.class,0);
		}
		public EveryPathPatternContext everyPathPattern() {
			return getRuleContext(EveryPathPatternContext.class,0);
		}
		public AnonymousPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousPattern; }
	}

	public final AnonymousPatternContext anonymousPattern() throws RecognitionException {
		AnonymousPatternContext _localctx = new AnonymousPatternContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_anonymousPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_SHORTEST_PATH:
			case SHORTEST_PATH:
				{
				setState(900);
				shortestPathPattern();
				}
				break;
			case LPAREN:
				{
				setState(901);
				everyPathPattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortestPathPatternContext extends ParserRuleContext {
		public TerminalNode SHORTEST_PATH() { return getToken(CypherParser.SHORTEST_PATH, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public EveryPathPatternContext everyPathPattern() {
			return getRuleContext(EveryPathPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode ALL_SHORTEST_PATH() { return getToken(CypherParser.ALL_SHORTEST_PATH, 0); }
		public ShortestPathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortestPathPattern; }
	}

	public final ShortestPathPatternContext shortestPathPattern() throws RecognitionException {
		ShortestPathPatternContext _localctx = new ShortestPathPatternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_shortestPathPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORTEST_PATH:
				{
				setState(904);
				match(SHORTEST_PATH);
				setState(905);
				match(LPAREN);
				setState(906);
				everyPathPattern();
				setState(907);
				match(RPAREN);
				}
				break;
			case ALL_SHORTEST_PATH:
				{
				setState(909);
				match(ALL_SHORTEST_PATH);
				setState(910);
				match(LPAREN);
				setState(911);
				everyPathPattern();
				setState(912);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaybeQuantifiedRelationshipPatternContext extends ParserRuleContext {
		public RelationshipPatternContext relationshipPattern() {
			return getRuleContext(RelationshipPatternContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public MaybeQuantifiedRelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeQuantifiedRelationshipPattern; }
	}

	public final MaybeQuantifiedRelationshipPatternContext maybeQuantifiedRelationshipPattern() throws RecognitionException {
		MaybeQuantifiedRelationshipPatternContext _localctx = new MaybeQuantifiedRelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_maybeQuantifiedRelationshipPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			relationshipPattern();
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==PLUS || _la==TIMES) {
				{
				setState(917);
				quantifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EveryPathPatternContext extends ParserRuleContext {
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public List<ParenthesizedPathContext> parenthesizedPath() {
			return getRuleContexts(ParenthesizedPathContext.class);
		}
		public ParenthesizedPathContext parenthesizedPath(int i) {
			return getRuleContext(ParenthesizedPathContext.class,i);
		}
		public List<MaybeQuantifiedRelationshipPatternContext> maybeQuantifiedRelationshipPattern() {
			return getRuleContexts(MaybeQuantifiedRelationshipPatternContext.class);
		}
		public MaybeQuantifiedRelationshipPatternContext maybeQuantifiedRelationshipPattern(int i) {
			return getRuleContext(MaybeQuantifiedRelationshipPatternContext.class,i);
		}
		public EveryPathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_everyPathPattern; }
	}

	public final EveryPathPatternContext everyPathPattern() throws RecognitionException {
		EveryPathPatternContext _localctx = new EveryPathPatternContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_everyPathPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(920);
					nodePattern();
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LT || _la==MINUS || _la==ARROW_LINE || _la==ARROW_LEFT_HEAD) {
						{
						{
						setState(921);
						maybeQuantifiedRelationshipPattern();
						setState(922);
						nodePattern();
						}
						}
						setState(928);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(929);
					parenthesizedPath();
					}
					break;
				}
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EveryPathPatternNonEmptyContext extends ParserRuleContext {
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public List<RelationshipPatternContext> relationshipPattern() {
			return getRuleContexts(RelationshipPatternContext.class);
		}
		public RelationshipPatternContext relationshipPattern(int i) {
			return getRuleContext(RelationshipPatternContext.class,i);
		}
		public EveryPathPatternNonEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_everyPathPatternNonEmpty; }
	}

	public final EveryPathPatternNonEmptyContext everyPathPatternNonEmpty() throws RecognitionException {
		EveryPathPatternNonEmptyContext _localctx = new EveryPathPatternNonEmptyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_everyPathPatternNonEmpty);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			nodePattern();
			setState(938); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(935);
					relationshipPattern();
					setState(936);
					nodePattern();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(940); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public LabelExpressionContext labelExpression() {
			return getRuleContext(LabelExpressionContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(LPAREN);
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(943);
				variable();
				setState(944);
				match(WHERE);
				setState(945);
				expression();
				}
				break;
			case 2:
				{
				setState(947);
				variable();
				setState(948);
				properties();
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(949);
					match(WHERE);
					setState(950);
					expression();
					}
				}

				}
				break;
			case 3:
				{
				setState(953);
				match(WHERE);
				setState(954);
				expression();
				}
				break;
			case 4:
				{
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(955);
					variable();
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(958);
					labelExpression();
					}
				}

				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR || _la==LCURLY) {
					{
					setState(961);
					properties();
					}
				}

				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(964);
					match(WHERE);
					setState(965);
					expression();
					}
				}

				}
				break;
			}
			setState(970);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedPathContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ParenthesizedPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedPath; }
	}

	public final ParenthesizedPathContext parenthesizedPath() throws RecognitionException {
		ParenthesizedPathContext _localctx = new ParenthesizedPathContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parenthesizedPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(LPAREN);
			setState(973);
			pattern();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(974);
				match(WHERE);
				setState(975);
				expression();
				}
			}

			setState(978);
			match(RPAREN);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY || _la==PLUS || _la==TIMES) {
				{
				setState(979);
				quantifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeLabelsContext extends ParserRuleContext {
		public List<LabelOrRelTypeContext> labelOrRelType() {
			return getRuleContexts(LabelOrRelTypeContext.class);
		}
		public LabelOrRelTypeContext labelOrRelType(int i) {
			return getRuleContext(LabelOrRelTypeContext.class,i);
		}
		public NodeLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabels; }
	}

	public final NodeLabelsContext nodeLabels() throws RecognitionException {
		NodeLabelsContext _localctx = new NodeLabelsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_nodeLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(982);
				labelOrRelType();
				}
				}
				setState(985); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpressionPredicateContext extends ParserRuleContext {
		public LabelExpressionContext labelExpression() {
			return getRuleContext(LabelExpressionContext.class,0);
		}
		public LabelExpressionPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpressionPredicate; }
	}

	public final LabelExpressionPredicateContext labelExpressionPredicate() throws RecognitionException {
		LabelExpressionPredicateContext _localctx = new LabelExpressionPredicateContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_labelExpressionPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			labelExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelOrRelTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public LabelOrRelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelOrRelType; }
	}

	public final LabelOrRelTypeContext labelOrRelType() throws RecognitionException {
		LabelOrRelTypeContext _localctx = new LabelOrRelTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_labelOrRelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(COLON);
			setState(990);
			symbolicNameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelOrRelTypesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(CypherParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(CypherParser.BAR, i);
		}
		public LabelOrRelTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelOrRelTypes; }
	}

	public final LabelOrRelTypesContext labelOrRelTypes() throws RecognitionException {
		LabelOrRelTypesContext _localctx = new LabelOrRelTypesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_labelOrRelTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(COLON);
			setState(993);
			symbolicNameString();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(994);
				match(BAR);
				setState(995);
				symbolicNameString();
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_properties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(1001);
				mapLiteral();
				}
				break;
			case DOLLAR:
				{
				setState(1002);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipPatternContext extends ParserRuleContext {
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public LabelExpressionContext labelExpression() {
			return getRuleContext(LabelExpressionContext.class,0);
		}
		public PathLengthContext pathLength() {
			return getRuleContext(PathLengthContext.class,0);
		}
		public RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipPattern; }
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationshipPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT || _la==ARROW_LEFT_HEAD) {
				{
				setState(1005);
				leftArrow();
				}
			}

			setState(1008);
			arrowLine();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1009);
				match(LBRACKET);
				setState(1038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(1010);
					variable();
					setState(1011);
					match(WHERE);
					setState(1012);
					expression();
					}
					break;
				case 2:
					{
					setState(1014);
					variable();
					setState(1015);
					properties();
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1016);
						match(WHERE);
						setState(1017);
						expression();
						}
					}

					}
					break;
				case 3:
					{
					setState(1020);
					match(WHERE);
					setState(1021);
					expression();
					}
					break;
				case 4:
					{
					setState(1023);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(1022);
						variable();
						}
						break;
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(1025);
						labelExpression();
						}
					}

					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TIMES) {
						{
						setState(1028);
						pathLength();
						}
					}

					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOLLAR || _la==LCURLY) {
						{
						setState(1031);
						properties();
						}
					}

					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1034);
						match(WHERE);
						setState(1035);
						expression();
						}
					}

					}
					break;
				}
				setState(1040);
				match(RBRACKET);
				}
			}

			setState(1043);
			arrowLine();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GT || _la==ARROW_RIGHT_HEAD) {
				{
				setState(1044);
				rightArrow();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftArrowContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public TerminalNode ARROW_LEFT_HEAD() { return getToken(CypherParser.ARROW_LEFT_HEAD, 0); }
		public LeftArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftArrow; }
	}

	public final LeftArrowContext leftArrow() throws RecognitionException {
		LeftArrowContext _localctx = new LeftArrowContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_leftArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==LT || _la==ARROW_LEFT_HEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowLineContext extends ParserRuleContext {
		public TerminalNode ARROW_LINE() { return getToken(CypherParser.ARROW_LINE, 0); }
		public TerminalNode MINUS() { return getToken(CypherParser.MINUS, 0); }
		public ArrowLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowLine; }
	}

	public final ArrowLineContext arrowLine() throws RecognitionException {
		ArrowLineContext _localctx = new ArrowLineContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrowLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==ARROW_LINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightArrowContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public TerminalNode ARROW_RIGHT_HEAD() { return getToken(CypherParser.ARROW_RIGHT_HEAD, 0); }
		public RightArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightArrow; }
	}

	public final RightArrowContext rightArrow() throws RecognitionException {
		RightArrowContext _localctx = new RightArrowContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_rightArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_la = _input.LA(1);
			if ( !(_la==GT || _la==ARROW_RIGHT_HEAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathLengthContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public PathLengthLiteralContext pathLengthLiteral() {
			return getRuleContext(PathLengthLiteralContext.class,0);
		}
		public PathLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathLength; }
	}

	public final PathLengthContext pathLength() throws RecognitionException {
		PathLengthContext _localctx = new PathLengthContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pathLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(TIMES);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNSIGNED_DECIMAL_INTEGER || _la==DOTDOT) {
				{
				setState(1054);
				pathLengthLiteral();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathLengthLiteralContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(CypherParser.DOTDOT, 0); }
		public List<TerminalNode> UNSIGNED_DECIMAL_INTEGER() { return getTokens(CypherParser.UNSIGNED_DECIMAL_INTEGER); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER(int i) {
			return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, i);
		}
		public PathLengthLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathLengthLiteral; }
	}

	public final PathLengthLiteralContext pathLengthLiteral() throws RecognitionException {
		PathLengthLiteralContext _localctx = new PathLengthLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pathLengthLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED_DECIMAL_INTEGER) {
					{
					setState(1057);
					match(UNSIGNED_DECIMAL_INTEGER);
					}
				}

				setState(1060);
				match(DOTDOT);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED_DECIMAL_INTEGER) {
					{
					setState(1061);
					match(UNSIGNED_DECIMAL_INTEGER);
					}
				}

				}
				break;
			case 2:
				{
				setState(1064);
				match(UNSIGNED_DECIMAL_INTEGER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpressionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public LabelExpressionNameContext labelExpressionName() {
			return getRuleContext(LabelExpressionNameContext.class,0);
		}
		public LabelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression; }
	}

	public final LabelExpressionContext labelExpression() throws RecognitionException {
		LabelExpressionContext _localctx = new LabelExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_labelExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(COLON);
			setState(1068);
			labelExpressionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpressionNameContext extends ParserRuleContext {
		public LabelExpression4ExpectingBarContext labelExpression4ExpectingBar() {
			return getRuleContext(LabelExpression4ExpectingBarContext.class,0);
		}
		public LabelExpression4Context labelExpression4() {
			return getRuleContext(LabelExpression4Context.class,0);
		}
		public LabelExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpressionName; }
	}

	public final LabelExpressionNameContext labelExpressionName() throws RecognitionException {
		LabelExpressionNameContext _localctx = new LabelExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_labelExpressionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1070);
				labelExpression4ExpectingBar();
				}
				break;
			case 2:
				{
				setState(1071);
				labelExpression4();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpression4Context extends ParserRuleContext {
		public List<LabelExpression3Context> labelExpression3() {
			return getRuleContexts(LabelExpression3Context.class);
		}
		public LabelExpression3Context labelExpression3(int i) {
			return getRuleContext(LabelExpression3Context.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(CypherParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(CypherParser.BAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public LabelExpression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression4; }
	}

	public final LabelExpression4Context labelExpression4() throws RecognitionException {
		LabelExpression4Context _localctx = new LabelExpression4Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_labelExpression4);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			labelExpression3();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					match(BAR);
					setState(1079);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COLON:
						{
						setState(1076);
						match(COLON);
						setState(1077);
						labelExpression3();
						}
						break;
					case ACCESS:
					case ACTIVE:
					case ADMIN:
					case ADMINISTRATOR:
					case ALIAS:
					case ALIASES:
					case ALL_SHORTEST_PATH:
					case ALL:
					case ALTER:
					case AND:
					case ANY:
					case AS:
					case ASC:
					case ASSERT:
					case ASSIGN:
					case AT:
					case BOOSTED:
					case BREAK:
					case BRIEF:
					case BTREE:
					case BUILT:
					case BY:
					case CALL:
					case CASE:
					case CHANGE:
					case COMMAND:
					case COMMANDS:
					case COMMIT:
					case COMPOSITE:
					case CONSTRAINT:
					case CONSTRAINTS:
					case CONTAINS:
					case COPY:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CSV:
					case CURRENT:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DBMS:
					case DEALLOCATE:
					case DEFAULT_TOKEN:
					case DEFINED:
					case DELETE:
					case DENY:
					case DESC:
					case DESTROY:
					case DETACH:
					case DISTINCT:
					case DRIVER:
					case DROP:
					case DRYRUN:
					case DUMP:
					case EACH:
					case ENABLE:
					case ELEMENT:
					case ELEMENTS:
					case ELSE:
					case ENCRYPTED:
					case END:
					case ENDS:
					case EXECUTABLE:
					case EXECUTE:
					case EXIST:
					case EXISTENCE:
					case EXISTS:
					case ERROR:
					case FAIL:
					case FALSE:
					case FIELDTERMINATOR:
					case FOR:
					case FOREACH:
					case FROM:
					case FULLTEXT:
					case FUNCTION:
					case FUNCTIONS:
					case GRANT:
					case GRAPH:
					case GRAPHS:
					case HEADERS:
					case HOME:
					case IF:
					case IMMUTABLE:
					case IN:
					case INDEX:
					case INDEXES:
					case INF:
					case INFINITY:
					case IS:
					case JOIN:
					case KEY:
					case LABEL:
					case LABELS:
					case EXCLAMATION_MARK:
					case LIMITROWS:
					case LOAD:
					case LOOKUP:
					case LPAREN:
					case MANAGEMENT:
					case MATCH:
					case MERGE:
					case PERCENT:
					case NAME:
					case NAMES:
					case NAN:
					case NEW:
					case NODE:
					case NODES:
					case NONE:
					case NOT:
					case NOWAIT:
					case NULL:
					case OF:
					case ON:
					case ONLY:
					case OPTIONAL:
					case OPTIONS:
					case OPTION:
					case OR:
					case ORDER:
					case OUTPUT:
					case PASSWORD:
					case PASSWORDS:
					case PERIODIC:
					case PLAINTEXT:
					case POINT:
					case POPULATED:
					case PRIMARY:
					case PRIMARIES:
					case PRIVILEGE:
					case PRIVILEGES:
					case PROCEDURE:
					case PROCEDURES:
					case PROPERTIES:
					case PROPERTY:
					case RANGE:
					case READ:
					case REALLOCATE:
					case REDUCE:
					case RENAME:
					case REL:
					case RELATIONSHIP:
					case RELATIONSHIPS:
					case REMOVE:
					case REPLACE:
					case REPORT:
					case REQUIRE:
					case REQUIRED:
					case RETURN:
					case REVOKE:
					case ROLE:
					case ROLES:
					case ROW:
					case ROWS:
					case SCAN:
					case SEC:
					case SECOND:
					case SECONDARY:
					case SECONDARIES:
					case SECONDS:
					case SEEK:
					case SERVER:
					case SERVERS:
					case SET:
					case SETTING:
					case SETTINGS:
					case SHORTEST_PATH:
					case SHOW:
					case SINGLE:
					case SKIPROWS:
					case START:
					case STARTS:
					case STATUS:
					case STOP:
					case SUSPENDED:
					case TARGET:
					case TERMINATE:
					case TEXT:
					case THEN:
					case TO:
					case TOPOLOGY:
					case TRANSACTION:
					case TRANSACTIONS:
					case TRAVERSE:
					case TRUE:
					case TYPE:
					case TYPES:
					case UNION:
					case UNIQUE:
					case UNIQUENESS:
					case UNWIND:
					case USE:
					case USER:
					case USERS:
					case USING:
					case VERBOSE:
					case WAIT:
					case WHEN:
					case WHERE:
					case WITH:
					case WRITE:
					case XOR:
					case YIELD:
					case IDENTIFIER:
					case ESCAPED_SYMBOLIC_NAME:
						{
						setState(1078);
						labelExpression3();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpression4ExpectingBarContext extends ParserRuleContext {
		public List<LabelExpression3Context> labelExpression3() {
			return getRuleContexts(LabelExpression3Context.class);
		}
		public LabelExpression3Context labelExpression3(int i) {
			return getRuleContext(LabelExpression3Context.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(CypherParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(CypherParser.BAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public LabelExpression4ExpectingBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression4ExpectingBar; }
	}

	public final LabelExpression4ExpectingBarContext labelExpression4ExpectingBar() throws RecognitionException {
		LabelExpression4ExpectingBarContext _localctx = new LabelExpression4ExpectingBarContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_labelExpression4ExpectingBar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			labelExpression3();
			setState(1095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1087);
					match(BAR);
					setState(1091);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COLON:
						{
						setState(1088);
						match(COLON);
						setState(1089);
						labelExpression3();
						}
						break;
					case ACCESS:
					case ACTIVE:
					case ADMIN:
					case ADMINISTRATOR:
					case ALIAS:
					case ALIASES:
					case ALL_SHORTEST_PATH:
					case ALL:
					case ALTER:
					case AND:
					case ANY:
					case AS:
					case ASC:
					case ASSERT:
					case ASSIGN:
					case AT:
					case BOOSTED:
					case BREAK:
					case BRIEF:
					case BTREE:
					case BUILT:
					case BY:
					case CALL:
					case CASE:
					case CHANGE:
					case COMMAND:
					case COMMANDS:
					case COMMIT:
					case COMPOSITE:
					case CONSTRAINT:
					case CONSTRAINTS:
					case CONTAINS:
					case COPY:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CSV:
					case CURRENT:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DBMS:
					case DEALLOCATE:
					case DEFAULT_TOKEN:
					case DEFINED:
					case DELETE:
					case DENY:
					case DESC:
					case DESTROY:
					case DETACH:
					case DISTINCT:
					case DRIVER:
					case DROP:
					case DRYRUN:
					case DUMP:
					case EACH:
					case ENABLE:
					case ELEMENT:
					case ELEMENTS:
					case ELSE:
					case ENCRYPTED:
					case END:
					case ENDS:
					case EXECUTABLE:
					case EXECUTE:
					case EXIST:
					case EXISTENCE:
					case EXISTS:
					case ERROR:
					case FAIL:
					case FALSE:
					case FIELDTERMINATOR:
					case FOR:
					case FOREACH:
					case FROM:
					case FULLTEXT:
					case FUNCTION:
					case FUNCTIONS:
					case GRANT:
					case GRAPH:
					case GRAPHS:
					case HEADERS:
					case HOME:
					case IF:
					case IMMUTABLE:
					case IN:
					case INDEX:
					case INDEXES:
					case INF:
					case INFINITY:
					case IS:
					case JOIN:
					case KEY:
					case LABEL:
					case LABELS:
					case EXCLAMATION_MARK:
					case LIMITROWS:
					case LOAD:
					case LOOKUP:
					case LPAREN:
					case MANAGEMENT:
					case MATCH:
					case MERGE:
					case PERCENT:
					case NAME:
					case NAMES:
					case NAN:
					case NEW:
					case NODE:
					case NODES:
					case NONE:
					case NOT:
					case NOWAIT:
					case NULL:
					case OF:
					case ON:
					case ONLY:
					case OPTIONAL:
					case OPTIONS:
					case OPTION:
					case OR:
					case ORDER:
					case OUTPUT:
					case PASSWORD:
					case PASSWORDS:
					case PERIODIC:
					case PLAINTEXT:
					case POINT:
					case POPULATED:
					case PRIMARY:
					case PRIMARIES:
					case PRIVILEGE:
					case PRIVILEGES:
					case PROCEDURE:
					case PROCEDURES:
					case PROPERTIES:
					case PROPERTY:
					case RANGE:
					case READ:
					case REALLOCATE:
					case REDUCE:
					case RENAME:
					case REL:
					case RELATIONSHIP:
					case RELATIONSHIPS:
					case REMOVE:
					case REPLACE:
					case REPORT:
					case REQUIRE:
					case REQUIRED:
					case RETURN:
					case REVOKE:
					case ROLE:
					case ROLES:
					case ROW:
					case ROWS:
					case SCAN:
					case SEC:
					case SECOND:
					case SECONDARY:
					case SECONDARIES:
					case SECONDS:
					case SEEK:
					case SERVER:
					case SERVERS:
					case SET:
					case SETTING:
					case SETTINGS:
					case SHORTEST_PATH:
					case SHOW:
					case SINGLE:
					case SKIPROWS:
					case START:
					case STARTS:
					case STATUS:
					case STOP:
					case SUSPENDED:
					case TARGET:
					case TERMINATE:
					case TEXT:
					case THEN:
					case TO:
					case TOPOLOGY:
					case TRANSACTION:
					case TRANSACTIONS:
					case TRAVERSE:
					case TRUE:
					case TYPE:
					case TYPES:
					case UNION:
					case UNIQUE:
					case UNIQUENESS:
					case UNWIND:
					case USE:
					case USER:
					case USERS:
					case USING:
					case VERBOSE:
					case WAIT:
					case WHEN:
					case WHERE:
					case WITH:
					case WRITE:
					case XOR:
					case YIELD:
					case IDENTIFIER:
					case ESCAPED_SYMBOLIC_NAME:
						{
						setState(1090);
						labelExpression3();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpression3Context extends ParserRuleContext {
		public List<LabelExpression2Context> labelExpression2() {
			return getRuleContexts(LabelExpression2Context.class);
		}
		public LabelExpression2Context labelExpression2(int i) {
			return getRuleContext(LabelExpression2Context.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(CypherParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(CypherParser.AMPERSAND, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public LabelExpression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression3; }
	}

	public final LabelExpression3Context labelExpression3() throws RecognitionException {
		LabelExpression3Context _localctx = new LabelExpression3Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_labelExpression3);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			labelExpression2();
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1103);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AMPERSAND:
						{
						setState(1099);
						match(AMPERSAND);
						setState(1100);
						labelExpression2();
						}
						break;
					case COLON:
						{
						setState(1101);
						match(COLON);
						setState(1102);
						labelExpression2();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpression2Context extends ParserRuleContext {
		public TerminalNode EXCLAMATION_MARK() { return getToken(CypherParser.EXCLAMATION_MARK, 0); }
		public LabelExpression2Context labelExpression2() {
			return getRuleContext(LabelExpression2Context.class,0);
		}
		public LabelExpression1Context labelExpression1() {
			return getRuleContext(LabelExpression1Context.class,0);
		}
		public LabelExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression2; }
	}

	public final LabelExpression2Context labelExpression2() throws RecognitionException {
		LabelExpression2Context _localctx = new LabelExpression2Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_labelExpression2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION_MARK:
				{
				setState(1108);
				match(EXCLAMATION_MARK);
				setState(1109);
				labelExpression2();
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case LPAREN:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case PERCENT:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(1110);
				labelExpression1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelExpression1Context extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public LabelExpression4Context labelExpression4() {
			return getRuleContext(LabelExpression4Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode PERCENT() { return getToken(CypherParser.PERCENT, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public LabelExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelExpression1; }
	}

	public final LabelExpression1Context labelExpression1() throws RecognitionException {
		LabelExpression1Context _localctx = new LabelExpression1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_labelExpression1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1113);
				match(LPAREN);
				setState(1114);
				labelExpression4();
				setState(1115);
				match(RPAREN);
				}
				break;
			case PERCENT:
				{
				setState(1117);
				match(PERCENT);
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(1118);
				symbolicNameString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression12Context expression12() {
			return getRuleContext(Expression12Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			expression12();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression12Context extends ParserRuleContext {
		public List<Expression11Context> expression11() {
			return getRuleContexts(Expression11Context.class);
		}
		public Expression11Context expression11(int i) {
			return getRuleContext(Expression11Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CypherParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CypherParser.OR, i);
		}
		public Expression12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression12; }
	}

	public final Expression12Context expression12() throws RecognitionException {
		Expression12Context _localctx = new Expression12Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_expression12);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			expression11();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1124);
				match(OR);
				setState(1125);
				expression11();
				}
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression11Context extends ParserRuleContext {
		public List<Expression10Context> expression10() {
			return getRuleContexts(Expression10Context.class);
		}
		public Expression10Context expression10(int i) {
			return getRuleContext(Expression10Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(CypherParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(CypherParser.XOR, i);
		}
		public Expression11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression11; }
	}

	public final Expression11Context expression11() throws RecognitionException {
		Expression11Context _localctx = new Expression11Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_expression11);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			expression10();
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(1132);
				match(XOR);
				setState(1133);
				expression10();
				}
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression10Context extends ParserRuleContext {
		public List<Expression9Context> expression9() {
			return getRuleContexts(Expression9Context.class);
		}
		public Expression9Context expression9(int i) {
			return getRuleContext(Expression9Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CypherParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CypherParser.AND, i);
		}
		public Expression10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression10; }
	}

	public final Expression10Context expression10() throws RecognitionException {
		Expression10Context _localctx = new Expression10Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_expression10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			expression9();
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1140);
				match(AND);
				setState(1141);
				expression9();
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression9Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public Expression9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression9; }
	}

	public final Expression9Context expression9() throws RecognitionException {
		Expression9Context _localctx = new Expression9Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_expression9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1147);
				match(NOT);
				setState(1148);
				expression9();
				}
				break;
			case 2:
				{
				setState(1149);
				expression8();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression8Context extends ParserRuleContext {
		public List<Expression7Context> expression7() {
			return getRuleContexts(Expression7Context.class);
		}
		public Expression7Context expression7(int i) {
			return getRuleContext(Expression7Context.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CypherParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CypherParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(CypherParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(CypherParser.NEQ, i);
		}
		public List<TerminalNode> NEQ2() { return getTokens(CypherParser.NEQ2); }
		public TerminalNode NEQ2(int i) {
			return getToken(CypherParser.NEQ2, i);
		}
		public List<TerminalNode> LE() { return getTokens(CypherParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(CypherParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(CypherParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(CypherParser.GE, i);
		}
		public List<TerminalNode> LT() { return getTokens(CypherParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CypherParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CypherParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CypherParser.GT, i);
		}
		public Expression8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression8; }
	}

	public final Expression8Context expression8() throws RecognitionException {
		Expression8Context _localctx = new Expression8Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_expression8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			expression7();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (EQ - 77)) | (1L << (GE - 77)) | (1L << (GT - 77)) | (1L << (LE - 77)) | (1L << (LT - 77)) | (1L << (NEQ - 77)) | (1L << (NEQ2 - 77)))) != 0)) {
				{
				setState(1167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(1153);
					match(EQ);
					setState(1154);
					expression7();
					}
					break;
				case NEQ:
					{
					setState(1155);
					match(NEQ);
					setState(1156);
					expression7();
					}
					break;
				case NEQ2:
					{
					setState(1157);
					match(NEQ2);
					setState(1158);
					expression7();
					}
					break;
				case LE:
					{
					setState(1159);
					match(LE);
					setState(1160);
					expression7();
					}
					break;
				case GE:
					{
					setState(1161);
					match(GE);
					setState(1162);
					expression7();
					}
					break;
				case LT:
					{
					setState(1163);
					match(LT);
					setState(1164);
					expression7();
					}
					break;
				case GT:
					{
					setState(1165);
					match(GT);
					setState(1166);
					expression7();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression7Context extends ParserRuleContext {
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public ComparisonExpression6Context comparisonExpression6() {
			return getRuleContext(ComparisonExpression6Context.class,0);
		}
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
	}

	public final Expression7Context expression7() throws RecognitionException {
		Expression7Context _localctx = new Expression7Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_expression7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			expression6();
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ENDS - 76)) | (1L << (IN - 76)) | (1L << (IS - 76)))) != 0) || _la==REGEQ || _la==STARTS) {
				{
				setState(1173);
				comparisonExpression6();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpression6Context extends ParserRuleContext {
		public TerminalNode REGEQ() { return getToken(CypherParser.REGEQ, 0); }
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NULL() { return getToken(CypherParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public ComparisonExpression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression6; }
	}

	public final ComparisonExpression6Context comparisonExpression6() throws RecognitionException {
		ComparisonExpression6Context _localctx = new ComparisonExpression6Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_comparisonExpression6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEQ:
				{
				setState(1176);
				match(REGEQ);
				setState(1177);
				expression6();
				}
				break;
			case STARTS:
				{
				setState(1178);
				match(STARTS);
				setState(1179);
				match(WITH);
				setState(1180);
				expression6();
				}
				break;
			case ENDS:
				{
				setState(1181);
				match(ENDS);
				setState(1182);
				match(WITH);
				setState(1183);
				expression6();
				}
				break;
			case CONTAINS:
				{
				setState(1184);
				match(CONTAINS);
				setState(1185);
				expression6();
				}
				break;
			case IN:
				{
				setState(1186);
				match(IN);
				setState(1187);
				expression6();
				}
				break;
			case IS:
				{
				setState(1188);
				match(IS);
				setState(1192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(1189);
					match(NULL);
					}
					break;
				case NOT:
					{
					setState(1190);
					match(NOT);
					setState(1191);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression6Context extends ParserRuleContext {
		public List<Expression5Context> expression5() {
			return getRuleContexts(Expression5Context.class);
		}
		public Expression5Context expression5(int i) {
			return getRuleContext(Expression5Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CypherParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CypherParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CypherParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CypherParser.MINUS, i);
		}
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
	}

	public final Expression6Context expression6() throws RecognitionException {
		Expression6Context _localctx = new Expression6Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_expression6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			expression5();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				setState(1201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(1197);
					match(PLUS);
					setState(1198);
					expression5();
					}
					break;
				case MINUS:
					{
					setState(1199);
					match(MINUS);
					setState(1200);
					expression5();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression5Context extends ParserRuleContext {
		public List<Expression4Context> expression4() {
			return getRuleContexts(Expression4Context.class);
		}
		public Expression4Context expression4(int i) {
			return getRuleContext(Expression4Context.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CypherParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CypherParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CypherParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CypherParser.DIVIDE, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CypherParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CypherParser.PERCENT, i);
		}
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_expression5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			expression4();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==PERCENT || _la==TIMES) {
				{
				setState(1213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(1207);
					match(TIMES);
					setState(1208);
					expression4();
					}
					break;
				case DIVIDE:
					{
					setState(1209);
					match(DIVIDE);
					setState(1210);
					expression4();
					}
					break;
				case PERCENT:
					{
					setState(1211);
					match(PERCENT);
					setState(1212);
					expression4();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression4Context extends ParserRuleContext {
		public List<Expression3Context> expression3() {
			return getRuleContexts(Expression3Context.class);
		}
		public Expression3Context expression3(int i) {
			return getRuleContext(Expression3Context.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(CypherParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(CypherParser.POW, i);
		}
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_expression4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			expression3();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(1219);
				match(POW);
				setState(1220);
				expression3();
				}
				}
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression3Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(CypherParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CypherParser.MINUS, 0); }
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_expression3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1226);
				expression2();
				}
				break;
			case 2:
				{
				setState(1227);
				match(PLUS);
				setState(1228);
				expression2();
				}
				break;
			case 3:
				{
				setState(1229);
				match(MINUS);
				setState(1230);
				expression2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public List<PostFix1Context> postFix1() {
			return getRuleContexts(PostFix1Context.class);
		}
		public PostFix1Context postFix1(int i) {
			return getRuleContext(PostFix1Context.class,i);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_expression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			expression1();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==DOT || _la==LBRACKET) {
				{
				{
				setState(1234);
				postFix1();
				}
				}
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostFix1Context extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LabelExpressionPredicateContext labelExpressionPredicate() {
			return getRuleContext(LabelExpressionPredicateContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode DOTDOT() { return getToken(CypherParser.DOTDOT, 0); }
		public PostFix1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postFix1; }
	}

	public final PostFix1Context postFix1() throws RecognitionException {
		PostFix1Context _localctx = new PostFix1Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_postFix1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1240);
				property();
				}
				break;
			case 2:
				{
				setState(1241);
				labelExpressionPredicate();
				}
				break;
			case 3:
				{
				setState(1242);
				match(LBRACKET);
				setState(1243);
				expression();
				setState(1244);
				match(RBRACKET);
				}
				break;
			case 4:
				{
				setState(1246);
				match(LBRACKET);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER) | (1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DOLLAR) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LBRACKET - 65)) | (1L << (LCURLY - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (LPAREN - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)) | (1L << (MINUS - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (PLUS - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (STRING_LITERAL1 - 194)) | (1L << (STRING_LITERAL2 - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
					{
					setState(1247);
					expression();
					}
				}

				setState(1250);
				match(DOTDOT);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER) | (1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DOLLAR) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LBRACKET - 65)) | (1L << (LCURLY - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (LPAREN - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)) | (1L << (MINUS - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (PLUS - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (STRING_LITERAL1 - 194)) | (1L << (STRING_LITERAL2 - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
					{
					setState(1251);
					expression();
					}
				}

				setState(1254);
				match(RBRACKET);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CypherParser.DOT, 0); }
		public PropertyKeyNameContext propertyKeyName() {
			return getRuleContext(PropertyKeyNameContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(DOT);
			setState(1258);
			propertyKeyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyExpressionContext extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_propertyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			expression1();
			setState(1262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1261);
				property();
				}
				}
				setState(1264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ExistsExpressionContext existsExpression() {
			return getRuleContext(ExistsExpressionContext.class,0);
		}
		public CountExpressionContext countExpression() {
			return getRuleContext(CountExpressionContext.class,0);
		}
		public MapProjectionContext mapProjection() {
			return getRuleContext(MapProjectionContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public PatternComprehensionContext patternComprehension() {
			return getRuleContext(PatternComprehensionContext.class,0);
		}
		public ReduceExpressionContext reduceExpression() {
			return getRuleContext(ReduceExpressionContext.class,0);
		}
		public AllExpressionContext allExpression() {
			return getRuleContext(AllExpressionContext.class,0);
		}
		public AnyExpressionContext anyExpression() {
			return getRuleContext(AnyExpressionContext.class,0);
		}
		public NoneExpressionContext noneExpression() {
			return getRuleContext(NoneExpressionContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PatternExpressionContext patternExpression() {
			return getRuleContext(PatternExpressionContext.class,0);
		}
		public ShortestPathExpressionContext shortestPathExpression() {
			return getRuleContext(ShortestPathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_expression1);
		try {
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268);
				caseExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1269);
				match(COUNT);
				setState(1270);
				match(LPAREN);
				setState(1271);
				match(TIMES);
				setState(1272);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1273);
				existsExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1274);
				countExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1275);
				mapProjection();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1276);
				listComprehension();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1277);
				patternComprehension();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1278);
				reduceExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1279);
				allExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1280);
				anyExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1281);
				noneExpression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1282);
				singleExpression();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1283);
				patternExpression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1284);
				shortestPathExpression();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1285);
				match(LPAREN);
				setState(1286);
				expression();
				setState(1287);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1289);
				functionInvocation();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1290);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public TerminalNode INFINITY() { return getToken(CypherParser.INFINITY, 0); }
		public TerminalNode INF() { return getToken(CypherParser.INF, 0); }
		public TerminalNode NAN() { return getToken(CypherParser.NAN, 0); }
		public TerminalNode NULL() { return getToken(CypherParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_literal);
		int _la;
		try {
			setState(1302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_DOUBLE:
			case UNSIGNED_DECIMAL_INTEGER:
			case UNSIGNED_HEX_INTEGER:
			case UNSIGNED_OCTAL_INTEGER:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				numberLiteral();
				}
				break;
			case STRING_LITERAL1:
			case STRING_LITERAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				stringLiteral();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				mapLiteral();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				listLiteral();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1297);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1298);
				match(FALSE);
				}
				break;
			case INF:
			case INFINITY:
				enterOuterAlt(_localctx, 7);
				{
				setState(1299);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==INFINITY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(1300);
				match(NAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1301);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(CypherParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(CypherParser.THEN, i);
		}
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(CypherParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(CypherParser.WHEN, i);
		}
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(CASE);
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1305);
				expression();
				setState(1306);
				match(WHEN);
				}
				break;
			case 2:
				{
				setState(1308);
				match(WHEN);
				}
				break;
			}
			setState(1311);
			expression();
			setState(1312);
			match(THEN);
			setState(1313);
			expression();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(1314);
				match(WHEN);
				setState(1315);
				expression();
				setState(1316);
				match(THEN);
				setState(1317);
				expression();
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1324);
				match(ELSE);
				setState(1325);
				expression();
				}
			}

			setState(1328);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public TerminalNode BAR() { return getToken(CypherParser.BAR, 0); }
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(LBRACKET);
			setState(1331);
			variable();
			setState(1332);
			match(IN);
			setState(1333);
			expression();
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1334);
				match(WHERE);
				setState(1335);
				expression();
				}
			}

			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BAR) {
				{
				setState(1338);
				match(BAR);
				setState(1339);
				expression();
				}
			}

			setState(1342);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public EveryPathPatternNonEmptyContext everyPathPatternNonEmpty() {
			return getRuleContext(EveryPathPatternNonEmptyContext.class,0);
		}
		public TerminalNode BAR() { return getToken(CypherParser.BAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CypherParser.EQ, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public PatternComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternComprehension; }
	}

	public final PatternComprehensionContext patternComprehension() throws RecognitionException {
		PatternComprehensionContext _localctx = new PatternComprehensionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_patternComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(LBRACKET);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1345);
				variable();
				setState(1346);
				match(EQ);
				}
			}

			setState(1350);
			everyPathPatternNonEmpty();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1351);
				match(WHERE);
				setState(1352);
				expression();
				}
			}

			setState(1355);
			match(BAR);
			setState(1356);
			expression();
			setState(1357);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternComprehensionPrefixContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public EveryPathPatternContext everyPathPattern() {
			return getRuleContext(EveryPathPatternContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public TerminalNode BAR() { return getToken(CypherParser.BAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CypherParser.EQ, 0); }
		public PatternComprehensionPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternComprehensionPrefix; }
	}

	public final PatternComprehensionPrefixContext patternComprehensionPrefix() throws RecognitionException {
		PatternComprehensionPrefixContext _localctx = new PatternComprehensionPrefixContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_patternComprehensionPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(LBRACKET);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1360);
				variable();
				setState(1361);
				match(EQ);
				}
			}

			setState(1365);
			everyPathPattern();
			setState(1366);
			_la = _input.LA(1);
			if ( !(_la==BAR || _la==WHERE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReduceExpressionContext extends ParserRuleContext {
		public TerminalNode REDUCE() { return getToken(CypherParser.REDUCE, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CypherParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CypherParser.COMMA, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode BAR() { return getToken(CypherParser.BAR, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ReduceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceExpression; }
	}

	public final ReduceExpressionContext reduceExpression() throws RecognitionException {
		ReduceExpressionContext _localctx = new ReduceExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_reduceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(REDUCE);
			setState(1369);
			match(LPAREN);
			setState(1370);
			variable();
			setState(1371);
			match(EQ);
			setState(1372);
			expression();
			setState(1373);
			match(COMMA);
			setState(1374);
			variable();
			setState(1375);
			match(IN);
			setState(1376);
			expression();
			setState(1377);
			match(BAR);
			setState(1378);
			expression();
			setState(1379);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllExpressionContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public AllExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allExpression; }
	}

	public final AllExpressionContext allExpression() throws RecognitionException {
		AllExpressionContext _localctx = new AllExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_allExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(ALL);
			setState(1382);
			match(LPAREN);
			setState(1383);
			variable();
			setState(1384);
			match(IN);
			setState(1385);
			expression();
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1386);
				match(WHERE);
				setState(1387);
				expression();
				}
			}

			setState(1390);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyExpressionContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public AnyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyExpression; }
	}

	public final AnyExpressionContext anyExpression() throws RecognitionException {
		AnyExpressionContext _localctx = new AnyExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_anyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(ANY);
			setState(1393);
			match(LPAREN);
			setState(1394);
			variable();
			setState(1395);
			match(IN);
			setState(1396);
			expression();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1397);
				match(WHERE);
				setState(1398);
				expression();
				}
			}

			setState(1401);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoneExpressionContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public NoneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noneExpression; }
	}

	public final NoneExpressionContext noneExpression() throws RecognitionException {
		NoneExpressionContext _localctx = new NoneExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_noneExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(NONE);
			setState(1404);
			match(LPAREN);
			setState(1405);
			variable();
			setState(1406);
			match(IN);
			setState(1407);
			expression();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1408);
				match(WHERE);
				setState(1409);
				expression();
				}
			}

			setState(1412);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_singleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(SINGLE);
			setState(1415);
			match(LPAREN);
			setState(1416);
			variable();
			setState(1417);
			match(IN);
			setState(1418);
			expression();
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1419);
				match(WHERE);
				setState(1420);
				expression();
				}
			}

			setState(1423);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternExpressionContext extends ParserRuleContext {
		public EveryPathPatternNonEmptyContext everyPathPatternNonEmpty() {
			return getRuleContext(EveryPathPatternNonEmptyContext.class,0);
		}
		public PatternExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternExpression; }
	}

	public final PatternExpressionContext patternExpression() throws RecognitionException {
		PatternExpressionContext _localctx = new PatternExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_patternExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			everyPathPatternNonEmpty();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortestPathExpressionContext extends ParserRuleContext {
		public ShortestPathPatternContext shortestPathPattern() {
			return getRuleContext(ShortestPathPatternContext.class,0);
		}
		public ShortestPathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortestPathExpression; }
	}

	public final ShortestPathExpressionContext shortestPathExpression() throws RecognitionException {
		ShortestPathExpressionContext _localctx = new ShortestPathExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_shortestPathExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			shortestPathPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapProjectionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public List<MapProjectionItemContext> mapProjectionItem() {
			return getRuleContexts(MapProjectionItemContext.class);
		}
		public MapProjectionItemContext mapProjectionItem(int i) {
			return getRuleContext(MapProjectionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public MapProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapProjection; }
	}

	public final MapProjectionContext mapProjection() throws RecognitionException {
		MapProjectionContext _localctx = new MapProjectionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_mapProjection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			variable();
			setState(1430);
			match(LCURLY);
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT) | (1L << DOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1431);
				mapProjectionItem();
				}
			}

			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1434);
				match(COMMA);
				setState(1435);
				mapProjectionItem();
				}
				}
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1441);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapProjectionItemContext extends ParserRuleContext {
		public PropertyKeyNameContext propertyKeyName() {
			return getRuleContext(PropertyKeyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CypherParser.DOT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public MapProjectionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapProjectionItem; }
	}

	public final MapProjectionItemContext mapProjectionItem() throws RecognitionException {
		MapProjectionItemContext _localctx = new MapProjectionItemContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_mapProjectionItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1443);
				propertyKeyName();
				setState(1444);
				match(COLON);
				setState(1445);
				expression();
				}
				break;
			case 2:
				{
				setState(1447);
				match(DOT);
				setState(1448);
				propertyKeyName();
				}
				break;
			case 3:
				{
				setState(1449);
				variable();
				}
				break;
			case 4:
				{
				setState(1450);
				match(DOT);
				setState(1451);
				match(TIMES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsExpressionContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ExistsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsExpression; }
	}

	public final ExistsExpressionContext existsExpression() throws RecognitionException {
		ExistsExpressionContext _localctx = new ExistsExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_existsExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(EXISTS);
			setState(1455);
			match(LCURLY);
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1456);
				regularQuery();
				}
				break;
			case 2:
				{
				setState(1457);
				patternList();
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1458);
					whereClause();
					}
				}

				}
				break;
			}
			setState(1463);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountExpressionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CountExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countExpression; }
	}

	public final CountExpressionContext countExpression() throws RecognitionException {
		CountExpressionContext _localctx = new CountExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_countExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(COUNT);
			setState(1466);
			match(LCURLY);
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1467);
				regularQuery();
				}
				break;
			case 2:
				{
				setState(1468);
				patternList();
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1469);
					whereClause();
					}
				}

				}
				break;
			}
			setState(1474);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public StringTokenContext stringToken() {
			return getRuleContext(StringTokenContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			stringToken();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_DOUBLE() { return getToken(CypherParser.DECIMAL_DOUBLE, 0); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER() { return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, 0); }
		public TerminalNode UNSIGNED_HEX_INTEGER() { return getToken(CypherParser.UNSIGNED_HEX_INTEGER, 0); }
		public TerminalNode UNSIGNED_OCTAL_INTEGER() { return getToken(CypherParser.UNSIGNED_OCTAL_INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(CypherParser.MINUS, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1478);
				match(MINUS);
				}
			}

			setState(1481);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedIntegerLiteralContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_DECIMAL_INTEGER() { return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(CypherParser.MINUS, 0); }
		public SignedIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedIntegerLiteral; }
	}

	public final SignedIntegerLiteralContext signedIntegerLiteral() throws RecognitionException {
		SignedIntegerLiteralContext _localctx = new SignedIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_signedIntegerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1483);
				match(MINUS);
				}
			}

			setState(1486);
			match(UNSIGNED_DECIMAL_INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(LBRACKET);
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER) | (1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DOLLAR) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LBRACKET - 65)) | (1L << (LCURLY - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (LPAREN - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)) | (1L << (MINUS - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (PLUS - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (STRING_LITERAL1 - 194)) | (1L << (STRING_LITERAL2 - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1489);
				expression();
				}
			}

			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1492);
				match(COMMA);
				setState(1493);
				expression();
				}
				}
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1499);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public List<PropertyKeyNameContext> propertyKeyName() {
			return getRuleContexts(PropertyKeyNameContext.class);
		}
		public PropertyKeyNameContext propertyKeyName(int i) {
			return getRuleContext(PropertyKeyNameContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(LCURLY);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1502);
				propertyKeyName();
				setState(1503);
				match(COLON);
				setState(1504);
				expression();
				}
			}

			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1508);
				match(COMMA);
				setState(1509);
				propertyKeyName();
				setState(1510);
				match(COLON);
				setState(1511);
				expression();
				}
				}
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1518);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyKeyNameContext extends ParserRuleContext {
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public PropertyKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKeyName; }
	}

	public final PropertyKeyNameContext propertyKeyName() throws RecognitionException {
		PropertyKeyNameContext _localctx = new PropertyKeyNameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_propertyKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			symbolicNameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(CypherParser.DOLLAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode UNSIGNED_DECIMAL_INTEGER() { return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(DOLLAR);
			setState(1525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(1523);
				variable();
				}
				break;
			case UNSIGNED_DECIMAL_INTEGER:
				{
				setState(1524);
				match(UNSIGNED_DECIMAL_INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInvocationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			functionName();
			setState(1528);
			match(LPAREN);
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1529);
				match(DISTINCT);
				}
				break;
			}
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_DOUBLE) | (1L << UNSIGNED_DECIMAL_INTEGER) | (1L << UNSIGNED_HEX_INTEGER) | (1L << UNSIGNED_OCTAL_INTEGER) | (1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DOLLAR) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LBRACKET - 65)) | (1L << (LCURLY - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (LPAREN - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)) | (1L << (MINUS - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (PLUS - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (STRING_LITERAL1 - 194)) | (1L << (STRING_LITERAL2 - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(1532);
				functionArgument();
				}
			}

			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1535);
				match(COMMA);
				setState(1536);
				functionArgument();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1542);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			namespace();
			setState(1545);
			symbolicNameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1549);
					symbolicNameString();
					setState(1550);
					match(DOT);
					}
					} 
				}
				setState(1556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableList1Context extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public VariableList1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList1; }
	}

	public final VariableList1Context variableList1() throws RecognitionException {
		VariableList1Context _localctx = new VariableList1Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_variableList1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			symbolicNameString();
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1558);
				match(COMMA);
				setState(1559);
				symbolicNameString();
				}
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			symbolicNameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicNameList1Context extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SymbolicNameList1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicNameList1; }
	}

	public final SymbolicNameList1Context symbolicNameList1() throws RecognitionException {
		SymbolicNameList1Context _localctx = new SymbolicNameList1Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_symbolicNameList1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			symbolicNameString();
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1568);
				match(COMMA);
				setState(1569);
				symbolicNameString();
				}
				}
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateCommandContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public CreateConstraintContext createConstraint() {
			return getRuleContext(CreateConstraintContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public CreateAliasContext createAlias() {
			return getRuleContext(CreateAliasContext.class,0);
		}
		public CreateCompositeDatabaseContext createCompositeDatabase() {
			return getRuleContext(CreateCompositeDatabaseContext.class,0);
		}
		public TerminalNode OR() { return getToken(CypherParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(CypherParser.REPLACE, 0); }
		public CreateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommand; }
	}

	public final CreateCommandContext createCommand() throws RecognitionException {
		CreateCommandContext _localctx = new CreateCommandContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_createCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(CREATE);
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1576);
				match(OR);
				setState(1577);
				match(REPLACE);
				}
			}

			setState(1587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROLE:
				{
				setState(1580);
				createRole();
				}
				break;
			case USER:
				{
				setState(1581);
				createUser();
				}
				break;
			case DATABASE:
				{
				setState(1582);
				createDatabase();
				}
				break;
			case CONSTRAINT:
				{
				setState(1583);
				createConstraint();
				}
				break;
			case BTREE:
			case FULLTEXT:
			case INDEX:
			case LOOKUP:
			case POINT:
			case RANGE:
			case TEXT:
				{
				setState(1584);
				createIndex();
				}
				break;
			case ALIAS:
				{
				setState(1585);
				createAlias();
				}
				break;
			case COMPOSITE:
				{
				setState(1586);
				createCompositeDatabase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandWithUseGraphContext commandWithUseGraph() {
			return getRuleContext(CommandWithUseGraphContext.class,0);
		}
		public ShowCommandContext showCommand() {
			return getRuleContext(ShowCommandContext.class,0);
		}
		public TerminateCommandContext terminateCommand() {
			return getRuleContext(TerminateCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
			case DEALLOCATE:
			case DENY:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case GRANT:
			case REALLOCATE:
			case RENAME:
			case REVOKE:
			case START:
			case STOP:
				{
				setState(1589);
				commandWithUseGraph();
				}
				break;
			case SHOW:
				{
				setState(1590);
				showCommand();
				}
				break;
			case TERMINATE:
				{
				setState(1591);
				terminateCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandWithUseGraphContext extends ParserRuleContext {
		public DropCommandContext dropCommand() {
			return getRuleContext(DropCommandContext.class,0);
		}
		public AlterCommandContext alterCommand() {
			return getRuleContext(AlterCommandContext.class,0);
		}
		public RenameCommandContext renameCommand() {
			return getRuleContext(RenameCommandContext.class,0);
		}
		public DenyPrivilegeContext denyPrivilege() {
			return getRuleContext(DenyPrivilegeContext.class,0);
		}
		public RevokeCommandContext revokeCommand() {
			return getRuleContext(RevokeCommandContext.class,0);
		}
		public GrantCommandContext grantCommand() {
			return getRuleContext(GrantCommandContext.class,0);
		}
		public StartDatabaseContext startDatabase() {
			return getRuleContext(StartDatabaseContext.class,0);
		}
		public StopDatabaseContext stopDatabase() {
			return getRuleContext(StopDatabaseContext.class,0);
		}
		public EnableServerCommandContext enableServerCommand() {
			return getRuleContext(EnableServerCommandContext.class,0);
		}
		public AllocationCommandContext allocationCommand() {
			return getRuleContext(AllocationCommandContext.class,0);
		}
		public CommandWithUseGraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandWithUseGraph; }
	}

	public final CommandWithUseGraphContext commandWithUseGraph() throws RecognitionException {
		CommandWithUseGraphContext _localctx = new CommandWithUseGraphContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_commandWithUseGraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DROP:
				{
				setState(1594);
				dropCommand();
				}
				break;
			case ALTER:
				{
				setState(1595);
				alterCommand();
				}
				break;
			case RENAME:
				{
				setState(1596);
				renameCommand();
				}
				break;
			case DENY:
				{
				setState(1597);
				denyPrivilege();
				}
				break;
			case REVOKE:
				{
				setState(1598);
				revokeCommand();
				}
				break;
			case GRANT:
				{
				setState(1599);
				grantCommand();
				}
				break;
			case START:
				{
				setState(1600);
				startDatabase();
				}
				break;
			case STOP:
				{
				setState(1601);
				stopDatabase();
				}
				break;
			case ENABLE:
				{
				setState(1602);
				enableServerCommand();
				}
				break;
			case DEALLOCATE:
			case DRYRUN:
			case REALLOCATE:
				{
				setState(1603);
				allocationCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropCommandContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(CypherParser.DROP, 0); }
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public DropConstraintContext dropConstraint() {
			return getRuleContext(DropConstraintContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public DropAliasContext dropAlias() {
			return getRuleContext(DropAliasContext.class,0);
		}
		public DropServerContext dropServer() {
			return getRuleContext(DropServerContext.class,0);
		}
		public DropCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropCommand; }
	}

	public final DropCommandContext dropCommand() throws RecognitionException {
		DropCommandContext _localctx = new DropCommandContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dropCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(DROP);
			setState(1614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROLE:
				{
				setState(1607);
				dropRole();
				}
				break;
			case USER:
				{
				setState(1608);
				dropUser();
				}
				break;
			case COMPOSITE:
			case DATABASE:
				{
				setState(1609);
				dropDatabase();
				}
				break;
			case CONSTRAINT:
				{
				setState(1610);
				dropConstraint();
				}
				break;
			case INDEX:
				{
				setState(1611);
				dropIndex();
				}
				break;
			case ALIAS:
				{
				setState(1612);
				dropAlias();
				}
				break;
			case SERVER:
				{
				setState(1613);
				dropServer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterCommandContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(CypherParser.ALTER, 0); }
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public AlterAliasContext alterAlias() {
			return getRuleContext(AlterAliasContext.class,0);
		}
		public AlterCurrentUserContext alterCurrentUser() {
			return getRuleContext(AlterCurrentUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public AlterServerContext alterServer() {
			return getRuleContext(AlterServerContext.class,0);
		}
		public AlterCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCommand; }
	}

	public final AlterCommandContext alterCommand() throws RecognitionException {
		AlterCommandContext _localctx = new AlterCommandContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_alterCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(ALTER);
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				{
				setState(1617);
				alterDatabase();
				}
				break;
			case ALIAS:
				{
				setState(1618);
				alterAlias();
				}
				break;
			case CURRENT:
				{
				setState(1619);
				alterCurrentUser();
				}
				break;
			case USER:
				{
				setState(1620);
				alterUser();
				}
				break;
			case SERVER:
				{
				setState(1621);
				alterServer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowCommandContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CypherParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public ShowAllCommandContext showAllCommand() {
			return getRuleContext(ShowAllCommandContext.class,0);
		}
		public TerminalNode POPULATED() { return getToken(CypherParser.POPULATED, 0); }
		public ShowRolesContext showRoles() {
			return getRuleContext(ShowRolesContext.class,0);
		}
		public TerminalNode BTREE() { return getToken(CypherParser.BTREE, 0); }
		public ShowIndexesAllowBriefContext showIndexesAllowBrief() {
			return getRuleContext(ShowIndexesAllowBriefContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public ShowIndexesNoBriefContext showIndexesNoBrief() {
			return getRuleContext(ShowIndexesNoBriefContext.class,0);
		}
		public TerminalNode FULLTEXT() { return getToken(CypherParser.FULLTEXT, 0); }
		public TerminalNode TEXT() { return getToken(CypherParser.TEXT, 0); }
		public TerminalNode POINT() { return getToken(CypherParser.POINT, 0); }
		public TerminalNode LOOKUP() { return getToken(CypherParser.LOOKUP, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public ShowConstraintsAllowBriefAndYieldContext showConstraintsAllowBriefAndYield() {
			return getRuleContext(ShowConstraintsAllowBriefAndYieldContext.class,0);
		}
		public TerminalNode UNIQUENESS() { return getToken(CypherParser.UNIQUENESS, 0); }
		public ShowConstraintsAllowYieldContext showConstraintsAllowYield() {
			return getRuleContext(ShowConstraintsAllowYieldContext.class,0);
		}
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public ShowNodeCommandContext showNodeCommand() {
			return getRuleContext(ShowNodeCommandContext.class,0);
		}
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public ShowPropertyCommandContext showPropertyCommand() {
			return getRuleContext(ShowPropertyCommandContext.class,0);
		}
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public ShowConstraintsAllowBriefContext showConstraintsAllowBrief() {
			return getRuleContext(ShowConstraintsAllowBriefContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public TerminalNode RELATIONSHIP() { return getToken(CypherParser.RELATIONSHIP, 0); }
		public ShowRelationshipCommandContext showRelationshipCommand() {
			return getRuleContext(ShowRelationshipCommandContext.class,0);
		}
		public TerminalNode REL() { return getToken(CypherParser.REL, 0); }
		public ShowRelCommandContext showRelCommand() {
			return getRuleContext(ShowRelCommandContext.class,0);
		}
		public TerminalNode BUILT() { return getToken(CypherParser.BUILT, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public ShowFunctionsContext showFunctions() {
			return getRuleContext(ShowFunctionsContext.class,0);
		}
		public ShowDatabaseContext showDatabase() {
			return getRuleContext(ShowDatabaseContext.class,0);
		}
		public ShowCurrentUserContext showCurrentUser() {
			return getRuleContext(ShowCurrentUserContext.class,0);
		}
		public ShowProceduresContext showProcedures() {
			return getRuleContext(ShowProceduresContext.class,0);
		}
		public ShowSettingsContext showSettings() {
			return getRuleContext(ShowSettingsContext.class,0);
		}
		public ShowTransactionsContext showTransactions() {
			return getRuleContext(ShowTransactionsContext.class,0);
		}
		public ShowAliasesContext showAliases() {
			return getRuleContext(ShowAliasesContext.class,0);
		}
		public ShowServersContext showServers() {
			return getRuleContext(ShowServersContext.class,0);
		}
		public ShowPrivilegesContext showPrivileges() {
			return getRuleContext(ShowPrivilegesContext.class,0);
		}
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode DEFINED() { return getToken(CypherParser.DEFINED, 0); }
		public TerminalNode ROLES() { return getToken(CypherParser.ROLES, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode USERS() { return getToken(CypherParser.USERS, 0); }
		public ShowRolePrivilegesContext showRolePrivileges() {
			return getRuleContext(ShowRolePrivilegesContext.class,0);
		}
		public ShowUserPrivilegesContext showUserPrivileges() {
			return getRuleContext(ShowUserPrivilegesContext.class,0);
		}
		public ShowUsersContext showUsers() {
			return getRuleContext(ShowUsersContext.class,0);
		}
		public ShowCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCommand; }
	}

	public final ShowCommandContext showCommand() throws RecognitionException {
		ShowCommandContext _localctx = new ShowCommandContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_showCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(SHOW);
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(ALL);
				setState(1626);
				showAllCommand();
				}
				break;
			case 2:
				{
				setState(1627);
				match(POPULATED);
				setState(1628);
				_la = _input.LA(1);
				if ( !(_la==ROLE || _la==ROLES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1629);
				showRoles();
				}
				break;
			case 3:
				{
				setState(1630);
				match(BTREE);
				setState(1631);
				showIndexesAllowBrief();
				}
				break;
			case 4:
				{
				setState(1632);
				match(RANGE);
				setState(1633);
				showIndexesNoBrief();
				}
				break;
			case 5:
				{
				setState(1634);
				match(FULLTEXT);
				setState(1635);
				showIndexesNoBrief();
				}
				break;
			case 6:
				{
				setState(1636);
				match(TEXT);
				setState(1637);
				showIndexesNoBrief();
				}
				break;
			case 7:
				{
				setState(1638);
				match(POINT);
				setState(1639);
				showIndexesNoBrief();
				}
				break;
			case 8:
				{
				setState(1640);
				match(LOOKUP);
				setState(1641);
				showIndexesNoBrief();
				}
				break;
			case 9:
				{
				setState(1642);
				match(UNIQUE);
				setState(1643);
				showConstraintsAllowBriefAndYield();
				}
				break;
			case 10:
				{
				setState(1644);
				match(UNIQUENESS);
				setState(1645);
				showConstraintsAllowYield();
				}
				break;
			case 11:
				{
				setState(1646);
				match(KEY);
				setState(1647);
				showConstraintsAllowYield();
				}
				break;
			case 12:
				{
				setState(1648);
				match(NODE);
				setState(1649);
				showNodeCommand();
				}
				break;
			case 13:
				{
				setState(1650);
				match(PROPERTY);
				setState(1651);
				showPropertyCommand();
				}
				break;
			case 14:
				{
				setState(1652);
				match(EXISTENCE);
				setState(1653);
				showConstraintsAllowYield();
				}
				break;
			case 15:
				{
				setState(1654);
				match(EXISTS);
				setState(1655);
				showConstraintsAllowBrief();
				}
				break;
			case 16:
				{
				setState(1656);
				match(EXIST);
				setState(1657);
				showConstraintsAllowBriefAndYield();
				}
				break;
			case 17:
				{
				setState(1658);
				match(RELATIONSHIP);
				setState(1659);
				showRelationshipCommand();
				}
				break;
			case 18:
				{
				setState(1660);
				match(REL);
				setState(1661);
				showRelCommand();
				}
				break;
			case 19:
				{
				setState(1662);
				match(BUILT);
				setState(1663);
				match(IN);
				setState(1664);
				showFunctions();
				}
				break;
			case 20:
				{
				setState(1665);
				showIndexesAllowBrief();
				}
				break;
			case 21:
				{
				setState(1666);
				showDatabase();
				}
				break;
			case 22:
				{
				setState(1667);
				showCurrentUser();
				}
				break;
			case 23:
				{
				setState(1668);
				showConstraintsAllowBriefAndYield();
				}
				break;
			case 24:
				{
				setState(1669);
				showProcedures();
				}
				break;
			case 25:
				{
				setState(1670);
				showSettings();
				}
				break;
			case 26:
				{
				setState(1671);
				showFunctions();
				}
				break;
			case 27:
				{
				setState(1672);
				showTransactions();
				}
				break;
			case 28:
				{
				setState(1673);
				showAliases();
				}
				break;
			case 29:
				{
				setState(1674);
				showServers();
				}
				break;
			case 30:
				{
				setState(1675);
				showPrivileges();
				}
				break;
			case 31:
				{
				setState(1676);
				_la = _input.LA(1);
				if ( !(_la==ROLE || _la==ROLES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1677);
					showRolePrivileges();
					}
					break;
				case 2:
					{
					setState(1678);
					showRoles();
					}
					break;
				case 3:
					{
					setState(1679);
					showRolePrivileges();
					}
					break;
				}
				}
				break;
			case 32:
				{
				setState(1682);
				match(USER);
				setState(1683);
				match(DEFINED);
				setState(1684);
				showFunctions();
				}
				break;
			case 33:
				{
				setState(1685);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==USERS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1686);
					showUserPrivileges();
					}
					break;
				case 2:
					{
					setState(1687);
					showUsers();
					}
					break;
				case 3:
					{
					setState(1688);
					showUserPrivileges();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminateCommandContext extends ParserRuleContext {
		public TerminalNode TERMINATE() { return getToken(CypherParser.TERMINATE, 0); }
		public TerminateTransactionsContext terminateTransactions() {
			return getRuleContext(TerminateTransactionsContext.class,0);
		}
		public TerminateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminateCommand; }
	}

	public final TerminateCommandContext terminateCommand() throws RecognitionException {
		TerminateCommandContext _localctx = new TerminateCommandContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_terminateCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(TERMINATE);
			setState(1694);
			terminateTransactions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowAllCommandContext extends ParserRuleContext {
		public ShowRolesContext showRoles() {
			return getRuleContext(ShowRolesContext.class,0);
		}
		public ShowIndexesAllowBriefContext showIndexesAllowBrief() {
			return getRuleContext(ShowIndexesAllowBriefContext.class,0);
		}
		public ShowConstraintsAllowBriefAndYieldContext showConstraintsAllowBriefAndYield() {
			return getRuleContext(ShowConstraintsAllowBriefAndYieldContext.class,0);
		}
		public ShowFunctionsContext showFunctions() {
			return getRuleContext(ShowFunctionsContext.class,0);
		}
		public ShowPrivilegesContext showPrivileges() {
			return getRuleContext(ShowPrivilegesContext.class,0);
		}
		public TerminalNode ROLES() { return getToken(CypherParser.ROLES, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public ShowAllCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showAllCommand; }
	}

	public final ShowAllCommandContext showAllCommand() throws RecognitionException {
		ShowAllCommandContext _localctx = new ShowAllCommandContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_showAllCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROLE:
			case ROLES:
				{
				setState(1696);
				_la = _input.LA(1);
				if ( !(_la==ROLE || _la==ROLES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1697);
				showRoles();
				}
				break;
			case INDEX:
			case INDEXES:
				{
				setState(1698);
				showIndexesAllowBrief();
				}
				break;
			case CONSTRAINT:
			case CONSTRAINTS:
				{
				setState(1699);
				showConstraintsAllowBriefAndYield();
				}
				break;
			case FUNCTION:
			case FUNCTIONS:
				{
				setState(1700);
				showFunctions();
				}
				break;
			case PRIVILEGE:
			case PRIVILEGES:
				{
				setState(1701);
				showPrivileges();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowNodeCommandContext extends ParserRuleContext {
		public ShowConstraintsAllowYieldContext showConstraintsAllowYield() {
			return getRuleContext(ShowConstraintsAllowYieldContext.class,0);
		}
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public ShowConstraintsAllowBriefAndYieldContext showConstraintsAllowBriefAndYield() {
			return getRuleContext(ShowConstraintsAllowBriefAndYieldContext.class,0);
		}
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public ShowPropertyCommandContext showPropertyCommand() {
			return getRuleContext(ShowPropertyCommandContext.class,0);
		}
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public ShowConstraintsAllowBriefContext showConstraintsAllowBrief() {
			return getRuleContext(ShowConstraintsAllowBriefContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode UNIQUENESS() { return getToken(CypherParser.UNIQUENESS, 0); }
		public ShowNodeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showNodeCommand; }
	}

	public final ShowNodeCommandContext showNodeCommand() throws RecognitionException {
		ShowNodeCommandContext _localctx = new ShowNodeCommandContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_showNodeCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
			case UNIQUENESS:
				{
				setState(1704);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==UNIQUENESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1705);
				showConstraintsAllowYield();
				}
				break;
			case KEY:
				{
				setState(1706);
				match(KEY);
				setState(1707);
				showConstraintsAllowBriefAndYield();
				}
				break;
			case PROPERTY:
				{
				setState(1708);
				match(PROPERTY);
				setState(1709);
				showPropertyCommand();
				}
				break;
			case EXISTENCE:
				{
				setState(1710);
				match(EXISTENCE);
				setState(1711);
				showConstraintsAllowYield();
				}
				break;
			case EXISTS:
				{
				setState(1712);
				match(EXISTS);
				setState(1713);
				showConstraintsAllowBrief();
				}
				break;
			case EXIST:
				{
				setState(1714);
				match(EXIST);
				setState(1715);
				showConstraintsAllowBriefAndYield();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRelationshipCommandContext extends ParserRuleContext {
		public ShowConstraintsAllowYieldContext showConstraintsAllowYield() {
			return getRuleContext(ShowConstraintsAllowYieldContext.class,0);
		}
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public ShowPropertyCommandContext showPropertyCommand() {
			return getRuleContext(ShowPropertyCommandContext.class,0);
		}
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public ShowConstraintsAllowBriefContext showConstraintsAllowBrief() {
			return getRuleContext(ShowConstraintsAllowBriefContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public ShowConstraintsAllowBriefAndYieldContext showConstraintsAllowBriefAndYield() {
			return getRuleContext(ShowConstraintsAllowBriefAndYieldContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode UNIQUENESS() { return getToken(CypherParser.UNIQUENESS, 0); }
		public ShowRelationshipCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRelationshipCommand; }
	}

	public final ShowRelationshipCommandContext showRelationshipCommand() throws RecognitionException {
		ShowRelationshipCommandContext _localctx = new ShowRelationshipCommandContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_showRelationshipCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
			case UNIQUENESS:
				{
				setState(1718);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==UNIQUENESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1719);
				showConstraintsAllowYield();
				}
				break;
			case KEY:
				{
				setState(1720);
				match(KEY);
				setState(1721);
				showConstraintsAllowYield();
				}
				break;
			case PROPERTY:
				{
				setState(1722);
				match(PROPERTY);
				setState(1723);
				showPropertyCommand();
				}
				break;
			case EXISTENCE:
				{
				setState(1724);
				match(EXISTENCE);
				setState(1725);
				showConstraintsAllowYield();
				}
				break;
			case EXISTS:
				{
				setState(1726);
				match(EXISTS);
				setState(1727);
				showConstraintsAllowBrief();
				}
				break;
			case EXIST:
				{
				setState(1728);
				match(EXIST);
				setState(1729);
				showConstraintsAllowBriefAndYield();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRelCommandContext extends ParserRuleContext {
		public ShowConstraintsAllowYieldContext showConstraintsAllowYield() {
			return getRuleContext(ShowConstraintsAllowYieldContext.class,0);
		}
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public ShowPropertyCommandContext showPropertyCommand() {
			return getRuleContext(ShowPropertyCommandContext.class,0);
		}
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode UNIQUENESS() { return getToken(CypherParser.UNIQUENESS, 0); }
		public ShowRelCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRelCommand; }
	}

	public final ShowRelCommandContext showRelCommand() throws RecognitionException {
		ShowRelCommandContext _localctx = new ShowRelCommandContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_showRelCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
			case UNIQUENESS:
				{
				setState(1732);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==UNIQUENESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1733);
				showConstraintsAllowYield();
				}
				break;
			case KEY:
				{
				setState(1734);
				match(KEY);
				setState(1735);
				showConstraintsAllowYield();
				}
				break;
			case PROPERTY:
				{
				setState(1736);
				match(PROPERTY);
				setState(1737);
				showPropertyCommand();
				}
				break;
			case EXISTENCE:
				{
				setState(1738);
				match(EXISTENCE);
				setState(1739);
				showConstraintsAllowYield();
				}
				break;
			case EXIST:
				{
				setState(1740);
				match(EXIST);
				setState(1741);
				showConstraintsAllowYield();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowPropertyCommandContext extends ParserRuleContext {
		public ShowConstraintsAllowYieldContext showConstraintsAllowYield() {
			return getRuleContext(ShowConstraintsAllowYieldContext.class,0);
		}
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public ShowPropertyCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showPropertyCommand; }
	}

	public final ShowPropertyCommandContext showPropertyCommand() throws RecognitionException {
		ShowPropertyCommandContext _localctx = new ShowPropertyCommandContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_showPropertyCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ( !(_la==EXIST || _la==EXISTENCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1745);
			showConstraintsAllowYield();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldItemContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItem; }
	}

	public final YieldItemContext yieldItem() throws RecognitionException {
		YieldItemContext _localctx = new YieldItemContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_yieldItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			variable();
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1748);
				match(AS);
				setState(1749);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldClauseContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public List<YieldItemContext> yieldItem() {
			return getRuleContexts(YieldItemContext.class);
		}
		public YieldItemContext yieldItem(int i) {
			return getRuleContext(YieldItemContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public TerminalNode SKIPROWS() { return getToken(CypherParser.SKIPROWS, 0); }
		public List<SignedIntegerLiteralContext> signedIntegerLiteral() {
			return getRuleContexts(SignedIntegerLiteralContext.class);
		}
		public SignedIntegerLiteralContext signedIntegerLiteral(int i) {
			return getRuleContext(SignedIntegerLiteralContext.class,i);
		}
		public TerminalNode LIMITROWS() { return getToken(CypherParser.LIMITROWS, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public YieldClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldClause; }
	}

	public final YieldClauseContext yieldClause() throws RecognitionException {
		YieldClauseContext _localctx = new YieldClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_yieldClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(YIELD);
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(1753);
				match(TIMES);
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(1754);
				yieldItem();
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1755);
					match(COMMA);
					setState(1756);
					yieldItem();
					}
					}
					setState(1761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1764);
				match(ORDER);
				setState(1765);
				match(BY);
				setState(1766);
				orderItem();
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1767);
					match(COMMA);
					setState(1768);
					orderItem();
					}
					}
					setState(1773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIPROWS) {
				{
				setState(1776);
				match(SKIPROWS);
				setState(1777);
				signedIntegerLiteral();
				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMITROWS) {
				{
				setState(1780);
				match(LIMITROWS);
				setState(1781);
				signedIntegerLiteral();
				}
			}

			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1784);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowIndexesAllowBriefContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode BRIEF() { return getToken(CypherParser.BRIEF, 0); }
		public TerminalNode VERBOSE() { return getToken(CypherParser.VERBOSE, 0); }
		public TerminalNode OUTPUT() { return getToken(CypherParser.OUTPUT, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowIndexesAllowBriefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showIndexesAllowBrief; }
	}

	public final ShowIndexesAllowBriefContext showIndexesAllowBrief() throws RecognitionException {
		ShowIndexesAllowBriefContext _localctx = new ShowIndexesAllowBriefContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_showIndexesAllowBrief);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==INDEXES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRIEF:
			case VERBOSE:
				{
				setState(1788);
				_la = _input.LA(1);
				if ( !(_la==BRIEF || _la==VERBOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(1789);
					match(OUTPUT);
					}
				}

				}
				break;
			case YIELD:
				{
				setState(1792);
				yieldClause();
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1793);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1796);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowIndexesNoBriefContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowIndexesNoBriefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showIndexesNoBrief; }
	}

	public final ShowIndexesNoBriefContext showIndexesNoBrief() throws RecognitionException {
		ShowIndexesNoBriefContext _localctx = new ShowIndexesNoBriefContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_showIndexesNoBrief);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==INDEXES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1800);
				yieldClause();
				setState(1802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1801);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1804);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowConstraintsAllowBriefAndYieldContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode BRIEF() { return getToken(CypherParser.BRIEF, 0); }
		public TerminalNode VERBOSE() { return getToken(CypherParser.VERBOSE, 0); }
		public TerminalNode OUTPUT() { return getToken(CypherParser.OUTPUT, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowConstraintsAllowBriefAndYieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showConstraintsAllowBriefAndYield; }
	}

	public final ShowConstraintsAllowBriefAndYieldContext showConstraintsAllowBriefAndYield() throws RecognitionException {
		ShowConstraintsAllowBriefAndYieldContext _localctx = new ShowConstraintsAllowBriefAndYieldContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_showConstraintsAllowBriefAndYield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			_la = _input.LA(1);
			if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRIEF:
			case VERBOSE:
				{
				setState(1808);
				_la = _input.LA(1);
				if ( !(_la==BRIEF || _la==VERBOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(1809);
					match(OUTPUT);
					}
				}

				}
				break;
			case YIELD:
				{
				setState(1812);
				yieldClause();
				setState(1814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1813);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1816);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowConstraintsAllowBriefContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public TerminalNode BRIEF() { return getToken(CypherParser.BRIEF, 0); }
		public TerminalNode VERBOSE() { return getToken(CypherParser.VERBOSE, 0); }
		public TerminalNode OUTPUT() { return getToken(CypherParser.OUTPUT, 0); }
		public ShowConstraintsAllowBriefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showConstraintsAllowBrief; }
	}

	public final ShowConstraintsAllowBriefContext showConstraintsAllowBrief() throws RecognitionException {
		ShowConstraintsAllowBriefContext _localctx = new ShowConstraintsAllowBriefContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_showConstraintsAllowBrief);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_la = _input.LA(1);
			if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRIEF || _la==VERBOSE) {
				{
				setState(1820);
				_la = _input.LA(1);
				if ( !(_la==BRIEF || _la==VERBOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(1821);
					match(OUTPUT);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowConstraintsAllowYieldContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowConstraintsAllowYieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showConstraintsAllowYield; }
	}

	public final ShowConstraintsAllowYieldContext showConstraintsAllowYield() throws RecognitionException {
		ShowConstraintsAllowYieldContext _localctx = new ShowConstraintsAllowYieldContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_showConstraintsAllowYield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_la = _input.LA(1);
			if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1827);
				yieldClause();
				setState(1829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1828);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1831);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowProceduresContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(CypherParser.PROCEDURE, 0); }
		public TerminalNode PROCEDURES() { return getToken(CypherParser.PROCEDURES, 0); }
		public TerminalNode EXECUTABLE() { return getToken(CypherParser.EXECUTABLE, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(CypherParser.CURRENT, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public ShowProceduresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showProcedures; }
	}

	public final ShowProceduresContext showProcedures() throws RecognitionException {
		ShowProceduresContext _localctx = new ShowProceduresContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_showProcedures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==PROCEDURES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXECUTABLE) {
				{
				setState(1835);
				match(EXECUTABLE);
				setState(1842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1836);
					match(BY);
					setState(1840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1837);
						match(CURRENT);
						setState(1838);
						match(USER);
						}
						break;
					case 2:
						{
						setState(1839);
						symbolicNameString();
						}
						break;
					}
					}
				}

				}
			}

			setState(1851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1846);
				yieldClause();
				setState(1848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1847);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1850);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowFunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CypherParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(CypherParser.FUNCTIONS, 0); }
		public TerminalNode EXECUTABLE() { return getToken(CypherParser.EXECUTABLE, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(CypherParser.CURRENT, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public ShowFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showFunctions; }
	}

	public final ShowFunctionsContext showFunctions() throws RecognitionException {
		ShowFunctionsContext _localctx = new ShowFunctionsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_showFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==FUNCTIONS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXECUTABLE) {
				{
				setState(1854);
				match(EXECUTABLE);
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1855);
					match(BY);
					setState(1859);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1856);
						match(CURRENT);
						setState(1857);
						match(USER);
						}
						break;
					case 2:
						{
						setState(1858);
						symbolicNameString();
						}
						break;
					}
					}
				}

				}
			}

			setState(1870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1865);
				yieldClause();
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1866);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(1869);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTransactionsContext extends ParserRuleContext {
		public TerminalNode TRANSACTION() { return getToken(CypherParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public ShowOrTerminateTransactionsContext showOrTerminateTransactions() {
			return getRuleContext(ShowOrTerminateTransactionsContext.class,0);
		}
		public StringsOrExpressionContext stringsOrExpression() {
			return getRuleContext(StringsOrExpressionContext.class,0);
		}
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTransactions; }
	}

	public final ShowTransactionsContext showTransactions() throws RecognitionException {
		ShowTransactionsContext _localctx = new ShowTransactionsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_showTransactions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRANSACTIONS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1873);
				showOrTerminateTransactions();
				}
				break;
			case 2:
				{
				setState(1888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1874);
					stringsOrExpression();
					setState(1880);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(1875);
						yieldClause();
						setState(1877);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1876);
							returnClause();
							}
							break;
						}
						}
						break;
					case WHERE:
						{
						setState(1879);
						whereClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(1882);
					yieldClause();
					setState(1884);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1883);
						returnClause();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(1886);
					whereClause();
					}
					break;
				case 4:
					{
					setState(1887);
					stringsOrExpression();
					}
					break;
				}
				setState(1891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1890);
					showOrTerminateTransactions();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminateTransactionsContext extends ParserRuleContext {
		public TerminalNode TRANSACTION() { return getToken(CypherParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public ShowOrTerminateTransactionsContext showOrTerminateTransactions() {
			return getRuleContext(ShowOrTerminateTransactionsContext.class,0);
		}
		public StringsOrExpressionContext stringsOrExpression() {
			return getRuleContext(StringsOrExpressionContext.class,0);
		}
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public TerminateTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminateTransactions; }
	}

	public final TerminateTransactionsContext terminateTransactions() throws RecognitionException {
		TerminateTransactionsContext _localctx = new TerminateTransactionsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_terminateTransactions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRANSACTIONS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1896);
				showOrTerminateTransactions();
				}
				break;
			case 2:
				{
				setState(1911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1897);
					stringsOrExpression();
					setState(1903);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(1898);
						yieldClause();
						setState(1900);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1899);
							returnClause();
							}
							break;
						}
						}
						break;
					case WHERE:
						{
						setState(1902);
						whereClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(1905);
					yieldClause();
					setState(1907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1906);
						returnClause();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(1909);
					whereClause();
					}
					break;
				case 4:
					{
					setState(1910);
					stringsOrExpression();
					}
					break;
				}
				setState(1914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1913);
					showOrTerminateTransactions();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowOrTerminateTransactionsContext extends ParserRuleContext {
		public TerminalNode TERMINATE() { return getToken(CypherParser.TERMINATE, 0); }
		public TerminateTransactionsContext terminateTransactions() {
			return getRuleContext(TerminateTransactionsContext.class,0);
		}
		public TerminalNode SHOW() { return getToken(CypherParser.SHOW, 0); }
		public ShowTransactionsContext showTransactions() {
			return getRuleContext(ShowTransactionsContext.class,0);
		}
		public ShowOrTerminateTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showOrTerminateTransactions; }
	}

	public final ShowOrTerminateTransactionsContext showOrTerminateTransactions() throws RecognitionException {
		ShowOrTerminateTransactionsContext _localctx = new ShowOrTerminateTransactionsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_showOrTerminateTransactions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINATE:
				{
				setState(1918);
				match(TERMINATE);
				setState(1919);
				terminateTransactions();
				}
				break;
			case SHOW:
				{
				setState(1920);
				match(SHOW);
				setState(1921);
				showTransactions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringsOrExpressionContext extends ParserRuleContext {
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringsOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringsOrExpression; }
	}

	public final StringsOrExpressionContext stringsOrExpression() throws RecognitionException {
		StringsOrExpressionContext _localctx = new StringsOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_stringsOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1924);
				stringList();
				}
				break;
			case 2:
				{
				setState(1925);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowSettingsContext extends ParserRuleContext {
		public TerminalNode SETTING() { return getToken(CypherParser.SETTING, 0); }
		public TerminalNode SETTINGS() { return getToken(CypherParser.SETTINGS, 0); }
		public StringsOrExpressionContext stringsOrExpression() {
			return getRuleContext(StringsOrExpressionContext.class,0);
		}
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowSettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showSettings; }
	}

	public final ShowSettingsContext showSettings() throws RecognitionException {
		ShowSettingsContext _localctx = new ShowSettingsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_showSettings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			_la = _input.LA(1);
			if ( !(_la==SETTING || _la==SETTINGS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1929);
				stringsOrExpression();
				setState(1935);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(1930);
					yieldClause();
					setState(1932);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						setState(1931);
						returnClause();
						}
						break;
					}
					}
					break;
				case WHERE:
					{
					setState(1934);
					whereClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(1937);
				yieldClause();
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1938);
					returnClause();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1941);
				whereClause();
				}
				break;
			case 4:
				{
				setState(1942);
				stringsOrExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CypherParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CypherParser.LPAREN, i);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public List<TerminalNode> NOT() { return getTokens(CypherParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(CypherParser.NOT, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(CypherParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(CypherParser.EXISTS, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CypherParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CypherParser.RPAREN, i);
		}
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode ASSERT() { return getToken(CypherParser.ASSERT, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode REQUIRE() { return getToken(CypherParser.REQUIRE, 0); }
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public MapOrParameterContext mapOrParameter() {
			return getRuleContext(MapOrParameterContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public TerminalNode NULL() { return getToken(CypherParser.NULL, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public TerminalNode RELATIONSHIP() { return getToken(CypherParser.RELATIONSHIP, 0); }
		public TerminalNode REL() { return getToken(CypherParser.REL, 0); }
		public CreateConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createConstraint; }
	}

	public final CreateConstraintContext createConstraint() throws RecognitionException {
		CreateConstraintContext _localctx = new CreateConstraintContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_createConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			match(CONSTRAINT);
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1946);
				match(ON);
				setState(1947);
				match(LPAREN);
				}
				break;
			case 2:
				{
				setState(1948);
				match(FOR);
				setState(1949);
				match(LPAREN);
				}
				break;
			case 3:
				{
				setState(1950);
				match(IF);
				setState(1951);
				match(NOT);
				setState(1952);
				match(EXISTS);
				setState(1953);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1954);
				match(LPAREN);
				}
				break;
			case 4:
				{
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1955);
					symbolicNameString();
					}
					break;
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1958);
					match(IF);
					setState(1959);
					match(NOT);
					setState(1960);
					match(EXISTS);
					}
				}

				setState(1963);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1964);
				match(LPAREN);
				}
				break;
			}
			setState(1987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(1967);
				variable();
				setState(1968);
				labelOrRelType();
				setState(1969);
				match(RPAREN);
				}
				break;
			case RPAREN:
				{
				setState(1971);
				match(RPAREN);
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT || _la==ARROW_LEFT_HEAD) {
					{
					setState(1972);
					leftArrow();
					}
				}

				setState(1975);
				arrowLine();
				setState(1976);
				match(LBRACKET);
				setState(1977);
				variable();
				setState(1978);
				labelOrRelType();
				setState(1979);
				match(RBRACKET);
				setState(1980);
				arrowLine();
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT || _la==ARROW_RIGHT_HEAD) {
					{
					setState(1981);
					rightArrow();
					}
				}

				setState(1984);
				match(LPAREN);
				setState(1985);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1989);
				match(ASSERT);
				setState(1990);
				match(EXISTS);
				setState(1991);
				propertyList();
				}
				break;
			case 2:
				{
				setState(1992);
				_la = _input.LA(1);
				if ( !(_la==ASSERT || _la==REQUIRE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1993);
				propertyList();
				setState(1994);
				match(IS);
				setState(2003);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNIQUE:
					{
					setState(1995);
					match(UNIQUE);
					}
					break;
				case KEY:
					{
					setState(1996);
					match(KEY);
					}
					break;
				case NODE:
					{
					setState(1997);
					match(NODE);
					setState(1998);
					_la = _input.LA(1);
					if ( !(_la==KEY || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case REL:
				case RELATIONSHIP:
					{
					setState(1999);
					_la = _input.LA(1);
					if ( !(_la==REL || _la==RELATIONSHIP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2000);
					_la = _input.LA(1);
					if ( !(_la==KEY || _la==UNIQUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case NOT:
					{
					setState(2001);
					match(NOT);
					setState(2002);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2007);
				match(OPTIONS);
				setState(2008);
				mapOrParameter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CypherParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CypherParser.LPAREN, i);
		}
		public TerminalNode ASSERT() { return getToken(CypherParser.ASSERT, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CypherParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CypherParser.RPAREN, i);
		}
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CypherParser.NULL, 0); }
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public DropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraint; }
	}

	public final DropConstraintContext dropConstraint() throws RecognitionException {
		DropConstraintContext _localctx = new DropConstraintContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_dropConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(CONSTRAINT);
			setState(2055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2012);
				match(ON);
				setState(2013);
				match(LPAREN);
				setState(2034);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(2014);
					variable();
					setState(2015);
					labelOrRelType();
					setState(2016);
					match(RPAREN);
					}
					break;
				case RPAREN:
					{
					setState(2018);
					match(RPAREN);
					setState(2020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT || _la==ARROW_LEFT_HEAD) {
						{
						setState(2019);
						leftArrow();
						}
					}

					setState(2022);
					arrowLine();
					setState(2023);
					match(LBRACKET);
					setState(2024);
					variable();
					setState(2025);
					labelOrRelType();
					setState(2026);
					match(RBRACKET);
					setState(2027);
					arrowLine();
					setState(2029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GT || _la==ARROW_RIGHT_HEAD) {
						{
						setState(2028);
						rightArrow();
						}
					}

					setState(2031);
					match(LPAREN);
					setState(2032);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2036);
				match(ASSERT);
				setState(2048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(2037);
					match(EXISTS);
					setState(2038);
					propertyList();
					}
					break;
				case 2:
					{
					setState(2039);
					propertyList();
					setState(2040);
					match(IS);
					setState(2046);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case UNIQUE:
						{
						setState(2041);
						match(UNIQUE);
						}
						break;
					case NODE:
						{
						setState(2042);
						match(NODE);
						setState(2043);
						match(KEY);
						}
						break;
					case NOT:
						{
						setState(2044);
						match(NOT);
						setState(2045);
						match(NULL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2050);
				symbolicNameString();
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2051);
					match(IF);
					setState(2052);
					match(EXISTS);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode BTREE() { return getToken(CypherParser.BTREE, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public CreateIndex_Context createIndex_() {
			return getRuleContext(CreateIndex_Context.class,0);
		}
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public TerminalNode FULLTEXT() { return getToken(CypherParser.FULLTEXT, 0); }
		public CreateFulltextIndexContext createFulltextIndex() {
			return getRuleContext(CreateFulltextIndexContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(CypherParser.TEXT, 0); }
		public TerminalNode POINT() { return getToken(CypherParser.POINT, 0); }
		public TerminalNode LOOKUP() { return getToken(CypherParser.LOOKUP, 0); }
		public CreateLookupIndexContext createLookupIndex() {
			return getRuleContext(CreateLookupIndexContext.class,0);
		}
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public OldCreateIndexContext oldCreateIndex() {
			return getRuleContext(OldCreateIndexContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BTREE:
				{
				setState(2057);
				match(BTREE);
				setState(2058);
				match(INDEX);
				setState(2059);
				createIndex_();
				}
				break;
			case RANGE:
				{
				setState(2060);
				match(RANGE);
				setState(2061);
				match(INDEX);
				setState(2062);
				createIndex_();
				}
				break;
			case FULLTEXT:
				{
				setState(2063);
				match(FULLTEXT);
				setState(2064);
				match(INDEX);
				setState(2065);
				createFulltextIndex();
				}
				break;
			case TEXT:
				{
				setState(2066);
				match(TEXT);
				setState(2067);
				match(INDEX);
				setState(2068);
				createIndex_();
				}
				break;
			case POINT:
				{
				setState(2069);
				match(POINT);
				setState(2070);
				match(INDEX);
				setState(2071);
				createIndex_();
				}
				break;
			case LOOKUP:
				{
				setState(2072);
				match(LOOKUP);
				setState(2073);
				match(INDEX);
				setState(2074);
				createLookupIndex();
				}
				break;
			case INDEX:
				{
				setState(2075);
				match(INDEX);
				setState(2079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2076);
					match(ON);
					setState(2077);
					oldCreateIndex();
					}
					break;
				case 2:
					{
					setState(2078);
					createIndex_();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OldCreateIndexContext extends ParserRuleContext {
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public SymbolicNamePositionsContext symbolicNamePositions() {
			return getRuleContext(SymbolicNamePositionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public OldCreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldCreateIndex; }
	}

	public final OldCreateIndexContext oldCreateIndex() throws RecognitionException {
		OldCreateIndexContext _localctx = new OldCreateIndexContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_oldCreateIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			labelOrRelType();
			setState(2084);
			match(LPAREN);
			setState(2085);
			symbolicNamePositions();
			setState(2086);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndex_Context extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CypherParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CypherParser.LPAREN, i);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CypherParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CypherParser.RPAREN, i);
		}
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public MapOrParameterContext mapOrParameter() {
			return getRuleContext(MapOrParameterContext.class,0);
		}
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public CreateIndex_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex_; }
	}

	public final CreateIndex_Context createIndex_() throws RecognitionException {
		CreateIndex_Context _localctx = new CreateIndex_Context(_ctx, getState());
		enterRule(_localctx, 294, RULE_createIndex_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(2088);
				match(FOR);
				setState(2089);
				match(LPAREN);
				}
				break;
			case 2:
				{
				setState(2090);
				match(IF);
				setState(2091);
				match(NOT);
				setState(2092);
				match(EXISTS);
				setState(2093);
				match(FOR);
				setState(2094);
				match(LPAREN);
				}
				break;
			case 3:
				{
				setState(2095);
				symbolicNameString();
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2096);
					match(IF);
					setState(2097);
					match(NOT);
					setState(2098);
					match(EXISTS);
					}
				}

				setState(2101);
				match(FOR);
				setState(2102);
				match(LPAREN);
				}
				break;
			}
			setState(2126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2106);
				variable();
				setState(2107);
				labelOrRelType();
				setState(2108);
				match(RPAREN);
				}
				break;
			case RPAREN:
				{
				setState(2110);
				match(RPAREN);
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT || _la==ARROW_LEFT_HEAD) {
					{
					setState(2111);
					leftArrow();
					}
				}

				setState(2114);
				arrowLine();
				setState(2115);
				match(LBRACKET);
				setState(2116);
				variable();
				setState(2117);
				labelOrRelType();
				setState(2118);
				match(RBRACKET);
				setState(2119);
				arrowLine();
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT || _la==ARROW_RIGHT_HEAD) {
					{
					setState(2120);
					rightArrow();
					}
				}

				setState(2123);
				match(LPAREN);
				setState(2124);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2128);
			match(ON);
			setState(2129);
			propertyList();
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2130);
				match(OPTIONS);
				setState(2131);
				mapOrParameter();
				}
			}

			setState(2134);
			createIndex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFulltextIndexContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode EACH() { return getToken(CypherParser.EACH, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CypherParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CypherParser.LBRACKET, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CypherParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CypherParser.RBRACKET, i);
		}
		public CreateFulltextIndexContext createFulltextIndex() {
			return getRuleContext(CreateFulltextIndexContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CypherParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CypherParser.LPAREN, i);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public LabelOrRelTypesContext labelOrRelTypes() {
			return getRuleContext(LabelOrRelTypesContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CypherParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CypherParser.RPAREN, i);
		}
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public MapOrParameterContext mapOrParameter() {
			return getRuleContext(MapOrParameterContext.class,0);
		}
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public CreateFulltextIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFulltextIndex; }
	}

	public final CreateFulltextIndexContext createFulltextIndex() throws RecognitionException {
		CreateFulltextIndexContext _localctx = new CreateFulltextIndexContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_createFulltextIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2136);
				match(FOR);
				setState(2137);
				match(LPAREN);
				}
				break;
			case 2:
				{
				setState(2138);
				match(IF);
				setState(2139);
				match(NOT);
				setState(2140);
				match(EXISTS);
				setState(2141);
				match(FOR);
				setState(2142);
				match(LPAREN);
				}
				break;
			case 3:
				{
				setState(2143);
				symbolicNameString();
				setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2144);
					match(IF);
					setState(2145);
					match(NOT);
					setState(2146);
					match(EXISTS);
					}
				}

				setState(2149);
				match(FOR);
				setState(2150);
				match(LPAREN);
				}
				break;
			}
			setState(2174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2154);
				variable();
				setState(2155);
				labelOrRelTypes();
				setState(2156);
				match(RPAREN);
				}
				break;
			case RPAREN:
				{
				setState(2158);
				match(RPAREN);
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT || _la==ARROW_LEFT_HEAD) {
					{
					setState(2159);
					leftArrow();
					}
				}

				setState(2162);
				arrowLine();
				setState(2163);
				match(LBRACKET);
				setState(2164);
				variable();
				setState(2165);
				labelOrRelTypes();
				setState(2166);
				match(RBRACKET);
				setState(2167);
				arrowLine();
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT || _la==ARROW_RIGHT_HEAD) {
					{
					setState(2168);
					rightArrow();
					}
				}

				setState(2171);
				match(LPAREN);
				setState(2172);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2176);
			match(ON);
			setState(2177);
			match(EACH);
			setState(2178);
			match(LBRACKET);
			setState(2179);
			variable();
			setState(2180);
			property();
			setState(2187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2181);
				match(COMMA);
				setState(2182);
				variable();
				setState(2183);
				property();
				}
				}
				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2190);
			match(RBRACKET);
			setState(2193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2191);
				match(OPTIONS);
				setState(2192);
				mapOrParameter();
				}
				break;
			}
			setState(2195);
			createFulltextIndex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLookupIndexContext extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CypherParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CypherParser.LPAREN, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CypherParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CypherParser.RPAREN, i);
		}
		public CreateLookupIndexContext createLookupIndex() {
			return getRuleContext(CreateLookupIndexContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode EACH() { return getToken(CypherParser.EACH, 0); }
		public List<ArrowLineContext> arrowLine() {
			return getRuleContexts(ArrowLineContext.class);
		}
		public ArrowLineContext arrowLine(int i) {
			return getRuleContext(ArrowLineContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(CypherParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CypherParser.RBRACKET, 0); }
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public MapOrParameterContext mapOrParameter() {
			return getRuleContext(MapOrParameterContext.class,0);
		}
		public LeftArrowContext leftArrow() {
			return getRuleContext(LeftArrowContext.class,0);
		}
		public RightArrowContext rightArrow() {
			return getRuleContext(RightArrowContext.class,0);
		}
		public CreateLookupIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLookupIndex; }
	}

	public final CreateLookupIndexContext createLookupIndex() throws RecognitionException {
		CreateLookupIndexContext _localctx = new CreateLookupIndexContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_createLookupIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2197);
				match(FOR);
				setState(2198);
				match(LPAREN);
				}
				break;
			case 2:
				{
				setState(2199);
				match(IF);
				setState(2200);
				match(NOT);
				setState(2201);
				match(EXISTS);
				setState(2202);
				match(FOR);
				setState(2203);
				match(LPAREN);
				}
				break;
			case 3:
				{
				setState(2204);
				symbolicNameString();
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2205);
					match(IF);
					setState(2206);
					match(NOT);
					setState(2207);
					match(EXISTS);
					}
				}

				setState(2210);
				match(FOR);
				setState(2211);
				match(LPAREN);
				}
				break;
			}
			setState(2238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2215);
				variable();
				setState(2216);
				match(RPAREN);
				setState(2217);
				match(ON);
				setState(2218);
				match(EACH);
				}
				break;
			case RPAREN:
				{
				setState(2220);
				match(RPAREN);
				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT || _la==ARROW_LEFT_HEAD) {
					{
					setState(2221);
					leftArrow();
					}
				}

				setState(2224);
				arrowLine();
				setState(2225);
				match(LBRACKET);
				setState(2226);
				variable();
				setState(2227);
				match(RBRACKET);
				setState(2228);
				arrowLine();
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT || _la==ARROW_RIGHT_HEAD) {
					{
					setState(2229);
					rightArrow();
					}
				}

				setState(2232);
				match(LPAREN);
				setState(2233);
				match(RPAREN);
				setState(2234);
				match(ON);
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2235);
					match(EACH);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2240);
			symbolicNameString();
			setState(2241);
			match(LPAREN);
			setState(2242);
			variable();
			setState(2243);
			match(RPAREN);
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2244);
				match(OPTIONS);
				setState(2245);
				mapOrParameter();
				}
				break;
			}
			setState(2248);
			createLookupIndex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public LabelOrRelTypeContext labelOrRelType() {
			return getRuleContext(LabelOrRelTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public SymbolicNamePositionsContext symbolicNamePositions() {
			return getRuleContext(SymbolicNamePositionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(INDEX);
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2251);
				match(ON);
				setState(2252);
				labelOrRelType();
				setState(2253);
				match(LPAREN);
				setState(2254);
				symbolicNamePositions();
				setState(2255);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(2257);
				symbolicNameString();
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(2258);
					match(IF);
					setState(2259);
					match(EXISTS);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2264);
				variable();
				setState(2265);
				property();
				}
				break;
			case LPAREN:
				{
				setState(2267);
				match(LPAREN);
				setState(2268);
				variable();
				setState(2269);
				property();
				setState(2276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2270);
					match(COMMA);
					setState(2271);
					variable();
					setState(2272);
					property();
					}
					}
					setState(2278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2279);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameCommandContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(CypherParser.RENAME, 0); }
		public RenameRoleContext renameRole() {
			return getRuleContext(RenameRoleContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public RenameServerContext renameServer() {
			return getRuleContext(RenameServerContext.class,0);
		}
		public RenameCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameCommand; }
	}

	public final RenameCommandContext renameCommand() throws RecognitionException {
		RenameCommandContext _localctx = new RenameCommandContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_renameCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			match(RENAME);
			setState(2287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROLE:
				{
				setState(2284);
				renameRole();
				}
				break;
			case USER:
				{
				setState(2285);
				renameUser();
				}
				break;
			case SERVER:
				{
				setState(2286);
				renameServer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantCommandContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(CypherParser.GRANT, 0); }
		public TerminalNode IMMUTABLE() { return getToken(CypherParser.IMMUTABLE, 0); }
		public GrantPrivilegeContext grantPrivilege() {
			return getRuleContext(GrantPrivilegeContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public GrantRoleManagementContext grantRoleManagement() {
			return getRuleContext(GrantRoleManagementContext.class,0);
		}
		public TerminalNode ROLES() { return getToken(CypherParser.ROLES, 0); }
		public GrantRoleContext grantRole() {
			return getRuleContext(GrantRoleContext.class,0);
		}
		public GrantCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantCommand; }
	}

	public final GrantCommandContext grantCommand() throws RecognitionException {
		GrantCommandContext _localctx = new GrantCommandContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_grantCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			match(GRANT);
			setState(2306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMMUTABLE:
				{
				setState(2290);
				match(IMMUTABLE);
				setState(2294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ALIAS:
				case ALL:
				case ALTER:
				case ASSIGN:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CREATE:
				case DATABASE:
				case DELETE:
				case DROP:
				case EXECUTE:
				case IMPERSONATE:
				case INDEX:
				case INDEXES:
				case MATCH:
				case MERGE:
				case NAME:
				case PRIVILEGE:
				case READ:
				case RENAME:
				case REMOVE:
				case SERVER:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case TRANSACTION:
				case TRAVERSE:
				case USER:
				case WRITE:
					{
					setState(2291);
					grantPrivilege();
					}
					break;
				case ROLE:
					{
					setState(2292);
					match(ROLE);
					setState(2293);
					grantRoleManagement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ACCESS:
			case ALIAS:
			case ALL:
			case ALTER:
			case ASSIGN:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CREATE:
			case DATABASE:
			case DELETE:
			case DROP:
			case EXECUTE:
			case IMPERSONATE:
			case INDEX:
			case INDEXES:
			case MATCH:
			case MERGE:
			case NAME:
			case PRIVILEGE:
			case READ:
			case RENAME:
			case REMOVE:
			case ROLE:
			case ROLES:
			case SERVER:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case TRANSACTION:
			case TRAVERSE:
			case USER:
			case WRITE:
				{
				setState(2304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ALIAS:
				case ALL:
				case ALTER:
				case ASSIGN:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CREATE:
				case DATABASE:
				case DELETE:
				case DROP:
				case EXECUTE:
				case IMPERSONATE:
				case INDEX:
				case INDEXES:
				case MATCH:
				case MERGE:
				case NAME:
				case PRIVILEGE:
				case READ:
				case RENAME:
				case REMOVE:
				case SERVER:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case TRANSACTION:
				case TRAVERSE:
				case USER:
				case WRITE:
					{
					setState(2296);
					grantPrivilege();
					}
					break;
				case ROLE:
					{
					setState(2297);
					match(ROLE);
					setState(2300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2298);
						grantRoleManagement();
						}
						break;
					case 2:
						{
						setState(2299);
						grantRole();
						}
						break;
					}
					}
					break;
				case ROLES:
					{
					setState(2302);
					match(ROLES);
					setState(2303);
					grantRole();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeCommandContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(CypherParser.REVOKE, 0); }
		public TerminalNode DENY() { return getToken(CypherParser.DENY, 0); }
		public TerminalNode GRANT() { return getToken(CypherParser.GRANT, 0); }
		public TerminalNode IMMUTABLE() { return getToken(CypherParser.IMMUTABLE, 0); }
		public RevokePrivilegeContext revokePrivilege() {
			return getRuleContext(RevokePrivilegeContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public RevokeRoleManagementContext revokeRoleManagement() {
			return getRuleContext(RevokeRoleManagementContext.class,0);
		}
		public RevokeRoleContext revokeRole() {
			return getRuleContext(RevokeRoleContext.class,0);
		}
		public TerminalNode ROLES() { return getToken(CypherParser.ROLES, 0); }
		public RevokeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeCommand; }
	}

	public final RevokeCommandContext revokeCommand() throws RecognitionException {
		RevokeCommandContext _localctx = new RevokeCommandContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_revokeCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(REVOKE);
			setState(2340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DENY:
				{
				setState(2309);
				match(DENY);
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMMUTABLE) {
					{
					setState(2310);
					match(IMMUTABLE);
					}
				}

				setState(2316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ALIAS:
				case ALL:
				case ALTER:
				case ASSIGN:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CREATE:
				case DATABASE:
				case DELETE:
				case DROP:
				case EXECUTE:
				case IMPERSONATE:
				case INDEX:
				case INDEXES:
				case MATCH:
				case MERGE:
				case NAME:
				case PRIVILEGE:
				case READ:
				case RENAME:
				case REMOVE:
				case SERVER:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case TRANSACTION:
				case TRAVERSE:
				case USER:
				case WRITE:
					{
					setState(2313);
					revokePrivilege();
					}
					break;
				case ROLE:
					{
					setState(2314);
					match(ROLE);
					setState(2315);
					revokeRoleManagement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case GRANT:
				{
				setState(2318);
				match(GRANT);
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMMUTABLE) {
					{
					setState(2319);
					match(IMMUTABLE);
					}
				}

				setState(2325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ALIAS:
				case ALL:
				case ALTER:
				case ASSIGN:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CREATE:
				case DATABASE:
				case DELETE:
				case DROP:
				case EXECUTE:
				case IMPERSONATE:
				case INDEX:
				case INDEXES:
				case MATCH:
				case MERGE:
				case NAME:
				case PRIVILEGE:
				case READ:
				case RENAME:
				case REMOVE:
				case SERVER:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case TRANSACTION:
				case TRAVERSE:
				case USER:
				case WRITE:
					{
					setState(2322);
					revokePrivilege();
					}
					break;
				case ROLE:
					{
					setState(2323);
					match(ROLE);
					setState(2324);
					revokeRoleManagement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IMMUTABLE:
				{
				setState(2327);
				match(IMMUTABLE);
				setState(2331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCESS:
				case ALIAS:
				case ALL:
				case ALTER:
				case ASSIGN:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CREATE:
				case DATABASE:
				case DELETE:
				case DROP:
				case EXECUTE:
				case IMPERSONATE:
				case INDEX:
				case INDEXES:
				case MATCH:
				case MERGE:
				case NAME:
				case PRIVILEGE:
				case READ:
				case RENAME:
				case REMOVE:
				case SERVER:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case TRANSACTION:
				case TRAVERSE:
				case USER:
				case WRITE:
					{
					setState(2328);
					revokePrivilege();
					}
					break;
				case ROLE:
					{
					setState(2329);
					match(ROLE);
					setState(2330);
					revokeRoleManagement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ACCESS:
			case ALIAS:
			case ALL:
			case ALTER:
			case ASSIGN:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CREATE:
			case DATABASE:
			case DELETE:
			case DROP:
			case EXECUTE:
			case IMPERSONATE:
			case INDEX:
			case INDEXES:
			case MATCH:
			case MERGE:
			case NAME:
			case PRIVILEGE:
			case READ:
			case RENAME:
			case REMOVE:
			case ROLE:
			case ROLES:
			case SERVER:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case TRANSACTION:
			case TRAVERSE:
			case USER:
			case WRITE:
				{
				setState(2338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2333);
					revokePrivilege();
					}
					break;
				case 2:
					{
					setState(2334);
					match(ROLE);
					setState(2335);
					revokeRoleManagement();
					}
					break;
				case 3:
					{
					setState(2336);
					_la = _input.LA(1);
					if ( !(_la==ROLE || _la==ROLES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2337);
					revokeRole();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnableServerCommandContext extends ParserRuleContext {
		public TerminalNode ENABLE() { return getToken(CypherParser.ENABLE, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public StringOrParameterContext stringOrParameter() {
			return getRuleContext(StringOrParameterContext.class,0);
		}
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public EnableServerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableServerCommand; }
	}

	public final EnableServerCommandContext enableServerCommand() throws RecognitionException {
		EnableServerCommandContext _localctx = new EnableServerCommandContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_enableServerCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			match(ENABLE);
			setState(2343);
			match(SERVER);
			setState(2344);
			stringOrParameter();
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2345);
				options_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterServerContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public StringOrParameterContext stringOrParameter() {
			return getRuleContext(StringOrParameterContext.class,0);
		}
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public AlterServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterServer; }
	}

	public final AlterServerContext alterServer() throws RecognitionException {
		AlterServerContext _localctx = new AlterServerContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_alterServer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			match(SERVER);
			setState(2349);
			stringOrParameter();
			setState(2350);
			match(SET);
			setState(2351);
			options_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameServerContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public List<StringOrParameterContext> stringOrParameter() {
			return getRuleContexts(StringOrParameterContext.class);
		}
		public StringOrParameterContext stringOrParameter(int i) {
			return getRuleContext(StringOrParameterContext.class,i);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public RenameServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameServer; }
	}

	public final RenameServerContext renameServer() throws RecognitionException {
		RenameServerContext _localctx = new RenameServerContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_renameServer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(SERVER);
			setState(2354);
			stringOrParameter();
			setState(2355);
			match(TO);
			setState(2356);
			stringOrParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropServerContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public StringOrParameterContext stringOrParameter() {
			return getRuleContext(StringOrParameterContext.class,0);
		}
		public DropServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropServer; }
	}

	public final DropServerContext dropServer() throws RecognitionException {
		DropServerContext _localctx = new DropServerContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dropServer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(SERVER);
			setState(2359);
			stringOrParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowServersContext extends ParserRuleContext {
		public TerminalNode SERVERS() { return getToken(CypherParser.SERVERS, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowServersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showServers; }
	}

	public final ShowServersContext showServers() throws RecognitionException {
		ShowServersContext _localctx = new ShowServersContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_showServers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			_la = _input.LA(1);
			if ( !(_la==SERVER || _la==SERVERS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2362);
				yieldClause();
				setState(2364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2363);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2366);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocationCommandContext extends ParserRuleContext {
		public DeallocateDatabaseFromServersContext deallocateDatabaseFromServers() {
			return getRuleContext(DeallocateDatabaseFromServersContext.class,0);
		}
		public ReallocateDatabasesContext reallocateDatabases() {
			return getRuleContext(ReallocateDatabasesContext.class,0);
		}
		public TerminalNode DRYRUN() { return getToken(CypherParser.DRYRUN, 0); }
		public AllocationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationCommand; }
	}

	public final AllocationCommandContext allocationCommand() throws RecognitionException {
		AllocationCommandContext _localctx = new AllocationCommandContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_allocationCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DRYRUN) {
				{
				setState(2369);
				match(DRYRUN);
				}
			}

			setState(2374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEALLOCATE:
				{
				setState(2372);
				deallocateDatabaseFromServers();
				}
				break;
			case REALLOCATE:
				{
				setState(2373);
				reallocateDatabases();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeallocateDatabaseFromServersContext extends ParserRuleContext {
		public TerminalNode DEALLOCATE() { return getToken(CypherParser.DEALLOCATE, 0); }
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public List<StringOrParameterContext> stringOrParameter() {
			return getRuleContexts(StringOrParameterContext.class);
		}
		public StringOrParameterContext stringOrParameter(int i) {
			return getRuleContext(StringOrParameterContext.class,i);
		}
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public TerminalNode SERVERS() { return getToken(CypherParser.SERVERS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public DeallocateDatabaseFromServersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deallocateDatabaseFromServers; }
	}

	public final DeallocateDatabaseFromServersContext deallocateDatabaseFromServers() throws RecognitionException {
		DeallocateDatabaseFromServersContext _localctx = new DeallocateDatabaseFromServersContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_deallocateDatabaseFromServers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(DEALLOCATE);
			setState(2377);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==DATABASES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2378);
			match(FROM);
			setState(2379);
			_la = _input.LA(1);
			if ( !(_la==SERVER || _la==SERVERS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2380);
			stringOrParameter();
			setState(2385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2381);
				match(COMMA);
				setState(2382);
				stringOrParameter();
				}
				}
				setState(2387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReallocateDatabasesContext extends ParserRuleContext {
		public TerminalNode REALLOCATE() { return getToken(CypherParser.REALLOCATE, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public ReallocateDatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reallocateDatabases; }
	}

	public final ReallocateDatabasesContext reallocateDatabases() throws RecognitionException {
		ReallocateDatabasesContext _localctx = new ReallocateDatabasesContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_reallocateDatabases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			match(REALLOCATE);
			setState(2389);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==DATABASES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public List<SymbolicNameOrStringParameterContext> symbolicNameOrStringParameter() {
			return getRuleContexts(SymbolicNameOrStringParameterContext.class);
		}
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter(int i) {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,i);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public TerminalNode COPY() { return getToken(CypherParser.COPY, 0); }
		public TerminalNode OF() { return getToken(CypherParser.OF, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_createRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(ROLE);
			setState(2392);
			symbolicNameOrStringParameter();
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2393);
				match(IF);
				setState(2394);
				match(NOT);
				setState(2395);
				match(EXISTS);
				}
			}

			setState(2402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2398);
				match(AS);
				setState(2399);
				match(COPY);
				setState(2400);
				match(OF);
				setState(2401);
				symbolicNameOrStringParameter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dropRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			match(ROLE);
			setState(2405);
			symbolicNameOrStringParameter();
			setState(2408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2406);
				match(IF);
				setState(2407);
				match(EXISTS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameRoleContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public List<SymbolicNameOrStringParameterContext> symbolicNameOrStringParameter() {
			return getRuleContexts(SymbolicNameOrStringParameterContext.class);
		}
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter(int i) {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,i);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public RenameRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameRole; }
	}

	public final RenameRoleContext renameRole() throws RecognitionException {
		RenameRoleContext _localctx = new RenameRoleContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_renameRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(ROLE);
			setState(2411);
			symbolicNameOrStringParameter();
			setState(2414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2412);
				match(IF);
				setState(2413);
				match(EXISTS);
				}
			}

			setState(2416);
			match(TO);
			setState(2417);
			symbolicNameOrStringParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRolesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode USERS() { return getToken(CypherParser.USERS, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRoles; }
	}

	public final ShowRolesContext showRoles() throws RecognitionException {
		ShowRolesContext _localctx = new ShowRolesContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_showRoles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2419);
				match(WITH);
				setState(2420);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==USERS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2423);
				yieldClause();
				setState(2425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2424);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2427);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantRoleContext extends ParserRuleContext {
		public List<SymbolicNameOrStringParameterListContext> symbolicNameOrStringParameterList() {
			return getRuleContexts(SymbolicNameOrStringParameterListContext.class);
		}
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList(int i) {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,i);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public GrantRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRole; }
	}

	public final GrantRoleContext grantRole() throws RecognitionException {
		GrantRoleContext _localctx = new GrantRoleContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_grantRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			symbolicNameOrStringParameterList();
			setState(2431);
			match(TO);
			setState(2432);
			symbolicNameOrStringParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeRoleContext extends ParserRuleContext {
		public List<SymbolicNameOrStringParameterListContext> symbolicNameOrStringParameterList() {
			return getRuleContexts(SymbolicNameOrStringParameterListContext.class);
		}
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList(int i) {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,i);
		}
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public RevokeRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRole; }
	}

	public final RevokeRoleContext revokeRole() throws RecognitionException {
		RevokeRoleContext _localctx = new RevokeRoleContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_revokeRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			symbolicNameOrStringParameterList();
			setState(2435);
			match(FROM);
			setState(2436);
			symbolicNameOrStringParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,0);
		}
		public List<TerminalNode> SET() { return getTokens(CypherParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(CypherParser.SET, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(CypherParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(CypherParser.PASSWORD, i);
		}
		public PasswordExpressionContext passwordExpression() {
			return getRuleContext(PasswordExpressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public List<PasswordChangeRequiredContext> passwordChangeRequired() {
			return getRuleContexts(PasswordChangeRequiredContext.class);
		}
		public PasswordChangeRequiredContext passwordChangeRequired(int i) {
			return getRuleContext(PasswordChangeRequiredContext.class,i);
		}
		public TerminalNode PLAINTEXT() { return getToken(CypherParser.PLAINTEXT, 0); }
		public TerminalNode ENCRYPTED() { return getToken(CypherParser.ENCRYPTED, 0); }
		public List<UserStatusContext> userStatus() {
			return getRuleContexts(UserStatusContext.class);
		}
		public UserStatusContext userStatus(int i) {
			return getRuleContext(UserStatusContext.class,i);
		}
		public List<HomeDatabaseContext> homeDatabase() {
			return getRuleContexts(HomeDatabaseContext.class);
		}
		public HomeDatabaseContext homeDatabase(int i) {
			return getRuleContext(HomeDatabaseContext.class,i);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_createUser);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			match(USER);
			setState(2439);
			symbolicNameOrStringParameter();
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2440);
				match(IF);
				setState(2441);
				match(NOT);
				setState(2442);
				match(EXISTS);
				}
			}

			setState(2445);
			match(SET);
			setState(2447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPTED || _la==PLAINTEXT) {
				{
				setState(2446);
				_la = _input.LA(1);
				if ( !(_la==ENCRYPTED || _la==PLAINTEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2449);
			match(PASSWORD);
			setState(2450);
			passwordExpression();
			setState(2452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHANGE) {
				{
				setState(2451);
				passwordChangeRequired();
				}
			}

			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2454);
					match(SET);
					setState(2459);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PASSWORD:
						{
						setState(2455);
						match(PASSWORD);
						setState(2456);
						passwordChangeRequired();
						}
						break;
					case STATUS:
						{
						setState(2457);
						userStatus();
						}
						break;
					case HOME:
						{
						setState(2458);
						homeDatabase();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dropUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			match(USER);
			setState(2467);
			symbolicNameOrStringParameter();
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2468);
				match(IF);
				setState(2469);
				match(EXISTS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameUserContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public List<SymbolicNameOrStringParameterContext> symbolicNameOrStringParameter() {
			return getRuleContexts(SymbolicNameOrStringParameterContext.class);
		}
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter(int i) {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,i);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_renameUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(USER);
			setState(2473);
			symbolicNameOrStringParameter();
			setState(2476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2474);
				match(IF);
				setState(2475);
				match(EXISTS);
				}
			}

			setState(2478);
			match(TO);
			setState(2479);
			symbolicNameOrStringParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterCurrentUserContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(CypherParser.CURRENT, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode PASSWORD() { return getToken(CypherParser.PASSWORD, 0); }
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public List<PasswordExpressionContext> passwordExpression() {
			return getRuleContexts(PasswordExpressionContext.class);
		}
		public PasswordExpressionContext passwordExpression(int i) {
			return getRuleContext(PasswordExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public AlterCurrentUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCurrentUser; }
	}

	public final AlterCurrentUserContext alterCurrentUser() throws RecognitionException {
		AlterCurrentUserContext _localctx = new AlterCurrentUserContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_alterCurrentUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			match(CURRENT);
			setState(2482);
			match(USER);
			setState(2483);
			match(SET);
			setState(2484);
			match(PASSWORD);
			setState(2485);
			match(FROM);
			setState(2486);
			passwordExpression();
			setState(2487);
			match(TO);
			setState(2488);
			passwordExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public List<TerminalNode> SET() { return getTokens(CypherParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(CypherParser.SET, i);
		}
		public List<TerminalNode> PLAINTEXT() { return getTokens(CypherParser.PLAINTEXT); }
		public TerminalNode PLAINTEXT(int i) {
			return getToken(CypherParser.PLAINTEXT, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(CypherParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(CypherParser.PASSWORD, i);
		}
		public List<SetPasswordContext> setPassword() {
			return getRuleContexts(SetPasswordContext.class);
		}
		public SetPasswordContext setPassword(int i) {
			return getRuleContext(SetPasswordContext.class,i);
		}
		public List<TerminalNode> ENCRYPTED() { return getTokens(CypherParser.ENCRYPTED); }
		public TerminalNode ENCRYPTED(int i) {
			return getToken(CypherParser.ENCRYPTED, i);
		}
		public List<UserStatusContext> userStatus() {
			return getRuleContexts(UserStatusContext.class);
		}
		public UserStatusContext userStatus(int i) {
			return getRuleContext(UserStatusContext.class,i);
		}
		public List<HomeDatabaseContext> homeDatabase() {
			return getRuleContexts(HomeDatabaseContext.class);
		}
		public HomeDatabaseContext homeDatabase(int i) {
			return getRuleContext(HomeDatabaseContext.class,i);
		}
		public List<PasswordChangeRequiredContext> passwordChangeRequired() {
			return getRuleContexts(PasswordChangeRequiredContext.class);
		}
		public PasswordChangeRequiredContext passwordChangeRequired(int i) {
			return getRuleContext(PasswordChangeRequiredContext.class,i);
		}
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_alterUser);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			match(USER);
			setState(2491);
			symbolicNameOrStringParameter();
			setState(2494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2492);
				match(IF);
				setState(2493);
				match(EXISTS);
				}
			}

			setState(2528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(2521); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2496);
						match(SET);
						setState(2519);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLAINTEXT:
							{
							setState(2497);
							match(PLAINTEXT);
							setState(2498);
							match(PASSWORD);
							setState(2499);
							setPassword();
							setState(2501);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==CHANGE) {
								{
								setState(2500);
								passwordChangeRequired();
								}
							}

							}
							break;
						case ENCRYPTED:
							{
							setState(2503);
							match(ENCRYPTED);
							setState(2504);
							match(PASSWORD);
							setState(2505);
							setPassword();
							setState(2507);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==CHANGE) {
								{
								setState(2506);
								passwordChangeRequired();
								}
							}

							}
							break;
						case PASSWORD:
							{
							setState(2509);
							match(PASSWORD);
							setState(2515);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case CHANGE:
								{
								setState(2510);
								passwordChangeRequired();
								}
								break;
							case DOLLAR:
							case STRING_LITERAL1:
							case STRING_LITERAL2:
								{
								setState(2511);
								setPassword();
								setState(2513);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==CHANGE) {
									{
									setState(2512);
									passwordChangeRequired();
									}
								}

								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						case STATUS:
							{
							setState(2517);
							userStatus();
							}
							break;
						case HOME:
							{
							setState(2518);
							homeDatabase();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2523); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case REMOVE:
				{
				setState(2525);
				match(REMOVE);
				setState(2526);
				match(HOME);
				setState(2527);
				match(DATABASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPasswordContext extends ParserRuleContext {
		public PasswordExpressionContext passwordExpression() {
			return getRuleContext(PasswordExpressionContext.class,0);
		}
		public SetPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPassword; }
	}

	public final SetPasswordContext setPassword() throws RecognitionException {
		SetPasswordContext _localctx = new SetPasswordContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_setPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
			passwordExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordExpressionContext extends ParserRuleContext {
		public StringTokenContext stringToken() {
			return getRuleContext(StringTokenContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PasswordExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordExpression; }
	}

	public final PasswordExpressionContext passwordExpression() throws RecognitionException {
		PasswordExpressionContext _localctx = new PasswordExpressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_passwordExpression);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL1:
			case STRING_LITERAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(2532);
				stringToken();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2533);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordChangeRequiredContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(CypherParser.CHANGE, 0); }
		public TerminalNode REQUIRED() { return getToken(CypherParser.REQUIRED, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public PasswordChangeRequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passwordChangeRequired; }
	}

	public final PasswordChangeRequiredContext passwordChangeRequired() throws RecognitionException {
		PasswordChangeRequiredContext _localctx = new PasswordChangeRequiredContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_passwordChangeRequired);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			match(CHANGE);
			setState(2538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2537);
				match(NOT);
				}
			}

			setState(2540);
			match(REQUIRED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserStatusContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(CypherParser.STATUS, 0); }
		public TerminalNode SUSPENDED() { return getToken(CypherParser.SUSPENDED, 0); }
		public TerminalNode ACTIVE() { return getToken(CypherParser.ACTIVE, 0); }
		public UserStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userStatus; }
	}

	public final UserStatusContext userStatus() throws RecognitionException {
		UserStatusContext _localctx = new UserStatusContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_userStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			match(STATUS);
			setState(2543);
			_la = _input.LA(1);
			if ( !(_la==ACTIVE || _la==SUSPENDED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HomeDatabaseContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public HomeDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_homeDatabase; }
	}

	public final HomeDatabaseContext homeDatabase() throws RecognitionException {
		HomeDatabaseContext _localctx = new HomeDatabaseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_homeDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(HOME);
			setState(2546);
			match(DATABASE);
			setState(2547);
			symbolicAliasName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowUsersContext extends ParserRuleContext {
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowUsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUsers; }
	}

	public final ShowUsersContext showUsers() throws RecognitionException {
		ShowUsersContext _localctx = new ShowUsersContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_showUsers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2549);
				yieldClause();
				setState(2551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2550);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2553);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowCurrentUserContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(CypherParser.CURRENT, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowCurrentUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCurrentUser; }
	}

	public final ShowCurrentUserContext showCurrentUser() throws RecognitionException {
		ShowCurrentUserContext _localctx = new ShowCurrentUserContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_showCurrentUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(CURRENT);
			setState(2557);
			match(USER);
			setState(2563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2558);
				yieldClause();
				setState(2560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2559);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2562);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowPrivilegesContext extends ParserRuleContext {
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(CypherParser.PRIVILEGES, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode COMMAND() { return getToken(CypherParser.COMMAND, 0); }
		public TerminalNode COMMANDS() { return getToken(CypherParser.COMMANDS, 0); }
		public TerminalNode REVOKE() { return getToken(CypherParser.REVOKE, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showPrivileges; }
	}

	public final ShowPrivilegesContext showPrivileges() throws RecognitionException {
		ShowPrivilegesContext _localctx = new ShowPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_showPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			_la = _input.LA(1);
			if ( !(_la==PRIVILEGE || _la==PRIVILEGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2566);
				match(AS);
				setState(2568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVOKE) {
					{
					setState(2567);
					match(REVOKE);
					}
				}

				setState(2570);
				_la = _input.LA(1);
				if ( !(_la==COMMAND || _la==COMMANDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2573);
				yieldClause();
				setState(2575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2574);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2577);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRolePrivilegesContext extends ParserRuleContext {
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(CypherParser.PRIVILEGES, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode COMMAND() { return getToken(CypherParser.COMMAND, 0); }
		public TerminalNode COMMANDS() { return getToken(CypherParser.COMMANDS, 0); }
		public TerminalNode REVOKE() { return getToken(CypherParser.REVOKE, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowRolePrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRolePrivileges; }
	}

	public final ShowRolePrivilegesContext showRolePrivileges() throws RecognitionException {
		ShowRolePrivilegesContext _localctx = new ShowRolePrivilegesContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_showRolePrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2580);
			symbolicNameOrStringParameterList();
			setState(2581);
			_la = _input.LA(1);
			if ( !(_la==PRIVILEGE || _la==PRIVILEGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2582);
				match(AS);
				setState(2584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVOKE) {
					{
					setState(2583);
					match(REVOKE);
					}
				}

				setState(2586);
				_la = _input.LA(1);
				if ( !(_la==COMMAND || _la==COMMANDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2589);
				yieldClause();
				setState(2591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2590);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2593);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowUserPrivilegesContext extends ParserRuleContext {
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(CypherParser.PRIVILEGES, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode COMMAND() { return getToken(CypherParser.COMMAND, 0); }
		public TerminalNode COMMANDS() { return getToken(CypherParser.COMMANDS, 0); }
		public TerminalNode REVOKE() { return getToken(CypherParser.REVOKE, 0); }
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowUserPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUserPrivileges; }
	}

	public final ShowUserPrivilegesContext showUserPrivileges() throws RecognitionException {
		ShowUserPrivilegesContext _localctx = new ShowUserPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_showUserPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2596);
				symbolicNameOrStringParameterList();
				setState(2597);
				_la = _input.LA(1);
				if ( !(_la==PRIVILEGE || _la==PRIVILEGES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(2599);
				_la = _input.LA(1);
				if ( !(_la==PRIVILEGE || _la==PRIVILEGES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(2600);
				symbolicNameOrStringParameterList();
				setState(2601);
				_la = _input.LA(1);
				if ( !(_la==PRIVILEGE || _la==PRIVILEGES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2605);
				match(AS);
				setState(2607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVOKE) {
					{
					setState(2606);
					match(REVOKE);
					}
				}

				setState(2609);
				_la = _input.LA(1);
				if ( !(_la==COMMAND || _la==COMMANDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(2612);
				yieldClause();
				setState(2614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2613);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(2616);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantRoleManagementContext extends ParserRuleContext {
		public RoleManagementPrivilegeContext roleManagementPrivilege() {
			return getRuleContext(RoleManagementPrivilegeContext.class,0);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public GrantPrivilegeContext grantPrivilege() {
			return getRuleContext(GrantPrivilegeContext.class,0);
		}
		public GrantRoleManagementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRoleManagement; }
	}

	public final GrantRoleManagementContext grantRoleManagement() throws RecognitionException {
		GrantRoleManagementContext _localctx = new GrantRoleManagementContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_grantRoleManagement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
			roleManagementPrivilege();
			setState(2620);
			match(TO);
			setState(2621);
			symbolicNameOrStringParameterList();
			setState(2622);
			grantPrivilege();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeRoleManagementContext extends ParserRuleContext {
		public RoleManagementPrivilegeContext roleManagementPrivilege() {
			return getRuleContext(RoleManagementPrivilegeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public RevokeRoleManagementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRoleManagement; }
	}

	public final RevokeRoleManagementContext revokeRoleManagement() throws RecognitionException {
		RevokeRoleManagementContext _localctx = new RevokeRoleManagementContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_revokeRoleManagement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2624);
			roleManagementPrivilege();
			setState(2625);
			match(FROM);
			setState(2626);
			symbolicNameOrStringParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleManagementPrivilegeContext extends ParserRuleContext {
		public TerminalNode MANAGEMENT() { return getToken(CypherParser.MANAGEMENT, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public RoleManagementPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleManagementPrivilege; }
	}

	public final RoleManagementPrivilegeContext roleManagementPrivilege() throws RecognitionException {
		RoleManagementPrivilegeContext _localctx = new RoleManagementPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_roleManagementPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			match(MANAGEMENT);
			setState(2629);
			match(ON);
			setState(2630);
			match(DBMS);
			setState(2631);
			dbmsPrivilege();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantPrivilegeContext extends ParserRuleContext {
		public PrivilegeContext privilege() {
			return getRuleContext(PrivilegeContext.class,0);
		}
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public GrantPrivilegeContext grantPrivilege() {
			return getRuleContext(GrantPrivilegeContext.class,0);
		}
		public GrantPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantPrivilege; }
	}

	public final GrantPrivilegeContext grantPrivilege() throws RecognitionException {
		GrantPrivilegeContext _localctx = new GrantPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_grantPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633);
			privilege();
			setState(2634);
			match(TO);
			setState(2635);
			symbolicNameOrStringParameterList();
			setState(2636);
			grantPrivilege();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DenyPrivilegeContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(CypherParser.DENY, 0); }
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public PrivilegeContext privilege() {
			return getRuleContext(PrivilegeContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public RoleManagementPrivilegeContext roleManagementPrivilege() {
			return getRuleContext(RoleManagementPrivilegeContext.class,0);
		}
		public TerminalNode IMMUTABLE() { return getToken(CypherParser.IMMUTABLE, 0); }
		public DenyPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_denyPrivilege; }
	}

	public final DenyPrivilegeContext denyPrivilege() throws RecognitionException {
		DenyPrivilegeContext _localctx = new DenyPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_denyPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(DENY);
			setState(2640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMMUTABLE) {
				{
				setState(2639);
				match(IMMUTABLE);
				}
			}

			setState(2645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ALIAS:
			case ALL:
			case ALTER:
			case ASSIGN:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CREATE:
			case DATABASE:
			case DELETE:
			case DROP:
			case EXECUTE:
			case IMPERSONATE:
			case INDEX:
			case INDEXES:
			case MATCH:
			case MERGE:
			case NAME:
			case PRIVILEGE:
			case READ:
			case RENAME:
			case REMOVE:
			case SERVER:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case TRANSACTION:
			case TRAVERSE:
			case USER:
			case WRITE:
				{
				setState(2642);
				privilege();
				}
				break;
			case ROLE:
				{
				setState(2643);
				match(ROLE);
				setState(2644);
				roleManagementPrivilege();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2647);
			match(TO);
			setState(2648);
			symbolicNameOrStringParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokePrivilegeContext extends ParserRuleContext {
		public PrivilegeContext privilege() {
			return getRuleContext(PrivilegeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public RevokePrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokePrivilege; }
	}

	public final RevokePrivilegeContext revokePrivilege() throws RecognitionException {
		RevokePrivilegeContext _localctx = new RevokePrivilegeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_revokePrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2650);
			privilege();
			setState(2651);
			match(FROM);
			setState(2652);
			symbolicNameOrStringParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public AllPrivilegeContext allPrivilege() {
			return getRuleContext(AllPrivilegeContext.class,0);
		}
		public CreatePrivilegeContext createPrivilege() {
			return getRuleContext(CreatePrivilegeContext.class,0);
		}
		public DropPrivilegeContext dropPrivilege() {
			return getRuleContext(DropPrivilegeContext.class,0);
		}
		public ShowPrivilegeContext showPrivilege() {
			return getRuleContext(ShowPrivilegeContext.class,0);
		}
		public SetPrivilegeContext setPrivilege() {
			return getRuleContext(SetPrivilegeContext.class,0);
		}
		public RemovePrivilegeContext removePrivilege() {
			return getRuleContext(RemovePrivilegeContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public WritePrivilegeContext writePrivilege() {
			return getRuleContext(WritePrivilegeContext.class,0);
		}
		public QualifiedGraphPrivilegesContext qualifiedGraphPrivileges() {
			return getRuleContext(QualifiedGraphPrivilegesContext.class,0);
		}
		public QualifiedGraphPrivilegesWithPropertyContext qualifiedGraphPrivilegesWithProperty() {
			return getRuleContext(QualifiedGraphPrivilegesWithPropertyContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_privilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2654);
				allPrivilege();
				}
				break;
			case CREATE:
				{
				setState(2655);
				createPrivilege();
				}
				break;
			case DROP:
				{
				setState(2656);
				dropPrivilege();
				}
				break;
			case SHOW:
				{
				setState(2657);
				showPrivilege();
				}
				break;
			case SET:
				{
				setState(2658);
				setPrivilege();
				}
				break;
			case REMOVE:
				{
				setState(2659);
				removePrivilege();
				}
				break;
			case ACCESS:
			case CONSTRAINT:
			case CONSTRAINTS:
			case INDEX:
			case INDEXES:
			case NAME:
			case START:
			case STOP:
			case TERMINATE:
			case TRANSACTION:
				{
				setState(2660);
				databasePrivilege();
				}
				break;
			case ALIAS:
			case ALTER:
			case ASSIGN:
			case COMPOSITE:
			case DATABASE:
			case EXECUTE:
			case IMPERSONATE:
			case PRIVILEGE:
			case RENAME:
			case SERVER:
			case USER:
				{
				setState(2661);
				dbmsPrivilege();
				}
				break;
			case WRITE:
				{
				setState(2662);
				writePrivilege();
				}
				break;
			case DELETE:
			case MERGE:
				{
				setState(2663);
				qualifiedGraphPrivileges();
				}
				break;
			case MATCH:
			case READ:
			case TRAVERSE:
				{
				setState(2664);
				qualifiedGraphPrivilegesWithProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllPrivilegeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode DEFAULT_TOKEN() { return getToken(CypherParser.DEFAULT_TOKEN, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public List<TerminalNode> DBMS() { return getTokens(CypherParser.DBMS); }
		public TerminalNode DBMS(int i) {
			return getToken(CypherParser.DBMS, i);
		}
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public TerminalNode PRIVILEGES() { return getToken(CypherParser.PRIVILEGES, 0); }
		public List<TerminalNode> GRAPH() { return getTokens(CypherParser.GRAPH); }
		public TerminalNode GRAPH(int i) {
			return getToken(CypherParser.GRAPH, i);
		}
		public TerminalNode GRAPHS() { return getToken(CypherParser.GRAPHS, 0); }
		public List<TerminalNode> DATABASE() { return getTokens(CypherParser.DATABASE); }
		public TerminalNode DATABASE(int i) {
			return getToken(CypherParser.DATABASE, i);
		}
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicAliasNameListContext symbolicAliasNameList() {
			return getRuleContext(SymbolicAliasNameListContext.class,0);
		}
		public AllPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allPrivilege; }
	}

	public final AllPrivilegeContext allPrivilege() throws RecognitionException {
		AllPrivilegeContext _localctx = new AllPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_allPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			match(ALL);
			setState(2672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (DATABASE - 49)) | (1L << (DBMS - 49)) | (1L << (GRAPH - 49)))) != 0) || _la==PRIVILEGES) {
				{
				setState(2669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (DATABASE - 49)) | (1L << (DBMS - 49)) | (1L << (GRAPH - 49)))) != 0)) {
					{
					setState(2668);
					_la = _input.LA(1);
					if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (DATABASE - 49)) | (1L << (DBMS - 49)) | (1L << (GRAPH - 49)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2671);
				match(PRIVILEGES);
				}
			}

			setState(2674);
			match(ON);
			setState(2700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT_TOKEN:
				{
				setState(2675);
				match(DEFAULT_TOKEN);
				setState(2679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPH:
					{
					setState(2676);
					match(GRAPH);
					}
					break;
				case DATABASE:
					{
					setState(2677);
					match(DATABASE);
					setState(2678);
					databasePrivilege();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case HOME:
				{
				setState(2681);
				match(HOME);
				setState(2685);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPH:
					{
					setState(2682);
					match(GRAPH);
					}
					break;
				case DATABASE:
					{
					setState(2683);
					match(DATABASE);
					setState(2684);
					databasePrivilege();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DBMS:
				{
				setState(2687);
				match(DBMS);
				setState(2688);
				dbmsPrivilege();
				}
				break;
			case GRAPH:
			case GRAPHS:
				{
				setState(2689);
				_la = _input.LA(1);
				if ( !(_la==GRAPH || _la==GRAPHS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2692);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(2690);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DOLLAR:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(2691);
					symbolicAliasNameList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DATABASE:
			case DATABASES:
				{
				setState(2694);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DATABASES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2697);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(2695);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DOLLAR:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(2696);
					symbolicAliasNameList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2699);
				databasePrivilege();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatePrivilegeContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public DatabaseScopeListContext databaseScopeList() {
			return getRuleContext(DatabaseScopeListContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public GraphQualifierContext graphQualifier() {
			return getRuleContext(GraphQualifierContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CypherParser.NEW, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public TerminalNode LABEL() { return getToken(CypherParser.LABEL, 0); }
		public TerminalNode LABELS() { return getToken(CypherParser.LABELS, 0); }
		public TerminalNode TYPE() { return getToken(CypherParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(CypherParser.TYPES, 0); }
		public TerminalNode NAME() { return getToken(CypherParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(CypherParser.NAMES, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public TerminalNode RELATIONSHIP() { return getToken(CypherParser.RELATIONSHIP, 0); }
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public CreatePrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createPrivilege; }
	}

	public final CreatePrivilegeContext createPrivilege() throws RecognitionException {
		CreatePrivilegeContext _localctx = new CreatePrivilegeContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_createPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			match(CREATE);
			setState(2741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case CONSTRAINTS:
			case INDEX:
			case INDEXES:
			case NEW:
				{
				setState(2720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEX:
				case INDEXES:
					{
					setState(2703);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==INDEXES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case CONSTRAINT:
				case CONSTRAINTS:
					{
					setState(2704);
					_la = _input.LA(1);
					if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case NEW:
					{
					setState(2705);
					match(NEW);
					setState(2718);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LABEL:
					case LABELS:
					case NODE:
						{
						setState(2707);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NODE) {
							{
							setState(2706);
							match(NODE);
							}
						}

						setState(2709);
						_la = _input.LA(1);
						if ( !(_la==LABEL || _la==LABELS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case RELATIONSHIP:
					case TYPE:
					case TYPES:
						{
						setState(2711);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==RELATIONSHIP) {
							{
							setState(2710);
							match(RELATIONSHIP);
							}
						}

						setState(2713);
						_la = _input.LA(1);
						if ( !(_la==TYPE || _la==TYPES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case NAME:
					case NAMES:
					case PROPERTY:
						{
						setState(2715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PROPERTY) {
							{
							setState(2714);
							match(PROPERTY);
							}
						}

						setState(2717);
						_la = _input.LA(1);
						if ( !(_la==NAME || _la==NAMES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2722);
				match(ON);
				setState(2723);
				databaseScopeList();
				setState(2724);
				databasePrivilege();
				}
				break;
			case ALIAS:
			case COMPOSITE:
			case DATABASE:
			case ROLE:
			case USER:
				{
				setState(2732);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
					{
					setState(2726);
					match(DATABASE);
					}
					break;
				case ALIAS:
					{
					setState(2727);
					match(ALIAS);
					}
					break;
				case ROLE:
					{
					setState(2728);
					match(ROLE);
					}
					break;
				case USER:
					{
					setState(2729);
					match(USER);
					}
					break;
				case COMPOSITE:
					{
					setState(2730);
					match(COMPOSITE);
					setState(2731);
					match(DATABASE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2734);
				match(ON);
				setState(2735);
				match(DBMS);
				setState(2736);
				dbmsPrivilege();
				}
				break;
			case ON:
				{
				setState(2737);
				match(ON);
				setState(2738);
				graphScopeList();
				setState(2739);
				graphQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPrivilegeContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(CypherParser.DROP, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public DatabaseScopeListContext databaseScopeList() {
			return getRuleContext(DatabaseScopeListContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public DropPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPrivilege; }
	}

	public final DropPrivilegeContext dropPrivilege() throws RecognitionException {
		DropPrivilegeContext _localctx = new DropPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_dropPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
			match(DROP);
			setState(2763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case CONSTRAINTS:
			case INDEX:
			case INDEXES:
				{
				setState(2746);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEX:
				case INDEXES:
					{
					setState(2744);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==INDEXES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case CONSTRAINT:
				case CONSTRAINTS:
					{
					setState(2745);
					_la = _input.LA(1);
					if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2748);
				match(ON);
				setState(2749);
				databaseScopeList();
				setState(2750);
				databasePrivilege();
				}
				break;
			case ALIAS:
			case COMPOSITE:
			case DATABASE:
			case ROLE:
			case USER:
				{
				setState(2758);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
					{
					setState(2752);
					match(DATABASE);
					}
					break;
				case ALIAS:
					{
					setState(2753);
					match(ALIAS);
					}
					break;
				case ROLE:
					{
					setState(2754);
					match(ROLE);
					}
					break;
				case USER:
					{
					setState(2755);
					match(USER);
					}
					break;
				case COMPOSITE:
					{
					setState(2756);
					match(COMPOSITE);
					setState(2757);
					match(DATABASE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2760);
				match(ON);
				setState(2761);
				match(DBMS);
				setState(2762);
				dbmsPrivilege();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowPrivilegeContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CypherParser.SHOW, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public DatabaseScopeListContext databaseScopeList() {
			return getRuleContext(DatabaseScopeListContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SettingQualifierContext settingQualifier() {
			return getRuleContext(SettingQualifierContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public TerminalNode TRANSACTION() { return getToken(CypherParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public TerminalNode SERVERS() { return getToken(CypherParser.SERVERS, 0); }
		public TerminalNode SETTING() { return getToken(CypherParser.SETTING, 0); }
		public TerminalNode SETTINGS() { return getToken(CypherParser.SETTINGS, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public ShowPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showPrivilege; }
	}

	public final ShowPrivilegeContext showPrivilege() throws RecognitionException {
		ShowPrivilegeContext _localctx = new ShowPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_showPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			match(SHOW);
			setState(2795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case CONSTRAINTS:
			case INDEX:
			case INDEXES:
			case TRANSACTION:
			case TRANSACTIONS:
				{
				setState(2777);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEX:
				case INDEXES:
					{
					setState(2766);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==INDEXES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case CONSTRAINT:
				case CONSTRAINTS:
					{
					setState(2767);
					_la = _input.LA(1);
					if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case TRANSACTION:
				case TRANSACTIONS:
					{
					setState(2768);
					_la = _input.LA(1);
					if ( !(_la==TRANSACTION || _la==TRANSACTIONS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(2769);
						match(LPAREN);
						setState(2772);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TIMES:
							{
							setState(2770);
							match(TIMES);
							}
							break;
						case ACCESS:
						case ACTIVE:
						case ADMIN:
						case ADMINISTRATOR:
						case ALIAS:
						case ALIASES:
						case ALL_SHORTEST_PATH:
						case ALL:
						case ALTER:
						case AND:
						case ANY:
						case AS:
						case ASC:
						case ASSERT:
						case ASSIGN:
						case AT:
						case BOOSTED:
						case BREAK:
						case BRIEF:
						case BTREE:
						case BUILT:
						case BY:
						case CALL:
						case CASE:
						case CHANGE:
						case COMMAND:
						case COMMANDS:
						case COMMIT:
						case COMPOSITE:
						case CONSTRAINT:
						case CONSTRAINTS:
						case CONTAINS:
						case COPY:
						case CONTINUE:
						case COUNT:
						case CREATE:
						case CSV:
						case CURRENT:
						case DATA:
						case DATABASE:
						case DATABASES:
						case DBMS:
						case DEALLOCATE:
						case DEFAULT_TOKEN:
						case DEFINED:
						case DELETE:
						case DENY:
						case DESC:
						case DESTROY:
						case DETACH:
						case DOLLAR:
						case DISTINCT:
						case DRIVER:
						case DROP:
						case DRYRUN:
						case DUMP:
						case EACH:
						case ENABLE:
						case ELEMENT:
						case ELEMENTS:
						case ELSE:
						case ENCRYPTED:
						case END:
						case ENDS:
						case EXECUTABLE:
						case EXECUTE:
						case EXIST:
						case EXISTENCE:
						case EXISTS:
						case ERROR:
						case FAIL:
						case FALSE:
						case FIELDTERMINATOR:
						case FOR:
						case FOREACH:
						case FROM:
						case FULLTEXT:
						case FUNCTION:
						case FUNCTIONS:
						case GRANT:
						case GRAPH:
						case GRAPHS:
						case HEADERS:
						case HOME:
						case IF:
						case IMMUTABLE:
						case IN:
						case INDEX:
						case INDEXES:
						case INF:
						case INFINITY:
						case IS:
						case JOIN:
						case KEY:
						case LABEL:
						case LABELS:
						case LIMITROWS:
						case LOAD:
						case LOOKUP:
						case MANAGEMENT:
						case MATCH:
						case MERGE:
						case NAME:
						case NAMES:
						case NAN:
						case NEW:
						case NODE:
						case NODES:
						case NONE:
						case NOT:
						case NOWAIT:
						case NULL:
						case OF:
						case ON:
						case ONLY:
						case OPTIONAL:
						case OPTIONS:
						case OPTION:
						case OR:
						case ORDER:
						case OUTPUT:
						case PASSWORD:
						case PASSWORDS:
						case PERIODIC:
						case PLAINTEXT:
						case POINT:
						case POPULATED:
						case PRIMARY:
						case PRIMARIES:
						case PRIVILEGE:
						case PRIVILEGES:
						case PROCEDURE:
						case PROCEDURES:
						case PROPERTIES:
						case PROPERTY:
						case RANGE:
						case READ:
						case REALLOCATE:
						case REDUCE:
						case RENAME:
						case REL:
						case RELATIONSHIP:
						case RELATIONSHIPS:
						case REMOVE:
						case REPLACE:
						case REPORT:
						case REQUIRE:
						case REQUIRED:
						case RETURN:
						case REVOKE:
						case ROLE:
						case ROLES:
						case ROW:
						case ROWS:
						case SCAN:
						case SEC:
						case SECOND:
						case SECONDARY:
						case SECONDARIES:
						case SECONDS:
						case SEEK:
						case SERVER:
						case SERVERS:
						case SET:
						case SETTING:
						case SETTINGS:
						case SHORTEST_PATH:
						case SHOW:
						case SINGLE:
						case SKIPROWS:
						case START:
						case STARTS:
						case STATUS:
						case STOP:
						case SUSPENDED:
						case TARGET:
						case TERMINATE:
						case TEXT:
						case THEN:
						case TO:
						case TOPOLOGY:
						case TRANSACTION:
						case TRANSACTIONS:
						case TRAVERSE:
						case TRUE:
						case TYPE:
						case TYPES:
						case UNION:
						case UNIQUE:
						case UNIQUENESS:
						case UNWIND:
						case USE:
						case USER:
						case USERS:
						case USING:
						case VERBOSE:
						case WAIT:
						case WHEN:
						case WHERE:
						case WITH:
						case WRITE:
						case XOR:
						case YIELD:
						case IDENTIFIER:
						case ESCAPED_SYMBOLIC_NAME:
							{
							setState(2771);
							symbolicNameOrStringParameterList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2774);
						match(RPAREN);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2779);
				match(ON);
				setState(2780);
				databaseScopeList();
				setState(2781);
				databasePrivilege();
				}
				break;
			case ALIAS:
			case PRIVILEGE:
			case ROLE:
			case SERVER:
			case SERVERS:
			case SETTING:
			case SETTINGS:
			case USER:
				{
				setState(2790);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALIAS:
					{
					setState(2783);
					match(ALIAS);
					}
					break;
				case PRIVILEGE:
					{
					setState(2784);
					match(PRIVILEGE);
					}
					break;
				case ROLE:
					{
					setState(2785);
					match(ROLE);
					}
					break;
				case USER:
					{
					setState(2786);
					match(USER);
					}
					break;
				case SERVER:
				case SERVERS:
					{
					setState(2787);
					_la = _input.LA(1);
					if ( !(_la==SERVER || _la==SERVERS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case SETTING:
				case SETTINGS:
					{
					setState(2788);
					_la = _input.LA(1);
					if ( !(_la==SETTING || _la==SETTINGS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2789);
					settingQualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2792);
				match(ON);
				setState(2793);
				match(DBMS);
				setState(2794);
				dbmsPrivilege();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPrivilegeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode ACCESS() { return getToken(CypherParser.ACCESS, 0); }
		public TerminalNode LABEL() { return getToken(CypherParser.LABEL, 0); }
		public LabelResourceContext labelResource() {
			return getRuleContext(LabelResourceContext.class,0);
		}
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public PropertyResourceContext propertyResource() {
			return getRuleContext(PropertyResourceContext.class,0);
		}
		public GraphQualifierContext graphQualifier() {
			return getRuleContext(GraphQualifierContext.class,0);
		}
		public TerminalNode PASSWORD() { return getToken(CypherParser.PASSWORD, 0); }
		public TerminalNode PASSWORDS() { return getToken(CypherParser.PASSWORDS, 0); }
		public TerminalNode STATUS() { return getToken(CypherParser.STATUS, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public SetPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPrivilege; }
	}

	public final SetPrivilegeContext setPrivilege() throws RecognitionException {
		SetPrivilegeContext _localctx = new SetPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_setPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			match(SET);
			setState(2825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
			case PASSWORD:
			case PASSWORDS:
			case USER:
				{
				setState(2807);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASSWORD:
				case PASSWORDS:
					{
					setState(2798);
					_la = _input.LA(1);
					if ( !(_la==PASSWORD || _la==PASSWORDS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case USER:
					{
					setState(2799);
					match(USER);
					setState(2803);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STATUS:
						{
						setState(2800);
						match(STATUS);
						}
						break;
					case HOME:
						{
						setState(2801);
						match(HOME);
						setState(2802);
						match(DATABASE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case DATABASE:
					{
					setState(2805);
					match(DATABASE);
					setState(2806);
					match(ACCESS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2809);
				match(ON);
				setState(2810);
				match(DBMS);
				setState(2811);
				dbmsPrivilege();
				}
				break;
			case LABEL:
			case PROPERTY:
				{
				setState(2823);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(2812);
					match(LABEL);
					setState(2813);
					labelResource();
					setState(2814);
					match(ON);
					setState(2815);
					graphScopeList();
					}
					break;
				case PROPERTY:
					{
					setState(2817);
					match(PROPERTY);
					setState(2818);
					propertyResource();
					setState(2819);
					match(ON);
					setState(2820);
					graphScopeList();
					setState(2821);
					graphQualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemovePrivilegeContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(CypherParser.LABEL, 0); }
		public LabelResourceContext labelResource() {
			return getRuleContext(LabelResourceContext.class,0);
		}
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public RemovePrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removePrivilege; }
	}

	public final RemovePrivilegeContext removePrivilege() throws RecognitionException {
		RemovePrivilegeContext _localctx = new RemovePrivilegeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_removePrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			match(REMOVE);
			setState(2837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVILEGE:
			case ROLE:
				{
				setState(2828);
				_la = _input.LA(1);
				if ( !(_la==PRIVILEGE || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2829);
				match(ON);
				setState(2830);
				match(DBMS);
				setState(2831);
				dbmsPrivilege();
				}
				break;
			case LABEL:
				{
				setState(2832);
				match(LABEL);
				setState(2833);
				labelResource();
				setState(2834);
				match(ON);
				setState(2835);
				graphScopeList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritePrivilegeContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CypherParser.WRITE, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public WritePrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writePrivilege; }
	}

	public final WritePrivilegeContext writePrivilege() throws RecognitionException {
		WritePrivilegeContext _localctx = new WritePrivilegeContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_writePrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
			match(WRITE);
			setState(2840);
			match(ON);
			setState(2841);
			graphScopeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabasePrivilegeContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public DatabaseScopeListContext databaseScopeList() {
			return getRuleContext(DatabaseScopeListContext.class,0);
		}
		public DatabasePrivilegeContext databasePrivilege() {
			return getRuleContext(DatabasePrivilegeContext.class,0);
		}
		public TerminalNode ACCESS() { return getToken(CypherParser.ACCESS, 0); }
		public TerminalNode START() { return getToken(CypherParser.START, 0); }
		public TerminalNode STOP() { return getToken(CypherParser.STOP, 0); }
		public TerminalNode TRANSACTION() { return getToken(CypherParser.TRANSACTION, 0); }
		public TerminalNode TERMINATE() { return getToken(CypherParser.TERMINATE, 0); }
		public TerminalNode NAME() { return getToken(CypherParser.NAME, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public TerminalNode MANAGEMENT() { return getToken(CypherParser.MANAGEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public DatabasePrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePrivilege; }
	}

	public final DatabasePrivilegeContext databasePrivilege() throws RecognitionException {
		DatabasePrivilegeContext _localctx = new DatabasePrivilegeContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_databasePrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
				{
				setState(2843);
				match(ACCESS);
				}
				break;
			case START:
				{
				setState(2844);
				match(START);
				}
				break;
			case STOP:
				{
				setState(2845);
				match(STOP);
				}
				break;
			case INDEX:
			case INDEXES:
				{
				setState(2846);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==INDEXES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANAGEMENT) {
					{
					setState(2847);
					match(MANAGEMENT);
					}
				}

				}
				break;
			case CONSTRAINT:
			case CONSTRAINTS:
				{
				setState(2850);
				_la = _input.LA(1);
				if ( !(_la==CONSTRAINT || _la==CONSTRAINTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANAGEMENT) {
					{
					setState(2851);
					match(MANAGEMENT);
					}
				}

				}
				break;
			case TRANSACTION:
				{
				setState(2854);
				match(TRANSACTION);
				setState(2856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANAGEMENT) {
					{
					setState(2855);
					match(MANAGEMENT);
					}
				}

				setState(2864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2858);
					match(LPAREN);
					setState(2861);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TIMES:
						{
						setState(2859);
						match(TIMES);
						}
						break;
					case ACCESS:
					case ACTIVE:
					case ADMIN:
					case ADMINISTRATOR:
					case ALIAS:
					case ALIASES:
					case ALL_SHORTEST_PATH:
					case ALL:
					case ALTER:
					case AND:
					case ANY:
					case AS:
					case ASC:
					case ASSERT:
					case ASSIGN:
					case AT:
					case BOOSTED:
					case BREAK:
					case BRIEF:
					case BTREE:
					case BUILT:
					case BY:
					case CALL:
					case CASE:
					case CHANGE:
					case COMMAND:
					case COMMANDS:
					case COMMIT:
					case COMPOSITE:
					case CONSTRAINT:
					case CONSTRAINTS:
					case CONTAINS:
					case COPY:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CSV:
					case CURRENT:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DBMS:
					case DEALLOCATE:
					case DEFAULT_TOKEN:
					case DEFINED:
					case DELETE:
					case DENY:
					case DESC:
					case DESTROY:
					case DETACH:
					case DOLLAR:
					case DISTINCT:
					case DRIVER:
					case DROP:
					case DRYRUN:
					case DUMP:
					case EACH:
					case ENABLE:
					case ELEMENT:
					case ELEMENTS:
					case ELSE:
					case ENCRYPTED:
					case END:
					case ENDS:
					case EXECUTABLE:
					case EXECUTE:
					case EXIST:
					case EXISTENCE:
					case EXISTS:
					case ERROR:
					case FAIL:
					case FALSE:
					case FIELDTERMINATOR:
					case FOR:
					case FOREACH:
					case FROM:
					case FULLTEXT:
					case FUNCTION:
					case FUNCTIONS:
					case GRANT:
					case GRAPH:
					case GRAPHS:
					case HEADERS:
					case HOME:
					case IF:
					case IMMUTABLE:
					case IN:
					case INDEX:
					case INDEXES:
					case INF:
					case INFINITY:
					case IS:
					case JOIN:
					case KEY:
					case LABEL:
					case LABELS:
					case LIMITROWS:
					case LOAD:
					case LOOKUP:
					case MANAGEMENT:
					case MATCH:
					case MERGE:
					case NAME:
					case NAMES:
					case NAN:
					case NEW:
					case NODE:
					case NODES:
					case NONE:
					case NOT:
					case NOWAIT:
					case NULL:
					case OF:
					case ON:
					case ONLY:
					case OPTIONAL:
					case OPTIONS:
					case OPTION:
					case OR:
					case ORDER:
					case OUTPUT:
					case PASSWORD:
					case PASSWORDS:
					case PERIODIC:
					case PLAINTEXT:
					case POINT:
					case POPULATED:
					case PRIMARY:
					case PRIMARIES:
					case PRIVILEGE:
					case PRIVILEGES:
					case PROCEDURE:
					case PROCEDURES:
					case PROPERTIES:
					case PROPERTY:
					case RANGE:
					case READ:
					case REALLOCATE:
					case REDUCE:
					case RENAME:
					case REL:
					case RELATIONSHIP:
					case RELATIONSHIPS:
					case REMOVE:
					case REPLACE:
					case REPORT:
					case REQUIRE:
					case REQUIRED:
					case RETURN:
					case REVOKE:
					case ROLE:
					case ROLES:
					case ROW:
					case ROWS:
					case SCAN:
					case SEC:
					case SECOND:
					case SECONDARY:
					case SECONDARIES:
					case SECONDS:
					case SEEK:
					case SERVER:
					case SERVERS:
					case SET:
					case SETTING:
					case SETTINGS:
					case SHORTEST_PATH:
					case SHOW:
					case SINGLE:
					case SKIPROWS:
					case START:
					case STARTS:
					case STATUS:
					case STOP:
					case SUSPENDED:
					case TARGET:
					case TERMINATE:
					case TEXT:
					case THEN:
					case TO:
					case TOPOLOGY:
					case TRANSACTION:
					case TRANSACTIONS:
					case TRAVERSE:
					case TRUE:
					case TYPE:
					case TYPES:
					case UNION:
					case UNIQUE:
					case UNIQUENESS:
					case UNWIND:
					case USE:
					case USER:
					case USERS:
					case USING:
					case VERBOSE:
					case WAIT:
					case WHEN:
					case WHERE:
					case WITH:
					case WRITE:
					case XOR:
					case YIELD:
					case IDENTIFIER:
					case ESCAPED_SYMBOLIC_NAME:
						{
						setState(2860);
						symbolicNameOrStringParameterList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2863);
					match(RPAREN);
					}
				}

				}
				break;
			case TERMINATE:
				{
				setState(2866);
				match(TERMINATE);
				setState(2867);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==TRANSACTIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2868);
					match(LPAREN);
					setState(2871);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TIMES:
						{
						setState(2869);
						match(TIMES);
						}
						break;
					case ACCESS:
					case ACTIVE:
					case ADMIN:
					case ADMINISTRATOR:
					case ALIAS:
					case ALIASES:
					case ALL_SHORTEST_PATH:
					case ALL:
					case ALTER:
					case AND:
					case ANY:
					case AS:
					case ASC:
					case ASSERT:
					case ASSIGN:
					case AT:
					case BOOSTED:
					case BREAK:
					case BRIEF:
					case BTREE:
					case BUILT:
					case BY:
					case CALL:
					case CASE:
					case CHANGE:
					case COMMAND:
					case COMMANDS:
					case COMMIT:
					case COMPOSITE:
					case CONSTRAINT:
					case CONSTRAINTS:
					case CONTAINS:
					case COPY:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CSV:
					case CURRENT:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DBMS:
					case DEALLOCATE:
					case DEFAULT_TOKEN:
					case DEFINED:
					case DELETE:
					case DENY:
					case DESC:
					case DESTROY:
					case DETACH:
					case DOLLAR:
					case DISTINCT:
					case DRIVER:
					case DROP:
					case DRYRUN:
					case DUMP:
					case EACH:
					case ENABLE:
					case ELEMENT:
					case ELEMENTS:
					case ELSE:
					case ENCRYPTED:
					case END:
					case ENDS:
					case EXECUTABLE:
					case EXECUTE:
					case EXIST:
					case EXISTENCE:
					case EXISTS:
					case ERROR:
					case FAIL:
					case FALSE:
					case FIELDTERMINATOR:
					case FOR:
					case FOREACH:
					case FROM:
					case FULLTEXT:
					case FUNCTION:
					case FUNCTIONS:
					case GRANT:
					case GRAPH:
					case GRAPHS:
					case HEADERS:
					case HOME:
					case IF:
					case IMMUTABLE:
					case IN:
					case INDEX:
					case INDEXES:
					case INF:
					case INFINITY:
					case IS:
					case JOIN:
					case KEY:
					case LABEL:
					case LABELS:
					case LIMITROWS:
					case LOAD:
					case LOOKUP:
					case MANAGEMENT:
					case MATCH:
					case MERGE:
					case NAME:
					case NAMES:
					case NAN:
					case NEW:
					case NODE:
					case NODES:
					case NONE:
					case NOT:
					case NOWAIT:
					case NULL:
					case OF:
					case ON:
					case ONLY:
					case OPTIONAL:
					case OPTIONS:
					case OPTION:
					case OR:
					case ORDER:
					case OUTPUT:
					case PASSWORD:
					case PASSWORDS:
					case PERIODIC:
					case PLAINTEXT:
					case POINT:
					case POPULATED:
					case PRIMARY:
					case PRIMARIES:
					case PRIVILEGE:
					case PRIVILEGES:
					case PROCEDURE:
					case PROCEDURES:
					case PROPERTIES:
					case PROPERTY:
					case RANGE:
					case READ:
					case REALLOCATE:
					case REDUCE:
					case RENAME:
					case REL:
					case RELATIONSHIP:
					case RELATIONSHIPS:
					case REMOVE:
					case REPLACE:
					case REPORT:
					case REQUIRE:
					case REQUIRED:
					case RETURN:
					case REVOKE:
					case ROLE:
					case ROLES:
					case ROW:
					case ROWS:
					case SCAN:
					case SEC:
					case SECOND:
					case SECONDARY:
					case SECONDARIES:
					case SECONDS:
					case SEEK:
					case SERVER:
					case SERVERS:
					case SET:
					case SETTING:
					case SETTINGS:
					case SHORTEST_PATH:
					case SHOW:
					case SINGLE:
					case SKIPROWS:
					case START:
					case STARTS:
					case STATUS:
					case STOP:
					case SUSPENDED:
					case TARGET:
					case TERMINATE:
					case TEXT:
					case THEN:
					case TO:
					case TOPOLOGY:
					case TRANSACTION:
					case TRANSACTIONS:
					case TRAVERSE:
					case TRUE:
					case TYPE:
					case TYPES:
					case UNION:
					case UNIQUE:
					case UNIQUENESS:
					case UNWIND:
					case USE:
					case USER:
					case USERS:
					case USING:
					case VERBOSE:
					case WAIT:
					case WHEN:
					case WHERE:
					case WITH:
					case WRITE:
					case XOR:
					case YIELD:
					case IDENTIFIER:
					case ESCAPED_SYMBOLIC_NAME:
						{
						setState(2870);
						symbolicNameOrStringParameterList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2873);
					match(RPAREN);
					}
				}

				}
				break;
			case NAME:
				{
				setState(2876);
				match(NAME);
				setState(2878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANAGEMENT) {
					{
					setState(2877);
					match(MANAGEMENT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2882);
			match(ON);
			setState(2883);
			databaseScopeList();
			setState(2884);
			databasePrivilege();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbmsPrivilegeContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public DbmsPrivilegeContext dbmsPrivilege() {
			return getRuleContext(DbmsPrivilegeContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(CypherParser.ALTER, 0); }
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode MANAGEMENT() { return getToken(CypherParser.MANAGEMENT, 0); }
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode EXECUTE() { return getToken(CypherParser.EXECUTE, 0); }
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode RENAME() { return getToken(CypherParser.RENAME, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode IMPERSONATE() { return getToken(CypherParser.IMPERSONATE, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode PROCEDURES() { return getToken(CypherParser.PROCEDURES, 0); }
		public TerminalNode BOOSTED() { return getToken(CypherParser.BOOSTED, 0); }
		public ExecuteProcedureQualifierContext executeProcedureQualifier() {
			return getRuleContext(ExecuteProcedureQualifierContext.class,0);
		}
		public ExecuteFunctionQualifierContext executeFunctionQualifier() {
			return getRuleContext(ExecuteFunctionQualifierContext.class,0);
		}
		public TerminalNode ADMIN() { return getToken(CypherParser.ADMIN, 0); }
		public TerminalNode ADMINISTRATOR() { return getToken(CypherParser.ADMINISTRATOR, 0); }
		public TerminalNode PROCEDURE() { return getToken(CypherParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(CypherParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(CypherParser.FUNCTIONS, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() {
			return getRuleContext(SymbolicNameOrStringParameterListContext.class,0);
		}
		public TerminalNode DEFINED() { return getToken(CypherParser.DEFINED, 0); }
		public DbmsPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbmsPrivilege; }
	}

	public final DbmsPrivilegeContext dbmsPrivilege() throws RecognitionException {
		DbmsPrivilegeContext _localctx = new DbmsPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_dbmsPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				{
				setState(2886);
				match(ALTER);
				setState(2887);
				_la = _input.LA(1);
				if ( !(_la==ALIAS || _la==DATABASE || _la==USER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ASSIGN:
				{
				setState(2888);
				match(ASSIGN);
				setState(2889);
				_la = _input.LA(1);
				if ( !(_la==PRIVILEGE || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case COMPOSITE:
				{
				setState(2890);
				match(COMPOSITE);
				setState(2891);
				match(DATABASE);
				setState(2892);
				match(MANAGEMENT);
				}
				break;
			case DATABASE:
				{
				setState(2893);
				match(DATABASE);
				setState(2894);
				match(MANAGEMENT);
				}
				break;
			case ALIAS:
				{
				setState(2895);
				match(ALIAS);
				setState(2896);
				match(MANAGEMENT);
				}
				break;
			case EXECUTE:
				{
				setState(2897);
				match(EXECUTE);
				setState(2923);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADMIN:
				case ADMINISTRATOR:
					{
					setState(2898);
					_la = _input.LA(1);
					if ( !(_la==ADMIN || _la==ADMINISTRATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2899);
					match(PROCEDURES);
					}
					break;
				case BOOSTED:
					{
					setState(2900);
					match(BOOSTED);
					setState(2911);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PROCEDURE:
					case PROCEDURES:
						{
						setState(2901);
						_la = _input.LA(1);
						if ( !(_la==PROCEDURE || _la==PROCEDURES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2902);
						executeProcedureQualifier();
						}
						break;
					case FUNCTION:
					case FUNCTIONS:
					case USER:
						{
						setState(2907);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==USER) {
							{
							setState(2903);
							match(USER);
							setState(2905);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==DEFINED) {
								{
								setState(2904);
								match(DEFINED);
								}
							}

							}
						}

						setState(2909);
						_la = _input.LA(1);
						if ( !(_la==FUNCTION || _la==FUNCTIONS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2910);
						executeFunctionQualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case PROCEDURE:
				case PROCEDURES:
					{
					setState(2913);
					_la = _input.LA(1);
					if ( !(_la==PROCEDURE || _la==PROCEDURES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2914);
					executeProcedureQualifier();
					}
					break;
				case FUNCTION:
				case FUNCTIONS:
				case USER:
					{
					setState(2919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==USER) {
						{
						setState(2915);
						match(USER);
						setState(2917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DEFINED) {
							{
							setState(2916);
							match(DEFINED);
							}
						}

						}
					}

					setState(2921);
					_la = _input.LA(1);
					if ( !(_la==FUNCTION || _la==FUNCTIONS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2922);
					executeFunctionQualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PRIVILEGE:
				{
				setState(2925);
				match(PRIVILEGE);
				setState(2926);
				match(MANAGEMENT);
				}
				break;
			case RENAME:
				{
				setState(2927);
				match(RENAME);
				setState(2928);
				_la = _input.LA(1);
				if ( !(_la==ROLE || _la==USER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SERVER:
				{
				setState(2929);
				match(SERVER);
				setState(2930);
				match(MANAGEMENT);
				}
				break;
			case USER:
				{
				setState(2931);
				match(USER);
				setState(2932);
				match(MANAGEMENT);
				}
				break;
			case IMPERSONATE:
				{
				setState(2933);
				match(IMPERSONATE);
				setState(2940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2934);
					match(LPAREN);
					setState(2937);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TIMES:
						{
						setState(2935);
						match(TIMES);
						}
						break;
					case ACCESS:
					case ACTIVE:
					case ADMIN:
					case ADMINISTRATOR:
					case ALIAS:
					case ALIASES:
					case ALL_SHORTEST_PATH:
					case ALL:
					case ALTER:
					case AND:
					case ANY:
					case AS:
					case ASC:
					case ASSERT:
					case ASSIGN:
					case AT:
					case BOOSTED:
					case BREAK:
					case BRIEF:
					case BTREE:
					case BUILT:
					case BY:
					case CALL:
					case CASE:
					case CHANGE:
					case COMMAND:
					case COMMANDS:
					case COMMIT:
					case COMPOSITE:
					case CONSTRAINT:
					case CONSTRAINTS:
					case CONTAINS:
					case COPY:
					case CONTINUE:
					case COUNT:
					case CREATE:
					case CSV:
					case CURRENT:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DBMS:
					case DEALLOCATE:
					case DEFAULT_TOKEN:
					case DEFINED:
					case DELETE:
					case DENY:
					case DESC:
					case DESTROY:
					case DETACH:
					case DOLLAR:
					case DISTINCT:
					case DRIVER:
					case DROP:
					case DRYRUN:
					case DUMP:
					case EACH:
					case ENABLE:
					case ELEMENT:
					case ELEMENTS:
					case ELSE:
					case ENCRYPTED:
					case END:
					case ENDS:
					case EXECUTABLE:
					case EXECUTE:
					case EXIST:
					case EXISTENCE:
					case EXISTS:
					case ERROR:
					case FAIL:
					case FALSE:
					case FIELDTERMINATOR:
					case FOR:
					case FOREACH:
					case FROM:
					case FULLTEXT:
					case FUNCTION:
					case FUNCTIONS:
					case GRANT:
					case GRAPH:
					case GRAPHS:
					case HEADERS:
					case HOME:
					case IF:
					case IMMUTABLE:
					case IN:
					case INDEX:
					case INDEXES:
					case INF:
					case INFINITY:
					case IS:
					case JOIN:
					case KEY:
					case LABEL:
					case LABELS:
					case LIMITROWS:
					case LOAD:
					case LOOKUP:
					case MANAGEMENT:
					case MATCH:
					case MERGE:
					case NAME:
					case NAMES:
					case NAN:
					case NEW:
					case NODE:
					case NODES:
					case NONE:
					case NOT:
					case NOWAIT:
					case NULL:
					case OF:
					case ON:
					case ONLY:
					case OPTIONAL:
					case OPTIONS:
					case OPTION:
					case OR:
					case ORDER:
					case OUTPUT:
					case PASSWORD:
					case PASSWORDS:
					case PERIODIC:
					case PLAINTEXT:
					case POINT:
					case POPULATED:
					case PRIMARY:
					case PRIMARIES:
					case PRIVILEGE:
					case PRIVILEGES:
					case PROCEDURE:
					case PROCEDURES:
					case PROPERTIES:
					case PROPERTY:
					case RANGE:
					case READ:
					case REALLOCATE:
					case REDUCE:
					case RENAME:
					case REL:
					case RELATIONSHIP:
					case RELATIONSHIPS:
					case REMOVE:
					case REPLACE:
					case REPORT:
					case REQUIRE:
					case REQUIRED:
					case RETURN:
					case REVOKE:
					case ROLE:
					case ROLES:
					case ROW:
					case ROWS:
					case SCAN:
					case SEC:
					case SECOND:
					case SECONDARY:
					case SECONDARIES:
					case SECONDS:
					case SEEK:
					case SERVER:
					case SERVERS:
					case SET:
					case SETTING:
					case SETTINGS:
					case SHORTEST_PATH:
					case SHOW:
					case SINGLE:
					case SKIPROWS:
					case START:
					case STARTS:
					case STATUS:
					case STOP:
					case SUSPENDED:
					case TARGET:
					case TERMINATE:
					case TEXT:
					case THEN:
					case TO:
					case TOPOLOGY:
					case TRANSACTION:
					case TRANSACTIONS:
					case TRAVERSE:
					case TRUE:
					case TYPE:
					case TYPES:
					case UNION:
					case UNIQUE:
					case UNIQUENESS:
					case UNWIND:
					case USE:
					case USER:
					case USERS:
					case USING:
					case VERBOSE:
					case WAIT:
					case WHEN:
					case WHERE:
					case WITH:
					case WRITE:
					case XOR:
					case YIELD:
					case IDENTIFIER:
					case ESCAPED_SYMBOLIC_NAME:
						{
						setState(2936);
						symbolicNameOrStringParameterList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2939);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2944);
			match(ON);
			setState(2945);
			match(DBMS);
			setState(2946);
			dbmsPrivilege();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteFunctionQualifierContext extends ParserRuleContext {
		public GlobsContext globs() {
			return getRuleContext(GlobsContext.class,0);
		}
		public ExecuteFunctionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeFunctionQualifier; }
	}

	public final ExecuteFunctionQualifierContext executeFunctionQualifier() throws RecognitionException {
		ExecuteFunctionQualifierContext _localctx = new ExecuteFunctionQualifierContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_executeFunctionQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2948);
			globs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteProcedureQualifierContext extends ParserRuleContext {
		public GlobsContext globs() {
			return getRuleContext(GlobsContext.class,0);
		}
		public ExecuteProcedureQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeProcedureQualifier; }
	}

	public final ExecuteProcedureQualifierContext executeProcedureQualifier() throws RecognitionException {
		ExecuteProcedureQualifierContext _localctx = new ExecuteProcedureQualifierContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_executeProcedureQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
			globs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingQualifierContext extends ParserRuleContext {
		public List<GlobsContext> globs() {
			return getRuleContexts(GlobsContext.class);
		}
		public GlobsContext globs(int i) {
			return getRuleContext(GlobsContext.class,i);
		}
		public SettingQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingQualifier; }
	}

	public final SettingQualifierContext settingQualifier() throws RecognitionException {
		SettingQualifierContext _localctx = new SettingQualifierContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_settingQualifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2953); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2952);
					globs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2955); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobsContext extends ParserRuleContext {
		public List<GlobContext> glob() {
			return getRuleContexts(GlobContext.class);
		}
		public GlobContext glob(int i) {
			return getRuleContext(GlobContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public GlobsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globs; }
	}

	public final GlobsContext globs() throws RecognitionException {
		GlobsContext _localctx = new GlobsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_globs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2957);
			glob();
			setState(2962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2958);
				match(COMMA);
				setState(2959);
				glob();
				}
				}
				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedGraphPrivilegesWithPropertyContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public GraphQualifierContext graphQualifier() {
			return getRuleContext(GraphQualifierContext.class,0);
		}
		public TerminalNode TRAVERSE() { return getToken(CypherParser.TRAVERSE, 0); }
		public TerminalNode READ() { return getToken(CypherParser.READ, 0); }
		public PropertyResourceContext propertyResource() {
			return getRuleContext(PropertyResourceContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public QualifiedGraphPrivilegesWithPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedGraphPrivilegesWithProperty; }
	}

	public final QualifiedGraphPrivilegesWithPropertyContext qualifiedGraphPrivilegesWithProperty() throws RecognitionException {
		QualifiedGraphPrivilegesWithPropertyContext _localctx = new QualifiedGraphPrivilegesWithPropertyContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_qualifiedGraphPrivilegesWithProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRAVERSE:
				{
				setState(2965);
				match(TRAVERSE);
				}
				break;
			case READ:
				{
				setState(2966);
				match(READ);
				setState(2967);
				propertyResource();
				}
				break;
			case MATCH:
				{
				setState(2968);
				match(MATCH);
				setState(2969);
				propertyResource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2972);
			match(ON);
			setState(2973);
			graphScopeList();
			setState(2974);
			graphQualifier();
			setState(2978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2975);
				match(LPAREN);
				setState(2976);
				match(TIMES);
				setState(2977);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedGraphPrivilegesContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public GraphScopeListContext graphScopeList() {
			return getRuleContext(GraphScopeListContext.class,0);
		}
		public GraphQualifierContext graphQualifier() {
			return getRuleContext(GraphQualifierContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public PropertyResourceContext propertyResource() {
			return getRuleContext(PropertyResourceContext.class,0);
		}
		public QualifiedGraphPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedGraphPrivileges; }
	}

	public final QualifiedGraphPrivilegesContext qualifiedGraphPrivileges() throws RecognitionException {
		QualifiedGraphPrivilegesContext _localctx = new QualifiedGraphPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_qualifiedGraphPrivileges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(2980);
				match(DELETE);
				}
				break;
			case MERGE:
				{
				setState(2981);
				match(MERGE);
				setState(2982);
				propertyResource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2985);
			match(ON);
			setState(2986);
			graphScopeList();
			setState(2987);
			graphQualifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelResourceContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicNameList1Context symbolicNameList1() {
			return getRuleContext(SymbolicNameList1Context.class,0);
		}
		public LabelResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelResource; }
	}

	public final LabelResourceContext labelResource() throws RecognitionException {
		LabelResourceContext _localctx = new LabelResourceContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_labelResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(2989);
				match(TIMES);
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2990);
				symbolicNameList1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyResourceContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicNameList1Context symbolicNameList1() {
			return getRuleContext(SymbolicNameList1Context.class,0);
		}
		public PropertyResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyResource; }
	}

	public final PropertyResourceContext propertyResource() throws RecognitionException {
		PropertyResourceContext _localctx = new PropertyResourceContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_propertyResource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2993);
			match(LCURLY);
			setState(2996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(2994);
				match(TIMES);
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(2995);
				symbolicNameList1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2998);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphQualifierContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(CypherParser.RELATIONSHIP, 0); }
		public TerminalNode RELATIONSHIPS() { return getToken(CypherParser.RELATIONSHIPS, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public TerminalNode NODES() { return getToken(CypherParser.NODES, 0); }
		public TerminalNode ELEMENT() { return getToken(CypherParser.ELEMENT, 0); }
		public TerminalNode ELEMENTS() { return getToken(CypherParser.ELEMENTS, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public GraphQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphQualifier; }
	}

	public final GraphQualifierContext graphQualifier() throws RecognitionException {
		GraphQualifierContext _localctx = new GraphQualifierContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_graphQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
			case RELATIONSHIPS:
				{
				setState(3000);
				_la = _input.LA(1);
				if ( !(_la==RELATIONSHIP || _la==RELATIONSHIPS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(3001);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(3002);
					symbolicNameString();
					setState(3007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3003);
						match(COMMA);
						setState(3004);
						symbolicNameString();
						}
						}
						setState(3009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NODE:
			case NODES:
				{
				setState(3012);
				_la = _input.LA(1);
				if ( !(_la==NODE || _la==NODES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3022);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(3013);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(3014);
					symbolicNameString();
					setState(3019);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3015);
						match(COMMA);
						setState(3016);
						symbolicNameString();
						}
						}
						setState(3021);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ELEMENT:
			case ELEMENTS:
				{
				setState(3024);
				_la = _input.LA(1);
				if ( !(_la==ELEMENT || _la==ELEMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3034);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(3025);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(3026);
					symbolicNameString();
					setState(3031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3027);
						match(COMMA);
						setState(3028);
						symbolicNameString();
						}
						}
						setState(3033);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FROM:
			case LPAREN:
			case TO:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode TOPOLOGY() { return getToken(CypherParser.TOPOLOGY, 0); }
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public WaitClauseContext waitClause() {
			return getRuleContext(WaitClauseContext.class,0);
		}
		public List<TerminalNode> UNSIGNED_DECIMAL_INTEGER() { return getTokens(CypherParser.UNSIGNED_DECIMAL_INTEGER); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER(int i) {
			return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, i);
		}
		public List<TerminalNode> PRIMARY() { return getTokens(CypherParser.PRIMARY); }
		public TerminalNode PRIMARY(int i) {
			return getToken(CypherParser.PRIMARY, i);
		}
		public List<TerminalNode> PRIMARIES() { return getTokens(CypherParser.PRIMARIES); }
		public TerminalNode PRIMARIES(int i) {
			return getToken(CypherParser.PRIMARIES, i);
		}
		public List<TerminalNode> SECONDARY() { return getTokens(CypherParser.SECONDARY); }
		public TerminalNode SECONDARY(int i) {
			return getToken(CypherParser.SECONDARY, i);
		}
		public List<TerminalNode> SECONDARIES() { return getTokens(CypherParser.SECONDARIES); }
		public TerminalNode SECONDARIES(int i) {
			return getToken(CypherParser.SECONDARIES, i);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_createDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3038);
			match(DATABASE);
			setState(3039);
			symbolicAliasName();
			setState(3043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3040);
				match(IF);
				setState(3041);
				match(NOT);
				setState(3042);
				match(EXISTS);
				}
			}

			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOPOLOGY) {
				{
				setState(3045);
				match(TOPOLOGY);
				setState(3051); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3046);
					match(UNSIGNED_DECIMAL_INTEGER);
					setState(3049);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PRIMARY:
					case PRIMARIES:
						{
						setState(3047);
						_la = _input.LA(1);
						if ( !(_la==PRIMARY || _la==PRIMARIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case SECONDARY:
					case SECONDARIES:
						{
						setState(3048);
						_la = _input.LA(1);
						if ( !(_la==SECONDARY || _la==SECONDARIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(3053); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNSIGNED_DECIMAL_INTEGER );
				}
			}

			setState(3058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(3057);
				options_();
				}
			}

			setState(3061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOWAIT || _la==WAIT) {
				{
				setState(3060);
				waitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Options_Context extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public MapOrParameterContext mapOrParameter() {
			return getRuleContext(MapOrParameterContext.class,0);
		}
		public Options_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_; }
	}

	public final Options_Context options_() throws RecognitionException {
		Options_Context _localctx = new Options_Context(_ctx, getState());
		enterRule(_localctx, 420, RULE_options_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3063);
			match(OPTIONS);
			setState(3064);
			mapOrParameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateCompositeDatabaseContext extends ParserRuleContext {
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public WaitClauseContext waitClause() {
			return getRuleContext(WaitClauseContext.class,0);
		}
		public CreateCompositeDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCompositeDatabase; }
	}

	public final CreateCompositeDatabaseContext createCompositeDatabase() throws RecognitionException {
		CreateCompositeDatabaseContext _localctx = new CreateCompositeDatabaseContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_createCompositeDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3066);
			match(COMPOSITE);
			setState(3067);
			match(DATABASE);
			setState(3068);
			symbolicAliasName();
			setState(3072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3069);
				match(IF);
				setState(3070);
				match(NOT);
				setState(3071);
				match(EXISTS);
				}
			}

			setState(3075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(3074);
				options_();
				}
			}

			setState(3078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOWAIT || _la==WAIT) {
				{
				setState(3077);
				waitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode DATA() { return getToken(CypherParser.DATA, 0); }
		public WaitClauseContext waitClause() {
			return getRuleContext(WaitClauseContext.class,0);
		}
		public TerminalNode DUMP() { return getToken(CypherParser.DUMP, 0); }
		public TerminalNode DESTROY() { return getToken(CypherParser.DESTROY, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_dropDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPOSITE) {
				{
				setState(3080);
				match(COMPOSITE);
				}
			}

			setState(3083);
			match(DATABASE);
			setState(3084);
			symbolicAliasName();
			setState(3087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3085);
				match(IF);
				setState(3086);
				match(EXISTS);
				}
			}

			setState(3091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESTROY || _la==DUMP) {
				{
				setState(3089);
				_la = _input.LA(1);
				if ( !(_la==DESTROY || _la==DUMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3090);
				match(DATA);
				}
			}

			setState(3094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOWAIT || _la==WAIT) {
				{
				setState(3093);
				waitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public List<TerminalNode> SET() { return getTokens(CypherParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(CypherParser.SET, i);
		}
		public List<TerminalNode> REMOVE() { return getTokens(CypherParser.REMOVE); }
		public TerminalNode REMOVE(int i) {
			return getToken(CypherParser.REMOVE, i);
		}
		public List<TerminalNode> OPTION() { return getTokens(CypherParser.OPTION); }
		public TerminalNode OPTION(int i) {
			return getToken(CypherParser.OPTION, i);
		}
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> ACCESS() { return getTokens(CypherParser.ACCESS); }
		public TerminalNode ACCESS(int i) {
			return getToken(CypherParser.ACCESS, i);
		}
		public List<TerminalNode> READ() { return getTokens(CypherParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(CypherParser.READ, i);
		}
		public List<TerminalNode> TOPOLOGY() { return getTokens(CypherParser.TOPOLOGY); }
		public TerminalNode TOPOLOGY(int i) {
			return getToken(CypherParser.TOPOLOGY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ONLY() { return getTokens(CypherParser.ONLY); }
		public TerminalNode ONLY(int i) {
			return getToken(CypherParser.ONLY, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(CypherParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(CypherParser.WRITE, i);
		}
		public List<TerminalNode> UNSIGNED_DECIMAL_INTEGER() { return getTokens(CypherParser.UNSIGNED_DECIMAL_INTEGER); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER(int i) {
			return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, i);
		}
		public List<TerminalNode> PRIMARY() { return getTokens(CypherParser.PRIMARY); }
		public TerminalNode PRIMARY(int i) {
			return getToken(CypherParser.PRIMARY, i);
		}
		public List<TerminalNode> PRIMARIES() { return getTokens(CypherParser.PRIMARIES); }
		public TerminalNode PRIMARIES(int i) {
			return getToken(CypherParser.PRIMARIES, i);
		}
		public List<TerminalNode> SECONDARY() { return getTokens(CypherParser.SECONDARY); }
		public TerminalNode SECONDARY(int i) {
			return getToken(CypherParser.SECONDARY, i);
		}
		public List<TerminalNode> SECONDARIES() { return getTokens(CypherParser.SECONDARIES); }
		public TerminalNode SECONDARIES(int i) {
			return getToken(CypherParser.SECONDARIES, i);
		}
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_alterDatabase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3096);
			match(DATABASE);
			setState(3097);
			symbolicAliasName();
			setState(3100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3098);
				match(IF);
				setState(3099);
				match(EXISTS);
				}
			}

			setState(3133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(3122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3102);
						match(SET);
						setState(3120);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ACCESS:
							{
							setState(3103);
							match(ACCESS);
							setState(3104);
							match(READ);
							setState(3105);
							_la = _input.LA(1);
							if ( !(_la==ONLY || _la==WRITE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case TOPOLOGY:
							{
							setState(3106);
							match(TOPOLOGY);
							setState(3112); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(3107);
								match(UNSIGNED_DECIMAL_INTEGER);
								setState(3110);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case PRIMARY:
								case PRIMARIES:
									{
									setState(3108);
									_la = _input.LA(1);
									if ( !(_la==PRIMARY || _la==PRIMARIES) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									break;
								case SECONDARY:
								case SECONDARIES:
									{
									setState(3109);
									_la = _input.LA(1);
									if ( !(_la==SECONDARY || _la==SECONDARIES) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								}
								setState(3114); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==UNSIGNED_DECIMAL_INTEGER );
							}
							break;
						case OPTION:
							{
							setState(3116);
							match(OPTION);
							setState(3117);
							symbolicNameString();
							setState(3118);
							expression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case REMOVE:
				{
				setState(3129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3126);
						match(REMOVE);
						setState(3127);
						match(OPTION);
						setState(3128);
						symbolicNameString();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartDatabaseContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(CypherParser.START, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public WaitClauseContext waitClause() {
			return getRuleContext(WaitClauseContext.class,0);
		}
		public StartDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDatabase; }
	}

	public final StartDatabaseContext startDatabase() throws RecognitionException {
		StartDatabaseContext _localctx = new StartDatabaseContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_startDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3135);
			match(START);
			setState(3136);
			match(DATABASE);
			setState(3137);
			symbolicAliasName();
			setState(3139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOWAIT || _la==WAIT) {
				{
				setState(3138);
				waitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopDatabaseContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(CypherParser.STOP, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public WaitClauseContext waitClause() {
			return getRuleContext(WaitClauseContext.class,0);
		}
		public StopDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopDatabase; }
	}

	public final StopDatabaseContext stopDatabase() throws RecognitionException {
		StopDatabaseContext _localctx = new StopDatabaseContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_stopDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3141);
			match(STOP);
			setState(3142);
			match(DATABASE);
			setState(3143);
			symbolicAliasName();
			setState(3145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOWAIT || _la==WAIT) {
				{
				setState(3144);
				waitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitClauseContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(CypherParser.WAIT, 0); }
		public TerminalNode NOWAIT() { return getToken(CypherParser.NOWAIT, 0); }
		public TerminalNode UNSIGNED_DECIMAL_INTEGER() { return getToken(CypherParser.UNSIGNED_DECIMAL_INTEGER, 0); }
		public TerminalNode SEC() { return getToken(CypherParser.SEC, 0); }
		public TerminalNode SECOND() { return getToken(CypherParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(CypherParser.SECONDS, 0); }
		public WaitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitClause; }
	}

	public final WaitClauseContext waitClause() throws RecognitionException {
		WaitClauseContext _localctx = new WaitClauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_waitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WAIT:
				{
				setState(3147);
				match(WAIT);
				setState(3152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED_DECIMAL_INTEGER) {
					{
					setState(3148);
					match(UNSIGNED_DECIMAL_INTEGER);
					setState(3150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (SEC - 191)) | (1L << (SECOND - 191)) | (1L << (SECONDS - 191)))) != 0)) {
						{
						setState(3149);
						_la = _input.LA(1);
						if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (SEC - 191)) | (1L << (SECOND - 191)) | (1L << (SECONDS - 191)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
				}

				}
				break;
			case NOWAIT:
				{
				setState(3154);
				match(NOWAIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode DEFAULT_TOKEN() { return getToken(CypherParser.DEFAULT_TOKEN, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_showDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
			case DATABASES:
				{
				setState(3157);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DATABASES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
					setState(3158);
					symbolicAliasName();
					setState(3164);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(3159);
						yieldClause();
						setState(3161);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
						case 1:
							{
							setState(3160);
							returnClause();
							}
							break;
						}
						}
						break;
					case WHERE:
						{
						setState(3163);
						whereClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(3166);
					yieldClause();
					setState(3168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
					case 1:
						{
						setState(3167);
						returnClause();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(3170);
					whereClause();
					}
					break;
				case 4:
					{
					setState(3171);
					symbolicAliasName();
					}
					break;
				}
				}
				break;
			case DEFAULT_TOKEN:
			case HOME:
				{
				setState(3178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT_TOKEN:
					{
					setState(3174);
					match(DEFAULT_TOKEN);
					setState(3175);
					match(DATABASE);
					}
					break;
				case HOME:
					{
					setState(3176);
					match(HOME);
					setState(3177);
					match(DATABASE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(3180);
					yieldClause();
					setState(3182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
					case 1:
						{
						setState(3181);
						returnClause();
						}
						break;
					}
					}
					break;
				case WHERE:
					{
					setState(3184);
					whereClause();
					}
					break;
				case EOF:
				case ALTER:
				case CALL:
				case CREATE:
				case DEALLOCATE:
				case DELETE:
				case DENY:
				case DETACH:
				case DROP:
				case DRYRUN:
				case ENABLE:
				case FOREACH:
				case GRANT:
				case LOAD:
				case MATCH:
				case MERGE:
				case OPTIONAL:
				case REALLOCATE:
				case RENAME:
				case REMOVE:
				case RETURN:
				case REVOKE:
				case SEMICOLON:
				case SET:
				case SHOW:
				case START:
				case STOP:
				case TERMINATE:
				case UNWIND:
				case USE:
				case USING:
				case WITH:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseScopeListContext extends ParserRuleContext {
		public TerminalNode DEFAULT_TOKEN() { return getToken(CypherParser.DEFAULT_TOKEN, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicAliasNameListContext symbolicAliasNameList() {
			return getRuleContext(SymbolicAliasNameListContext.class,0);
		}
		public DatabaseScopeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseScopeList; }
	}

	public final DatabaseScopeListContext databaseScopeList() throws RecognitionException {
		DatabaseScopeListContext _localctx = new DatabaseScopeListContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_databaseScopeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
			case DATABASES:
				{
				setState(3189);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DATABASES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(3190);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DOLLAR:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(3191);
					symbolicAliasNameList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_TOKEN:
				{
				setState(3194);
				match(DEFAULT_TOKEN);
				setState(3195);
				match(DATABASE);
				}
				break;
			case HOME:
				{
				setState(3196);
				match(HOME);
				setState(3197);
				match(DATABASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphScopeListContext extends ParserRuleContext {
		public TerminalNode DEFAULT_TOKEN() { return getToken(CypherParser.DEFAULT_TOKEN, 0); }
		public TerminalNode GRAPH() { return getToken(CypherParser.GRAPH, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public TerminalNode GRAPHS() { return getToken(CypherParser.GRAPHS, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public SymbolicAliasNameListContext symbolicAliasNameList() {
			return getRuleContext(SymbolicAliasNameListContext.class,0);
		}
		public GraphScopeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphScopeList; }
	}

	public final GraphScopeListContext graphScopeList() throws RecognitionException {
		GraphScopeListContext _localctx = new GraphScopeListContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_graphScopeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRAPH:
			case GRAPHS:
				{
				setState(3200);
				_la = _input.LA(1);
				if ( !(_la==GRAPH || _la==GRAPHS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(3201);
					match(TIMES);
					}
					break;
				case ACCESS:
				case ACTIVE:
				case ADMIN:
				case ADMINISTRATOR:
				case ALIAS:
				case ALIASES:
				case ALL_SHORTEST_PATH:
				case ALL:
				case ALTER:
				case AND:
				case ANY:
				case AS:
				case ASC:
				case ASSERT:
				case ASSIGN:
				case AT:
				case BOOSTED:
				case BREAK:
				case BRIEF:
				case BTREE:
				case BUILT:
				case BY:
				case CALL:
				case CASE:
				case CHANGE:
				case COMMAND:
				case COMMANDS:
				case COMMIT:
				case COMPOSITE:
				case CONSTRAINT:
				case CONSTRAINTS:
				case CONTAINS:
				case COPY:
				case CONTINUE:
				case COUNT:
				case CREATE:
				case CSV:
				case CURRENT:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBMS:
				case DEALLOCATE:
				case DEFAULT_TOKEN:
				case DEFINED:
				case DELETE:
				case DENY:
				case DESC:
				case DESTROY:
				case DETACH:
				case DOLLAR:
				case DISTINCT:
				case DRIVER:
				case DROP:
				case DRYRUN:
				case DUMP:
				case EACH:
				case ENABLE:
				case ELEMENT:
				case ELEMENTS:
				case ELSE:
				case ENCRYPTED:
				case END:
				case ENDS:
				case EXECUTABLE:
				case EXECUTE:
				case EXIST:
				case EXISTENCE:
				case EXISTS:
				case ERROR:
				case FAIL:
				case FALSE:
				case FIELDTERMINATOR:
				case FOR:
				case FOREACH:
				case FROM:
				case FULLTEXT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRAPH:
				case GRAPHS:
				case HEADERS:
				case HOME:
				case IF:
				case IMMUTABLE:
				case IN:
				case INDEX:
				case INDEXES:
				case INF:
				case INFINITY:
				case IS:
				case JOIN:
				case KEY:
				case LABEL:
				case LABELS:
				case LIMITROWS:
				case LOAD:
				case LOOKUP:
				case MANAGEMENT:
				case MATCH:
				case MERGE:
				case NAME:
				case NAMES:
				case NAN:
				case NEW:
				case NODE:
				case NODES:
				case NONE:
				case NOT:
				case NOWAIT:
				case NULL:
				case OF:
				case ON:
				case ONLY:
				case OPTIONAL:
				case OPTIONS:
				case OPTION:
				case OR:
				case ORDER:
				case OUTPUT:
				case PASSWORD:
				case PASSWORDS:
				case PERIODIC:
				case PLAINTEXT:
				case POINT:
				case POPULATED:
				case PRIMARY:
				case PRIMARIES:
				case PRIVILEGE:
				case PRIVILEGES:
				case PROCEDURE:
				case PROCEDURES:
				case PROPERTIES:
				case PROPERTY:
				case RANGE:
				case READ:
				case REALLOCATE:
				case REDUCE:
				case RENAME:
				case REL:
				case RELATIONSHIP:
				case RELATIONSHIPS:
				case REMOVE:
				case REPLACE:
				case REPORT:
				case REQUIRE:
				case REQUIRED:
				case RETURN:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROW:
				case ROWS:
				case SCAN:
				case SEC:
				case SECOND:
				case SECONDARY:
				case SECONDARIES:
				case SECONDS:
				case SEEK:
				case SERVER:
				case SERVERS:
				case SET:
				case SETTING:
				case SETTINGS:
				case SHORTEST_PATH:
				case SHOW:
				case SINGLE:
				case SKIPROWS:
				case START:
				case STARTS:
				case STATUS:
				case STOP:
				case SUSPENDED:
				case TARGET:
				case TERMINATE:
				case TEXT:
				case THEN:
				case TO:
				case TOPOLOGY:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRAVERSE:
				case TRUE:
				case TYPE:
				case TYPES:
				case UNION:
				case UNIQUE:
				case UNIQUENESS:
				case UNWIND:
				case USE:
				case USER:
				case USERS:
				case USING:
				case VERBOSE:
				case WAIT:
				case WHEN:
				case WHERE:
				case WITH:
				case WRITE:
				case XOR:
				case YIELD:
				case IDENTIFIER:
				case ESCAPED_SYMBOLIC_NAME:
					{
					setState(3202);
					symbolicAliasNameList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_TOKEN:
				{
				setState(3205);
				match(DEFAULT_TOKEN);
				setState(3206);
				match(GRAPH);
				}
				break;
			case HOME:
				{
				setState(3207);
				match(HOME);
				setState(3208);
				match(GRAPH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateAliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public List<SymbolicAliasNameContext> symbolicAliasName() {
			return getRuleContexts(SymbolicAliasNameContext.class);
		}
		public SymbolicAliasNameContext symbolicAliasName(int i) {
			return getRuleContext(SymbolicAliasNameContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode AT() { return getToken(CypherParser.AT, 0); }
		public StringOrParameterContext stringOrParameter() {
			return getRuleContext(StringOrParameterContext.class,0);
		}
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,0);
		}
		public TerminalNode PASSWORD() { return getToken(CypherParser.PASSWORD, 0); }
		public PasswordExpressionContext passwordExpression() {
			return getRuleContext(PasswordExpressionContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(CypherParser.PROPERTIES, 0); }
		public List<MapOrParameterContext> mapOrParameter() {
			return getRuleContexts(MapOrParameterContext.class);
		}
		public MapOrParameterContext mapOrParameter(int i) {
			return getRuleContext(MapOrParameterContext.class,i);
		}
		public TerminalNode DRIVER() { return getToken(CypherParser.DRIVER, 0); }
		public CreateAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAlias; }
	}

	public final CreateAliasContext createAlias() throws RecognitionException {
		CreateAliasContext _localctx = new CreateAliasContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_createAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3211);
			match(ALIAS);
			setState(3212);
			symbolicAliasName();
			setState(3216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3213);
				match(IF);
				setState(3214);
				match(NOT);
				setState(3215);
				match(EXISTS);
				}
			}

			setState(3218);
			match(FOR);
			setState(3219);
			match(DATABASE);
			setState(3220);
			symbolicAliasName();
			setState(3231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(3221);
				match(AT);
				setState(3222);
				stringOrParameter();
				setState(3223);
				match(USER);
				setState(3224);
				symbolicNameOrStringParameter();
				setState(3225);
				match(PASSWORD);
				setState(3226);
				passwordExpression();
				setState(3229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRIVER) {
					{
					setState(3227);
					match(DRIVER);
					setState(3228);
					mapOrParameter();
					}
				}

				}
			}

			setState(3235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROPERTIES) {
				{
				setState(3233);
				match(PROPERTIES);
				setState(3234);
				mapOrParameter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropAliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public DropAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropAlias; }
	}

	public final DropAliasContext dropAlias() throws RecognitionException {
		DropAliasContext _localctx = new DropAliasContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_dropAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3237);
			match(ALIAS);
			setState(3238);
			symbolicAliasName();
			setState(3241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3239);
				match(IF);
				setState(3240);
				match(EXISTS);
				}
			}

			setState(3243);
			match(FOR);
			setState(3244);
			match(DATABASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterAliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public List<SymbolicAliasNameContext> symbolicAliasName() {
			return getRuleContexts(SymbolicAliasNameContext.class);
		}
		public SymbolicAliasNameContext symbolicAliasName(int i) {
			return getRuleContext(SymbolicAliasNameContext.class,i);
		}
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public List<TerminalNode> TARGET() { return getTokens(CypherParser.TARGET); }
		public TerminalNode TARGET(int i) {
			return getToken(CypherParser.TARGET, i);
		}
		public List<TerminalNode> USER() { return getTokens(CypherParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(CypherParser.USER, i);
		}
		public List<SymbolicNameOrStringParameterContext> symbolicNameOrStringParameter() {
			return getRuleContexts(SymbolicNameOrStringParameterContext.class);
		}
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter(int i) {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(CypherParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(CypherParser.PASSWORD, i);
		}
		public List<PasswordExpressionContext> passwordExpression() {
			return getRuleContexts(PasswordExpressionContext.class);
		}
		public PasswordExpressionContext passwordExpression(int i) {
			return getRuleContext(PasswordExpressionContext.class,i);
		}
		public List<TerminalNode> DRIVER() { return getTokens(CypherParser.DRIVER); }
		public TerminalNode DRIVER(int i) {
			return getToken(CypherParser.DRIVER, i);
		}
		public List<MapOrParameterContext> mapOrParameter() {
			return getRuleContexts(MapOrParameterContext.class);
		}
		public MapOrParameterContext mapOrParameter(int i) {
			return getRuleContext(MapOrParameterContext.class,i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(CypherParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(CypherParser.PROPERTIES, i);
		}
		public List<TerminalNode> AT() { return getTokens(CypherParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(CypherParser.AT, i);
		}
		public List<StringOrParameterContext> stringOrParameter() {
			return getRuleContexts(StringOrParameterContext.class);
		}
		public StringOrParameterContext stringOrParameter(int i) {
			return getRuleContext(StringOrParameterContext.class,i);
		}
		public AlterAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterAlias; }
	}

	public final AlterAliasContext alterAlias() throws RecognitionException {
		AlterAliasContext _localctx = new AlterAliasContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_alterAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3246);
			match(ALIAS);
			setState(3247);
			symbolicAliasName();
			setState(3250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(3248);
				match(IF);
				setState(3249);
				match(EXISTS);
				}
			}

			setState(3252);
			match(SET);
			setState(3253);
			match(DATABASE);
			setState(3268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(3268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TARGET:
					{
					setState(3254);
					match(TARGET);
					setState(3255);
					symbolicAliasName();
					setState(3258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AT) {
						{
						setState(3256);
						match(AT);
						setState(3257);
						stringOrParameter();
						}
					}

					}
					break;
				case USER:
					{
					setState(3260);
					match(USER);
					setState(3261);
					symbolicNameOrStringParameter();
					}
					break;
				case PASSWORD:
					{
					setState(3262);
					match(PASSWORD);
					setState(3263);
					passwordExpression();
					}
					break;
				case DRIVER:
					{
					setState(3264);
					match(DRIVER);
					setState(3265);
					mapOrParameter();
					}
					break;
				case PROPERTIES:
					{
					setState(3266);
					match(PROPERTIES);
					setState(3267);
					mapOrParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(3270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DRIVER || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (PASSWORD - 149)) | (1L << (PROPERTIES - 149)) | (1L << (TARGET - 149)))) != 0) || _la==USER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowAliasesContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode ALIASES() { return getToken(CypherParser.ALIASES, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public SymbolicAliasNameContext symbolicAliasName() {
			return getRuleContext(SymbolicAliasNameContext.class,0);
		}
		public YieldClauseContext yieldClause() {
			return getRuleContext(YieldClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ShowAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showAliases; }
	}

	public final ShowAliasesContext showAliases() throws RecognitionException {
		ShowAliasesContext _localctx = new ShowAliasesContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_showAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3272);
			_la = _input.LA(1);
			if ( !(_la==ALIAS || _la==ALIASES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(3273);
				symbolicAliasName();
				}
				break;
			}
			setState(3276);
			match(FOR);
			setState(3277);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==DATABASES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(3278);
				yieldClause();
				setState(3280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
				case 1:
					{
					setState(3279);
					returnClause();
					}
					break;
				}
				}
				break;
			case WHERE:
				{
				setState(3282);
				whereClause();
				}
				break;
			case EOF:
			case ALTER:
			case CALL:
			case CREATE:
			case DEALLOCATE:
			case DELETE:
			case DENY:
			case DETACH:
			case DROP:
			case DRYRUN:
			case ENABLE:
			case FOREACH:
			case GRANT:
			case LOAD:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REALLOCATE:
			case RENAME:
			case REMOVE:
			case RETURN:
			case REVOKE:
			case SEMICOLON:
			case SET:
			case SHOW:
			case START:
			case STOP:
			case TERMINATE:
			case UNWIND:
			case USE:
			case USING:
			case WITH:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicAliasNameListContext extends ParserRuleContext {
		public List<SymbolicAliasNameContext> symbolicAliasName() {
			return getRuleContexts(SymbolicAliasNameContext.class);
		}
		public SymbolicAliasNameContext symbolicAliasName(int i) {
			return getRuleContext(SymbolicAliasNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SymbolicAliasNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicAliasNameList; }
	}

	public final SymbolicAliasNameListContext symbolicAliasNameList() throws RecognitionException {
		SymbolicAliasNameListContext _localctx = new SymbolicAliasNameListContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_symbolicAliasNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3285);
			symbolicAliasName();
			setState(3290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3286);
				match(COMMA);
				setState(3287);
				symbolicAliasName();
				}
				}
				setState(3292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicAliasNameContext extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public SymbolicAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicAliasName; }
	}

	public final SymbolicAliasNameContext symbolicAliasName() throws RecognitionException {
		SymbolicAliasNameContext _localctx = new SymbolicAliasNameContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_symbolicAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(3293);
				symbolicNameString();
				setState(3298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(3294);
					match(DOT);
					setState(3295);
					symbolicNameString();
					}
					}
					setState(3300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOLLAR:
				{
				setState(3301);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicNameOrStringParameterListContext extends ParserRuleContext {
		public List<SymbolicNameOrStringParameterContext> symbolicNameOrStringParameter() {
			return getRuleContexts(SymbolicNameOrStringParameterContext.class);
		}
		public SymbolicNameOrStringParameterContext symbolicNameOrStringParameter(int i) {
			return getRuleContext(SymbolicNameOrStringParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SymbolicNameOrStringParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicNameOrStringParameterList; }
	}

	public final SymbolicNameOrStringParameterListContext symbolicNameOrStringParameterList() throws RecognitionException {
		SymbolicNameOrStringParameterListContext _localctx = new SymbolicNameOrStringParameterListContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_symbolicNameOrStringParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3304);
			symbolicNameOrStringParameter();
			setState(3309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3305);
				match(COMMA);
				setState(3306);
				symbolicNameOrStringParameter();
				}
				}
				setState(3311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicNameOrStringParameterContext extends ParserRuleContext {
		public SymbolicNameStringContext symbolicNameString() {
			return getRuleContext(SymbolicNameStringContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public SymbolicNameOrStringParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicNameOrStringParameter; }
	}

	public final SymbolicNameOrStringParameterContext symbolicNameOrStringParameter() throws RecognitionException {
		SymbolicNameOrStringParameterContext _localctx = new SymbolicNameOrStringParameterContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_symbolicNameOrStringParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(3312);
				symbolicNameString();
				}
				break;
			case DOLLAR:
				{
				setState(3313);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobContext extends ParserRuleContext {
		public EscapedSymbolicNameStringContext escapedSymbolicNameString() {
			return getRuleContext(EscapedSymbolicNameStringContext.class,0);
		}
		public GlobRecursiveContext globRecursive() {
			return getRuleContext(GlobRecursiveContext.class,0);
		}
		public GlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob; }
	}

	public final GlobContext glob() throws RecognitionException {
		GlobContext _localctx = new GlobContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_glob);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(3316);
				escapedSymbolicNameString();
				}
				break;
			case 2:
				{
				setState(3317);
				escapedSymbolicNameString();
				setState(3318);
				globRecursive();
				}
				break;
			case 3:
				{
				setState(3320);
				globRecursive();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobRecursiveContext extends ParserRuleContext {
		public GlobPartContext globPart() {
			return getRuleContext(GlobPartContext.class,0);
		}
		public GlobRecursiveContext globRecursive() {
			return getRuleContext(GlobRecursiveContext.class,0);
		}
		public GlobRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globRecursive; }
	}

	public final GlobRecursiveContext globRecursive() throws RecognitionException {
		GlobRecursiveContext _localctx = new GlobRecursiveContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_globRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
			case 1:
				{
				setState(3323);
				globPart();
				}
				break;
			case 2:
				{
				setState(3324);
				globPart();
				setState(3325);
				globRecursive();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobPartContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CypherParser.DOT, 0); }
		public EscapedSymbolicNameStringContext escapedSymbolicNameString() {
			return getRuleContext(EscapedSymbolicNameStringContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(CypherParser.QUESTION, 0); }
		public TerminalNode TIMES() { return getToken(CypherParser.TIMES, 0); }
		public UnescapedSymbolicNameStringContext unescapedSymbolicNameString() {
			return getRuleContext(UnescapedSymbolicNameStringContext.class,0);
		}
		public GlobPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globPart; }
	}

	public final GlobPartContext globPart() throws RecognitionException {
		GlobPartContext _localctx = new GlobPartContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_globPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(3329);
				match(DOT);
				setState(3330);
				escapedSymbolicNameString();
				}
				break;
			case 2:
				{
				setState(3331);
				match(QUESTION);
				}
				break;
			case 3:
				{
				setState(3332);
				match(TIMES);
				}
				break;
			case 4:
				{
				setState(3333);
				match(DOT);
				}
				break;
			case 5:
				{
				setState(3334);
				unescapedSymbolicNameString();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringImageContext extends ParserRuleContext {
		public StringTokenContext stringToken() {
			return getRuleContext(StringTokenContext.class,0);
		}
		public StringImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringImage; }
	}

	public final StringImageContext stringImage() throws RecognitionException {
		StringImageContext _localctx = new StringImageContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_stringImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3337);
			stringToken();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public List<StringImageContext> stringImage() {
			return getRuleContexts(StringImageContext.class);
		}
		public StringImageContext stringImage(int i) {
			return getRuleContext(StringImageContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3339);
			stringImage();
			setState(3344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3340);
				match(COMMA);
				setState(3341);
				stringImage();
				}
				}
				setState(3346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringTokenContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL1() { return getToken(CypherParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(CypherParser.STRING_LITERAL2, 0); }
		public StringTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringToken; }
	}

	public final StringTokenContext stringToken() throws RecognitionException {
		StringTokenContext _localctx = new StringTokenContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_stringToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3347);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL1 || _la==STRING_LITERAL2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringOrParameterContext extends ParserRuleContext {
		public StringTokenContext stringToken() {
			return getRuleContext(StringTokenContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public StringOrParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOrParameter; }
	}

	public final StringOrParameterContext stringOrParameter() throws RecognitionException {
		StringOrParameterContext _localctx = new StringOrParameterContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_stringOrParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL1:
			case STRING_LITERAL2:
				{
				setState(3349);
				stringToken();
				}
				break;
			case DOLLAR:
				{
				setState(3350);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapOrParameterContext extends ParserRuleContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public MapOrParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapOrParameter; }
	}

	public final MapOrParameterContext mapOrParameter() throws RecognitionException {
		MapOrParameterContext _localctx = new MapOrParameterContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_mapOrParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				{
				setState(3353);
				map();
				}
				break;
			case DOLLAR:
				{
				setState(3354);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CypherParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CypherParser.RCURLY, 0); }
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3357);
			match(LCURLY);
			setState(3371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (ESCAPED_SYMBOLIC_NAME - 194)))) != 0)) {
				{
				setState(3358);
				symbolicNameString();
				setState(3359);
				match(COLON);
				setState(3360);
				expression();
				setState(3368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3361);
					match(COMMA);
					setState(3362);
					symbolicNameString();
					setState(3363);
					match(COLON);
					setState(3364);
					expression();
					}
					}
					setState(3370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3373);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicNamePositionsContext extends ParserRuleContext {
		public List<SymbolicNameStringContext> symbolicNameString() {
			return getRuleContexts(SymbolicNameStringContext.class);
		}
		public SymbolicNameStringContext symbolicNameString(int i) {
			return getRuleContext(SymbolicNameStringContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SymbolicNamePositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicNamePositions; }
	}

	public final SymbolicNamePositionsContext symbolicNamePositions() throws RecognitionException {
		SymbolicNamePositionsContext _localctx = new SymbolicNamePositionsContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_symbolicNamePositions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3375);
			symbolicNameString();
			setState(3380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3376);
				match(COMMA);
				setState(3377);
				symbolicNameString();
				}
				}
				setState(3382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolicNameStringContext extends ParserRuleContext {
		public EscapedSymbolicNameStringContext escapedSymbolicNameString() {
			return getRuleContext(EscapedSymbolicNameStringContext.class,0);
		}
		public UnescapedSymbolicNameStringContext unescapedSymbolicNameString() {
			return getRuleContext(UnescapedSymbolicNameStringContext.class,0);
		}
		public SymbolicNameStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolicNameString; }
	}

	public final SymbolicNameStringContext symbolicNameString() throws RecognitionException {
		SymbolicNameStringContext _localctx = new SymbolicNameStringContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_symbolicNameString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCAPED_SYMBOLIC_NAME:
				{
				setState(3383);
				escapedSymbolicNameString();
				}
				break;
			case ACCESS:
			case ACTIVE:
			case ADMIN:
			case ADMINISTRATOR:
			case ALIAS:
			case ALIASES:
			case ALL_SHORTEST_PATH:
			case ALL:
			case ALTER:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ASSERT:
			case ASSIGN:
			case AT:
			case BOOSTED:
			case BREAK:
			case BRIEF:
			case BTREE:
			case BUILT:
			case BY:
			case CALL:
			case CASE:
			case CHANGE:
			case COMMAND:
			case COMMANDS:
			case COMMIT:
			case COMPOSITE:
			case CONSTRAINT:
			case CONSTRAINTS:
			case CONTAINS:
			case COPY:
			case CONTINUE:
			case COUNT:
			case CREATE:
			case CSV:
			case CURRENT:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBMS:
			case DEALLOCATE:
			case DEFAULT_TOKEN:
			case DEFINED:
			case DELETE:
			case DENY:
			case DESC:
			case DESTROY:
			case DETACH:
			case DISTINCT:
			case DRIVER:
			case DROP:
			case DRYRUN:
			case DUMP:
			case EACH:
			case ENABLE:
			case ELEMENT:
			case ELEMENTS:
			case ELSE:
			case ENCRYPTED:
			case END:
			case ENDS:
			case EXECUTABLE:
			case EXECUTE:
			case EXIST:
			case EXISTENCE:
			case EXISTS:
			case ERROR:
			case FAIL:
			case FALSE:
			case FIELDTERMINATOR:
			case FOR:
			case FOREACH:
			case FROM:
			case FULLTEXT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRAPH:
			case GRAPHS:
			case HEADERS:
			case HOME:
			case IF:
			case IMMUTABLE:
			case IN:
			case INDEX:
			case INDEXES:
			case INF:
			case INFINITY:
			case IS:
			case JOIN:
			case KEY:
			case LABEL:
			case LABELS:
			case LIMITROWS:
			case LOAD:
			case LOOKUP:
			case MANAGEMENT:
			case MATCH:
			case MERGE:
			case NAME:
			case NAMES:
			case NAN:
			case NEW:
			case NODE:
			case NODES:
			case NONE:
			case NOT:
			case NOWAIT:
			case NULL:
			case OF:
			case ON:
			case ONLY:
			case OPTIONAL:
			case OPTIONS:
			case OPTION:
			case OR:
			case ORDER:
			case OUTPUT:
			case PASSWORD:
			case PASSWORDS:
			case PERIODIC:
			case PLAINTEXT:
			case POINT:
			case POPULATED:
			case PRIMARY:
			case PRIMARIES:
			case PRIVILEGE:
			case PRIVILEGES:
			case PROCEDURE:
			case PROCEDURES:
			case PROPERTIES:
			case PROPERTY:
			case RANGE:
			case READ:
			case REALLOCATE:
			case REDUCE:
			case RENAME:
			case REL:
			case RELATIONSHIP:
			case RELATIONSHIPS:
			case REMOVE:
			case REPLACE:
			case REPORT:
			case REQUIRE:
			case REQUIRED:
			case RETURN:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROW:
			case ROWS:
			case SCAN:
			case SEC:
			case SECOND:
			case SECONDARY:
			case SECONDARIES:
			case SECONDS:
			case SEEK:
			case SERVER:
			case SERVERS:
			case SET:
			case SETTING:
			case SETTINGS:
			case SHORTEST_PATH:
			case SHOW:
			case SINGLE:
			case SKIPROWS:
			case START:
			case STARTS:
			case STATUS:
			case STOP:
			case SUSPENDED:
			case TARGET:
			case TERMINATE:
			case TEXT:
			case THEN:
			case TO:
			case TOPOLOGY:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRAVERSE:
			case TRUE:
			case TYPE:
			case TYPES:
			case UNION:
			case UNIQUE:
			case UNIQUENESS:
			case UNWIND:
			case USE:
			case USER:
			case USERS:
			case USING:
			case VERBOSE:
			case WAIT:
			case WHEN:
			case WHERE:
			case WITH:
			case WRITE:
			case XOR:
			case YIELD:
			case IDENTIFIER:
				{
				setState(3384);
				unescapedSymbolicNameString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapedSymbolicNameStringContext extends ParserRuleContext {
		public TerminalNode ESCAPED_SYMBOLIC_NAME() { return getToken(CypherParser.ESCAPED_SYMBOLIC_NAME, 0); }
		public EscapedSymbolicNameStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedSymbolicNameString; }
	}

	public final EscapedSymbolicNameStringContext escapedSymbolicNameString() throws RecognitionException {
		EscapedSymbolicNameStringContext _localctx = new EscapedSymbolicNameStringContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_escapedSymbolicNameString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3387);
			match(ESCAPED_SYMBOLIC_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnescapedSymbolicNameStringContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CypherParser.IDENTIFIER, 0); }
		public TerminalNode ACCESS() { return getToken(CypherParser.ACCESS, 0); }
		public TerminalNode ACTIVE() { return getToken(CypherParser.ACTIVE, 0); }
		public TerminalNode ADMIN() { return getToken(CypherParser.ADMIN, 0); }
		public TerminalNode ADMINISTRATOR() { return getToken(CypherParser.ADMINISTRATOR, 0); }
		public TerminalNode ALIAS() { return getToken(CypherParser.ALIAS, 0); }
		public TerminalNode ALIASES() { return getToken(CypherParser.ALIASES, 0); }
		public TerminalNode ALL_SHORTEST_PATH() { return getToken(CypherParser.ALL_SHORTEST_PATH, 0); }
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(CypherParser.ALTER, 0); }
		public TerminalNode AND() { return getToken(CypherParser.AND, 0); }
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public TerminalNode ASSERT() { return getToken(CypherParser.ASSERT, 0); }
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public TerminalNode AT() { return getToken(CypherParser.AT, 0); }
		public TerminalNode BOOSTED() { return getToken(CypherParser.BOOSTED, 0); }
		public TerminalNode BREAK() { return getToken(CypherParser.BREAK, 0); }
		public TerminalNode BRIEF() { return getToken(CypherParser.BRIEF, 0); }
		public TerminalNode BTREE() { return getToken(CypherParser.BTREE, 0); }
		public TerminalNode BUILT() { return getToken(CypherParser.BUILT, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public TerminalNode CHANGE() { return getToken(CypherParser.CHANGE, 0); }
		public TerminalNode COMMAND() { return getToken(CypherParser.COMMAND, 0); }
		public TerminalNode COMMANDS() { return getToken(CypherParser.COMMANDS, 0); }
		public TerminalNode COMMIT() { return getToken(CypherParser.COMMIT, 0); }
		public TerminalNode COMPOSITE() { return getToken(CypherParser.COMPOSITE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(CypherParser.CONSTRAINTS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public TerminalNode CONTINUE() { return getToken(CypherParser.CONTINUE, 0); }
		public TerminalNode COPY() { return getToken(CypherParser.COPY, 0); }
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public TerminalNode CSV() { return getToken(CypherParser.CSV, 0); }
		public TerminalNode CURRENT() { return getToken(CypherParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(CypherParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(CypherParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(CypherParser.DATABASES, 0); }
		public TerminalNode DBMS() { return getToken(CypherParser.DBMS, 0); }
		public TerminalNode DEALLOCATE() { return getToken(CypherParser.DEALLOCATE, 0); }
		public TerminalNode DEFAULT_TOKEN() { return getToken(CypherParser.DEFAULT_TOKEN, 0); }
		public TerminalNode DEFINED() { return getToken(CypherParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public TerminalNode DENY() { return getToken(CypherParser.DENY, 0); }
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public TerminalNode DESTROY() { return getToken(CypherParser.DESTROY, 0); }
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public TerminalNode DRIVER() { return getToken(CypherParser.DRIVER, 0); }
		public TerminalNode DROP() { return getToken(CypherParser.DROP, 0); }
		public TerminalNode DRYRUN() { return getToken(CypherParser.DRYRUN, 0); }
		public TerminalNode DUMP() { return getToken(CypherParser.DUMP, 0); }
		public TerminalNode EACH() { return getToken(CypherParser.EACH, 0); }
		public TerminalNode ELEMENT() { return getToken(CypherParser.ELEMENT, 0); }
		public TerminalNode ELEMENTS() { return getToken(CypherParser.ELEMENTS, 0); }
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public TerminalNode ENABLE() { return getToken(CypherParser.ENABLE, 0); }
		public TerminalNode ENCRYPTED() { return getToken(CypherParser.ENCRYPTED, 0); }
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode ERROR() { return getToken(CypherParser.ERROR, 0); }
		public TerminalNode EXECUTABLE() { return getToken(CypherParser.EXECUTABLE, 0); }
		public TerminalNode EXECUTE() { return getToken(CypherParser.EXECUTE, 0); }
		public TerminalNode EXIST() { return getToken(CypherParser.EXIST, 0); }
		public TerminalNode EXISTENCE() { return getToken(CypherParser.EXISTENCE, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode FAIL() { return getToken(CypherParser.FAIL, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public TerminalNode FIELDTERMINATOR() { return getToken(CypherParser.FIELDTERMINATOR, 0); }
		public TerminalNode FOREACH() { return getToken(CypherParser.FOREACH, 0); }
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(CypherParser.FROM, 0); }
		public TerminalNode FULLTEXT() { return getToken(CypherParser.FULLTEXT, 0); }
		public TerminalNode FUNCTION() { return getToken(CypherParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(CypherParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(CypherParser.GRANT, 0); }
		public TerminalNode GRAPH() { return getToken(CypherParser.GRAPH, 0); }
		public TerminalNode GRAPHS() { return getToken(CypherParser.GRAPHS, 0); }
		public TerminalNode HEADERS() { return getToken(CypherParser.HEADERS, 0); }
		public TerminalNode HOME() { return getToken(CypherParser.HOME, 0); }
		public TerminalNode IF() { return getToken(CypherParser.IF, 0); }
		public TerminalNode IMMUTABLE() { return getToken(CypherParser.IMMUTABLE, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(CypherParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(CypherParser.INDEXES, 0); }
		public TerminalNode INF() { return getToken(CypherParser.INF, 0); }
		public TerminalNode INFINITY() { return getToken(CypherParser.INFINITY, 0); }
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode JOIN() { return getToken(CypherParser.JOIN, 0); }
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode LABEL() { return getToken(CypherParser.LABEL, 0); }
		public TerminalNode LABELS() { return getToken(CypherParser.LABELS, 0); }
		public TerminalNode LIMITROWS() { return getToken(CypherParser.LIMITROWS, 0); }
		public TerminalNode LOAD() { return getToken(CypherParser.LOAD, 0); }
		public TerminalNode LOOKUP() { return getToken(CypherParser.LOOKUP, 0); }
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode MANAGEMENT() { return getToken(CypherParser.MANAGEMENT, 0); }
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public TerminalNode NAME() { return getToken(CypherParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(CypherParser.NAMES, 0); }
		public TerminalNode NAN() { return getToken(CypherParser.NAN, 0); }
		public TerminalNode NEW() { return getToken(CypherParser.NEW, 0); }
		public TerminalNode NODE() { return getToken(CypherParser.NODE, 0); }
		public TerminalNode NODES() { return getToken(CypherParser.NODES, 0); }
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode NOWAIT() { return getToken(CypherParser.NOWAIT, 0); }
		public TerminalNode NULL() { return getToken(CypherParser.NULL, 0); }
		public TerminalNode OF() { return getToken(CypherParser.OF, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode ONLY() { return getToken(CypherParser.ONLY, 0); }
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public TerminalNode OPTIONS() { return getToken(CypherParser.OPTIONS, 0); }
		public TerminalNode OPTION() { return getToken(CypherParser.OPTION, 0); }
		public TerminalNode OR() { return getToken(CypherParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode OUTPUT() { return getToken(CypherParser.OUTPUT, 0); }
		public TerminalNode PASSWORD() { return getToken(CypherParser.PASSWORD, 0); }
		public TerminalNode PASSWORDS() { return getToken(CypherParser.PASSWORDS, 0); }
		public TerminalNode PERIODIC() { return getToken(CypherParser.PERIODIC, 0); }
		public TerminalNode PLAINTEXT() { return getToken(CypherParser.PLAINTEXT, 0); }
		public TerminalNode POINT() { return getToken(CypherParser.POINT, 0); }
		public TerminalNode POPULATED() { return getToken(CypherParser.POPULATED, 0); }
		public TerminalNode PRIMARY() { return getToken(CypherParser.PRIMARY, 0); }
		public TerminalNode PRIMARIES() { return getToken(CypherParser.PRIMARIES, 0); }
		public TerminalNode PRIVILEGE() { return getToken(CypherParser.PRIVILEGE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(CypherParser.PRIVILEGES, 0); }
		public TerminalNode PROCEDURE() { return getToken(CypherParser.PROCEDURE, 0); }
		public TerminalNode PROCEDURES() { return getToken(CypherParser.PROCEDURES, 0); }
		public TerminalNode PROPERTIES() { return getToken(CypherParser.PROPERTIES, 0); }
		public TerminalNode PROPERTY() { return getToken(CypherParser.PROPERTY, 0); }
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(CypherParser.READ, 0); }
		public TerminalNode REALLOCATE() { return getToken(CypherParser.REALLOCATE, 0); }
		public TerminalNode REDUCE() { return getToken(CypherParser.REDUCE, 0); }
		public TerminalNode REL() { return getToken(CypherParser.REL, 0); }
		public TerminalNode RELATIONSHIP() { return getToken(CypherParser.RELATIONSHIP, 0); }
		public TerminalNode RELATIONSHIPS() { return getToken(CypherParser.RELATIONSHIPS, 0); }
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(CypherParser.RENAME, 0); }
		public TerminalNode REPLACE() { return getToken(CypherParser.REPLACE, 0); }
		public TerminalNode REPORT() { return getToken(CypherParser.REPORT, 0); }
		public TerminalNode REQUIRE() { return getToken(CypherParser.REQUIRE, 0); }
		public TerminalNode REQUIRED() { return getToken(CypherParser.REQUIRED, 0); }
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public TerminalNode REVOKE() { return getToken(CypherParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(CypherParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(CypherParser.ROLES, 0); }
		public TerminalNode ROW() { return getToken(CypherParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(CypherParser.ROWS, 0); }
		public TerminalNode SCAN() { return getToken(CypherParser.SCAN, 0); }
		public TerminalNode SEC() { return getToken(CypherParser.SEC, 0); }
		public TerminalNode SECOND() { return getToken(CypherParser.SECOND, 0); }
		public TerminalNode SECONDARY() { return getToken(CypherParser.SECONDARY, 0); }
		public TerminalNode SECONDARIES() { return getToken(CypherParser.SECONDARIES, 0); }
		public TerminalNode SECONDS() { return getToken(CypherParser.SECONDS, 0); }
		public TerminalNode SEEK() { return getToken(CypherParser.SEEK, 0); }
		public TerminalNode SERVER() { return getToken(CypherParser.SERVER, 0); }
		public TerminalNode SERVERS() { return getToken(CypherParser.SERVERS, 0); }
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode SETTING() { return getToken(CypherParser.SETTING, 0); }
		public TerminalNode SETTINGS() { return getToken(CypherParser.SETTINGS, 0); }
		public TerminalNode SHORTEST_PATH() { return getToken(CypherParser.SHORTEST_PATH, 0); }
		public TerminalNode SHOW() { return getToken(CypherParser.SHOW, 0); }
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public TerminalNode SKIPROWS() { return getToken(CypherParser.SKIPROWS, 0); }
		public TerminalNode START() { return getToken(CypherParser.START, 0); }
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode STATUS() { return getToken(CypherParser.STATUS, 0); }
		public TerminalNode STOP() { return getToken(CypherParser.STOP, 0); }
		public TerminalNode SUSPENDED() { return getToken(CypherParser.SUSPENDED, 0); }
		public TerminalNode TARGET() { return getToken(CypherParser.TARGET, 0); }
		public TerminalNode TERMINATE() { return getToken(CypherParser.TERMINATE, 0); }
		public TerminalNode TEXT() { return getToken(CypherParser.TEXT, 0); }
		public TerminalNode THEN() { return getToken(CypherParser.THEN, 0); }
		public TerminalNode TO() { return getToken(CypherParser.TO, 0); }
		public TerminalNode TOPOLOGY() { return getToken(CypherParser.TOPOLOGY, 0); }
		public TerminalNode TRANSACTION() { return getToken(CypherParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(CypherParser.TRANSACTIONS, 0); }
		public TerminalNode TRAVERSE() { return getToken(CypherParser.TRAVERSE, 0); }
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode TYPE() { return getToken(CypherParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(CypherParser.TYPES, 0); }
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode UNIQUENESS() { return getToken(CypherParser.UNIQUENESS, 0); }
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public TerminalNode USE() { return getToken(CypherParser.USE, 0); }
		public TerminalNode USER() { return getToken(CypherParser.USER, 0); }
		public TerminalNode USERS() { return getToken(CypherParser.USERS, 0); }
		public TerminalNode USING() { return getToken(CypherParser.USING, 0); }
		public TerminalNode VERBOSE() { return getToken(CypherParser.VERBOSE, 0); }
		public TerminalNode WAIT() { return getToken(CypherParser.WAIT, 0); }
		public TerminalNode WHEN() { return getToken(CypherParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode WRITE() { return getToken(CypherParser.WRITE, 0); }
		public TerminalNode XOR() { return getToken(CypherParser.XOR, 0); }
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public UnescapedSymbolicNameStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedSymbolicNameString; }
	}

	public final UnescapedSymbolicNameStringContext unescapedSymbolicNameString() throws RecognitionException {
		UnescapedSymbolicNameStringContext _localctx = new UnescapedSymbolicNameStringContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_unescapedSymbolicNameString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ACTIVE) | (1L << ADMIN) | (1L << ADMINISTRATOR) | (1L << ALIAS) | (1L << ALIASES) | (1L << ALL_SHORTEST_PATH) | (1L << ALL) | (1L << ALTER) | (1L << AND) | (1L << ANY) | (1L << AS) | (1L << ASC) | (1L << ASSERT) | (1L << ASSIGN) | (1L << AT) | (1L << BOOSTED) | (1L << BREAK) | (1L << BRIEF) | (1L << BTREE) | (1L << BUILT) | (1L << BY) | (1L << CALL) | (1L << CASE) | (1L << CHANGE) | (1L << COMMAND) | (1L << COMMANDS) | (1L << COMMIT) | (1L << COMPOSITE) | (1L << CONSTRAINT) | (1L << CONSTRAINTS) | (1L << CONTAINS) | (1L << COPY) | (1L << CONTINUE) | (1L << COUNT) | (1L << CREATE) | (1L << CSV) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBMS) | (1L << DEALLOCATE) | (1L << DEFAULT_TOKEN) | (1L << DEFINED) | (1L << DELETE) | (1L << DENY) | (1L << DESC) | (1L << DESTROY) | (1L << DETACH) | (1L << DISTINCT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DRIVER - 65)) | (1L << (DROP - 65)) | (1L << (DRYRUN - 65)) | (1L << (DUMP - 65)) | (1L << (EACH - 65)) | (1L << (ENABLE - 65)) | (1L << (ELEMENT - 65)) | (1L << (ELEMENTS - 65)) | (1L << (ELSE - 65)) | (1L << (ENCRYPTED - 65)) | (1L << (END - 65)) | (1L << (ENDS - 65)) | (1L << (EXECUTABLE - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIST - 65)) | (1L << (EXISTENCE - 65)) | (1L << (EXISTS - 65)) | (1L << (ERROR - 65)) | (1L << (FAIL - 65)) | (1L << (FALSE - 65)) | (1L << (FIELDTERMINATOR - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FROM - 65)) | (1L << (FULLTEXT - 65)) | (1L << (FUNCTION - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRAPH - 65)) | (1L << (GRAPHS - 65)) | (1L << (HEADERS - 65)) | (1L << (HOME - 65)) | (1L << (IF - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (IN - 65)) | (1L << (INDEX - 65)) | (1L << (INDEXES - 65)) | (1L << (INF - 65)) | (1L << (INFINITY - 65)) | (1L << (IS - 65)) | (1L << (JOIN - 65)) | (1L << (KEY - 65)) | (1L << (LABEL - 65)) | (1L << (LABELS - 65)) | (1L << (LIMITROWS - 65)) | (1L << (LOAD - 65)) | (1L << (LOOKUP - 65)) | (1L << (MANAGEMENT - 65)) | (1L << (MATCH - 65)) | (1L << (MERGE - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (NAME - 130)) | (1L << (NAMES - 130)) | (1L << (NAN - 130)) | (1L << (NEW - 130)) | (1L << (NODE - 130)) | (1L << (NODES - 130)) | (1L << (NONE - 130)) | (1L << (NOT - 130)) | (1L << (NOWAIT - 130)) | (1L << (NULL - 130)) | (1L << (OF - 130)) | (1L << (ON - 130)) | (1L << (ONLY - 130)) | (1L << (OPTIONAL - 130)) | (1L << (OPTIONS - 130)) | (1L << (OPTION - 130)) | (1L << (OR - 130)) | (1L << (ORDER - 130)) | (1L << (OUTPUT - 130)) | (1L << (PASSWORD - 130)) | (1L << (PASSWORDS - 130)) | (1L << (PERIODIC - 130)) | (1L << (PLAINTEXT - 130)) | (1L << (POINT - 130)) | (1L << (POPULATED - 130)) | (1L << (PRIMARY - 130)) | (1L << (PRIMARIES - 130)) | (1L << (PRIVILEGE - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROCEDURE - 130)) | (1L << (PROCEDURES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PROPERTY - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (REALLOCATE - 130)) | (1L << (REDUCE - 130)) | (1L << (RENAME - 130)) | (1L << (REL - 130)) | (1L << (RELATIONSHIP - 130)) | (1L << (RELATIONSHIPS - 130)) | (1L << (REMOVE - 130)) | (1L << (REPLACE - 130)) | (1L << (REPORT - 130)) | (1L << (REQUIRE - 130)) | (1L << (REQUIRED - 130)) | (1L << (RETURN - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCAN - 130)) | (1L << (SEC - 130)) | (1L << (SECOND - 130)) | (1L << (SECONDARY - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SECONDARIES - 194)) | (1L << (SECONDS - 194)) | (1L << (SEEK - 194)) | (1L << (SERVER - 194)) | (1L << (SERVERS - 194)) | (1L << (SET - 194)) | (1L << (SETTING - 194)) | (1L << (SETTINGS - 194)) | (1L << (SHORTEST_PATH - 194)) | (1L << (SHOW - 194)) | (1L << (SINGLE - 194)) | (1L << (SKIPROWS - 194)) | (1L << (START - 194)) | (1L << (STARTS - 194)) | (1L << (STATUS - 194)) | (1L << (STOP - 194)) | (1L << (SUSPENDED - 194)) | (1L << (TARGET - 194)) | (1L << (TERMINATE - 194)) | (1L << (TEXT - 194)) | (1L << (THEN - 194)) | (1L << (TO - 194)) | (1L << (TOPOLOGY - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRAVERSE - 194)) | (1L << (TRUE - 194)) | (1L << (TYPE - 194)) | (1L << (TYPES - 194)) | (1L << (UNION - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNIQUENESS - 194)) | (1L << (UNWIND - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (USERS - 194)) | (1L << (USING - 194)) | (1L << (VERBOSE - 194)) | (1L << (WAIT - 194)) | (1L << (WHEN - 194)) | (1L << (WHERE - 194)) | (1L << (WITH - 194)) | (1L << (WRITE - 194)) | (1L << (XOR - 194)) | (1L << (YIELD - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOfFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CypherParser.EOF, 0); }
		public EndOfFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOfFile; }
	}

	public final EndOfFileContext endOfFile() throws RecognitionException {
		EndOfFileContext _localctx = new EndOfFileContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_endOfFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3391);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0109\u0d44\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\3\2\6\2\u01e8\n\2\r\2\16\2\u01e9"+
		"\3\2\3\2\3\3\5\3\u01ef\n\3\3\3\3\3\3\3\3\3\5\3\u01f5\n\3\3\3\5\3\u01f8"+
		"\n\3\3\4\3\4\3\4\3\4\7\4\u01fe\n\4\f\4\16\4\u0201\13\4\5\4\u0203\n\4\3"+
		"\5\3\5\3\5\3\5\7\5\u0209\n\5\f\5\16\5\u020c\13\5\5\5\u020e\n\5\3\6\3\6"+
		"\3\6\3\6\5\6\u0214\n\6\3\7\3\7\7\7\u0218\n\7\f\7\16\7\u021b\13\7\3\b\3"+
		"\b\5\b\u021f\n\b\3\b\3\b\3\t\6\t\u0224\n\t\r\t\16\t\u0225\3\n\7\n\u0229"+
		"\n\n\f\n\16\n\u022c\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u023c\n\13\3\f\3\f\3\f\3\f\5\f\u0242\n"+
		"\f\3\r\3\r\3\r\3\16\5\16\u0248\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0250\n\16\f\16\16\16\u0253\13\16\5\16\u0255\n\16\3\16\5\16\u0258\n\16"+
		"\3\16\5\16\u025b\n\16\3\17\3\17\3\17\5\17\u0260\n\17\3\20\3\20\3\20\7"+
		"\20\u0265\n\20\f\20\16\20\u0268\13\20\3\20\3\20\3\20\7\20\u026d\n\20\f"+
		"\20\16\20\u0270\13\20\5\20\u0272\n\20\3\21\3\21\3\21\5\21\u0277\n\21\5"+
		"\21\u0279\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u0287\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0290\n"+
		"\27\f\27\16\27\u0293\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02a4\n\30\3\31\3\31\3\31\3\31\7\31"+
		"\u02aa\n\31\f\31\16\31\u02ad\13\31\3\32\3\32\3\32\3\32\5\32\u02b3\n\32"+
		"\3\33\5\33\u02b6\n\33\3\33\3\33\3\33\3\33\7\33\u02bc\n\33\f\33\16\33\u02bf"+
		"\13\33\3\34\3\34\3\34\5\34\u02c4\n\34\3\34\3\34\7\34\u02c8\n\34\f\34\16"+
		"\34\u02cb\13\34\3\34\5\34\u02ce\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u02e6\n\35\3\36\5\36\u02e9\n\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02f8\n\37\7\37\u02fa\n\37"+
		"\f\37\16\37\u02fd\13\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0308\n!\3!\3!\7"+
		"!\u030c\n!\f!\16!\u030f\13!\3!\5!\u0312\n!\3!\3!\3!\3!\3!\7!\u0319\n!"+
		"\f!\16!\u031c\13!\3!\5!\u031f\n!\5!\u0321\n!\5!\u0323\n!\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3$\5$\u032d\n$\3%\3%\3%\3%\5%\u0333\n%\3%\3%\3%\3%\3%\3%\5"+
		"%\u033b\n%\3&\3&\3&\3&\3&\3&\3&\6&\u0344\n&\r&\16&\u0345\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u034f\n\'\3(\3(\3(\3(\3(\7(\u0356\n(\f(\16(\u0359\13"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\7,\u036b\n,\f,\16,\u036e"+
		"\13,\3-\3-\3-\3-\3-\5-\u0375\n-\3.\3.\3.\3.\3.\5.\u037c\n.\3.\3.\5.\u0380"+
		"\n.\3.\3.\3.\5.\u0385\n.\3/\3/\5/\u0389\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0395\n\60\3\61\3\61\5\61\u0399\n\61\3\62"+
		"\3\62\3\62\3\62\7\62\u039f\n\62\f\62\16\62\u03a2\13\62\3\62\6\62\u03a5"+
		"\n\62\r\62\16\62\u03a6\3\63\3\63\3\63\3\63\6\63\u03ad\n\63\r\63\16\63"+
		"\u03ae\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03ba\n\64\3"+
		"\64\3\64\3\64\5\64\u03bf\n\64\3\64\5\64\u03c2\n\64\3\64\5\64\u03c5\n\64"+
		"\3\64\3\64\5\64\u03c9\n\64\5\64\u03cb\n\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\5\65\u03d3\n\65\3\65\3\65\5\65\u03d7\n\65\3\66\6\66\u03da\n\66\r\66"+
		"\16\66\u03db\3\67\3\67\38\38\38\39\39\39\39\79\u03e7\n9\f9\169\u03ea\13"+
		"9\3:\3:\5:\u03ee\n:\3;\5;\u03f1\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u03fd"+
		"\n;\3;\3;\3;\5;\u0402\n;\3;\5;\u0405\n;\3;\5;\u0408\n;\3;\5;\u040b\n;"+
		"\3;\3;\5;\u040f\n;\5;\u0411\n;\3;\5;\u0414\n;\3;\3;\5;\u0418\n;\3<\3<"+
		"\3=\3=\3>\3>\3?\3?\5?\u0422\n?\3@\5@\u0425\n@\3@\3@\5@\u0429\n@\3@\5@"+
		"\u042c\n@\3A\3A\3A\3B\3B\5B\u0433\nB\3C\3C\3C\3C\3C\5C\u043a\nC\7C\u043c"+
		"\nC\fC\16C\u043f\13C\3D\3D\3D\3D\3D\5D\u0446\nD\7D\u0448\nD\fD\16D\u044b"+
		"\13D\3E\3E\3E\3E\3E\7E\u0452\nE\fE\16E\u0455\13E\3F\3F\3F\5F\u045a\nF"+
		"\3G\3G\3G\3G\3G\3G\5G\u0462\nG\3H\3H\3I\3I\3I\7I\u0469\nI\fI\16I\u046c"+
		"\13I\3J\3J\3J\7J\u0471\nJ\fJ\16J\u0474\13J\3K\3K\3K\7K\u0479\nK\fK\16"+
		"K\u047c\13K\3L\3L\3L\5L\u0481\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\7M\u0492\nM\fM\16M\u0495\13M\3N\3N\5N\u0499\nN\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u04ab\nO\5O\u04ad\nO\3P\3P\3P\3P"+
		"\3P\7P\u04b4\nP\fP\16P\u04b7\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u04c0\nQ\fQ\16"+
		"Q\u04c3\13Q\3R\3R\3R\7R\u04c8\nR\fR\16R\u04cb\13R\3S\3S\3S\3S\3S\5S\u04d2"+
		"\nS\3T\3T\7T\u04d6\nT\fT\16T\u04d9\13T\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04e3"+
		"\nU\3U\3U\5U\u04e7\nU\3U\5U\u04ea\nU\3V\3V\3V\3W\3W\6W\u04f1\nW\rW\16"+
		"W\u04f2\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\5X\u050e\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0519\nY\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u0520\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u052a\nZ\fZ\16Z\u052d"+
		"\13Z\3Z\3Z\5Z\u0531\nZ\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u053b\n[\3[\3[\5[\u053f"+
		"\n[\3[\3[\3\\\3\\\3\\\3\\\5\\\u0547\n\\\3\\\3\\\3\\\5\\\u054c\n\\\3\\"+
		"\3\\\3\\\3\\\3]\3]\3]\3]\5]\u0556\n]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\5_\u056f\n_\3_\3_\3`\3`\3`\3`\3`"+
		"\3`\3`\5`\u057a\n`\3`\3`\3a\3a\3a\3a\3a\3a\3a\5a\u0585\na\3a\3a\3b\3b"+
		"\3b\3b\3b\3b\3b\5b\u0590\nb\3b\3b\3c\3c\3d\3d\3e\3e\3e\5e\u059b\ne\3e"+
		"\3e\7e\u059f\ne\fe\16e\u05a2\13e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05af"+
		"\nf\3g\3g\3g\3g\3g\5g\u05b6\ng\5g\u05b8\ng\3g\3g\3h\3h\3h\3h\3h\5h\u05c1"+
		"\nh\5h\u05c3\nh\3h\3h\3i\3i\3j\5j\u05ca\nj\3j\3j\3k\5k\u05cf\nk\3k\3k"+
		"\3l\3l\5l\u05d5\nl\3l\3l\7l\u05d9\nl\fl\16l\u05dc\13l\3l\3l\3m\3m\3m\3"+
		"m\3m\5m\u05e5\nm\3m\3m\3m\3m\3m\7m\u05ec\nm\fm\16m\u05ef\13m\3m\3m\3n"+
		"\3n\3o\3o\3o\5o\u05f8\no\3p\3p\3p\5p\u05fd\np\3p\5p\u0600\np\3p\3p\7p"+
		"\u0604\np\fp\16p\u0607\13p\3p\3p\3q\3q\3q\3r\3r\3s\3s\3s\7s\u0613\ns\f"+
		"s\16s\u0616\13s\3t\3t\3t\7t\u061b\nt\ft\16t\u061e\13t\3u\3u\3v\3v\3v\7"+
		"v\u0625\nv\fv\16v\u0628\13v\3w\3w\3w\5w\u062d\nw\3w\3w\3w\3w\3w\3w\3w"+
		"\5w\u0636\nw\3x\3x\3x\5x\u063b\nx\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0647"+
		"\ny\3z\3z\3z\3z\3z\3z\3z\3z\5z\u0651\nz\3{\3{\3{\3{\3{\3{\5{\u0659\n{"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0693\n|\3|\3|\3|\3|\3|\3|\3|\5|\u069c"+
		"\n|\5|\u069e\n|\3}\3}\3}\3~\3~\3~\3~\3~\3~\5~\u06a9\n~\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u06b7\n\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u06c5\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06d1"+
		"\n\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u06d9"+
		"\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u06e0\n\u0084"+
		"\f\u0084\16\u0084\u06e3\13\u0084\5\u0084\u06e5\n\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u06ec\n\u0084\f\u0084\16\u0084\u06ef"+
		"\13\u0084\5\u0084\u06f1\n\u0084\3\u0084\3\u0084\5\u0084\u06f5\n\u0084"+
		"\3\u0084\3\u0084\5\u0084\u06f9\n\u0084\3\u0084\5\u0084\u06fc\n\u0084\3"+
		"\u0085\3\u0085\3\u0085\5\u0085\u0701\n\u0085\3\u0085\3\u0085\5\u0085\u0705"+
		"\n\u0085\3\u0085\5\u0085\u0708\n\u0085\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u070d\n\u0086\3\u0086\5\u0086\u0710\n\u0086\3\u0087\3\u0087\3\u0087\5"+
		"\u0087\u0715\n\u0087\3\u0087\3\u0087\5\u0087\u0719\n\u0087\3\u0087\5\u0087"+
		"\u071c\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u0721\n\u0088\5\u0088\u0723"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u0728\n\u0089\3\u0089\5\u0089"+
		"\u072b\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0733\n\u008a\5\u008a\u0735\n\u008a\5\u008a\u0737\n\u008a\3\u008a\3\u008a"+
		"\5\u008a\u073b\n\u008a\3\u008a\5\u008a\u073e\n\u008a\3\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0746\n\u008b\5\u008b\u0748\n\u008b"+
		"\5\u008b\u074a\n\u008b\3\u008b\3\u008b\5\u008b\u074e\n\u008b\3\u008b\5"+
		"\u008b\u0751\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0758"+
		"\n\u008c\3\u008c\5\u008c\u075b\n\u008c\3\u008c\3\u008c\5\u008c\u075f\n"+
		"\u008c\3\u008c\3\u008c\5\u008c\u0763\n\u008c\3\u008c\5\u008c\u0766\n\u008c"+
		"\5\u008c\u0768\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u076f\n\u008d\3\u008d\5\u008d\u0772\n\u008d\3\u008d\3\u008d\5\u008d\u0776"+
		"\n\u008d\3\u008d\3\u008d\5\u008d\u077a\n\u008d\3\u008d\5\u008d\u077d\n"+
		"\u008d\5\u008d\u077f\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0785"+
		"\n\u008e\3\u008f\3\u008f\5\u008f\u0789\n\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u078f\n\u0090\3\u0090\5\u0090\u0792\n\u0090\3\u0090\3"+
		"\u0090\5\u0090\u0796\n\u0090\3\u0090\3\u0090\5\u0090\u079a\n\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u07a7\n\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u07ac\n"+
		"\u0091\3\u0091\3\u0091\5\u0091\u07b0\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u07b8\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u07c1\n\u0091\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u07c6\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u07d6\n\u0091\5\u0091\u07d8\n\u0091\3\u0091\3\u0091\5\u0091\u07dc"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u07e7\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u07f0\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u07f5\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u0801\n\u0092\5\u0092\u0803\n\u0092\3"+
		"\u0092\3\u0092\3\u0092\5\u0092\u0808\n\u0092\5\u0092\u080a\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0822\n\u0093\5\u0093\u0824\n\u0093\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0836"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u083b\n\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0843\n\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u084c\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0851\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0857\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0866"+
		"\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u086b\n\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0873\n\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u087c\n\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u0881\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u088c\n\u0096\f\u0096"+
		"\16\u0096\u088f\13\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0894\n\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u08a3\n\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u08a8\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u08b1\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u08b9\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u08bf\n\u0097\5\u0097\u08c1\n\u0097\3\u0097\3\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\5\u0097\u08c9\n\u0097\3\u0097\3\u0097\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\5\u0098\u08d7\n\u0098\5\u0098\u08d9\n\u0098\3\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u08e5\n"+
		"\u0099\f\u0099\16\u0099\u08e8\13\u0099\3\u0099\3\u0099\5\u0099\u08ec\n"+
		"\u0099\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08f2\n\u009a\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u08f9\n\u009b\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\5\u009b\u08ff\n\u009b\3\u009b\3\u009b\5\u009b\u0903\n\u009b"+
		"\5\u009b\u0905\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u090a\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u090f\n\u009c\3\u009c\3\u009c\5\u009c\u0913"+
		"\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0918\n\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u091e\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u0925\n\u009c\5\u009c\u0927\n\u009c\3\u009d\3\u009d\3"+
		"\u009d\3\u009d\5\u009d\u092d\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u093f\n\u00a1\3\u00a1\5\u00a1\u0942\n"+
		"\u00a1\3\u00a2\5\u00a2\u0945\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0949\n\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0952"+
		"\n\u00a3\f\u00a3\16\u00a3\u0955\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u095f\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u0965\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u096b\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0971\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0978\n\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u097c\n\u00a8\3\u00a8\5\u00a8\u097f\n\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u098e\n\u00ab\3\u00ab\3\u00ab\5\u00ab"+
		"\u0992\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0997\n\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u099e\n\u00ab\7\u00ab\u09a0\n\u00ab"+
		"\f\u00ab\16\u00ab\u09a3\13\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u09a9\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u09af\n\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09c1"+
		"\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09c8\n\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09ce\n\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u09d4\n\u00af\5\u00af\u09d6\n\u00af\3\u00af\3"+
		"\u00af\5\u00af\u09da\n\u00af\6\u00af\u09dc\n\u00af\r\u00af\16\u00af\u09dd"+
		"\3\u00af\3\u00af\3\u00af\5\u00af\u09e3\n\u00af\3\u00b0\3\u00b0\3\u00b1"+
		"\3\u00b1\5\u00b1\u09e9\n\u00b1\3\u00b2\3\u00b2\5\u00b2\u09ed\n\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\5\u00b5\u09fa\n\u00b5\3\u00b5\5\u00b5\u09fd\n\u00b5\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0a03\n\u00b6\3\u00b6\5\u00b6\u0a06"+
		"\n\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a0b\n\u00b7\3\u00b7\5\u00b7"+
		"\u0a0e\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a12\n\u00b7\3\u00b7\5\u00b7\u0a15"+
		"\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0a1b\n\u00b8\3\u00b8"+
		"\5\u00b8\u0a1e\n\u00b8\3\u00b8\3\u00b8\5\u00b8\u0a22\n\u00b8\3\u00b8\5"+
		"\u00b8\u0a25\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3"+
		"\u00b9\5\u00b9\u0a2e\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u0a32\n\u00b9\3\u00b9"+
		"\5\u00b9\u0a35\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u0a39\n\u00b9\3\u00b9\5"+
		"\u00b9\u0a3c\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\5\u00be\u0a53\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0a58\n\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0a6c\n\u00c0"+
		"\3\u00c1\3\u00c1\5\u00c1\u0a70\n\u00c1\3\u00c1\5\u00c1\u0a73\n\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0a7a\n\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\5\u00c1\u0a80\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0a87\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0a8c"+
		"\n\u00c1\3\u00c1\5\u00c1\u0a8f\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u0a96\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0a9a\n\u00c2\3"+
		"\u00c2\3\u00c2\5\u00c2\u0a9e\n\u00c2\3\u00c2\5\u00c2\u0aa1\n\u00c2\5\u00c2"+
		"\u0aa3\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0aaf\n\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0ab8\n\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u0abd\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0ac9\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u0ace\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0ad7\n\u00c4\3\u00c4\5\u00c4\u0ada\n"+
		"\u00c4\5\u00c4\u0adc\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0ae9\n\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\5\u00c4\u0aee\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\5\u00c5\u0af6\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u0afa"+
		"\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0b0a\n\u00c5"+
		"\5\u00c5\u0b0c\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0b18\n\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b23"+
		"\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b27\n\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0b2b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b30\n\u00c8\3\u00c8\5"+
		"\u00c8\u0b33\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b3a"+
		"\n\u00c8\3\u00c8\5\u00c8\u0b3d\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b41\n"+
		"\u00c8\5\u00c8\u0b43\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0b5c\n\u00c9\5\u00c9\u0b5e\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b62"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b68\n\u00c9\5\u00c9"+
		"\u0b6a\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0b6e\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u0b7c\n\u00c9\3\u00c9\5\u00c9\u0b7f\n\u00c9\5\u00c9\u0b81"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cc\6\u00cc\u0b8c\n\u00cc\r\u00cc\16\u00cc\u0b8d\3\u00cd\3\u00cd"+
		"\3\u00cd\7\u00cd\u0b93\n\u00cd\f\u00cd\16\u00cd\u0b96\13\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b9d\n\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0ba5\n\u00ce\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0baa\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\5\u00d0\u0bb2\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0bb7\n"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2"+
		"\u0bc0\n\u00d2\f\u00d2\16\u00d2\u0bc3\13\u00d2\5\u00d2\u0bc5\n\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0bcc\n\u00d2\f\u00d2\16"+
		"\u00d2\u0bcf\13\u00d2\5\u00d2\u0bd1\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\7\u00d2\u0bd8\n\u00d2\f\u00d2\16\u00d2\u0bdb\13\u00d2\5"+
		"\u00d2\u0bdd\n\u00d2\5\u00d2\u0bdf\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0be6\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0bec\n\u00d3\6\u00d3\u0bee\n\u00d3\r\u00d3\16\u00d3\u0bef\5\u00d3\u0bf2"+
		"\n\u00d3\3\u00d3\5\u00d3\u0bf5\n\u00d3\3\u00d3\5\u00d3\u0bf8\n\u00d3\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\5\u00d5\u0c03\n\u00d5\3\u00d5\5\u00d5\u0c06\n\u00d5\3\u00d5\5\u00d5\u0c09"+
		"\n\u00d5\3\u00d6\5\u00d6\u0c0c\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0c12\n\u00d6\3\u00d6\3\u00d6\5\u00d6\u0c16\n\u00d6\3\u00d6\5"+
		"\u00d6\u0c19\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0c1f\n\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7"+
		"\u0c29\n\u00d7\6\u00d7\u0c2b\n\u00d7\r\u00d7\16\u00d7\u0c2c\3\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\5\u00d7\u0c33\n\u00d7\6\u00d7\u0c35\n\u00d7\r\u00d7"+
		"\16\u00d7\u0c36\3\u00d7\3\u00d7\3\u00d7\6\u00d7\u0c3c\n\u00d7\r\u00d7"+
		"\16\u00d7\u0c3d\5\u00d7\u0c40\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0c46\n\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0c4c\n"+
		"\u00d9\3\u00da\3\u00da\3\u00da\5\u00da\u0c51\n\u00da\5\u00da\u0c53\n\u00da"+
		"\3\u00da\5\u00da\u0c56\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db"+
		"\u0c5c\n\u00db\3\u00db\5\u00db\u0c5f\n\u00db\3\u00db\3\u00db\5\u00db\u0c63"+
		"\n\u00db\3\u00db\3\u00db\5\u00db\u0c67\n\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\5\u00db\u0c6d\n\u00db\3\u00db\3\u00db\5\u00db\u0c71\n\u00db\3"+
		"\u00db\5\u00db\u0c74\n\u00db\5\u00db\u0c76\n\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\5\u00dc\u0c7b\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0c81\n"+
		"\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0c86\n\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\5\u00dd\u0c8c\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3"+
		"\u00de\5\u00de\u0c93\n\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3"+
		"\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0ca0\n\u00de\5"+
		"\u00de\u0ca2\n\u00de\3\u00de\3\u00de\5\u00de\u0ca6\n\u00de\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\5\u00df\u0cac\n\u00df\3\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0cb5\n\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0cbd\n\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\6\u00e0\u0cc7\n\u00e0\r\u00e0"+
		"\16\u00e0\u0cc8\3\u00e1\3\u00e1\5\u00e1\u0ccd\n\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\5\u00e1\u0cd3\n\u00e1\3\u00e1\5\u00e1\u0cd6\n\u00e1\3"+
		"\u00e2\3\u00e2\3\u00e2\7\u00e2\u0cdb\n\u00e2\f\u00e2\16\u00e2\u0cde\13"+
		"\u00e2\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ce3\n\u00e3\f\u00e3\16\u00e3"+
		"\u0ce6\13\u00e3\3\u00e3\5\u00e3\u0ce9\n\u00e3\3\u00e4\3\u00e4\3\u00e4"+
		"\7\u00e4\u0cee\n\u00e4\f\u00e4\16\u00e4\u0cf1\13\u00e4\3\u00e5\3\u00e5"+
		"\5\u00e5\u0cf5\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6"+
		"\u0cfc\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d02\n\u00e7\3"+
		"\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0d0a\n\u00e8\3"+
		"\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0d11\n\u00ea\f\u00ea\16"+
		"\u00ea\u0d14\13\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\5\u00ec\u0d1a\n"+
		"\u00ec\3\u00ed\3\u00ed\5\u00ed\u0d1e\n\u00ed\3\u00ee\3\u00ee\3\u00ee\3"+
		"\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0d29\n\u00ee\f"+
		"\u00ee\16\u00ee\u0d2c\13\u00ee\5\u00ee\u0d2e\n\u00ee\3\u00ee\3\u00ee\3"+
		"\u00ef\3\u00ef\3\u00ef\7\u00ef\u0d35\n\u00ef\f\u00ef\16\u00ef\u0d38\13"+
		"\u00ef\3\u00f0\3\u00f0\5\u00f0\u0d3c\n\u00f0\3\u00f1\3\u00f1\3\u00f2\3"+
		"\u00f2\3\u00f3\3\u00f3\3\u00f3\2\2\u00f4\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8"+
		"\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0"+
		"\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\2\64\3\2"+
		"\u00bd\u00be\5\2\33\33--VV\4\2||\u00f5\u00f5\4\2\u0080\u0080\u00f4\u00f4"+
		"\4\2cc\u00f6\u00f6\3\2lm\4\2\31\31\u00ee\u00ee\3\2\5\b\3\2\u00bb\u00bc"+
		"\3\2\u00e8\u00e9\3\2\u00e4\u00e5\3\2RS\3\2jk\4\2\34\34\u00eb\u00eb\3\2"+
		")*\3\2\u00a4\u00a5\3\2]^\3\2\u00dd\u00de\3\2\u00cb\u00cc\4\2YY\u008f\u008f"+
		"\4\2\26\26\u00b7\u00b7\4\2pp\u00e4\u00e4\3\2\u00b1\u00b2\3\2\u00c8\u00c9"+
		"\3\2\63\64\4\2LL\u009a\u009a\4\2\n\n\u00d5\u00d5\3\2\u00a2\u00a3\3\2%"+
		"&\5\2\63\63\65\65aa\3\2ab\3\2qr\3\2\u00e1\u00e2\3\2\u0084\u0085\3\2\u0097"+
		"\u0098\4\2\u00a2\u00a2\u00bb\u00bb\5\2\r\r\63\63\u00e8\u00e8\3\2\13\f"+
		"\4\2\u00bb\u00bb\u00e8\u00e8\3\2\u00b2\u00b3\3\2\u0088\u0089\3\2IJ\3\2"+
		"\u00a0\u00a1\3\2\u00c3\u00c4\4\2<<FF\4\2\u0090\u0090\u00f0\u00f0\4\2\u00c1"+
		"\u00c2\u00c5\u00c5\3\2\r\16\3\2\u00f8\u00f9\26\2\t\30\32\"%=??CNP^`bd"+
		"fhrxz}\177\u0084\u009a\u009d\u009e\u00a0\u00a7\u00a9\u00a9\u00ac\u00af"+
		"\u00b1\u00be\u00c0\u00c6\u00c8\u00d9\u00db\u00f3\2\u0f02\2\u01e7\3\2\2"+
		"\2\4\u01ee\3\2\2\2\6\u0202\3\2\2\2\b\u020d\3\2\2\2\n\u020f\3\2\2\2\f\u0215"+
		"\3\2\2\2\16\u021c\3\2\2\2\20\u0223\3\2\2\2\22\u022a\3\2\2\2\24\u023b\3"+
		"\2\2\2\26\u023d\3\2\2\2\30\u0243\3\2\2\2\32\u0247\3\2\2\2\34\u025c\3\2"+
		"\2\2\36\u0271\3\2\2\2 \u0273\3\2\2\2\"\u027a\3\2\2\2$\u027d\3\2\2\2&\u0280"+
		"\3\2\2\2(\u0283\3\2\2\2*\u0288\3\2\2\2,\u028b\3\2\2\2.\u02a3\3\2\2\2\60"+
		"\u02a5\3\2\2\2\62\u02b2\3\2\2\2\64\u02b5\3\2\2\2\66\u02c3\3\2\2\28\u02cf"+
		"\3\2\2\2:\u02e8\3\2\2\2<\u02f0\3\2\2\2>\u02fe\3\2\2\2@\u0303\3\2\2\2B"+
		"\u0324\3\2\2\2D\u0327\3\2\2\2F\u0329\3\2\2\2H\u032e\3\2\2\2J\u033c\3\2"+
		"\2\2L\u0349\3\2\2\2N\u0350\3\2\2\2P\u035a\3\2\2\2R\u035e\3\2\2\2T\u0362"+
		"\3\2\2\2V\u0367\3\2\2\2X\u0374\3\2\2\2Z\u0384\3\2\2\2\\\u0388\3\2\2\2"+
		"^\u0394\3\2\2\2`\u0396\3\2\2\2b\u03a4\3\2\2\2d\u03a8\3\2\2\2f\u03b0\3"+
		"\2\2\2h\u03ce\3\2\2\2j\u03d9\3\2\2\2l\u03dd\3\2\2\2n\u03df\3\2\2\2p\u03e2"+
		"\3\2\2\2r\u03ed\3\2\2\2t\u03f0\3\2\2\2v\u0419\3\2\2\2x\u041b\3\2\2\2z"+
		"\u041d\3\2\2\2|\u041f\3\2\2\2~\u042b\3\2\2\2\u0080\u042d\3\2\2\2\u0082"+
		"\u0432\3\2\2\2\u0084\u0434\3\2\2\2\u0086\u0440\3\2\2\2\u0088\u044c\3\2"+
		"\2\2\u008a\u0459\3\2\2\2\u008c\u0461\3\2\2\2\u008e\u0463\3\2\2\2\u0090"+
		"\u0465\3\2\2\2\u0092\u046d\3\2\2\2\u0094\u0475\3\2\2\2\u0096\u0480\3\2"+
		"\2\2\u0098\u0482\3\2\2\2\u009a\u0496\3\2\2\2\u009c\u04ac\3\2\2\2\u009e"+
		"\u04ae\3\2\2\2\u00a0\u04b8\3\2\2\2\u00a2\u04c4\3\2\2\2\u00a4\u04d1\3\2"+
		"\2\2\u00a6\u04d3\3\2\2\2\u00a8\u04e9\3\2\2\2\u00aa\u04eb\3\2\2\2\u00ac"+
		"\u04ee\3\2\2\2\u00ae\u050d\3\2\2\2\u00b0\u0518\3\2\2\2\u00b2\u051a\3\2"+
		"\2\2\u00b4\u0534\3\2\2\2\u00b6\u0542\3\2\2\2\u00b8\u0551\3\2\2\2\u00ba"+
		"\u055a\3\2\2\2\u00bc\u0567\3\2\2\2\u00be\u0572\3\2\2\2\u00c0\u057d\3\2"+
		"\2\2\u00c2\u0588\3\2\2\2\u00c4\u0593\3\2\2\2\u00c6\u0595\3\2\2\2\u00c8"+
		"\u0597\3\2\2\2\u00ca\u05ae\3\2\2\2\u00cc\u05b0\3\2\2\2\u00ce\u05bb\3\2"+
		"\2\2\u00d0\u05c6\3\2\2\2\u00d2\u05c9\3\2\2\2\u00d4\u05ce\3\2\2\2\u00d6"+
		"\u05d2\3\2\2\2\u00d8\u05df\3\2\2\2\u00da\u05f2\3\2\2\2\u00dc\u05f4\3\2"+
		"\2\2\u00de\u05f9\3\2\2\2\u00e0\u060a\3\2\2\2\u00e2\u060d\3\2\2\2\u00e4"+
		"\u0614\3\2\2\2\u00e6\u0617\3\2\2\2\u00e8\u061f\3\2\2\2\u00ea\u0621\3\2"+
		"\2\2\u00ec\u0629\3\2\2\2\u00ee\u063a\3\2\2\2\u00f0\u0646\3\2\2\2\u00f2"+
		"\u0648\3\2\2\2\u00f4\u0652\3\2\2\2\u00f6\u065a\3\2\2\2\u00f8\u069f\3\2"+
		"\2\2\u00fa\u06a8\3\2\2\2\u00fc\u06b6\3\2\2\2\u00fe\u06c4\3\2\2\2\u0100"+
		"\u06d0\3\2\2\2\u0102\u06d2\3\2\2\2\u0104\u06d5\3\2\2\2\u0106\u06da\3\2"+
		"\2\2\u0108\u06fd\3\2\2\2\u010a\u0709\3\2\2\2\u010c\u0711\3\2\2\2\u010e"+
		"\u071d\3\2\2\2\u0110\u0724\3\2\2\2\u0112\u072c\3\2\2\2\u0114\u073f\3\2"+
		"\2\2\u0116\u0752\3\2\2\2\u0118\u0769\3\2\2\2\u011a\u0784\3\2\2\2\u011c"+
		"\u0788\3\2\2\2\u011e\u078a\3\2\2\2\u0120\u079b\3\2\2\2\u0122\u07dd\3\2"+
		"\2\2\u0124\u0823\3\2\2\2\u0126\u0825\3\2\2\2\u0128\u083a\3\2\2\2\u012a"+
		"\u086a\3\2\2\2\u012c\u08a7\3\2\2\2\u012e\u08cc\3\2\2\2\u0130\u08eb\3\2"+
		"\2\2\u0132\u08ed\3\2\2\2\u0134\u08f3\3\2\2\2\u0136\u0906\3\2\2\2\u0138"+
		"\u0928\3\2\2\2\u013a\u092e\3\2\2\2\u013c\u0933\3\2\2\2\u013e\u0938\3\2"+
		"\2\2\u0140\u093b\3\2\2\2\u0142\u0944\3\2\2\2\u0144\u094a\3\2\2\2\u0146"+
		"\u0956\3\2\2\2\u0148\u0959\3\2\2\2\u014a\u0966\3\2\2\2\u014c\u096c\3\2"+
		"\2\2\u014e\u0977\3\2\2\2\u0150\u0980\3\2\2\2\u0152\u0984\3\2\2\2\u0154"+
		"\u0988\3\2\2\2\u0156\u09a4\3\2\2\2\u0158\u09aa\3\2\2\2\u015a\u09b3\3\2"+
		"\2\2\u015c\u09bc\3\2\2\2\u015e\u09e4\3\2\2\2\u0160\u09e8\3\2\2\2\u0162"+
		"\u09ea\3\2\2\2\u0164\u09f0\3\2\2\2\u0166\u09f3\3\2\2\2\u0168\u09fc\3\2"+
		"\2\2\u016a\u09fe\3\2\2\2\u016c\u0a07\3\2\2\2\u016e\u0a16\3\2\2\2\u0170"+
		"\u0a2d\3\2\2\2\u0172\u0a3d\3\2\2\2\u0174\u0a42\3\2\2\2\u0176\u0a46\3\2"+
		"\2\2\u0178\u0a4b\3\2\2\2\u017a\u0a50\3\2\2\2\u017c\u0a5c\3\2\2\2\u017e"+
		"\u0a6b\3\2\2\2\u0180\u0a6d\3\2\2\2\u0182\u0a90\3\2\2\2\u0184\u0ab9\3\2"+
		"\2\2\u0186\u0acf\3\2\2\2\u0188\u0aef\3\2\2\2\u018a\u0b0d\3\2\2\2\u018c"+
		"\u0b19\3\2\2\2\u018e\u0b42\3\2\2\2\u0190\u0b80\3\2\2\2\u0192\u0b86\3\2"+
		"\2\2\u0194\u0b88\3\2\2\2\u0196\u0b8b\3\2\2\2\u0198\u0b8f\3\2\2\2\u019a"+
		"\u0b9c\3\2\2\2\u019c\u0ba9\3\2\2\2\u019e\u0bb1\3\2\2\2\u01a0\u0bb3\3\2"+
		"\2\2\u01a2\u0bde\3\2\2\2\u01a4\u0be0\3\2\2\2\u01a6\u0bf9\3\2\2\2\u01a8"+
		"\u0bfc\3\2\2\2\u01aa\u0c0b\3\2\2\2\u01ac\u0c1a\3\2\2\2\u01ae\u0c41\3\2"+
		"\2\2\u01b0\u0c47\3\2\2\2\u01b2\u0c55\3\2\2\2\u01b4\u0c75\3\2\2\2\u01b6"+
		"\u0c80\3\2\2\2\u01b8\u0c8b\3\2\2\2\u01ba\u0c8d\3\2\2\2\u01bc\u0ca7\3\2"+
		"\2\2\u01be\u0cb0\3\2\2\2\u01c0\u0cca\3\2\2\2\u01c2\u0cd7\3\2\2\2\u01c4"+
		"\u0ce8\3\2\2\2\u01c6\u0cea\3\2\2\2\u01c8\u0cf4\3\2\2\2\u01ca\u0cfb\3\2"+
		"\2\2\u01cc\u0d01\3\2\2\2\u01ce\u0d09\3\2\2\2\u01d0\u0d0b\3\2\2\2\u01d2"+
		"\u0d0d\3\2\2\2\u01d4\u0d15\3\2\2\2\u01d6\u0d19\3\2\2\2\u01d8\u0d1d\3\2"+
		"\2\2\u01da\u0d1f\3\2\2\2\u01dc\u0d31\3\2\2\2\u01de\u0d3b\3\2\2\2\u01e0"+
		"\u0d3d\3\2\2\2\u01e2\u0d3f\3\2\2\2\u01e4\u0d41\3\2\2\2\u01e6\u01e8\5\4"+
		"\3\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7\2\2\3\u01ec\3\3\2\2\2"+
		"\u01ed\u01ef\5\n\6\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f4"+
		"\3\2\2\2\u01f0\u01f1\5\26\f\2\u01f1\u01f2\5\b\5\2\u01f2\u01f5\3\2\2\2"+
		"\u01f3\u01f5\5\6\4\2\u01f4\u01f0\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01f8\7\u00c7\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2"+
		"\2\u01f8\5\3\2\2\2\u01f9\u0203\5\u00ecw\2\u01fa\u0203\5\u00eex\2\u01fb"+
		"\u01ff\5\20\t\2\u01fc\u01fe\5\16\b\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3"+
		"\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u01fa\3\2\2\2\u0202\u01fb\3\2"+
		"\2\2\u0203\7\3\2\2\2\u0204\u020e\5\u00ecw\2\u0205\u020e\5\u00eex\2\u0206"+
		"\u020a\5\22\n\2\u0207\u0209\5\16\b\2\u0208\u0207\3\2\2\2\u0209\u020c\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0204\3\2\2\2\u020d\u0205\3\2\2\2\u020d\u0206\3\2"+
		"\2\2\u020e\t\3\2\2\2\u020f\u0210\7\u00ea\2\2\u0210\u0211\7\u0099\2\2\u0211"+
		"\u0213\7\'\2\2\u0212\u0214\7\6\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\13\3\2\2\2\u0215\u0219\5\20\t\2\u0216\u0218\5\16\b\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\r\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021e\7\u00e3\2\2\u021d"+
		"\u021f\7\20\2\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3"+
		"\2\2\2\u0220\u0221\5\20\t\2\u0221\17\3\2\2\2\u0222\u0224\5\24\13\2\u0223"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\21\3\2\2\2\u0227\u0229\5\24\13\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\23\3\2\2"+
		"\2\u022c\u022a\3\2\2\2\u022d\u023c\5\26\f\2\u022e\u023c\5\30\r\2\u022f"+
		"\u023c\5*\26\2\u0230\u023c\5\64\33\2\u0231\u023c\5,\27\2\u0232\u023c\5"+
		"\60\31\2\u0233\u023c\5\66\34\2\u0234\u023c\5<\37\2\u0235\u023c\5(\25\2"+
		"\u0236\u023c\5> \2\u0237\u023c\5@!\2\u0238\u023c\5L\'\2\u0239\u023c\5"+
		"H%\2\u023a\u023c\5J&\2\u023b\u022d\3\2\2\2\u023b\u022e\3\2\2\2\u023b\u022f"+
		"\3\2\2\2\u023b\u0230\3\2\2\2\u023b\u0231\3\2\2\2\u023b\u0232\3\2\2\2\u023b"+
		"\u0233\3\2\2\2\u023b\u0234\3\2\2\2\u023b\u0235\3\2\2\2\u023b\u0236\3\2"+
		"\2\2\u023b\u0237\3\2\2\2\u023b\u0238\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023a\3\2\2\2\u023c\25\3\2\2\2\u023d\u0241\7\u00e7\2\2\u023e\u023f\7"+
		"a\2\2\u023f\u0242\5\u008eH\2\u0240\u0242\5\u008eH\2\u0241\u023e\3\2\2"+
		"\2\u0241\u0240\3\2\2\2\u0242\27\3\2\2\2\u0243\u0244\7\u00b9\2\2\u0244"+
		"\u0245\5\32\16\2\u0245\31\3\2\2\2\u0246\u0248\7?\2\2\u0247\u0246\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0254\5\36\20\2\u024a"+
		"\u024b\7\u0095\2\2\u024b\u024c\7\37\2\2\u024c\u0251\5 \21\2\u024d\u024e"+
		"\7$\2\2\u024e\u0250\5 \21\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u024a\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256"+
		"\u0258\5\"\22\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3"+
		"\2\2\2\u0259\u025b\5$\23\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\33\3\2\2\2\u025c\u025f\5\u008eH\2\u025d\u025e\7\24\2\2\u025e\u0260\5"+
		"\u00e8u\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\35\3\2\2\2\u0261"+
		"\u0266\7\u00da\2\2\u0262\u0263\7$\2\2\u0263\u0265\5\34\17\2\u0264\u0262"+
		"\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0272\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026e\5\34\17\2\u026a\u026b\7"+
		"$\2\2\u026b\u026d\5\34\17\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0271\u0261\3\2\2\2\u0271\u0269\3\2\2\2\u0272\37\3\2\2\2\u0273\u0278"+
		"\5\u008eH\2\u0274\u0279\7;\2\2\u0275\u0277\7\25\2\2\u0276\u0275\3\2\2"+
		"\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0274\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0279!\3\2\2\2\u027a\u027b\7\u00d0\2\2\u027b\u027c\5\u008eH\2"+
		"\u027c#\3\2\2\2\u027d\u027e\7x\2\2\u027e\u027f\5\u008eH\2\u027f%\3\2\2"+
		"\2\u0280\u0281\7\u00ee\2\2\u0281\u0282\5\u008eH\2\u0282\'\3\2\2\2\u0283"+
		"\u0284\7\u00ef\2\2\u0284\u0286\5\32\16\2\u0285\u0287\5&\24\2\u0286\u0285"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287)\3\2\2\2\u0288\u0289\7/\2\2\u0289\u028a"+
		"\5V,\2\u028a+\3\2\2\2\u028b\u028c\7\u00ca\2\2\u028c\u0291\5.\30\2\u028d"+
		"\u028e\7$\2\2\u028e\u0290\5.\30\2\u028f\u028d\3\2\2\2\u0290\u0293\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292-\3\2\2\2\u0293\u0291"+
		"\3\2\2\2\u0294\u0295\5\u00acW\2\u0295\u0296\7O\2\2\u0296\u0297\5\u008e"+
		"H\2\u0297\u02a4\3\2\2\2\u0298\u0299\5\u00e8u\2\u0299\u029a\7O\2\2\u029a"+
		"\u029b\5\u008eH\2\u029b\u02a4\3\2\2\2\u029c\u029d\5\u00e8u\2\u029d\u029e"+
		"\7\u009c\2\2\u029e\u029f\5\u008eH\2\u029f\u02a4\3\2\2\2\u02a0\u02a1\5"+
		"\u00e8u\2\u02a1\u02a2\5j\66\2\u02a2\u02a4\3\2\2\2\u02a3\u0294\3\2\2\2"+
		"\u02a3\u0298\3\2\2\2\u02a3\u029c\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a4/\3"+
		"\2\2\2\u02a5\u02a6\7\u00b4\2\2\u02a6\u02ab\5\62\32\2\u02a7\u02a8\7$\2"+
		"\2\u02a8\u02aa\5\62\32\2\u02a9\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\61\3\2\2\2\u02ad\u02ab\3\2\2"+
		"\2\u02ae\u02b3\5\u00acW\2\u02af\u02b0\5\u00e8u\2\u02b0\u02b1\5j\66\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02ae\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3\63\3\2\2"+
		"\2\u02b4\u02b6\7=\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02b8\79\2\2\u02b8\u02bd\5\u008eH\2\u02b9\u02ba\7$\2\2"+
		"\u02ba\u02bc\5\u008eH\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\65\3\2\2\2\u02bf\u02bd\3\2\2"+
		"\2\u02c0\u02c1\7\u0091\2\2\u02c1\u02c4\7~\2\2\u02c2\u02c4\7~\2\2\u02c3"+
		"\u02c0\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c9\5V"+
		",\2\u02c6\u02c8\58\35\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02ce\5&\24\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\67\3\2\2\2\u02cf\u02e5\7\u00ea\2\2\u02d0\u02d1\7j\2\2\u02d1\u02e6\5:"+
		"\36\2\u02d2\u02d3\7\35\2\2\u02d3\u02d4\7j\2\2\u02d4\u02e6\5:\36\2\u02d5"+
		"\u02d6\7\u00d8\2\2\u02d6\u02d7\7j\2\2\u02d7\u02e6\5:\36\2\u02d8\u02d9"+
		"\7\u00a9\2\2\u02d9\u02da\7j\2\2\u02da\u02e6\5:\36\2\u02db\u02dc\7\u009d"+
		"\2\2\u02dc\u02dd\7j\2\2\u02dd\u02e6\5:\36\2\u02de\u02df\7o\2\2\u02df\u02e0"+
		"\7\u008f\2\2\u02e0\u02e6\5\u00e6t\2\u02e1\u02e2\7\u00c0\2\2\u02e2\u02e3"+
		"\5\u00e8u\2\u02e3\u02e4\5n8\2\u02e4\u02e6\3\2\2\2\u02e5\u02d0\3\2\2\2"+
		"\u02e5\u02d2\3\2\2\2\u02e5\u02d5\3\2\2\2\u02e5\u02d8\3\2\2\2\u02e5\u02db"+
		"\3\2\2\2\u02e5\u02de\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e69\3\2\2\2\u02e7"+
		"\u02e9\7\u00c6\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\5\u00e8u\2\u02eb\u02ec\5n8\2\u02ec\u02ed\7{\2\2\u02ed"+
		"\u02ee\5\u00eav\2\u02ee\u02ef\7\u00bf\2\2\u02ef;\3\2\2\2\u02f0\u02f1\7"+
		"\177\2\2\u02f1\u02fb\5X-\2\u02f2\u02f7\7\u008f\2\2\u02f3\u02f4\7~\2\2"+
		"\u02f4\u02f8\5,\27\2\u02f5\u02f6\7/\2\2\u02f6\u02f8\5,\27\2\u02f7\u02f3"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f2\3\2\2\2\u02fa"+
		"\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc=\3\2\2\2"+
		"\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7\u00e6\2\2\u02ff\u0300\5\u008eH\2\u0300"+
		"\u0301\7\24\2\2\u0301\u0302\5\u00e8u\2\u0302?\3\2\2\2\u0303\u0304\7 \2"+
		"\2\u0304\u0311\5B\"\2\u0305\u0307\7{\2\2\u0306\u0308\5D#\2\u0307\u0306"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030d\3\2\2\2\u0309\u030a\7$\2\2\u030a"+
		"\u030c\5D#\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2"+
		"\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312"+
		"\7\u00bf\2\2\u0311\u0305\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0322\3\2\2"+
		"\2\u0313\u0320\7\u00f2\2\2\u0314\u0321\7\u00da\2\2\u0315\u031a\5F$\2\u0316"+
		"\u0317\7$\2\2\u0317\u0319\5F$\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2"+
		"\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a"+
		"\3\2\2\2\u031d\u031f\5&\24\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u0314\3\2\2\2\u0320\u0315\3\2\2\2\u0321\u0323\3\2"+
		"\2\2\u0322\u0313\3\2\2\2\u0322\u0323\3\2\2\2\u0323A\3\2\2\2\u0324\u0325"+
		"\5\u00e4s\2\u0325\u0326\5\u01de\u00f0\2\u0326C\3\2\2\2\u0327\u0328\5\u008e"+
		"H\2\u0328E\3\2\2\2\u0329\u032c\5\u01de\u00f0\2\u032a\u032b\7\24\2\2\u032b"+
		"\u032d\5\u00e8u\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032dG\3\2\2"+
		"\2\u032e\u032f\7y\2\2\u032f\u0332\7\60\2\2\u0330\u0331\7\u00ef\2\2\u0331"+
		"\u0333\7d\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0335\7[\2\2\u0335\u0336\5\u008eH\2\u0336\u0337\7\24\2\2\u0337"+
		"\u033a\5\u00e8u\2\u0338\u0339\7X\2\2\u0339\u033b\5\u01d4\u00eb\2\u033a"+
		"\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033bI\3\2\2\2\u033c\u033d\7Z\2\2\u033d"+
		"\u033e\7{\2\2\u033e\u033f\5\u00e8u\2\u033f\u0340\7i\2\2\u0340\u0341\5"+
		"\u008eH\2\u0341\u0343\7\31\2\2\u0342\u0344\5\24\13\2\u0343\u0342\3\2\2"+
		"\2\u0344\u0345\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347"+
		"\3\2\2\2\u0347\u0348\7\u00bf\2\2\u0348K\3\2\2\2\u0349\u034a\7 \2\2\u034a"+
		"\u034b\7v\2\2\u034b\u034c\5\f\7\2\u034c\u034e\7\u00ab\2\2\u034d\u034f"+
		"\5N(\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034fM\3\2\2\2\u0350\u0351"+
		"\7i\2\2\u0351\u0357\7\u00de\2\2\u0352\u0356\5P)\2\u0353\u0356\5R*\2\u0354"+
		"\u0356\5T+\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2"+
		"\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358O"+
		"\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\7\u008e\2\2\u035b\u035c\5\u008e"+
		"H\2\u035c\u035d\t\2\2\2\u035dQ\3\2\2\2\u035e\u035f\7\u008f\2\2\u035f\u0360"+
		"\7U\2\2\u0360\u0361\t\3\2\2\u0361S\3\2\2\2\u0362\u0363\7\u00b6\2\2\u0363"+
		"\u0364\7\u00d3\2\2\u0364\u0365\7\24\2\2\u0365\u0366\5\u00e8u\2\u0366U"+
		"\3\2\2\2\u0367\u036c\5X-\2\u0368\u0369\7$\2\2\u0369\u036b\5X-\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036dW\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\5\u00e8u\2\u0370\u0371"+
		"\7O\2\2\u0371\u0372\5\\/\2\u0372\u0375\3\2\2\2\u0373\u0375\5\\/\2\u0374"+
		"\u036f\3\2\2\2\u0374\u0373\3\2\2\2\u0375Y\3\2\2\2\u0376\u0377\7v\2\2\u0377"+
		"\u0378\7\6\2\2\u0378\u0385\7\u00ab\2\2\u0379\u037b\7v\2\2\u037a\u037c"+
		"\7\6\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037f\7$\2\2\u037e\u0380\7\6\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2"+
		"\2\2\u0380\u0381\3\2\2\2\u0381\u0385\7\u00ab\2\2\u0382\u0385\7\u009b\2"+
		"\2\u0383\u0385\7\u00da\2\2\u0384\u0376\3\2\2\2\u0384\u0379\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0384\u0383\3\2\2\2\u0385[\3\2\2\2\u0386\u0389\5^\60\2"+
		"\u0387\u0389\5b\62\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389]\3"+
		"\2\2\2\u038a\u038b\7\u00cd\2\2\u038b\u038c\7{\2\2\u038c\u038d\5b\62\2"+
		"\u038d\u038e\7\u00bf\2\2\u038e\u0395\3\2\2\2\u038f\u0390\7\17\2\2\u0390"+
		"\u0391\7{\2\2\u0391\u0392\5b\62\2\u0392\u0393\7\u00bf\2\2\u0393\u0395"+
		"\3\2\2\2\u0394\u038a\3\2\2\2\u0394\u038f\3\2\2\2\u0395_\3\2\2\2\u0396"+
		"\u0398\5t;\2\u0397\u0399\5Z.\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2"+
		"\u0399a\3\2\2\2\u039a\u03a0\5f\64\2\u039b\u039c\5`\61\2\u039c\u039d\5"+
		"f\64\2\u039d\u039f\3\2\2\2\u039e\u039b\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a5\3\2\2\2\u03a2\u03a0\3\2"+
		"\2\2\u03a3\u03a5\5h\65\2\u03a4\u039a\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7c\3\2\2\2"+
		"\u03a8\u03ac\5f\64\2\u03a9\u03aa\5t;\2\u03aa\u03ab\5f\64\2\u03ab\u03ad"+
		"\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03afe\3\2\2\2\u03b0\u03ca\7{\2\2\u03b1\u03b2\5\u00e8u"+
		"\2\u03b2\u03b3\7\u00ee\2\2\u03b3\u03b4\5\u008eH\2\u03b4\u03cb\3\2\2\2"+
		"\u03b5\u03b6\5\u00e8u\2\u03b6\u03b9\5r:\2\u03b7\u03b8\7\u00ee\2\2\u03b8"+
		"\u03ba\5\u008eH\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03cb"+
		"\3\2\2\2\u03bb\u03bc\7\u00ee\2\2\u03bc\u03cb\5\u008eH\2\u03bd\u03bf\5"+
		"\u00e8u\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2"+
		"\u03c0\u03c2\5\u0080A\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c4\3\2\2\2\u03c3\u03c5\5r:\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2"+
		"\2\u03c5\u03c8\3\2\2\2\u03c6\u03c7\7\u00ee\2\2\u03c7\u03c9\5\u008eH\2"+
		"\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03b1"+
		"\3\2\2\2\u03ca\u03b5\3\2\2\2\u03ca\u03bb\3\2\2\2\u03ca\u03be\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03cd\7\u00bf\2\2\u03cdg\3\2\2\2\u03ce\u03cf\7{\2"+
		"\2\u03cf\u03d2\5X-\2\u03d0\u03d1\7\u00ee\2\2\u03d1\u03d3\5\u008eH\2\u03d2"+
		"\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\7\u00bf"+
		"\2\2\u03d5\u03d7\5Z.\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7i"+
		"\3\2\2\2\u03d8\u03da\5n8\2\u03d9\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dck\3\2\2\2\u03dd\u03de\5\u0080"+
		"A\2\u03dem\3\2\2\2\u03df\u03e0\7#\2\2\u03e0\u03e1\5\u01de\u00f0\2\u03e1"+
		"o\3\2\2\2\u03e2\u03e3\7#\2\2\u03e3\u03e8\5\u01de\u00f0\2\u03e4\u03e5\7"+
		"\31\2\2\u03e5\u03e7\5\u01de\u00f0\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3"+
		"\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9q\3\2\2\2\u03ea\u03e8"+
		"\3\2\2\2\u03eb\u03ee\5\u00d8m\2\u03ec\u03ee\5\u00dco\2\u03ed\u03eb\3\2"+
		"\2\2\u03ed\u03ec\3\2\2\2\u03ees\3\2\2\2\u03ef\u03f1\5v<\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0413\5x=\2\u03f3"+
		"\u0410\7u\2\2\u03f4\u03f5\5\u00e8u\2\u03f5\u03f6\7\u00ee\2\2\u03f6\u03f7"+
		"\5\u008eH\2\u03f7\u0411\3\2\2\2\u03f8\u03f9\5\u00e8u\2\u03f9\u03fc\5r"+
		":\2\u03fa\u03fb\7\u00ee\2\2\u03fb\u03fd\5\u008eH\2\u03fc\u03fa\3\2\2\2"+
		"\u03fc\u03fd\3\2\2\2\u03fd\u0411\3\2\2\2\u03fe\u03ff\7\u00ee\2\2\u03ff"+
		"\u0411\5\u008eH\2\u0400\u0402\5\u00e8u\2\u0401\u0400\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0405\5\u0080A\2\u0404\u0403\3\2\2"+
		"\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u0408\5|?\2\u0407\u0406"+
		"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u040b\5r:\2\u040a"+
		"\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040d\7\u00ee"+
		"\2\2\u040d\u040f\5\u008eH\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f"+
		"\u0411\3\2\2\2\u0410\u03f4\3\2\2\2\u0410\u03f8\3\2\2\2\u0410\u03fe\3\2"+
		"\2\2\u0410\u0401\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\7\u00aa\2\2\u0413"+
		"\u03f3\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\5x"+
		"=\2\u0416\u0418\5z>\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418u\3"+
		"\2\2\2\u0419\u041a\t\4\2\2\u041aw\3\2\2\2\u041b\u041c\t\5\2\2\u041cy\3"+
		"\2\2\2\u041d\u041e\t\6\2\2\u041e{\3\2\2\2\u041f\u0421\7\u00da\2\2\u0420"+
		"\u0422\5~@\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422}\3\2\2\2\u0423"+
		"\u0425\7\6\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0428\7B\2\2\u0427\u0429\7\6\2\2\u0428\u0427\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u042c\7\6\2\2\u042b\u0424\3\2"+
		"\2\2\u042b\u042a\3\2\2\2\u042c\177\3\2\2\2\u042d\u042e\7#\2\2\u042e\u042f"+
		"\5\u0082B\2\u042f\u0081\3\2\2\2\u0430\u0433\5\u0086D\2\u0431\u0433\5\u0084"+
		"C\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u0083\3\2\2\2\u0434"+
		"\u043d\5\u0088E\2\u0435\u0439\7\31\2\2\u0436\u0437\7#\2\2\u0437\u043a"+
		"\5\u0088E\2\u0438\u043a\5\u0088E\2\u0439\u0436\3\2\2\2\u0439\u0438\3\2"+
		"\2\2\u043a\u043c\3\2\2\2\u043b\u0435\3\2\2\2\u043c\u043f\3\2\2\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0085\3\2\2\2\u043f\u043d\3\2"+
		"\2\2\u0440\u0449\5\u0088E\2\u0441\u0445\7\31\2\2\u0442\u0443\7#\2\2\u0443"+
		"\u0446\5\u0088E\2\u0444\u0446\5\u0088E\2\u0445\u0442\3\2\2\2\u0445\u0444"+
		"\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0441\3\2\2\2\u0448\u044b\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0087\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044c\u0453\5\u008aF\2\u044d\u044e\7s\2\2\u044e\u0452\5\u008aF\2"+
		"\u044f\u0450\7#\2\2\u0450\u0452\5\u008aF\2\u0451\u044d\3\2\2\2\u0451\u044f"+
		"\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0089\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0457\7t\2\2\u0457\u045a\5\u008a"+
		"F\2\u0458\u045a\5\u008cG\2\u0459\u0456\3\2\2\2\u0459\u0458\3\2\2\2\u045a"+
		"\u008b\3\2\2\2\u045b\u045c\7{\2\2\u045c\u045d\5\u0084C\2\u045d\u045e\7"+
		"\u00bf\2\2\u045e\u0462\3\2\2\2\u045f\u0462\7\u0081\2\2\u0460\u0462\5\u01de"+
		"\u00f0\2\u0461\u045b\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0460\3\2\2\2\u0462"+
		"\u008d\3\2\2\2\u0463\u0464\5\u0090I\2\u0464\u008f\3\2\2\2\u0465\u046a"+
		"\5\u0092J\2\u0466\u0467\7\u0094\2\2\u0467\u0469\5\u0092J\2\u0468\u0466"+
		"\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u0091\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u0472\5\u0094K\2\u046e\u046f"+
		"\7\u00f1\2\2\u046f\u0471\5\u0094K\2\u0470\u046e\3\2\2\2\u0471\u0474\3"+
		"\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0093\3\2\2\2\u0474"+
		"\u0472\3\2\2\2\u0475\u047a\5\u0096L\2\u0476\u0477\7\22\2\2\u0477\u0479"+
		"\5\u0096L\2\u0478\u0476\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2"+
		"\2\u047a\u047b\3\2\2\2\u047b\u0095\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e"+
		"\7\u008b\2\2\u047e\u0481\5\u0096L\2\u047f\u0481\5\u0098M\2\u0480\u047d"+
		"\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u0097\3\2\2\2\u0482\u0493\5\u009aN"+
		"\2\u0483\u0484\7O\2\2\u0484\u0492\5\u009aN\2\u0485\u0486\7\u0082\2\2\u0486"+
		"\u0492\5\u009aN\2\u0487\u0488\7\u0083\2\2\u0488\u0492\5\u009aN\2\u0489"+
		"\u048a\7w\2\2\u048a\u0492\5\u009aN\2\u048b\u048c\7_\2\2\u048c\u0492\5"+
		"\u009aN\2\u048d\u048e\7|\2\2\u048e\u0492\5\u009aN\2\u048f\u0490\7c\2\2"+
		"\u0490\u0492\5\u009aN\2\u0491\u0483\3\2\2\2\u0491\u0485\3\2\2\2\u0491"+
		"\u0487\3\2\2\2\u0491\u0489\3\2\2\2\u0491\u048b\3\2\2\2\u0491\u048d\3\2"+
		"\2\2\u0491\u048f\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0099\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0498\5\u009e"+
		"P\2\u0497\u0499\5\u009cO\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u009b\3\2\2\2\u049a\u049b\7\u00b0\2\2\u049b\u04ad\5\u009eP\2\u049c\u049d"+
		"\7\u00d2\2\2\u049d\u049e\7\u00ef\2\2\u049e\u04ad\5\u009eP\2\u049f\u04a0"+
		"\7N\2\2\u04a0\u04a1\7\u00ef\2\2\u04a1\u04ad\5\u009eP\2\u04a2\u04a3\7+"+
		"\2\2\u04a3\u04ad\5\u009eP\2\u04a4\u04a5\7i\2\2\u04a5\u04ad\5\u009eP\2"+
		"\u04a6\u04aa\7n\2\2\u04a7\u04ab\7\u008d\2\2\u04a8\u04a9\7\u008b\2\2\u04a9"+
		"\u04ab\7\u008d\2\2\u04aa\u04a7\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ad"+
		"\3\2\2\2\u04ac\u049a\3\2\2\2\u04ac\u049c\3\2\2\2\u04ac\u049f\3\2\2\2\u04ac"+
		"\u04a2\3\2\2\2\u04ac\u04a4\3\2\2\2\u04ac\u04a6\3\2\2\2\u04ad\u009d\3\2"+
		"\2\2\u04ae\u04b5\5\u00a0Q\2\u04af\u04b0\7\u009b\2\2\u04b0\u04b4\5\u00a0"+
		"Q\2\u04b1\u04b2\7\u0080\2\2\u04b2\u04b4\5\u00a0Q\2\u04b3\u04af\3\2\2\2"+
		"\u04b3\u04b1\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6"+
		"\3\2\2\2\u04b6\u009f\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04c1\5\u00a2R"+
		"\2\u04b9\u04ba\7\u00da\2\2\u04ba\u04c0\5\u00a2R\2\u04bb\u04bc\7@\2\2\u04bc"+
		"\u04c0\5\u00a2R\2\u04bd\u04be\7\u0081\2\2\u04be\u04c0\5\u00a2R\2\u04bf"+
		"\u04b9\3\2\2\2\u04bf\u04bb\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2"+
		"\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00a1\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c4\u04c9\5\u00a4S\2\u04c5\u04c6\7\u009f\2\2\u04c6\u04c8"+
		"\5\u00a4S\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2"+
		"\2\u04c9\u04ca\3\2\2\2\u04ca\u00a3\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04d2"+
		"\5\u00a6T\2\u04cd\u04ce\7\u009b\2\2\u04ce\u04d2\5\u00a6T\2\u04cf\u04d0"+
		"\7\u0080\2\2\u04d0\u04d2\5\u00a6T\2\u04d1\u04cc\3\2\2\2\u04d1\u04cd\3"+
		"\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u00a5\3\2\2\2\u04d3\u04d7\5\u00aeX\2"+
		"\u04d4\u04d6\5\u00a8U\2\u04d5\u04d4\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7"+
		"\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u00a7\3\2\2\2\u04d9\u04d7\3\2"+
		"\2\2\u04da\u04ea\5\u00aaV\2\u04db\u04ea\5l\67\2\u04dc\u04dd\7u\2\2\u04dd"+
		"\u04de\5\u008eH\2\u04de\u04df\7\u00aa\2\2\u04df\u04ea\3\2\2\2\u04e0\u04e2"+
		"\7u\2\2\u04e1\u04e3\5\u008eH\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2"+
		"\u04e3\u04e4\3\2\2\2\u04e4\u04e6\7B\2\2\u04e5\u04e7\5\u008eH\2\u04e6\u04e5"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\7\u00aa\2"+
		"\2\u04e9\u04da\3\2\2\2\u04e9\u04db\3\2\2\2\u04e9\u04dc\3\2\2\2\u04e9\u04e0"+
		"\3\2\2\2\u04ea\u00a9\3\2\2\2\u04eb\u04ec\7A\2\2\u04ec\u04ed\5\u00dan\2"+
		"\u04ed\u00ab\3\2\2\2\u04ee\u04f0\5\u00aeX\2\u04ef\u04f1\5\u00aaV\2\u04f0"+
		"\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2"+
		"\2\2\u04f3\u00ad\3\2\2\2\u04f4\u050e\5\u00b0Y\2\u04f5\u050e\5\u00dco\2"+
		"\u04f6\u050e\5\u00b2Z\2\u04f7\u04f8\7.\2\2\u04f8\u04f9\7{\2\2\u04f9\u04fa"+
		"\7\u00da\2\2\u04fa\u050e\7\u00bf\2\2\u04fb\u050e\5\u00ccg\2\u04fc\u050e"+
		"\5\u00ceh\2\u04fd\u050e\5\u00c8e\2\u04fe\u050e\5\u00b4[\2\u04ff\u050e"+
		"\5\u00b6\\\2\u0500\u050e\5\u00ba^\2\u0501\u050e\5\u00bc_\2\u0502\u050e"+
		"\5\u00be`\2\u0503\u050e\5\u00c0a\2\u0504\u050e\5\u00c2b\2\u0505\u050e"+
		"\5\u00c4c\2\u0506\u050e\5\u00c6d\2\u0507\u0508\7{\2\2\u0508\u0509\5\u008e"+
		"H\2\u0509\u050a\7\u00bf\2\2\u050a\u050e\3\2\2\2\u050b\u050e\5\u00dep\2"+
		"\u050c\u050e\5\u00e8u\2\u050d\u04f4\3\2\2\2\u050d\u04f5\3\2\2\2\u050d"+
		"\u04f6\3\2\2\2\u050d\u04f7\3\2\2\2\u050d\u04fb\3\2\2\2\u050d\u04fc\3\2"+
		"\2\2\u050d\u04fd\3\2\2\2\u050d\u04fe\3\2\2\2\u050d\u04ff\3\2\2\2\u050d"+
		"\u0500\3\2\2\2\u050d\u0501\3\2\2\2\u050d\u0502\3\2\2\2\u050d\u0503\3\2"+
		"\2\2\u050d\u0504\3\2\2\2\u050d\u0505\3\2\2\2\u050d\u0506\3\2\2\2\u050d"+
		"\u0507\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050c\3\2\2\2\u050e\u00af\3\2"+
		"\2\2\u050f\u0519\5\u00d2j\2\u0510\u0519\5\u00d0i\2\u0511\u0519\5\u00d8"+
		"m\2\u0512\u0519\5\u00d6l\2\u0513\u0519\7\u00e0\2\2\u0514\u0519\7W\2\2"+
		"\u0515\u0519\t\7\2\2\u0516\u0519\7\u0086\2\2\u0517\u0519\7\u008d\2\2\u0518"+
		"\u050f\3\2\2\2\u0518\u0510\3\2\2\2\u0518\u0511\3\2\2\2\u0518\u0512\3\2"+
		"\2\2\u0518\u0513\3\2\2\2\u0518\u0514\3\2\2\2\u0518\u0515\3\2\2\2\u0518"+
		"\u0516\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u00b1\3\2\2\2\u051a\u051f\7!"+
		"\2\2\u051b\u051c\5\u008eH\2\u051c\u051d\7\u00ed\2\2\u051d\u0520\3\2\2"+
		"\2\u051e\u0520\7\u00ed\2\2\u051f\u051b\3\2\2\2\u051f\u051e\3\2\2\2\u0520"+
		"\u0521\3\2\2\2\u0521\u0522\5\u008eH\2\u0522\u0523\7\u00d9\2\2\u0523\u052b"+
		"\5\u008eH\2\u0524\u0525\7\u00ed\2\2\u0525\u0526\5\u008eH\2\u0526\u0527"+
		"\7\u00d9\2\2\u0527\u0528\5\u008eH\2\u0528\u052a\3\2\2\2\u0529\u0524\3"+
		"\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u0530\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f\7K\2\2\u052f\u0531\5\u008e"+
		"H\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0533\7M\2\2\u0533\u00b3\3\2\2\2\u0534\u0535\7u\2\2\u0535\u0536\5\u00e8"+
		"u\2\u0536\u0537\7i\2\2\u0537\u053a\5\u008eH\2\u0538\u0539\7\u00ee\2\2"+
		"\u0539\u053b\5\u008eH\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b"+
		"\u053e\3\2\2\2\u053c\u053d\7\31\2\2\u053d\u053f\5\u008eH\2\u053e\u053c"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\7\u00aa\2"+
		"\2\u0541\u00b5\3\2\2\2\u0542\u0546\7u\2\2\u0543\u0544\5\u00e8u\2\u0544"+
		"\u0545\7O\2\2\u0545\u0547\3\2\2\2\u0546\u0543\3\2\2\2\u0546\u0547\3\2"+
		"\2\2\u0547\u0548\3\2\2\2\u0548\u054b\5d\63\2\u0549\u054a\7\u00ee\2\2\u054a"+
		"\u054c\5\u008eH\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d"+
		"\3\2\2\2\u054d\u054e\7\31\2\2\u054e\u054f\5\u008eH\2\u054f\u0550\7\u00aa"+
		"\2\2\u0550\u00b7\3\2\2\2\u0551\u0555\7u\2\2\u0552\u0553\5\u00e8u\2\u0553"+
		"\u0554\7O\2\2\u0554\u0556\3\2\2\2\u0555\u0552\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5b\62\2\u0558\u0559\t\b\2\2\u0559"+
		"\u00b9\3\2\2\2\u055a\u055b\7\u00ae\2\2\u055b\u055c\7{\2\2\u055c\u055d"+
		"\5\u00e8u\2\u055d\u055e\7O\2\2\u055e\u055f\5\u008eH\2\u055f\u0560\7$\2"+
		"\2\u0560\u0561\5\u00e8u\2\u0561\u0562\7i\2\2\u0562\u0563\5\u008eH\2\u0563"+
		"\u0564\7\31\2\2\u0564\u0565\5\u008eH\2\u0565\u0566\7\u00bf\2\2\u0566\u00bb"+
		"\3\2\2\2\u0567\u0568\7\20\2\2\u0568\u0569\7{\2\2\u0569\u056a\5\u00e8u"+
		"\2\u056a\u056b\7i\2\2\u056b\u056e\5\u008eH\2\u056c\u056d\7\u00ee\2\2\u056d"+
		"\u056f\5\u008eH\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570"+
		"\3\2\2\2\u0570\u0571\7\u00bf\2\2\u0571\u00bd\3\2\2\2\u0572\u0573\7\23"+
		"\2\2\u0573\u0574\7{\2\2\u0574\u0575\5\u00e8u\2\u0575\u0576\7i\2\2\u0576"+
		"\u0579\5\u008eH\2\u0577\u0578\7\u00ee\2\2\u0578\u057a\5\u008eH\2\u0579"+
		"\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\7\u00bf"+
		"\2\2\u057c\u00bf\3\2\2\2\u057d\u057e\7\u008a\2\2\u057e\u057f\7{\2\2\u057f"+
		"\u0580\5\u00e8u\2\u0580\u0581\7i\2\2\u0581\u0584\5\u008eH\2\u0582\u0583"+
		"\7\u00ee\2\2\u0583\u0585\5\u008eH\2\u0584\u0582\3\2\2\2\u0584\u0585\3"+
		"\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\7\u00bf\2\2\u0587\u00c1\3\2\2\2"+
		"\u0588\u0589\7\u00cf\2\2\u0589\u058a\7{\2\2\u058a\u058b\5\u00e8u\2\u058b"+
		"\u058c\7i\2\2\u058c\u058f\5\u008eH\2\u058d\u058e\7\u00ee\2\2\u058e\u0590"+
		"\5\u008eH\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2"+
		"\2\u0591\u0592\7\u00bf\2\2\u0592\u00c3\3\2\2\2\u0593\u0594\5d\63\2\u0594"+
		"\u00c5\3\2\2\2\u0595\u0596\5^\60\2\u0596\u00c7\3\2\2\2\u0597\u0598\5\u00e8"+
		"u\2\u0598\u059a\7v\2\2\u0599\u059b\5\u00caf\2\u059a\u0599\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u05a0\3\2\2\2\u059c\u059d\7$\2\2\u059d\u059f\5\u00ca"+
		"f\2\u059e\u059c\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05a4\7\u00ab"+
		"\2\2\u05a4\u00c9\3\2\2\2\u05a5\u05a6\5\u00dan\2\u05a6\u05a7\7#\2\2\u05a7"+
		"\u05a8\5\u008eH\2\u05a8\u05af\3\2\2\2\u05a9\u05aa\7A\2\2\u05aa\u05af\5"+
		"\u00dan\2\u05ab\u05af\5\u00e8u\2\u05ac\u05ad\7A\2\2\u05ad\u05af\7\u00da"+
		"\2\2\u05ae\u05a5\3\2\2\2\u05ae\u05a9\3\2\2\2\u05ae\u05ab\3\2\2\2\u05ae"+
		"\u05ac\3\2\2\2\u05af\u00cb\3\2\2\2\u05b0\u05b1\7T\2\2\u05b1\u05b7\7v\2"+
		"\2\u05b2\u05b8\5\f\7\2\u05b3\u05b5\5V,\2\u05b4\u05b6\5&\24\2\u05b5\u05b4"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b7"+
		"\u05b3\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\7\u00ab\2\2\u05ba\u00cd"+
		"\3\2\2\2\u05bb\u05bc\7.\2\2\u05bc\u05c2\7v\2\2\u05bd\u05c3\5\f\7\2\u05be"+
		"\u05c0\5V,\2\u05bf\u05c1\5&\24\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2"+
		"\2\u05c1\u05c3\3\2\2\2\u05c2\u05bd\3\2\2\2\u05c2\u05be\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\u05c5\7\u00ab\2\2\u05c5\u00cf\3\2\2\2\u05c6\u05c7\5\u01d4"+
		"\u00eb\2\u05c7\u00d1\3\2\2\2\u05c8\u05ca\7\u0080\2\2\u05c9\u05c8\3\2\2"+
		"\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\t\t\2\2\u05cc\u00d3"+
		"\3\2\2\2\u05cd\u05cf\7\u0080\2\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2"+
		"\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7\6\2\2\u05d1\u00d5\3\2\2\2\u05d2\u05d4"+
		"\7u\2\2\u05d3\u05d5\5\u008eH\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2"+
		"\u05d5\u05da\3\2\2\2\u05d6\u05d7\7$\2\2\u05d7\u05d9\5\u008eH\2\u05d8\u05d6"+
		"\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05dd\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05de\7\u00aa\2\2\u05de\u00d7"+
		"\3\2\2\2\u05df\u05e4\7v\2\2\u05e0\u05e1\5\u00dan\2\u05e1\u05e2\7#\2\2"+
		"\u05e2\u05e3\5\u008eH\2\u05e3\u05e5\3\2\2\2\u05e4\u05e0\3\2\2\2\u05e4"+
		"\u05e5\3\2\2\2\u05e5\u05ed\3\2\2\2\u05e6\u05e7\7$\2\2\u05e7\u05e8\5\u00da"+
		"n\2\u05e8\u05e9\7#\2\2\u05e9\u05ea\5\u008eH\2\u05ea\u05ec\3\2\2\2\u05eb"+
		"\u05e6\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2"+
		"\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f1\7\u00ab\2\2\u05f1"+
		"\u00d9\3\2\2\2\u05f2\u05f3\5\u01de\u00f0\2\u05f3\u00db\3\2\2\2\u05f4\u05f7"+
		"\7>\2\2\u05f5\u05f8\5\u00e8u\2\u05f6\u05f8\7\6\2\2\u05f7\u05f5\3\2\2\2"+
		"\u05f7\u05f6\3\2\2\2\u05f8\u00dd\3\2\2\2\u05f9\u05fa\5\u00e0q\2\u05fa"+
		"\u05fc\7{\2\2\u05fb\u05fd\7?\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2"+
		"\2\u05fd\u05ff\3\2\2\2\u05fe\u0600\5\u00e2r\2\u05ff\u05fe\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u0605\3\2\2\2\u0601\u0602\7$\2\2\u0602\u0604\5\u00e2"+
		"r\2\u0603\u0601\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u0609\7\u00bf"+
		"\2\2\u0609\u00df\3\2\2\2\u060a\u060b\5\u00e4s\2\u060b\u060c\5\u01de\u00f0"+
		"\2\u060c\u00e1\3\2\2\2\u060d\u060e\5\u008eH\2\u060e\u00e3\3\2\2\2\u060f"+
		"\u0610\5\u01de\u00f0\2\u0610\u0611\7A\2\2\u0611\u0613\3\2\2\2\u0612\u060f"+
		"\3\2\2\2\u0613\u0616\3\2\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615"+
		"\u00e5\3\2\2\2\u0616\u0614\3\2\2\2\u0617\u061c\5\u01de\u00f0\2\u0618\u0619"+
		"\7$\2\2\u0619\u061b\5\u01de\u00f0\2\u061a\u0618\3\2\2\2\u061b\u061e\3"+
		"\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u00e7\3\2\2\2\u061e"+
		"\u061c\3\2\2\2\u061f\u0620\5\u01de\u00f0\2\u0620\u00e9\3\2\2\2\u0621\u0626"+
		"\5\u01de\u00f0\2\u0622\u0623\7$\2\2\u0623\u0625\5\u01de\u00f0\2\u0624"+
		"\u0622\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u00eb\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062c\7/\2\2\u062a"+
		"\u062b\7\u0094\2\2\u062b\u062d\7\u00b5\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u0635\3\2\2\2\u062e\u0636\5\u0148\u00a5\2\u062f\u0636\5"+
		"\u0154\u00ab\2\u0630\u0636\5\u01a4\u00d3\2\u0631\u0636\5\u0120\u0091\2"+
		"\u0632\u0636\5\u0124\u0093\2\u0633\u0636\5\u01ba\u00de\2\u0634\u0636\5"+
		"\u01a8\u00d5\2\u0635\u062e\3\2\2\2\u0635\u062f\3\2\2\2\u0635\u0630\3\2"+
		"\2\2\u0635\u0631\3\2\2\2\u0635\u0632\3\2\2\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0634\3\2\2\2\u0636\u00ed\3\2\2\2\u0637\u063b\5\u00f0y\2\u0638\u063b"+
		"\5\u00f6|\2\u0639\u063b\5\u00f8}\2\u063a\u0637\3\2\2\2\u063a\u0638\3\2"+
		"\2\2\u063a\u0639\3\2\2\2\u063b\u00ef\3\2\2\2\u063c\u0647\5\u00f2z\2\u063d"+
		"\u0647\5\u00f4{\2\u063e\u0647\5\u0132\u009a\2\u063f\u0647\5\u017a\u00be"+
		"\2\u0640\u0647\5\u0136\u009c\2\u0641\u0647\5\u0134\u009b\2\u0642\u0647"+
		"\5\u01ae\u00d8\2\u0643\u0647\5\u01b0\u00d9\2\u0644\u0647\5\u0138\u009d"+
		"\2\u0645\u0647\5\u0142\u00a2\2\u0646\u063c\3\2\2\2\u0646\u063d\3\2\2\2"+
		"\u0646\u063e\3\2\2\2\u0646\u063f\3\2\2\2\u0646\u0640\3\2\2\2\u0646\u0641"+
		"\3\2\2\2\u0646\u0642\3\2\2\2\u0646\u0643\3\2\2\2\u0646\u0644\3\2\2\2\u0646"+
		"\u0645\3\2\2\2\u0647\u00f1\3\2\2\2\u0648\u0650\7D\2\2\u0649\u0651\5\u014a"+
		"\u00a6\2\u064a\u0651\5\u0156\u00ac\2\u064b\u0651\5\u01aa\u00d6\2\u064c"+
		"\u0651\5\u0122\u0092\2\u064d\u0651\5\u012e\u0098\2\u064e\u0651\5\u01bc"+
		"\u00df\2\u064f\u0651\5\u013e\u00a0\2\u0650\u0649\3\2\2\2\u0650\u064a\3"+
		"\2\2\2\u0650\u064b\3\2\2\2\u0650\u064c\3\2\2\2\u0650\u064d\3\2\2\2\u0650"+
		"\u064e\3\2\2\2\u0650\u064f\3\2\2\2\u0651\u00f3\3\2\2\2\u0652\u0658\7\21"+
		"\2\2\u0653\u0659\5\u01ac\u00d7\2\u0654\u0659\5\u01be\u00e0\2\u0655\u0659"+
		"\5\u015a\u00ae\2\u0656\u0659\5\u015c\u00af\2\u0657\u0659\5\u013a\u009e"+
		"\2\u0658\u0653\3\2\2\2\u0658\u0654\3\2\2\2\u0658\u0655\3\2\2\2\u0658\u0656"+
		"\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u00f5\3\2\2\2\u065a\u069d\7\u00ce\2"+
		"\2\u065b\u065c\7\20\2\2\u065c\u069e\5\u00fa~\2\u065d\u065e\7\u009e\2\2"+
		"\u065e\u065f\t\n\2\2\u065f\u069e\5\u014e\u00a8\2\u0660\u0661\7\35\2\2"+
		"\u0661\u069e\5\u0108\u0085\2\u0662\u0663\7\u00a9\2\2\u0663\u069e\5\u010a"+
		"\u0086\2\u0664\u0665\7\\\2\2\u0665\u069e\5\u010a\u0086\2\u0666\u0667\7"+
		"\u00d8\2\2\u0667\u069e\5\u010a\u0086\2\u0668\u0669\7\u009d\2\2\u0669\u069e"+
		"\5\u010a\u0086\2\u066a\u066b\7z\2\2\u066b\u069e\5\u010a\u0086\2\u066c"+
		"\u066d\7\u00e4\2\2\u066d\u069e\5\u010c\u0087\2\u066e\u066f\7\u00e5\2\2"+
		"\u066f\u069e\5\u0110\u0089\2\u0670\u0671\7p\2\2\u0671\u069e\5\u0110\u0089"+
		"\2\u0672\u0673\7\u0088\2\2\u0673\u069e\5\u00fc\177\2\u0674\u0675\7\u00a7"+
		"\2\2\u0675\u069e\5\u0102\u0082\2\u0676\u0677\7S\2\2\u0677\u069e\5\u0110"+
		"\u0089\2\u0678\u0679\7T\2\2\u0679\u069e\5\u010e\u0088\2\u067a\u067b\7"+
		"R\2\2\u067b\u069e\5\u010c\u0087\2\u067c\u067d\7\u00b2\2\2\u067d\u069e"+
		"\5\u00fe\u0080\2\u067e\u067f\7\u00b1\2\2\u067f\u069e\5\u0100\u0081\2\u0680"+
		"\u0681\7\36\2\2\u0681\u0682\7i\2\2\u0682\u069e\5\u0114\u008b\2\u0683\u069e"+
		"\5\u0108\u0085\2\u0684\u069e\5\u01b4\u00db\2\u0685\u069e\5\u016a\u00b6"+
		"\2\u0686\u069e\5\u010c\u0087\2\u0687\u069e\5\u0112\u008a\2\u0688\u069e"+
		"\5\u011e\u0090\2\u0689\u069e\5\u0114\u008b\2\u068a\u069e\5\u0116\u008c"+
		"\2\u068b\u069e\5\u01c0\u00e1\2\u068c\u069e\5\u0140\u00a1\2\u068d\u069e"+
		"\5\u016c\u00b7\2\u068e\u0692\t\n\2\2\u068f\u0693\5\u016e\u00b8\2\u0690"+
		"\u0693\5\u014e\u00a8\2\u0691\u0693\5\u016e\u00b8\2\u0692\u068f\3\2\2\2"+
		"\u0692\u0690\3\2\2\2\u0692\u0691\3\2\2\2\u0693\u069e\3\2\2\2\u0694\u0695"+
		"\7\u00e8\2\2\u0695\u0696\78\2\2\u0696\u069e\5\u0114\u008b\2\u0697\u069b"+
		"\t\13\2\2\u0698\u069c\5\u0170\u00b9\2\u0699\u069c\5\u0168\u00b5\2\u069a"+
		"\u069c\5\u0170\u00b9\2\u069b\u0698\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069a"+
		"\3\2\2\2\u069c\u069e\3\2\2\2\u069d\u065b\3\2\2\2\u069d\u065d\3\2\2\2\u069d"+
		"\u0660\3\2\2\2\u069d\u0662\3\2\2\2\u069d\u0664\3\2\2\2\u069d\u0666\3\2"+
		"\2\2\u069d\u0668\3\2\2\2\u069d\u066a\3\2\2\2\u069d\u066c\3\2\2\2\u069d"+
		"\u066e\3\2\2\2\u069d\u0670\3\2\2\2\u069d\u0672\3\2\2\2\u069d\u0674\3\2"+
		"\2\2\u069d\u0676\3\2\2\2\u069d\u0678\3\2\2\2\u069d\u067a\3\2\2\2\u069d"+
		"\u067c\3\2\2\2\u069d\u067e\3\2\2\2\u069d\u0680\3\2\2\2\u069d\u0683\3\2"+
		"\2\2\u069d\u0684\3\2\2\2\u069d\u0685\3\2\2\2\u069d\u0686\3\2\2\2\u069d"+
		"\u0687\3\2\2\2\u069d\u0688\3\2\2\2\u069d\u0689\3\2\2\2\u069d\u068a\3\2"+
		"\2\2\u069d\u068b\3\2\2\2\u069d\u068c\3\2\2\2\u069d\u068d\3\2\2\2\u069d"+
		"\u068e\3\2\2\2\u069d\u0694\3\2\2\2\u069d\u0697\3\2\2\2\u069e\u00f7\3\2"+
		"\2\2\u069f\u06a0\7\u00d7\2\2\u06a0\u06a1\5\u0118\u008d\2\u06a1\u00f9\3"+
		"\2\2\2\u06a2\u06a3\t\n\2\2\u06a3\u06a9\5\u014e\u00a8\2\u06a4\u06a9\5\u0108"+
		"\u0085\2\u06a5\u06a9\5\u010c\u0087\2\u06a6\u06a9\5\u0114\u008b\2\u06a7"+
		"\u06a9\5\u016c\u00b7\2\u06a8\u06a2\3\2\2\2\u06a8\u06a4\3\2\2\2\u06a8\u06a5"+
		"\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a7\3\2\2\2\u06a9\u00fb\3\2\2\2\u06aa"+
		"\u06ab\t\f\2\2\u06ab\u06b7\5\u0110\u0089\2\u06ac\u06ad\7p\2\2\u06ad\u06b7"+
		"\5\u010c\u0087\2\u06ae\u06af\7\u00a7\2\2\u06af\u06b7\5\u0102\u0082\2\u06b0"+
		"\u06b1\7S\2\2\u06b1\u06b7\5\u0110\u0089\2\u06b2\u06b3\7T\2\2\u06b3\u06b7"+
		"\5\u010e\u0088\2\u06b4\u06b5\7R\2\2\u06b5\u06b7\5\u010c\u0087\2\u06b6"+
		"\u06aa\3\2\2\2\u06b6\u06ac\3\2\2\2\u06b6\u06ae\3\2\2\2\u06b6\u06b0\3\2"+
		"\2\2\u06b6\u06b2\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7\u00fd\3\2\2\2\u06b8"+
		"\u06b9\t\f\2\2\u06b9\u06c5\5\u0110\u0089\2\u06ba\u06bb\7p\2\2\u06bb\u06c5"+
		"\5\u0110\u0089\2\u06bc\u06bd\7\u00a7\2\2\u06bd\u06c5\5\u0102\u0082\2\u06be"+
		"\u06bf\7S\2\2\u06bf\u06c5\5\u0110\u0089\2\u06c0\u06c1\7T\2\2\u06c1\u06c5"+
		"\5\u010e\u0088\2\u06c2\u06c3\7R\2\2\u06c3\u06c5\5\u010c\u0087\2\u06c4"+
		"\u06b8\3\2\2\2\u06c4\u06ba\3\2\2\2\u06c4\u06bc\3\2\2\2\u06c4\u06be\3\2"+
		"\2\2\u06c4\u06c0\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u00ff\3\2\2\2\u06c6"+
		"\u06c7\t\f\2\2\u06c7\u06d1\5\u0110\u0089\2\u06c8\u06c9\7p\2\2\u06c9\u06d1"+
		"\5\u0110\u0089\2\u06ca\u06cb\7\u00a7\2\2\u06cb\u06d1\5\u0102\u0082\2\u06cc"+
		"\u06cd\7S\2\2\u06cd\u06d1\5\u0110\u0089\2\u06ce\u06cf\7R\2\2\u06cf\u06d1"+
		"\5\u0110\u0089\2\u06d0\u06c6\3\2\2\2\u06d0\u06c8\3\2\2\2\u06d0\u06ca\3"+
		"\2\2\2\u06d0\u06cc\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d1\u0101\3\2\2\2\u06d2"+
		"\u06d3\t\r\2\2\u06d3\u06d4\5\u0110\u0089\2\u06d4\u0103\3\2\2\2\u06d5\u06d8"+
		"\5\u00e8u\2\u06d6\u06d7\7\24\2\2\u06d7\u06d9\5\u00e8u\2\u06d8\u06d6\3"+
		"\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u0105\3\2\2\2\u06da\u06e4\7\u00f2\2\2"+
		"\u06db\u06e5\7\u00da\2\2\u06dc\u06e1\5\u0104\u0083\2\u06dd\u06de\7$\2"+
		"\2\u06de\u06e0\5\u0104\u0083\2\u06df\u06dd\3\2\2\2\u06e0\u06e3\3\2\2\2"+
		"\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1"+
		"\3\2\2\2\u06e4\u06db\3\2\2\2\u06e4\u06dc\3\2\2\2\u06e5\u06f0\3\2\2\2\u06e6"+
		"\u06e7\7\u0095\2\2\u06e7\u06e8\7\37\2\2\u06e8\u06ed\5 \21\2\u06e9\u06ea"+
		"\7$\2\2\u06ea\u06ec\5 \21\2\u06eb\u06e9\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed"+
		"\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2"+
		"\2\2\u06f0\u06e6\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2"+
		"\u06f3\7\u00d0\2\2\u06f3\u06f5\5\u00d4k\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5"+
		"\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f7\7x\2\2\u06f7\u06f9\5\u00d4k\2"+
		"\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06fc"+
		"\5&\24\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u0107\3\2\2\2\u06fd"+
		"\u0707\t\16\2\2\u06fe\u0700\t\17\2\2\u06ff\u0701\7\u0096\2\2\u0700\u06ff"+
		"\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0708\3\2\2\2\u0702\u0704\5\u0106\u0084"+
		"\2\u0703\u0705\5\30\r\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0708\3\2\2\2\u0706\u0708\5&\24\2\u0707\u06fe\3\2\2\2\u0707\u0702\3\2"+
		"\2\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0109\3\2\2\2\u0709"+
		"\u070f\t\16\2\2\u070a\u070c\5\u0106\u0084\2\u070b\u070d\5\30\r\2\u070c"+
		"\u070b\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u0710\5&"+
		"\24\2\u070f\u070a\3\2\2\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710"+
		"\u010b\3\2\2\2\u0711\u071b\t\20\2\2\u0712\u0714\t\17\2\2\u0713\u0715\7"+
		"\u0096\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u071c\3\2\2\2"+
		"\u0716\u0718\5\u0106\u0084\2\u0717\u0719\5\30\r\2\u0718\u0717\3\2\2\2"+
		"\u0718\u0719\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u071c\5&\24\2\u071b\u0712"+
		"\3\2\2\2\u071b\u0716\3\2\2\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c"+
		"\u010d\3\2\2\2\u071d\u0722\t\20\2\2\u071e\u0720\t\17\2\2\u071f\u0721\7"+
		"\u0096\2\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0723\3\2\2\2"+
		"\u0722\u071e\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u010f\3\2\2\2\u0724\u072a"+
		"\t\20\2\2\u0725\u0727\5\u0106\u0084\2\u0726\u0728\5\30\r\2\u0727\u0726"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072b\3\2\2\2\u0729\u072b\5&\24\2\u072a"+
		"\u0725\3\2\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u0111\3\2"+
		"\2\2\u072c\u0736\t\21\2\2\u072d\u0734\7P\2\2\u072e\u0732\7\37\2\2\u072f"+
		"\u0730\7\61\2\2\u0730\u0733\7\u00e8\2\2\u0731\u0733\5\u01de\u00f0\2\u0732"+
		"\u072f\3\2\2\2\u0732\u0731\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u072e\3\2"+
		"\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736\u072d\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u073d\3\2\2\2\u0738\u073a\5\u0106\u0084\2\u0739\u073b"+
		"\5\30\r\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073e\3\2\2\2"+
		"\u073c\u073e\5&\24\2\u073d\u0738\3\2\2\2\u073d\u073c\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u0113\3\2\2\2\u073f\u0749\t\22\2\2\u0740\u0747\7P\2\2\u0741"+
		"\u0745\7\37\2\2\u0742\u0743\7\61\2\2\u0743\u0746\7\u00e8\2\2\u0744\u0746"+
		"\5\u01de\u00f0\2\u0745\u0742\3\2\2\2\u0745\u0744\3\2\2\2\u0746\u0748\3"+
		"\2\2\2\u0747\u0741\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a\3\2\2\2\u0749"+
		"\u0740\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u0750\3\2\2\2\u074b\u074d\5\u0106"+
		"\u0084\2\u074c\u074e\5\30\r\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2"+
		"\u074e\u0751\3\2\2\2\u074f\u0751\5&\24\2\u0750\u074b\3\2\2\2\u0750\u074f"+
		"\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0115\3\2\2\2\u0752\u0767\t\23\2\2"+
		"\u0753\u0768\5\u011a\u008e\2\u0754\u075a\5\u011c\u008f\2\u0755\u0757\5"+
		"\u0106\u0084\2\u0756\u0758\5\30\r\2\u0757\u0756\3\2\2\2\u0757\u0758\3"+
		"\2\2\2\u0758\u075b\3\2\2\2\u0759\u075b\5&\24\2\u075a\u0755\3\2\2\2\u075a"+
		"\u0759\3\2\2\2\u075b\u0763\3\2\2\2\u075c\u075e\5\u0106\u0084\2\u075d\u075f"+
		"\5\30\r\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0763\3\2\2\2"+
		"\u0760\u0763\5&\24\2\u0761\u0763\5\u011c\u008f\2\u0762\u0754\3\2\2\2\u0762"+
		"\u075c\3\2\2\2\u0762\u0760\3\2\2\2\u0762\u0761\3\2\2\2\u0763\u0765\3\2"+
		"\2\2\u0764\u0766\5\u011a\u008e\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2"+
		"\2\u0766\u0768\3\2\2\2\u0767\u0753\3\2\2\2\u0767\u0762\3\2\2\2\u0767\u0768"+
		"\3\2\2\2\u0768\u0117\3\2\2\2\u0769\u077e\t\23\2\2\u076a\u077f\5\u011a"+
		"\u008e\2\u076b\u0771\5\u011c\u008f\2\u076c\u076e\5\u0106\u0084\2\u076d"+
		"\u076f\5\30\r\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0772\3"+
		"\2\2\2\u0770\u0772\5&\24\2\u0771\u076c\3\2\2\2\u0771\u0770\3\2\2\2\u0772"+
		"\u077a\3\2\2\2\u0773\u0775\5\u0106\u0084\2\u0774\u0776\5\30\r\2\u0775"+
		"\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u077a\3\2\2\2\u0777\u077a\5&"+
		"\24\2\u0778\u077a\5\u011c\u008f\2\u0779\u076b\3\2\2\2\u0779\u0773\3\2"+
		"\2\2\u0779\u0777\3\2\2\2\u0779\u0778\3\2\2\2\u077a\u077c\3\2\2\2\u077b"+
		"\u077d\5\u011a\u008e\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077f"+
		"\3\2\2\2\u077e\u076a\3\2\2\2\u077e\u0779\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u0119\3\2\2\2\u0780\u0781\7\u00d7\2\2\u0781\u0785\5\u0118\u008d\2\u0782"+
		"\u0783\7\u00ce\2\2\u0783\u0785\5\u0116\u008c\2\u0784\u0780\3\2\2\2\u0784"+
		"\u0782\3\2\2\2\u0785\u011b\3\2\2\2\u0786\u0789\5\u01d2\u00ea\2\u0787\u0789"+
		"\5\u008eH\2\u0788\u0786\3\2\2\2\u0788\u0787\3\2\2\2\u0789\u011d\3\2\2"+
		"\2\u078a\u0799\t\24\2\2\u078b\u0791\5\u011c\u008f\2\u078c\u078e\5\u0106"+
		"\u0084\2\u078d\u078f\5\30\r\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2"+
		"\u078f\u0792\3\2\2\2\u0790\u0792\5&\24\2\u0791\u078c\3\2\2\2\u0791\u0790"+
		"\3\2\2\2\u0792\u079a\3\2\2\2\u0793\u0795\5\u0106\u0084\2\u0794\u0796\5"+
		"\30\r\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079a\3\2\2\2\u0797"+
		"\u079a\5&\24\2\u0798\u079a\5\u011c\u008f\2\u0799\u078b\3\2\2\2\u0799\u0793"+
		"\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a"+
		"\u011f\3\2\2\2\u079b\u07af\7)\2\2\u079c\u079d\7\u008f\2\2\u079d\u07b0"+
		"\7{\2\2\u079e\u079f\7Y\2\2\u079f\u07b0\7{\2\2\u07a0\u07a1\7f\2\2\u07a1"+
		"\u07a2\7\u008b\2\2\u07a2\u07a3\7T\2\2\u07a3\u07a4\t\25\2\2\u07a4\u07b0"+
		"\7{\2\2\u07a5\u07a7\5\u01de\u00f0\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3"+
		"\2\2\2\u07a7\u07ab\3\2\2\2\u07a8\u07a9\7f\2\2\u07a9\u07aa\7\u008b\2\2"+
		"\u07aa\u07ac\7T\2\2\u07ab\u07a8\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad"+
		"\3\2\2\2\u07ad\u07ae\t\25\2\2\u07ae\u07b0\7{\2\2\u07af\u079c\3\2\2\2\u07af"+
		"\u079e\3\2\2\2\u07af\u07a0\3\2\2\2\u07af\u07a6\3\2\2\2\u07b0\u07c5\3\2"+
		"\2\2\u07b1\u07b2\5\u00e8u\2\u07b2\u07b3\5n8\2\u07b3\u07b4\7\u00bf\2\2"+
		"\u07b4\u07c6\3\2\2\2\u07b5\u07b7\7\u00bf\2\2\u07b6\u07b8\5v<\2\u07b7\u07b6"+
		"\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\5x=\2\u07ba"+
		"\u07bb\7u\2\2\u07bb\u07bc\5\u00e8u\2\u07bc\u07bd\5n8\2\u07bd\u07be\7\u00aa"+
		"\2\2\u07be\u07c0\5x=\2\u07bf\u07c1\5z>\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1"+
		"\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\7{\2\2\u07c3\u07c4\7\u00bf\2"+
		"\2\u07c4\u07c6\3\2\2\2\u07c5\u07b1\3\2\2\2\u07c5\u07b5\3\2\2\2\u07c6\u07d7"+
		"\3\2\2\2\u07c7\u07c8\7\26\2\2\u07c8\u07c9\7T\2\2\u07c9\u07d8\5\u0130\u0099"+
		"\2\u07ca\u07cb\t\26\2\2\u07cb\u07cc\5\u0130\u0099\2\u07cc\u07d5\7n\2\2"+
		"\u07cd\u07d6\7\u00e4\2\2\u07ce\u07d6\7p\2\2\u07cf\u07d0\7\u0088\2\2\u07d0"+
		"\u07d6\t\27\2\2\u07d1\u07d2\t\30\2\2\u07d2\u07d6\t\27\2\2\u07d3\u07d4"+
		"\7\u008b\2\2\u07d4\u07d6\7\u008d\2\2\u07d5\u07cd\3\2\2\2\u07d5\u07ce\3"+
		"\2\2\2\u07d5\u07cf\3\2\2\2\u07d5\u07d1\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6"+
		"\u07d8\3\2\2\2\u07d7\u07c7\3\2\2\2\u07d7\u07ca\3\2\2\2\u07d8\u07db\3\2"+
		"\2\2\u07d9\u07da\7\u0092\2\2\u07da\u07dc\5\u01d8\u00ed\2\u07db\u07d9\3"+
		"\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u0121\3\2\2\2\u07dd\u0809\7)\2\2\u07de"+
		"\u07df\7\u008f\2\2\u07df\u07f4\7{\2\2\u07e0\u07e1\5\u00e8u\2\u07e1\u07e2"+
		"\5n8\2\u07e2\u07e3\7\u00bf\2\2\u07e3\u07f5\3\2\2\2\u07e4\u07e6\7\u00bf"+
		"\2\2\u07e5\u07e7\5v<\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8"+
		"\3\2\2\2\u07e8\u07e9\5x=\2\u07e9\u07ea\7u\2\2\u07ea\u07eb\5\u00e8u\2\u07eb"+
		"\u07ec\5n8\2\u07ec\u07ed\7\u00aa\2\2\u07ed\u07ef\5x=\2\u07ee\u07f0\5z"+
		">\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1"+
		"\u07f2\7{\2\2\u07f2\u07f3\7\u00bf\2\2\u07f3\u07f5\3\2\2\2\u07f4\u07e0"+
		"\3\2\2\2\u07f4\u07e4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u0802\7\26\2\2"+
		"\u07f7\u07f8\7T\2\2\u07f8\u0803\5\u0130\u0099\2\u07f9\u07fa\5\u0130\u0099"+
		"\2\u07fa\u0800\7n\2\2\u07fb\u0801\7\u00e4\2\2\u07fc\u07fd\7\u0088\2\2"+
		"\u07fd\u0801\7p\2\2\u07fe\u07ff\7\u008b\2\2\u07ff\u0801\7\u008d\2\2\u0800"+
		"\u07fb\3\2\2\2\u0800\u07fc\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u0803\3\2"+
		"\2\2\u0802\u07f7\3\2\2\2\u0802\u07f9\3\2\2\2\u0803\u080a\3\2\2\2\u0804"+
		"\u0807\5\u01de\u00f0\2\u0805\u0806\7f\2\2\u0806\u0808\7T\2\2\u0807\u0805"+
		"\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080a\3\2\2\2\u0809\u07de\3\2\2\2\u0809"+
		"\u0804\3\2\2\2\u080a\u0123\3\2\2\2\u080b\u080c\7\35\2\2\u080c\u080d\7"+
		"j\2\2\u080d\u0824\5\u0128\u0095\2\u080e\u080f\7\u00a9\2\2\u080f\u0810"+
		"\7j\2\2\u0810\u0824\5\u0128\u0095\2\u0811\u0812\7\\\2\2\u0812\u0813\7"+
		"j\2\2\u0813\u0824\5\u012a\u0096\2\u0814\u0815\7\u00d8\2\2\u0815\u0816"+
		"\7j\2\2\u0816\u0824\5\u0128\u0095\2\u0817\u0818\7\u009d\2\2\u0818\u0819"+
		"\7j\2\2\u0819\u0824\5\u0128\u0095\2\u081a\u081b\7z\2\2\u081b\u081c\7j"+
		"\2\2\u081c\u0824\5\u012c\u0097\2\u081d\u0821\7j\2\2\u081e\u081f\7\u008f"+
		"\2\2\u081f\u0822\5\u0126\u0094\2\u0820\u0822\5\u0128\u0095\2\u0821\u081e"+
		"\3\2\2\2\u0821\u0820\3\2\2\2\u0822\u0824\3\2\2\2\u0823\u080b\3\2\2\2\u0823"+
		"\u080e\3\2\2\2\u0823\u0811\3\2\2\2\u0823\u0814\3\2\2\2\u0823\u0817\3\2"+
		"\2\2\u0823\u081a\3\2\2\2\u0823\u081d\3\2\2\2\u0824\u0125\3\2\2\2\u0825"+
		"\u0826\5n8\2\u0826\u0827\7{\2\2\u0827\u0828\5\u01dc\u00ef\2\u0828\u0829"+
		"\7\u00bf\2\2\u0829\u0127\3\2\2\2\u082a\u082b\7Y\2\2\u082b\u083b\7{\2\2"+
		"\u082c\u082d\7f\2\2\u082d\u082e\7\u008b\2\2\u082e\u082f\7T\2\2\u082f\u0830"+
		"\7Y\2\2\u0830\u083b\7{\2\2\u0831\u0835\5\u01de\u00f0\2\u0832\u0833\7f"+
		"\2\2\u0833\u0834\7\u008b\2\2\u0834\u0836\7T\2\2\u0835\u0832\3\2\2\2\u0835"+
		"\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\7Y\2\2\u0838\u0839\7{\2"+
		"\2\u0839\u083b\3\2\2\2\u083a\u082a\3\2\2\2\u083a\u082c\3\2\2\2\u083a\u0831"+
		"\3\2\2\2\u083b\u0850\3\2\2\2\u083c\u083d\5\u00e8u\2\u083d\u083e\5n8\2"+
		"\u083e\u083f\7\u00bf\2\2\u083f\u0851\3\2\2\2\u0840\u0842\7\u00bf\2\2\u0841"+
		"\u0843\5v<\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2"+
		"\2\u0844\u0845\5x=\2\u0845\u0846\7u\2\2\u0846\u0847\5\u00e8u\2\u0847\u0848"+
		"\5n8\2\u0848\u0849\7\u00aa\2\2\u0849\u084b\5x=\2\u084a\u084c\5z>\2\u084b"+
		"\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\7{"+
		"\2\2\u084e\u084f\7\u00bf\2\2\u084f\u0851\3\2\2\2\u0850\u083c\3\2\2\2\u0850"+
		"\u0840\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\7\u008f\2\2\u0853\u0856"+
		"\5\u0130\u0099\2\u0854\u0855\7\u0092\2\2\u0855\u0857\5\u01d8\u00ed\2\u0856"+
		"\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0859\5\u0124"+
		"\u0093\2\u0859\u0129\3\2\2\2\u085a\u085b\7Y\2\2\u085b\u086b\7{\2\2\u085c"+
		"\u085d\7f\2\2\u085d\u085e\7\u008b\2\2\u085e\u085f\7T\2\2\u085f\u0860\7"+
		"Y\2\2\u0860\u086b\7{\2\2\u0861\u0865\5\u01de\u00f0\2\u0862\u0863\7f\2"+
		"\2\u0863\u0864\7\u008b\2\2\u0864\u0866\7T\2\2\u0865\u0862\3\2\2\2\u0865"+
		"\u0866\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\7Y\2\2\u0868\u0869\7{\2"+
		"\2\u0869\u086b\3\2\2\2\u086a\u085a\3\2\2\2\u086a\u085c\3\2\2\2\u086a\u0861"+
		"\3\2\2\2\u086b\u0880\3\2\2\2\u086c\u086d\5\u00e8u\2\u086d\u086e\5p9\2"+
		"\u086e\u086f\7\u00bf\2\2\u086f\u0881\3\2\2\2\u0870\u0872\7\u00bf\2\2\u0871"+
		"\u0873\5v<\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2"+
		"\2\u0874\u0875\5x=\2\u0875\u0876\7u\2\2\u0876\u0877\5\u00e8u\2\u0877\u0878"+
		"\5p9\2\u0878\u0879\7\u00aa\2\2\u0879\u087b\5x=\2\u087a\u087c\5z";
	private static final String _serializedATNSegment1 =
		">\2\u087b\u087a\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\3\2\2\2\u087d"+
		"\u087e\7{\2\2\u087e\u087f\7\u00bf\2\2\u087f\u0881\3\2\2\2\u0880\u086c"+
		"\3\2\2\2\u0880\u0870\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883\7\u008f\2"+
		"\2\u0883\u0884\7G\2\2\u0884\u0885\7u\2\2\u0885\u0886\5\u00e8u\2\u0886"+
		"\u088d\5\u00aaV\2\u0887\u0888\7$\2\2\u0888\u0889\5\u00e8u\2\u0889\u088a"+
		"\5\u00aaV\2\u088a\u088c\3\2\2\2\u088b\u0887\3\2\2\2\u088c\u088f\3\2\2"+
		"\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0890\3\2\2\2\u088f\u088d"+
		"\3\2\2\2\u0890\u0893\7\u00aa\2\2\u0891\u0892\7\u0092\2\2\u0892\u0894\5"+
		"\u01d8\u00ed\2\u0893\u0891\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895\3\2"+
		"\2\2\u0895\u0896\5\u012a\u0096\2\u0896\u012b\3\2\2\2\u0897\u0898\7Y\2"+
		"\2\u0898\u08a8\7{\2\2\u0899\u089a\7f\2\2\u089a\u089b\7\u008b\2\2\u089b"+
		"\u089c\7T\2\2\u089c\u089d\7Y\2\2\u089d\u08a8\7{\2\2\u089e\u08a2\5\u01de"+
		"\u00f0\2\u089f\u08a0\7f\2\2\u08a0\u08a1\7\u008b\2\2\u08a1\u08a3\7T\2\2"+
		"\u08a2\u089f\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5"+
		"\7Y\2\2\u08a5\u08a6\7{\2\2\u08a6\u08a8\3\2\2\2\u08a7\u0897\3\2\2\2\u08a7"+
		"\u0899\3\2\2\2\u08a7\u089e\3\2\2\2\u08a8\u08c0\3\2\2\2\u08a9\u08aa\5\u00e8"+
		"u\2\u08aa\u08ab\7\u00bf\2\2\u08ab\u08ac\7\u008f\2\2\u08ac\u08ad\7G\2\2"+
		"\u08ad\u08c1\3\2\2\2\u08ae\u08b0\7\u00bf\2\2\u08af\u08b1\5v<\2\u08b0\u08af"+
		"\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\5x=\2\u08b3"+
		"\u08b4\7u\2\2\u08b4\u08b5\5\u00e8u\2\u08b5\u08b6\7\u00aa\2\2\u08b6\u08b8"+
		"\5x=\2\u08b7\u08b9\5z>\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9"+
		"\u08ba\3\2\2\2\u08ba\u08bb\7{\2\2\u08bb\u08bc\7\u00bf\2\2\u08bc\u08be"+
		"\7\u008f\2\2\u08bd\u08bf\7G\2\2\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2\2"+
		"\2\u08bf\u08c1\3\2\2\2\u08c0\u08a9\3\2\2\2\u08c0\u08ae\3\2\2\2\u08c1\u08c2"+
		"\3\2\2\2\u08c2\u08c3\5\u01de\u00f0\2\u08c3\u08c4\7{\2\2\u08c4\u08c5\5"+
		"\u00e8u\2\u08c5\u08c8\7\u00bf\2\2\u08c6\u08c7\7\u0092\2\2\u08c7\u08c9"+
		"\5\u01d8\u00ed\2\u08c8\u08c6\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3"+
		"\2\2\2\u08ca\u08cb\5\u012c\u0097\2\u08cb\u012d\3\2\2\2\u08cc\u08d8\7j"+
		"\2\2\u08cd\u08ce\7\u008f\2\2\u08ce\u08cf\5n8\2\u08cf\u08d0\7{\2\2\u08d0"+
		"\u08d1\5\u01dc\u00ef\2\u08d1\u08d2\7\u00bf\2\2\u08d2\u08d9\3\2\2\2\u08d3"+
		"\u08d6\5\u01de\u00f0\2\u08d4\u08d5\7f\2\2\u08d5\u08d7\7T\2\2\u08d6\u08d4"+
		"\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08cd\3\2\2\2\u08d8"+
		"\u08d3\3\2\2\2\u08d9\u012f\3\2\2\2\u08da\u08db\5\u00e8u\2\u08db\u08dc"+
		"\5\u00aaV\2\u08dc\u08ec\3\2\2\2\u08dd\u08de\7{\2\2\u08de\u08df\5\u00e8"+
		"u\2\u08df\u08e6\5\u00aaV\2\u08e0\u08e1\7$\2\2\u08e1\u08e2\5\u00e8u\2\u08e2"+
		"\u08e3\5\u00aaV\2\u08e3\u08e5\3\2\2\2\u08e4\u08e0\3\2\2\2\u08e5\u08e8"+
		"\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e9\3\2\2\2\u08e8"+
		"\u08e6\3\2\2\2\u08e9\u08ea\7\u00bf\2\2\u08ea\u08ec\3\2\2\2\u08eb\u08da"+
		"\3\2\2\2\u08eb\u08dd\3\2\2\2\u08ec\u0131\3\2\2\2\u08ed\u08f1\7\u00af\2"+
		"\2\u08ee\u08f2\5\u014c\u00a7\2\u08ef\u08f2\5\u0158\u00ad\2\u08f0\u08f2"+
		"\5\u013c\u009f\2\u08f1\u08ee\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f0\3"+
		"\2\2\2\u08f2\u0133\3\2\2\2\u08f3\u0904\7`\2\2\u08f4\u08f8\7h\2\2\u08f5"+
		"\u08f9\5\u0178\u00bd\2\u08f6\u08f7\7\u00bb\2\2\u08f7\u08f9\5\u0172\u00ba"+
		"\2\u08f8\u08f5\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u0905\3\2\2\2\u08fa\u0903"+
		"\5\u0178\u00bd\2\u08fb\u08fe\7\u00bb\2\2\u08fc\u08ff\5\u0172\u00ba\2\u08fd"+
		"\u08ff\5\u0150\u00a9\2\u08fe\u08fc\3\2\2\2\u08fe\u08fd\3\2\2\2\u08ff\u0903"+
		"\3\2\2\2\u0900\u0901\7\u00bc\2\2\u0901\u0903\5\u0150\u00a9\2\u0902\u08fa"+
		"\3\2\2\2\u0902\u08fb\3\2\2\2\u0902\u0900\3\2\2\2\u0903\u0905\3\2\2\2\u0904"+
		"\u08f4\3\2\2\2\u0904\u0902\3\2\2\2\u0905\u0135\3\2\2\2\u0906\u0926\7\u00ba"+
		"\2\2\u0907\u0909\7:\2\2\u0908\u090a\7h\2\2\u0909\u0908\3\2\2\2\u0909\u090a"+
		"\3\2\2\2\u090a\u090e\3\2\2\2\u090b\u090f\5\u017c\u00bf\2\u090c\u090d\7"+
		"\u00bb\2\2\u090d\u090f\5\u0174\u00bb\2\u090e\u090b\3\2\2\2\u090e\u090c"+
		"\3\2\2\2\u090f\u0927\3\2\2\2\u0910\u0912\7`\2\2\u0911\u0913\7h\2\2\u0912"+
		"\u0911\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0917\3\2\2\2\u0914\u0918\5\u017c"+
		"\u00bf\2\u0915\u0916\7\u00bb\2\2\u0916\u0918\5\u0174\u00bb\2\u0917\u0914"+
		"\3\2\2\2\u0917\u0915\3\2\2\2\u0918\u0927\3\2\2\2\u0919\u091d\7h\2\2\u091a"+
		"\u091e\5\u017c\u00bf\2\u091b\u091c\7\u00bb\2\2\u091c\u091e\5\u0174\u00bb"+
		"\2\u091d\u091a\3\2\2\2\u091d\u091b\3\2\2\2\u091e\u0927\3\2\2\2\u091f\u0925"+
		"\5\u017c\u00bf\2\u0920\u0921\7\u00bb\2\2\u0921\u0925\5\u0174\u00bb\2\u0922"+
		"\u0923\t\n\2\2\u0923\u0925\5\u0152\u00aa\2\u0924\u091f\3\2\2\2\u0924\u0920"+
		"\3\2\2\2\u0924\u0922\3\2\2\2\u0925\u0927\3\2\2\2\u0926\u0907\3\2\2\2\u0926"+
		"\u0910\3\2\2\2\u0926\u0919\3\2\2\2\u0926\u0924\3\2\2\2\u0927\u0137\3\2"+
		"\2\2\u0928\u0929\7H\2\2\u0929\u092a\7\u00c8\2\2\u092a\u092c\5\u01d6\u00ec"+
		"\2\u092b\u092d\5\u01a6\u00d4\2\u092c\u092b\3\2\2\2\u092c\u092d\3\2\2\2"+
		"\u092d\u0139\3\2\2\2\u092e\u092f\7\u00c8\2\2\u092f\u0930\5\u01d6\u00ec"+
		"\2\u0930\u0931\7\u00ca\2\2\u0931\u0932\5\u01a6\u00d4\2\u0932\u013b\3\2"+
		"\2\2\u0933\u0934\7\u00c8\2\2\u0934\u0935\5\u01d6\u00ec\2\u0935\u0936\7"+
		"\u00db\2\2\u0936\u0937\5\u01d6\u00ec\2\u0937\u013d\3\2\2\2\u0938\u0939"+
		"\7\u00c8\2\2\u0939\u093a\5\u01d6\u00ec\2\u093a\u013f\3\2\2\2\u093b\u0941"+
		"\t\31\2\2\u093c\u093e\5\u0106\u0084\2\u093d\u093f\5\30\r\2\u093e\u093d"+
		"\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0942\3\2\2\2\u0940\u0942\5&\24\2\u0941"+
		"\u093c\3\2\2\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0141\3\2"+
		"\2\2\u0943\u0945\7E\2\2\u0944\u0943\3\2\2\2\u0944\u0945\3\2\2\2\u0945"+
		"\u0948\3\2\2\2\u0946\u0949\5\u0144\u00a3\2\u0947\u0949\5\u0146\u00a4\2"+
		"\u0948\u0946\3\2\2\2\u0948\u0947\3\2\2\2\u0949\u0143\3\2\2\2\u094a\u094b"+
		"\7\66\2\2\u094b\u094c\t\32\2\2\u094c\u094d\7[\2\2\u094d\u094e\t\31\2\2"+
		"\u094e\u0953\5\u01d6\u00ec\2\u094f\u0950\7$\2\2\u0950\u0952\5\u01d6\u00ec"+
		"\2\u0951\u094f\3\2\2\2\u0952\u0955\3\2\2\2\u0953\u0951\3\2\2\2\u0953\u0954"+
		"\3\2\2\2\u0954\u0145\3\2\2\2\u0955\u0953\3\2\2\2\u0956\u0957\7\u00ad\2"+
		"\2\u0957\u0958\t\32\2\2\u0958\u0147\3\2\2\2\u0959\u095a\7\u00bb\2\2\u095a"+
		"\u095e\5\u01c8\u00e5\2\u095b\u095c\7f\2\2\u095c\u095d\7\u008b\2\2\u095d"+
		"\u095f\7T\2\2\u095e\u095b\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0964\3\2"+
		"\2\2\u0960\u0961\7\24\2\2\u0961\u0962\7,\2\2\u0962\u0963\7\u008e\2\2\u0963"+
		"\u0965\5\u01c8\u00e5\2\u0964\u0960\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0149"+
		"\3\2\2\2\u0966\u0967\7\u00bb\2\2\u0967\u096a\5\u01c8\u00e5\2\u0968\u0969"+
		"\7f\2\2\u0969\u096b\7T\2\2\u096a\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b"+
		"\u014b\3\2\2\2\u096c\u096d\7\u00bb\2\2\u096d\u0970\5\u01c8\u00e5\2\u096e"+
		"\u096f\7f\2\2\u096f\u0971\7T\2\2\u0970\u096e\3\2\2\2\u0970\u0971\3\2\2"+
		"\2\u0971\u0972\3\2\2\2\u0972\u0973\7\u00db\2\2\u0973\u0974\5\u01c8\u00e5"+
		"\2\u0974\u014d\3\2\2\2\u0975\u0976\7\u00ef\2\2\u0976\u0978\t\13\2\2\u0977"+
		"\u0975\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u097e\3\2\2\2\u0979\u097b\5\u0106"+
		"\u0084\2\u097a\u097c\5\30\r\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2"+
		"\u097c\u097f\3\2\2\2\u097d\u097f\5&\24\2\u097e\u0979\3\2\2\2\u097e\u097d"+
		"\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u014f\3\2\2\2\u0980\u0981\5\u01c6\u00e4"+
		"\2\u0981\u0982\7\u00db\2\2\u0982\u0983\5\u01c6\u00e4\2\u0983\u0151\3\2"+
		"\2\2\u0984\u0985\5\u01c6\u00e4\2\u0985\u0986\7[\2\2\u0986\u0987\5\u01c6"+
		"\u00e4\2\u0987\u0153\3\2\2\2\u0988\u0989\7\u00e8\2\2\u0989\u098d\5\u01c8"+
		"\u00e5\2\u098a\u098b\7f\2\2\u098b\u098c\7\u008b\2\2\u098c\u098e\7T\2\2"+
		"\u098d\u098a\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0991"+
		"\7\u00ca\2\2\u0990\u0992\t\33\2\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2"+
		"\2\2\u0992\u0993\3\2\2\2\u0993\u0994\7\u0097\2\2\u0994\u0996\5\u0160\u00b1"+
		"\2\u0995\u0997\5\u0162\u00b2\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2"+
		"\u0997\u09a1\3\2\2\2\u0998\u099d\7\u00ca\2\2\u0999\u099a\7\u0097\2\2\u099a"+
		"\u099e\5\u0162\u00b2\2\u099b\u099e\5\u0164\u00b3\2\u099c\u099e\5\u0166"+
		"\u00b4\2\u099d\u0999\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099c\3\2\2\2\u099e"+
		"\u09a0\3\2\2\2\u099f\u0998\3\2\2\2\u09a0\u09a3\3\2\2\2\u09a1\u099f\3\2"+
		"\2\2\u09a1\u09a2\3\2\2\2\u09a2\u0155\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a4"+
		"\u09a5\7\u00e8\2\2\u09a5\u09a8\5\u01c8\u00e5\2\u09a6\u09a7\7f\2\2\u09a7"+
		"\u09a9\7T\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u0157\3\2"+
		"\2\2\u09aa\u09ab\7\u00e8\2\2\u09ab\u09ae\5\u01c8\u00e5\2\u09ac\u09ad\7"+
		"f\2\2\u09ad\u09af\7T\2\2\u09ae\u09ac\3\2\2\2\u09ae\u09af\3\2\2\2\u09af"+
		"\u09b0\3\2\2\2\u09b0\u09b1\7\u00db\2\2\u09b1\u09b2\5\u01c8\u00e5\2\u09b2"+
		"\u0159\3\2\2\2\u09b3\u09b4\7\61\2\2\u09b4\u09b5\7\u00e8\2\2\u09b5\u09b6"+
		"\7\u00ca\2\2\u09b6\u09b7\7\u0097\2\2\u09b7\u09b8\7[\2\2\u09b8\u09b9\5"+
		"\u0160\u00b1\2\u09b9\u09ba\7\u00db\2\2\u09ba\u09bb\5\u0160\u00b1\2\u09bb"+
		"\u015b\3\2\2\2\u09bc\u09bd\7\u00e8\2\2\u09bd\u09c0\5\u01c8\u00e5\2\u09be"+
		"\u09bf\7f\2\2\u09bf\u09c1\7T\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2"+
		"\2\u09c1\u09e2\3\2\2\2\u09c2\u09d9\7\u00ca\2\2\u09c3\u09c4\7\u009a\2\2"+
		"\u09c4\u09c5\7\u0097\2\2\u09c5\u09c7\5\u015e\u00b0\2\u09c6\u09c8\5\u0162"+
		"\u00b2\2\u09c7\u09c6\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09da\3\2\2\2\u09c9"+
		"\u09ca\7L\2\2\u09ca\u09cb\7\u0097\2\2\u09cb\u09cd\5\u015e\u00b0\2\u09cc"+
		"\u09ce\5\u0162\u00b2\2\u09cd\u09cc\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09da"+
		"\3\2\2\2\u09cf\u09d5\7\u0097\2\2\u09d0\u09d6\5\u0162\u00b2\2\u09d1\u09d3"+
		"\5\u015e\u00b0\2\u09d2\u09d4\5\u0162\u00b2\2\u09d3\u09d2\3\2\2\2\u09d3"+
		"\u09d4\3\2\2\2\u09d4\u09d6\3\2\2\2\u09d5\u09d0\3\2\2\2\u09d5\u09d1\3\2"+
		"\2\2\u09d6\u09da\3\2\2\2\u09d7\u09da\5\u0164\u00b3\2\u09d8\u09da\5\u0166"+
		"\u00b4\2\u09d9\u09c3\3\2\2\2\u09d9\u09c9\3\2\2\2\u09d9\u09cf\3\2\2\2\u09d9"+
		"\u09d7\3\2\2\2\u09d9\u09d8\3\2\2\2\u09da\u09dc\3\2\2\2\u09db\u09c2\3\2"+
		"\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09db\3\2\2\2\u09dd\u09de\3\2\2\2\u09de"+
		"\u09e3\3\2\2\2\u09df\u09e0\7\u00b4\2\2\u09e0\u09e1\7e\2\2\u09e1\u09e3"+
		"\7\63\2\2\u09e2\u09db\3\2\2\2\u09e2\u09df\3\2\2\2\u09e3\u015d\3\2\2\2"+
		"\u09e4\u09e5\5\u0160\u00b1\2\u09e5\u015f\3\2\2\2\u09e6\u09e9\5\u01d4\u00eb"+
		"\2\u09e7\u09e9\5\u00dco\2\u09e8\u09e6\3\2\2\2\u09e8\u09e7\3\2\2\2\u09e9"+
		"\u0161\3\2\2\2\u09ea\u09ec\7\"\2\2\u09eb\u09ed\7\u008b\2\2\u09ec\u09eb"+
		"\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\7\u00b8\2"+
		"\2\u09ef\u0163\3\2\2\2\u09f0\u09f1\7\u00d3\2\2\u09f1\u09f2\t\34\2\2\u09f2"+
		"\u0165\3\2\2\2\u09f3\u09f4\7e\2\2\u09f4\u09f5\7\63\2\2\u09f5\u09f6\5\u01c4"+
		"\u00e3\2\u09f6\u0167\3\2\2\2\u09f7\u09f9\5\u0106\u0084\2\u09f8\u09fa\5"+
		"\30\r\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fd\3\2\2\2\u09fb"+
		"\u09fd\5&\24\2\u09fc\u09f7\3\2\2\2\u09fc\u09fb\3\2\2\2\u09fc\u09fd\3\2"+
		"\2\2\u09fd\u0169\3\2\2\2\u09fe\u09ff\7\61\2\2\u09ff\u0a05\7\u00e8\2\2"+
		"\u0a00\u0a02\5\u0106\u0084\2\u0a01\u0a03\5\30\r\2\u0a02\u0a01\3\2\2\2"+
		"\u0a02\u0a03\3\2\2\2\u0a03\u0a06\3\2\2\2\u0a04\u0a06\5&\24\2\u0a05\u0a00"+
		"\3\2\2\2\u0a05\u0a04\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06\u016b\3\2\2\2\u0a07"+
		"\u0a0d\t\35\2\2\u0a08\u0a0a\7\24\2\2\u0a09\u0a0b\7\u00ba\2\2\u0a0a\u0a09"+
		"\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\t\36\2\2"+
		"\u0a0d\u0a08\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a14\3\2\2\2\u0a0f\u0a11"+
		"\5\u0106\u0084\2\u0a10\u0a12\5\30\r\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12"+
		"\3\2\2\2\u0a12\u0a15\3\2\2\2\u0a13\u0a15\5&\24\2\u0a14\u0a0f\3\2\2\2\u0a14"+
		"\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u016d\3\2\2\2\u0a16\u0a17\5\u01c6"+
		"\u00e4\2\u0a17\u0a1d\t\35\2\2\u0a18\u0a1a\7\24\2\2\u0a19\u0a1b\7\u00ba"+
		"\2\2\u0a1a\u0a19\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c"+
		"\u0a1e\t\36\2\2\u0a1d\u0a18\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a24\3"+
		"\2\2\2\u0a1f\u0a21\5\u0106\u0084\2\u0a20\u0a22\5\30\r\2\u0a21\u0a20\3"+
		"\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a25\3\2\2\2\u0a23\u0a25\5&\24\2\u0a24"+
		"\u0a1f\3\2\2\2\u0a24\u0a23\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u016f\3\2"+
		"\2\2\u0a26\u0a27\5\u01c6\u00e4\2\u0a27\u0a28\t\35\2\2\u0a28\u0a2e\3\2"+
		"\2\2\u0a29\u0a2e\t\35\2\2\u0a2a\u0a2b\5\u01c6\u00e4\2\u0a2b\u0a2c\t\35"+
		"\2\2\u0a2c\u0a2e\3\2\2\2\u0a2d\u0a26\3\2\2\2\u0a2d\u0a29\3\2\2\2\u0a2d"+
		"\u0a2a\3\2\2\2\u0a2e\u0a34\3\2\2\2\u0a2f\u0a31\7\24\2\2\u0a30\u0a32\7"+
		"\u00ba\2\2\u0a31\u0a30\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a33\3\2\2\2"+
		"\u0a33\u0a35\t\36\2\2\u0a34\u0a2f\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a3b"+
		"\3\2\2\2\u0a36\u0a38\5\u0106\u0084\2\u0a37\u0a39\5\30\r\2\u0a38\u0a37"+
		"\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3c\3\2\2\2\u0a3a\u0a3c\5&\24\2\u0a3b"+
		"\u0a36\3\2\2\2\u0a3b\u0a3a\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0171\3\2"+
		"\2\2\u0a3d\u0a3e\5\u0176\u00bc\2\u0a3e\u0a3f\7\u00db\2\2\u0a3f\u0a40\5"+
		"\u01c6\u00e4\2\u0a40\u0a41\5\u0178\u00bd\2\u0a41\u0173\3\2\2\2\u0a42\u0a43"+
		"\5\u0176\u00bc\2\u0a43\u0a44\7[\2\2\u0a44\u0a45\5\u01c6\u00e4\2\u0a45"+
		"\u0175\3\2\2\2\u0a46\u0a47\7}\2\2\u0a47\u0a48\7\u008f\2\2\u0a48\u0a49"+
		"\7\65\2\2\u0a49\u0a4a\5\u0190\u00c9\2\u0a4a\u0177\3\2\2\2\u0a4b\u0a4c"+
		"\5\u017e\u00c0\2\u0a4c\u0a4d\7\u00db\2\2\u0a4d\u0a4e\5\u01c6\u00e4\2\u0a4e"+
		"\u0a4f\5\u0178\u00bd\2\u0a4f\u0179\3\2\2\2\u0a50\u0a52\7:\2\2\u0a51\u0a53"+
		"\7h\2\2\u0a52\u0a51\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a57\3\2\2\2\u0a54"+
		"\u0a58\5\u017e\u00c0\2\u0a55\u0a56\7\u00bb\2\2\u0a56\u0a58\5\u0176\u00bc"+
		"\2\u0a57\u0a54\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a"+
		"\7\u00db\2\2\u0a5a\u0a5b\5\u01c6\u00e4\2\u0a5b\u017b\3\2\2\2\u0a5c\u0a5d"+
		"\5\u017e\u00c0\2\u0a5d\u0a5e\7[\2\2\u0a5e\u0a5f\5\u01c6\u00e4\2\u0a5f"+
		"\u017d\3\2\2\2\u0a60\u0a6c\5\u0180\u00c1\2\u0a61\u0a6c\5\u0182\u00c2\2"+
		"\u0a62\u0a6c\5\u0184\u00c3\2\u0a63\u0a6c\5\u0186\u00c4\2\u0a64\u0a6c\5"+
		"\u0188\u00c5\2\u0a65\u0a6c\5\u018a\u00c6\2\u0a66\u0a6c\5\u018e\u00c8\2"+
		"\u0a67\u0a6c\5\u0190\u00c9\2\u0a68\u0a6c\5\u018c\u00c7\2\u0a69\u0a6c\5"+
		"\u019c\u00cf\2\u0a6a\u0a6c\5\u019a\u00ce\2\u0a6b\u0a60\3\2\2\2\u0a6b\u0a61"+
		"\3\2\2\2\u0a6b\u0a62\3\2\2\2\u0a6b\u0a63\3\2\2\2\u0a6b\u0a64\3\2\2\2\u0a6b"+
		"\u0a65\3\2\2\2\u0a6b\u0a66\3\2\2\2\u0a6b\u0a67\3\2\2\2\u0a6b\u0a68\3\2"+
		"\2\2\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6a\3\2\2\2\u0a6c\u017f\3\2\2\2\u0a6d"+
		"\u0a72\7\20\2\2\u0a6e\u0a70\t\37\2\2\u0a6f\u0a6e\3\2\2\2\u0a6f\u0a70\3"+
		"\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a73\7\u00a3\2\2\u0a72\u0a6f\3\2\2\2"+
		"\u0a72\u0a73\3\2\2\2\u0a73\u0a74\3\2\2\2\u0a74\u0a8e\7\u008f\2\2\u0a75"+
		"\u0a79\7\67\2\2\u0a76\u0a7a\7a\2\2\u0a77\u0a78\7\63\2\2\u0a78\u0a7a\5"+
		"\u018e\u00c8\2\u0a79\u0a76\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a7a\u0a8f\3\2"+
		"\2\2\u0a7b\u0a7f\7e\2\2\u0a7c\u0a80\7a\2\2\u0a7d\u0a7e\7\63\2\2\u0a7e"+
		"\u0a80\5\u018e\u00c8\2\u0a7f\u0a7c\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a80\u0a8f"+
		"\3\2\2\2\u0a81\u0a82\7\65\2\2\u0a82\u0a8f\5\u0190\u00c9\2\u0a83\u0a86"+
		"\t \2\2\u0a84\u0a87\7\u00da\2\2\u0a85\u0a87\5\u01c2\u00e2\2\u0a86\u0a84"+
		"\3\2\2\2\u0a86\u0a85\3\2\2\2\u0a87\u0a8f\3\2\2\2\u0a88\u0a8b\t\32\2\2"+
		"\u0a89\u0a8c\7\u00da\2\2\u0a8a\u0a8c\5\u01c2\u00e2\2\u0a8b\u0a89\3\2\2"+
		"\2\u0a8b\u0a8a\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a8f\5\u018e\u00c8\2"+
		"\u0a8e\u0a75\3\2\2\2\u0a8e\u0a7b\3\2\2\2\u0a8e\u0a81\3\2\2\2\u0a8e\u0a83"+
		"\3\2\2\2\u0a8e\u0a88\3\2\2\2\u0a8f\u0181\3\2\2\2\u0a90\u0ab7\7/\2\2\u0a91"+
		"\u0aa3\t\16\2\2\u0a92\u0aa3\t\20\2\2\u0a93\u0aa0\7\u0087\2\2\u0a94\u0a96"+
		"\7\u0088\2\2\u0a95\u0a94\3\2\2\2\u0a95\u0a96\3\2\2\2\u0a96\u0a97\3\2\2"+
		"\2\u0a97\u0aa1\t!\2\2\u0a98\u0a9a\7\u00b2\2\2\u0a99\u0a98\3\2\2\2\u0a99"+
		"\u0a9a\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0aa1\t\"\2\2\u0a9c\u0a9e\7\u00a7"+
		"\2\2\u0a9d\u0a9c\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f"+
		"\u0aa1\t#\2\2\u0aa0\u0a95\3\2\2\2\u0aa0\u0a99\3\2\2\2\u0aa0\u0a9d\3\2"+
		"\2\2\u0aa1\u0aa3\3\2\2\2\u0aa2\u0a91\3\2\2\2\u0aa2\u0a92\3\2\2\2\u0aa2"+
		"\u0a93\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa5\7\u008f\2\2\u0aa5\u0aa6"+
		"\5\u01b6\u00dc\2\u0aa6\u0aa7\5\u018e\u00c8\2\u0aa7\u0ab8\3\2\2\2\u0aa8"+
		"\u0aaf\7\63\2\2\u0aa9\u0aaf\7\r\2\2\u0aaa\u0aaf\7\u00bb\2\2\u0aab\u0aaf"+
		"\7\u00e8\2\2\u0aac\u0aad\7(\2\2\u0aad\u0aaf\7\63\2\2\u0aae\u0aa8\3\2\2"+
		"\2\u0aae\u0aa9\3\2\2\2\u0aae\u0aaa\3\2\2\2\u0aae\u0aab\3\2\2\2\u0aae\u0aac"+
		"\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab1\7\u008f\2\2\u0ab1\u0ab2\7\65"+
		"\2\2\u0ab2\u0ab8\5\u0190\u00c9\2\u0ab3\u0ab4\7\u008f\2\2\u0ab4\u0ab5\5"+
		"\u01b8\u00dd\2\u0ab5\u0ab6\5\u01a2\u00d2\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0aa2"+
		"\3\2\2\2\u0ab7\u0aae\3\2\2\2\u0ab7\u0ab3\3\2\2\2\u0ab8\u0183\3\2\2\2\u0ab9"+
		"\u0acd\7D\2\2\u0aba\u0abd\t\16\2\2\u0abb\u0abd\t\20\2\2\u0abc\u0aba\3"+
		"\2\2\2\u0abc\u0abb\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u0abf\7\u008f\2\2"+
		"\u0abf\u0ac0\5\u01b6\u00dc\2\u0ac0\u0ac1\5\u018e\u00c8\2\u0ac1\u0ace\3"+
		"\2\2\2\u0ac2\u0ac9\7\63\2\2\u0ac3\u0ac9\7\r\2\2\u0ac4\u0ac9\7\u00bb\2"+
		"\2\u0ac5\u0ac9\7\u00e8\2\2\u0ac6\u0ac7\7(\2\2\u0ac7\u0ac9\7\63\2\2\u0ac8"+
		"\u0ac2\3\2\2\2\u0ac8\u0ac3\3\2\2\2\u0ac8\u0ac4\3\2\2\2\u0ac8\u0ac5\3\2"+
		"\2\2\u0ac8\u0ac6\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acb\7\u008f\2\2\u0acb"+
		"\u0acc\7\65\2\2\u0acc\u0ace\5\u0190\u00c9\2\u0acd\u0abc\3\2\2\2\u0acd"+
		"\u0ac8\3\2\2\2\u0ace\u0185\3\2\2\2\u0acf\u0aed\7\u00ce\2\2\u0ad0\u0adc"+
		"\t\16\2\2\u0ad1\u0adc\t\20\2\2\u0ad2\u0ad9\t\23\2\2\u0ad3\u0ad6\7{\2\2"+
		"\u0ad4\u0ad7\7\u00da\2\2\u0ad5\u0ad7\5\u01c6\u00e4\2\u0ad6\u0ad4\3\2\2"+
		"\2\u0ad6\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0ada\7\u00bf\2\2\u0ad9"+
		"\u0ad3\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adc\3\2\2\2\u0adb\u0ad0\3\2"+
		"\2\2\u0adb\u0ad1\3\2\2\2\u0adb\u0ad2\3\2\2\2\u0adc\u0add\3\2\2\2\u0add"+
		"\u0ade\7\u008f\2\2\u0ade\u0adf\5\u01b6\u00dc\2\u0adf\u0ae0\5\u018e\u00c8"+
		"\2\u0ae0\u0aee\3\2\2\2\u0ae1\u0ae9\7\r\2\2\u0ae2\u0ae9\7\u00a2\2\2\u0ae3"+
		"\u0ae9\7\u00bb\2\2\u0ae4\u0ae9\7\u00e8\2\2\u0ae5\u0ae9\t\31\2\2\u0ae6"+
		"\u0ae7\t\24\2\2\u0ae7\u0ae9\5\u0196\u00cc\2\u0ae8\u0ae1\3\2\2\2\u0ae8"+
		"\u0ae2\3\2\2\2\u0ae8\u0ae3\3\2\2\2\u0ae8\u0ae4\3\2\2\2\u0ae8\u0ae5\3\2"+
		"\2\2\u0ae8\u0ae6\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb\7\u008f\2\2\u0aeb"+
		"\u0aec\7\65\2\2\u0aec\u0aee\5\u0190\u00c9\2\u0aed\u0adb\3\2\2\2\u0aed"+
		"\u0ae8\3\2\2\2\u0aee\u0187\3\2\2\2\u0aef\u0b0b\7\u00ca\2\2\u0af0\u0afa"+
		"\t$\2\2\u0af1\u0af5\7\u00e8\2\2\u0af2\u0af6\7\u00d3\2\2\u0af3\u0af4\7"+
		"e\2\2\u0af4\u0af6\7\63\2\2\u0af5\u0af2\3\2\2\2\u0af5\u0af3\3\2\2\2\u0af6"+
		"\u0afa\3\2\2\2\u0af7\u0af8\7\63\2\2\u0af8\u0afa\7\t\2\2\u0af9\u0af0\3"+
		"\2\2\2\u0af9\u0af1\3\2\2\2\u0af9\u0af7\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb"+
		"\u0afc\7\u008f\2\2\u0afc\u0afd\7\65\2\2\u0afd\u0b0c\5\u0190\u00c9\2\u0afe"+
		"\u0aff\7q\2\2\u0aff\u0b00\5\u019e\u00d0\2\u0b00\u0b01\7\u008f\2\2\u0b01"+
		"\u0b02\5\u01b8\u00dd\2\u0b02\u0b0a\3\2\2\2\u0b03\u0b04\7\u00a7\2\2\u0b04"+
		"\u0b05\5\u01a0\u00d1\2\u0b05\u0b06\7\u008f\2\2\u0b06\u0b07\5\u01b8\u00dd"+
		"\2\u0b07\u0b08\5\u01a2\u00d2\2\u0b08\u0b0a\3\2\2\2\u0b09\u0afe\3\2\2\2"+
		"\u0b09\u0b03\3\2\2\2\u0b0a\u0b0c\3\2\2\2\u0b0b\u0af9\3\2\2\2\u0b0b\u0b09"+
		"\3\2\2\2\u0b0c\u0189\3\2\2\2\u0b0d\u0b17\7\u00b4\2\2\u0b0e\u0b0f\t%\2"+
		"\2\u0b0f\u0b10\7\u008f\2\2\u0b10\u0b11\7\65\2\2\u0b11\u0b18\5\u0190\u00c9"+
		"\2\u0b12\u0b13\7q\2\2\u0b13\u0b14\5\u019e\u00d0\2\u0b14\u0b15\7\u008f"+
		"\2\2\u0b15\u0b16\5\u01b8\u00dd\2\u0b16\u0b18\3\2\2\2\u0b17\u0b0e\3\2\2"+
		"\2\u0b17\u0b12\3\2\2\2\u0b18\u018b\3\2\2\2\u0b19\u0b1a\7\u00f0\2\2\u0b1a"+
		"\u0b1b\7\u008f\2\2\u0b1b\u0b1c\5\u01b8\u00dd\2\u0b1c\u018d\3\2\2\2\u0b1d"+
		"\u0b43\7\t\2\2\u0b1e\u0b43\7\u00d1\2\2\u0b1f\u0b43\7\u00d4\2\2\u0b20\u0b22"+
		"\t\16\2\2\u0b21\u0b23\7}\2\2\u0b22\u0b21\3\2\2\2\u0b22\u0b23\3\2\2\2\u0b23"+
		"\u0b43\3\2\2\2\u0b24\u0b26\t\20\2\2\u0b25\u0b27\7}\2\2\u0b26\u0b25\3\2"+
		"\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b43\3\2\2\2\u0b28\u0b2a\7\u00dd\2\2\u0b29"+
		"\u0b2b\7}\2\2\u0b2a\u0b29\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b32\3\2"+
		"\2\2\u0b2c\u0b2f\7{\2\2\u0b2d\u0b30\7\u00da\2\2\u0b2e\u0b30\5\u01c6\u00e4"+
		"\2\u0b2f\u0b2d\3\2\2\2\u0b2f\u0b2e\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31\u0b33"+
		"\7\u00bf\2\2\u0b32\u0b2c\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33\u0b43\3\2\2"+
		"\2\u0b34\u0b35\7\u00d7\2\2\u0b35\u0b3c\t\23\2\2\u0b36\u0b39\7{\2\2\u0b37"+
		"\u0b3a\7\u00da\2\2\u0b38\u0b3a\5\u01c6\u00e4\2\u0b39\u0b37\3\2\2\2\u0b39"+
		"\u0b38\3\2\2\2\u0b3a\u0b3b\3\2\2\2\u0b3b\u0b3d\7\u00bf\2\2\u0b3c\u0b36"+
		"\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b43\3\2\2\2\u0b3e\u0b40\7\u0084\2"+
		"\2\u0b3f\u0b41\7}\2\2\u0b40\u0b3f\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b43"+
		"\3\2\2\2\u0b42\u0b1d\3\2\2\2\u0b42\u0b1e\3\2\2\2\u0b42\u0b1f\3\2\2\2\u0b42"+
		"\u0b20\3\2\2\2\u0b42\u0b24\3\2\2\2\u0b42\u0b28\3\2\2\2\u0b42\u0b34\3\2"+
		"\2\2\u0b42\u0b3e\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\7\u008f\2\2\u0b45"+
		"\u0b46\5\u01b6\u00dc\2\u0b46\u0b47\5\u018e\u00c8\2\u0b47\u018f\3\2\2\2"+
		"\u0b48\u0b49\7\21\2\2\u0b49\u0b81\t&\2\2\u0b4a\u0b4b\7\27\2\2\u0b4b\u0b81"+
		"\t%\2\2\u0b4c\u0b4d\7(\2\2\u0b4d\u0b4e\7\63\2\2\u0b4e\u0b81\7}\2\2\u0b4f"+
		"\u0b50\7\63\2\2\u0b50\u0b81\7}\2\2\u0b51\u0b52\7\r\2\2\u0b52\u0b81\7}"+
		"\2\2\u0b53\u0b6d\7Q\2\2\u0b54\u0b55\t\'\2\2\u0b55\u0b6e\7\u00a5\2\2\u0b56"+
		"\u0b61\7\32\2\2\u0b57\u0b58\t\21\2\2\u0b58\u0b62\5\u0194\u00cb\2\u0b59"+
		"\u0b5b\7\u00e8\2\2\u0b5a\u0b5c\78\2\2\u0b5b\u0b5a\3\2\2\2\u0b5b\u0b5c"+
		"\3\2\2\2\u0b5c\u0b5e\3\2\2\2\u0b5d\u0b59\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e"+
		"\u0b5f\3\2\2\2\u0b5f\u0b60\t\22\2\2\u0b60\u0b62\5\u0192\u00ca\2\u0b61"+
		"\u0b57\3\2\2\2\u0b61\u0b5d\3\2\2\2\u0b62\u0b6e\3\2\2\2\u0b63\u0b64\t\21"+
		"\2\2\u0b64\u0b6e\5\u0194\u00cb\2\u0b65\u0b67\7\u00e8\2\2\u0b66\u0b68\7"+
		"8\2\2\u0b67\u0b66\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u0b6a\3\2\2\2\u0b69"+
		"\u0b65\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b6b\3\2\2\2\u0b6b\u0b6c\t\22"+
		"\2\2\u0b6c\u0b6e\5\u0192\u00ca\2\u0b6d\u0b54\3\2\2\2\u0b6d\u0b56\3\2\2"+
		"\2\u0b6d\u0b63\3\2\2\2\u0b6d\u0b69\3\2\2\2\u0b6e\u0b81\3\2\2\2\u0b6f\u0b70"+
		"\7\u00a2\2\2\u0b70\u0b81\7}\2\2\u0b71\u0b72\7\u00af\2\2\u0b72\u0b81\t"+
		"(\2\2\u0b73\u0b74\7\u00c8\2\2\u0b74\u0b81\7}\2\2\u0b75\u0b76\7\u00e8\2"+
		"\2\u0b76\u0b81\7}\2\2\u0b77\u0b7e\7g\2\2\u0b78\u0b7b\7{\2\2\u0b79\u0b7c"+
		"\7\u00da\2\2\u0b7a\u0b7c\5\u01c6\u00e4\2\u0b7b\u0b79\3\2\2\2\u0b7b\u0b7a"+
		"\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7f\7\u00bf\2\2\u0b7e\u0b78\3\2\2"+
		"\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b81\3\2\2\2\u0b80\u0b48\3\2\2\2\u0b80\u0b4a"+
		"\3\2\2\2\u0b80\u0b4c\3\2\2\2\u0b80\u0b4f\3\2\2\2\u0b80\u0b51\3\2\2\2\u0b80"+
		"\u0b53\3\2\2\2\u0b80\u0b6f\3\2\2\2\u0b80\u0b71\3\2\2\2\u0b80\u0b73\3\2"+
		"\2\2\u0b80\u0b75\3\2\2\2\u0b80\u0b77\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82"+
		"\u0b83\7\u008f\2\2\u0b83\u0b84\7\65\2\2\u0b84\u0b85\5\u0190\u00c9\2\u0b85"+
		"\u0191\3\2\2\2\u0b86\u0b87\5\u0198\u00cd\2\u0b87\u0193\3\2\2\2\u0b88\u0b89"+
		"\5\u0198\u00cd\2\u0b89\u0195\3\2\2\2\u0b8a\u0b8c\5\u0198\u00cd\2\u0b8b"+
		"\u0b8a\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8b\3\2\2\2\u0b8d\u0b8e\3\2"+
		"\2\2\u0b8e\u0197\3\2\2\2\u0b8f\u0b94\5\u01ca\u00e6\2\u0b90\u0b91\7$\2"+
		"\2\u0b91\u0b93\5\u01ca\u00e6\2\u0b92\u0b90\3\2\2\2\u0b93\u0b96\3\2\2\2"+
		"\u0b94\u0b92\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0199\3\2\2\2\u0b96\u0b94"+
		"\3\2\2\2\u0b97\u0b9d\7\u00df\2\2\u0b98\u0b99\7\u00ac\2\2\u0b99\u0b9d\5"+
		"\u01a0\u00d1\2\u0b9a\u0b9b\7~\2\2\u0b9b\u0b9d\5\u01a0\u00d1\2\u0b9c\u0b97"+
		"\3\2\2\2\u0b9c\u0b98\3\2\2\2\u0b9c\u0b9a\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e"+
		"\u0b9f\7\u008f\2\2\u0b9f\u0ba0\5\u01b8\u00dd\2\u0ba0\u0ba4\5\u01a2\u00d2"+
		"\2\u0ba1\u0ba2\7{\2\2\u0ba2\u0ba3\7\u00da\2\2\u0ba3\u0ba5\7\u00bf\2\2"+
		"\u0ba4\u0ba1\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u019b\3\2\2\2\u0ba6\u0baa"+
		"\79\2\2\u0ba7\u0ba8\7\177\2\2\u0ba8\u0baa\5\u01a0\u00d1\2\u0ba9\u0ba6"+
		"\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0baa\u0bab\3\2\2\2\u0bab\u0bac\7\u008f\2"+
		"\2\u0bac\u0bad\5\u01b8\u00dd\2\u0bad\u0bae\5\u01a2\u00d2\2\u0bae\u019d"+
		"\3\2\2\2\u0baf\u0bb2\7\u00da\2\2\u0bb0\u0bb2\5\u00eav\2\u0bb1\u0baf\3"+
		"\2\2\2\u0bb1\u0bb0\3\2\2\2\u0bb2\u019f\3\2\2\2\u0bb3\u0bb6\7v\2\2\u0bb4"+
		"\u0bb7\7\u00da\2\2\u0bb5\u0bb7\5\u00eav\2\u0bb6\u0bb4\3\2\2\2\u0bb6\u0bb5"+
		"\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bb9\7\u00ab\2\2\u0bb9\u01a1\3\2\2"+
		"\2\u0bba\u0bc4\t)\2\2\u0bbb\u0bc5\7\u00da\2\2\u0bbc\u0bc1\5\u01de\u00f0"+
		"\2\u0bbd\u0bbe\7$\2\2\u0bbe\u0bc0\5\u01de\u00f0\2\u0bbf\u0bbd\3\2\2\2"+
		"\u0bc0\u0bc3\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc5"+
		"\3\2\2\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bbb\3\2\2\2\u0bc4\u0bbc\3\2\2\2\u0bc5"+
		"\u0bdf\3\2\2\2\u0bc6\u0bd0\t*\2\2\u0bc7\u0bd1\7\u00da\2\2\u0bc8\u0bcd"+
		"\5\u01de\u00f0\2\u0bc9\u0bca\7$\2\2\u0bca\u0bcc\5\u01de\u00f0\2\u0bcb"+
		"\u0bc9\3\2\2\2\u0bcc\u0bcf\3\2\2\2\u0bcd\u0bcb\3\2\2\2\u0bcd\u0bce\3\2"+
		"\2\2\u0bce\u0bd1\3\2\2\2\u0bcf\u0bcd\3\2\2\2\u0bd0\u0bc7\3\2\2\2\u0bd0"+
		"\u0bc8\3\2\2\2\u0bd1\u0bdf\3\2\2\2\u0bd2\u0bdc\t+\2\2\u0bd3\u0bdd\7\u00da"+
		"\2\2\u0bd4\u0bd9\5\u01de\u00f0\2\u0bd5\u0bd6\7$\2\2\u0bd6\u0bd8\5\u01de"+
		"\u00f0\2\u0bd7\u0bd5\3\2\2\2\u0bd8\u0bdb\3\2\2\2\u0bd9\u0bd7\3\2\2\2\u0bd9"+
		"\u0bda\3\2\2\2\u0bda\u0bdd\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0bd3\3\2"+
		"\2\2\u0bdc\u0bd4\3\2\2\2\u0bdd\u0bdf\3\2\2\2\u0bde\u0bba\3\2\2\2\u0bde"+
		"\u0bc6\3\2\2\2\u0bde\u0bd2\3\2\2\2\u0bde\u0bdf\3\2\2\2\u0bdf\u01a3\3\2"+
		"\2\2\u0be0\u0be1\7\63\2\2\u0be1\u0be5\5\u01c4\u00e3\2\u0be2\u0be3\7f\2"+
		"\2\u0be3\u0be4\7\u008b\2\2\u0be4\u0be6\7T\2\2\u0be5\u0be2\3\2\2\2\u0be5"+
		"\u0be6\3\2\2\2\u0be6\u0bf1\3\2\2\2\u0be7\u0bed\7\u00dc\2\2\u0be8\u0beb"+
		"\7\6\2\2\u0be9\u0bec\t,\2\2\u0bea\u0bec\t-\2\2\u0beb\u0be9\3\2\2\2\u0beb"+
		"\u0bea\3\2\2\2\u0bec\u0bee\3\2\2\2\u0bed\u0be8\3\2\2\2\u0bee\u0bef\3\2"+
		"\2\2\u0bef\u0bed\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0bf2\3\2\2\2\u0bf1"+
		"\u0be7\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf5\5\u01a6"+
		"\u00d4\2\u0bf4\u0bf3\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf7\3\2\2\2\u0bf6"+
		"\u0bf8\5\u01b2\u00da\2\u0bf7\u0bf6\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u01a5"+
		"\3\2\2\2\u0bf9\u0bfa\7\u0092\2\2\u0bfa\u0bfb\5\u01d8\u00ed\2\u0bfb\u01a7"+
		"\3\2\2\2\u0bfc\u0bfd\7(\2\2\u0bfd\u0bfe\7\63\2\2\u0bfe\u0c02\5\u01c4\u00e3"+
		"\2\u0bff\u0c00\7f\2\2\u0c00\u0c01\7\u008b\2\2\u0c01\u0c03\7T\2\2\u0c02"+
		"\u0bff\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c05\3\2\2\2\u0c04\u0c06\5\u01a6"+
		"\u00d4\2\u0c05\u0c04\3\2\2\2\u0c05\u0c06\3\2\2\2\u0c06\u0c08\3\2\2\2\u0c07"+
		"\u0c09\5\u01b2\u00da\2\u0c08\u0c07\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u01a9"+
		"\3\2\2\2\u0c0a\u0c0c\7(\2\2\u0c0b\u0c0a\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c"+
		"\u0c0d\3\2\2\2\u0c0d\u0c0e\7\63\2\2\u0c0e\u0c11\5\u01c4\u00e3\2\u0c0f"+
		"\u0c10\7f\2\2\u0c10\u0c12\7T\2\2\u0c11\u0c0f\3\2\2\2\u0c11\u0c12\3\2\2"+
		"\2\u0c12\u0c15\3\2\2\2\u0c13\u0c14\t.\2\2\u0c14\u0c16\7\62\2\2\u0c15\u0c13"+
		"\3\2\2\2\u0c15\u0c16\3\2\2\2\u0c16\u0c18\3\2\2\2\u0c17\u0c19\5\u01b2\u00da"+
		"\2\u0c18\u0c17\3\2\2\2\u0c18\u0c19\3\2\2\2\u0c19\u01ab\3\2\2\2\u0c1a\u0c1b"+
		"\7\63\2\2\u0c1b\u0c1e\5\u01c4\u00e3\2\u0c1c\u0c1d\7f\2\2\u0c1d\u0c1f\7"+
		"T\2\2\u0c1e\u0c1c\3\2\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f\u0c3f\3\2\2\2\u0c20"+
		"\u0c32\7\u00ca\2\2\u0c21\u0c22\7\t\2\2\u0c22\u0c23\7\u00ac\2\2\u0c23\u0c33"+
		"\t/\2\2\u0c24\u0c2a\7\u00dc\2\2\u0c25\u0c28\7\6\2\2\u0c26\u0c29\t,\2\2"+
		"\u0c27\u0c29\t-\2\2\u0c28\u0c26\3\2\2\2\u0c28\u0c27\3\2\2\2\u0c29\u0c2b"+
		"\3\2\2\2\u0c2a\u0c25\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c2a\3\2\2\2\u0c2c"+
		"\u0c2d\3\2\2\2\u0c2d\u0c33\3\2\2\2\u0c2e\u0c2f\7\u0093\2\2\u0c2f\u0c30"+
		"\5\u01de\u00f0\2\u0c30\u0c31\5\u008eH\2\u0c31\u0c33\3\2\2\2\u0c32\u0c21"+
		"\3\2\2\2\u0c32\u0c24\3\2\2\2\u0c32\u0c2e\3\2\2\2\u0c33\u0c35\3\2\2\2\u0c34"+
		"\u0c20\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c34\3\2\2\2\u0c36\u0c37\3\2"+
		"\2\2\u0c37\u0c40\3\2\2\2\u0c38\u0c39\7\u00b4\2\2\u0c39\u0c3a\7\u0093\2"+
		"\2\u0c3a\u0c3c\5\u01de\u00f0\2\u0c3b\u0c38\3\2\2\2\u0c3c\u0c3d\3\2\2\2"+
		"\u0c3d\u0c3b\3\2\2\2\u0c3d\u0c3e\3\2\2\2\u0c3e\u0c40\3\2\2\2\u0c3f\u0c34"+
		"\3\2\2\2\u0c3f\u0c3b\3\2\2\2\u0c40\u01ad\3\2\2\2\u0c41\u0c42\7\u00d1\2"+
		"\2\u0c42\u0c43\7\63\2\2\u0c43\u0c45\5\u01c4\u00e3\2\u0c44\u0c46\5\u01b2"+
		"\u00da\2\u0c45\u0c44\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u01af\3\2\2\2\u0c47"+
		"\u0c48\7\u00d4\2\2\u0c48\u0c49\7\63\2\2\u0c49\u0c4b\5\u01c4\u00e3\2\u0c4a"+
		"\u0c4c\5\u01b2\u00da\2\u0c4b\u0c4a\3\2\2\2\u0c4b\u0c4c\3\2\2\2\u0c4c\u01b1"+
		"\3\2\2\2\u0c4d\u0c52\7\u00ec\2\2\u0c4e\u0c50\7\6\2\2\u0c4f\u0c51\t\60"+
		"\2\2\u0c50\u0c4f\3\2\2\2\u0c50\u0c51\3\2\2\2\u0c51\u0c53\3\2\2\2\u0c52"+
		"\u0c4e\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c56\3\2\2\2\u0c54\u0c56\7\u008c"+
		"\2\2\u0c55\u0c4d\3\2\2\2\u0c55\u0c54\3\2\2\2\u0c56\u01b3\3\2\2\2\u0c57"+
		"\u0c66\t\32\2\2\u0c58\u0c5e\5\u01c4\u00e3\2\u0c59\u0c5b\5\u0106\u0084"+
		"\2\u0c5a\u0c5c\5\30\r\2\u0c5b\u0c5a\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c"+
		"\u0c5f\3\2\2\2\u0c5d\u0c5f\5&\24\2\u0c5e\u0c59\3\2\2\2\u0c5e\u0c5d\3\2"+
		"\2\2\u0c5f\u0c67\3\2\2\2\u0c60\u0c62\5\u0106\u0084\2\u0c61\u0c63\5\30"+
		"\r\2\u0c62\u0c61\3\2\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c67\3\2\2\2\u0c64"+
		"\u0c67\5&\24\2\u0c65\u0c67\5\u01c4\u00e3\2\u0c66\u0c58\3\2\2\2\u0c66\u0c60"+
		"\3\2\2\2\u0c66\u0c64\3\2\2\2\u0c66\u0c65\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67"+
		"\u0c76\3\2\2\2\u0c68\u0c69\7\67\2\2\u0c69\u0c6d\7\63\2\2\u0c6a\u0c6b\7"+
		"e\2\2\u0c6b\u0c6d\7\63\2\2\u0c6c\u0c68\3\2\2\2\u0c6c\u0c6a\3\2\2\2\u0c6d"+
		"\u0c73\3\2\2\2\u0c6e\u0c70\5\u0106\u0084\2\u0c6f\u0c71\5\30\r\2\u0c70"+
		"\u0c6f\3\2\2\2\u0c70\u0c71\3\2\2\2\u0c71\u0c74\3\2\2\2\u0c72\u0c74\5&"+
		"\24\2\u0c73\u0c6e\3\2\2\2\u0c73\u0c72\3\2\2\2\u0c73\u0c74\3\2\2\2\u0c74"+
		"\u0c76\3\2\2\2\u0c75\u0c57\3\2\2\2\u0c75\u0c6c\3\2\2\2\u0c76\u01b5\3\2"+
		"\2\2\u0c77\u0c7a\t\32\2\2\u0c78\u0c7b\7\u00da\2\2\u0c79\u0c7b\5\u01c2"+
		"\u00e2\2\u0c7a\u0c78\3\2\2\2\u0c7a\u0c79\3\2\2\2\u0c7b\u0c81\3\2\2\2\u0c7c"+
		"\u0c7d\7\67\2\2\u0c7d\u0c81\7\63\2\2\u0c7e\u0c7f\7e\2\2\u0c7f\u0c81\7"+
		"\63\2\2\u0c80\u0c77\3\2\2\2\u0c80\u0c7c\3\2\2\2\u0c80\u0c7e\3\2\2\2\u0c81"+
		"\u01b7\3\2\2\2\u0c82\u0c85\t \2\2\u0c83\u0c86\7\u00da\2\2\u0c84\u0c86"+
		"\5\u01c2\u00e2\2\u0c85\u0c83\3\2\2\2\u0c85\u0c84\3\2\2\2\u0c86\u0c8c\3"+
		"\2\2\2\u0c87\u0c88\7\67\2\2\u0c88\u0c8c\7a\2\2\u0c89\u0c8a\7e\2\2\u0c8a"+
		"\u0c8c\7a\2\2\u0c8b\u0c82\3\2\2\2\u0c8b\u0c87\3\2\2\2\u0c8b\u0c89\3\2"+
		"\2\2\u0c8c\u01b9\3\2\2\2\u0c8d\u0c8e\7\r\2\2\u0c8e\u0c92\5\u01c4\u00e3"+
		"\2\u0c8f\u0c90\7f\2\2\u0c90\u0c91\7\u008b\2\2\u0c91\u0c93\7T\2\2\u0c92"+
		"\u0c8f\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93\u0c94\3\2\2\2\u0c94\u0c95\7Y"+
		"\2\2\u0c95\u0c96\7\63\2\2\u0c96\u0ca1\5\u01c4\u00e3\2\u0c97\u0c98\7\30"+
		"\2\2\u0c98\u0c99\5\u01d6\u00ec\2\u0c99\u0c9a\7\u00e8\2\2\u0c9a\u0c9b\5"+
		"\u01c8\u00e5\2\u0c9b\u0c9c\7\u0097\2\2\u0c9c\u0c9f\5\u0160\u00b1\2\u0c9d"+
		"\u0c9e\7C\2\2\u0c9e\u0ca0\5\u01d8\u00ed\2\u0c9f\u0c9d\3\2\2\2\u0c9f\u0ca0"+
		"\3\2\2\2\u0ca0\u0ca2\3\2\2\2\u0ca1\u0c97\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2"+
		"\u0ca5\3\2\2\2\u0ca3\u0ca4\7\u00a6\2\2\u0ca4\u0ca6\5\u01d8\u00ed\2\u0ca5"+
		"\u0ca3\3\2\2\2\u0ca5\u0ca6\3\2\2\2\u0ca6\u01bb\3\2\2\2\u0ca7\u0ca8\7\r"+
		"\2\2\u0ca8\u0cab\5\u01c4\u00e3\2\u0ca9\u0caa\7f\2\2\u0caa\u0cac\7T\2\2"+
		"\u0cab\u0ca9\3\2\2\2\u0cab\u0cac\3\2\2\2\u0cac\u0cad\3\2\2\2\u0cad\u0cae"+
		"\7Y\2\2\u0cae\u0caf\7\63\2\2\u0caf\u01bd\3\2\2\2\u0cb0\u0cb1\7\r\2\2\u0cb1"+
		"\u0cb4\5\u01c4\u00e3\2\u0cb2\u0cb3\7f\2\2\u0cb3\u0cb5\7T\2\2\u0cb4\u0cb2"+
		"\3\2\2\2\u0cb4\u0cb5\3\2\2\2\u0cb5\u0cb6\3\2\2\2\u0cb6\u0cb7\7\u00ca\2"+
		"\2\u0cb7\u0cc6\7\63\2\2\u0cb8\u0cb9\7\u00d6\2\2\u0cb9\u0cbc\5\u01c4\u00e3"+
		"\2\u0cba\u0cbb\7\30\2\2\u0cbb\u0cbd\5\u01d6\u00ec\2\u0cbc\u0cba\3\2\2"+
		"\2\u0cbc\u0cbd\3\2\2\2\u0cbd\u0cc7\3\2\2\2\u0cbe\u0cbf\7\u00e8\2\2\u0cbf"+
		"\u0cc7\5\u01c8\u00e5\2\u0cc0\u0cc1\7\u0097\2\2\u0cc1\u0cc7\5\u0160\u00b1"+
		"\2\u0cc2\u0cc3\7C\2\2\u0cc3\u0cc7\5\u01d8\u00ed\2\u0cc4\u0cc5\7\u00a6"+
		"\2\2\u0cc5\u0cc7\5\u01d8\u00ed\2\u0cc6\u0cb8\3\2\2\2\u0cc6\u0cbe\3\2\2"+
		"\2\u0cc6\u0cc0\3\2\2\2\u0cc6\u0cc2\3\2\2\2\u0cc6\u0cc4\3\2\2\2\u0cc7\u0cc8"+
		"\3\2\2\2\u0cc8\u0cc6\3\2\2\2\u0cc8\u0cc9\3\2\2\2\u0cc9\u01bf\3\2\2\2\u0cca"+
		"\u0ccc\t\61\2\2\u0ccb\u0ccd\5\u01c4\u00e3\2\u0ccc\u0ccb\3\2\2\2\u0ccc"+
		"\u0ccd\3\2\2\2\u0ccd\u0cce\3\2\2\2\u0cce\u0ccf\7Y\2\2\u0ccf\u0cd5\t\32"+
		"\2\2\u0cd0\u0cd2\5\u0106\u0084\2\u0cd1\u0cd3\5\30\r\2\u0cd2\u0cd1\3\2"+
		"\2\2\u0cd2\u0cd3\3\2\2\2\u0cd3\u0cd6\3\2\2\2\u0cd4\u0cd6\5&\24\2\u0cd5"+
		"\u0cd0\3\2\2\2\u0cd5\u0cd4\3\2\2\2\u0cd5\u0cd6\3\2\2\2\u0cd6\u01c1\3\2"+
		"\2\2\u0cd7\u0cdc\5\u01c4\u00e3\2\u0cd8\u0cd9\7$\2\2\u0cd9\u0cdb\5\u01c4"+
		"\u00e3\2\u0cda\u0cd8\3\2\2\2\u0cdb\u0cde\3\2\2\2\u0cdc\u0cda\3\2\2\2\u0cdc"+
		"\u0cdd\3\2\2\2\u0cdd\u01c3\3\2\2\2\u0cde\u0cdc\3\2\2\2\u0cdf\u0ce4\5\u01de"+
		"\u00f0\2\u0ce0\u0ce1\7A\2\2\u0ce1\u0ce3\5\u01de\u00f0\2\u0ce2\u0ce0\3"+
		"\2\2\2\u0ce3\u0ce6\3\2\2\2\u0ce4\u0ce2\3\2\2\2\u0ce4\u0ce5\3\2\2\2\u0ce5"+
		"\u0ce9\3\2\2\2\u0ce6\u0ce4\3\2\2\2\u0ce7\u0ce9\5\u00dco\2\u0ce8\u0cdf"+
		"\3\2\2\2\u0ce8\u0ce7\3\2\2\2\u0ce9\u01c5\3\2\2\2\u0cea\u0cef\5\u01c8\u00e5"+
		"\2\u0ceb\u0cec\7$\2\2\u0cec\u0cee\5\u01c8\u00e5\2\u0ced\u0ceb\3\2\2\2"+
		"\u0cee\u0cf1\3\2\2\2\u0cef\u0ced\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0\u01c7"+
		"\3\2\2\2\u0cf1\u0cef\3\2\2\2\u0cf2\u0cf5\5\u01de\u00f0\2\u0cf3\u0cf5\5"+
		"\u00dco\2\u0cf4\u0cf2\3\2\2\2\u0cf4\u0cf3\3\2\2\2\u0cf5\u01c9\3\2\2\2"+
		"\u0cf6\u0cfc\5\u01e0\u00f1\2\u0cf7\u0cf8\5\u01e0\u00f1\2\u0cf8\u0cf9\5"+
		"\u01cc\u00e7\2\u0cf9\u0cfc\3\2\2\2\u0cfa\u0cfc\5\u01cc\u00e7\2\u0cfb\u0cf6"+
		"\3\2\2\2\u0cfb\u0cf7\3\2\2\2\u0cfb\u0cfa\3\2\2\2\u0cfc\u01cb\3\2\2\2\u0cfd"+
		"\u0d02\5\u01ce\u00e8\2\u0cfe\u0cff\5\u01ce\u00e8\2\u0cff\u0d00\5\u01cc"+
		"\u00e7\2\u0d00\u0d02\3\2\2\2\u0d01\u0cfd\3\2\2\2\u0d01\u0cfe\3\2\2\2\u0d02"+
		"\u01cd\3\2\2\2\u0d03\u0d04\7A\2\2\u0d04\u0d0a\5\u01e0\u00f1\2\u0d05\u0d0a"+
		"\7\u00a8\2\2\u0d06\u0d0a\7\u00da\2\2\u0d07\u0d0a\7A\2\2\u0d08\u0d0a\5"+
		"\u01e2\u00f2\2\u0d09\u0d03\3\2\2\2\u0d09\u0d05\3\2\2\2\u0d09\u0d06\3\2"+
		"\2\2\u0d09\u0d07\3\2\2\2\u0d09\u0d08\3\2\2\2\u0d0a\u01cf\3\2\2\2\u0d0b"+
		"\u0d0c\5\u01d4\u00eb\2\u0d0c\u01d1\3\2\2\2\u0d0d\u0d12\5\u01d0\u00e9\2"+
		"\u0d0e\u0d0f\7$\2\2\u0d0f\u0d11\5\u01d0\u00e9\2\u0d10\u0d0e\3\2\2\2\u0d11"+
		"\u0d14\3\2\2\2\u0d12\u0d10\3\2\2\2\u0d12\u0d13\3\2\2\2\u0d13\u01d3\3\2"+
		"\2\2\u0d14\u0d12\3\2\2\2\u0d15\u0d16\t\62\2\2\u0d16\u01d5\3\2\2\2\u0d17"+
		"\u0d1a\5\u01d4\u00eb\2\u0d18\u0d1a\5\u00dco\2\u0d19\u0d17\3\2\2\2\u0d19"+
		"\u0d18\3\2\2\2\u0d1a\u01d7\3\2\2\2\u0d1b\u0d1e\5\u01da\u00ee\2\u0d1c\u0d1e"+
		"\5\u00dco\2\u0d1d\u0d1b\3\2\2\2\u0d1d\u0d1c\3\2\2\2\u0d1e\u01d9\3\2\2"+
		"\2\u0d1f\u0d2d\7v\2\2\u0d20\u0d21\5\u01de\u00f0\2\u0d21\u0d22\7#\2\2\u0d22"+
		"\u0d2a\5\u008eH\2\u0d23\u0d24\7$\2\2\u0d24\u0d25\5\u01de\u00f0\2\u0d25"+
		"\u0d26\7#\2\2\u0d26\u0d27\5\u008eH\2\u0d27\u0d29\3\2\2\2\u0d28\u0d23\3"+
		"\2\2\2\u0d29\u0d2c\3\2\2\2\u0d2a\u0d28\3\2\2\2\u0d2a\u0d2b\3\2\2\2\u0d2b"+
		"\u0d2e\3\2\2\2\u0d2c\u0d2a\3\2\2\2\u0d2d\u0d20\3\2\2\2\u0d2d\u0d2e\3\2"+
		"\2\2\u0d2e\u0d2f\3\2\2\2\u0d2f\u0d30\7\u00ab\2\2\u0d30\u01db\3\2\2\2\u0d31"+
		"\u0d36\5\u01de\u00f0\2\u0d32\u0d33\7$\2\2\u0d33\u0d35\5\u01de\u00f0\2"+
		"\u0d34\u0d32\3\2\2\2\u0d35\u0d38\3\2\2\2\u0d36\u0d34\3\2\2\2\u0d36\u0d37"+
		"\3\2\2\2\u0d37\u01dd\3\2\2\2\u0d38\u0d36\3\2\2\2\u0d39\u0d3c\5\u01e0\u00f1"+
		"\2\u0d3a\u0d3c\5\u01e2\u00f2\2\u0d3b\u0d39\3\2\2\2\u0d3b\u0d3a\3\2\2\2"+
		"\u0d3c\u01df\3\2\2\2\u0d3d\u0d3e\7\u00fb\2\2\u0d3e\u01e1\3\2\2\2\u0d3f"+
		"\u0d40\t\63\2\2\u0d40\u01e3\3\2\2\2\u0d41\u0d42\7\2\2\3\u0d42\u01e5\3"+
		"\2\2\2\u01bc\u01e9\u01ee\u01f4\u01f7\u01ff\u0202\u020a\u020d\u0213\u0219"+
		"\u021e\u0225\u022a\u023b\u0241\u0247\u0251\u0254\u0257\u025a\u025f\u0266"+
		"\u026e\u0271\u0276\u0278\u0286\u0291\u02a3\u02ab\u02b2\u02b5\u02bd\u02c3"+
		"\u02c9\u02cd\u02e5\u02e8\u02f7\u02fb\u0307\u030d\u0311\u031a\u031e\u0320"+
		"\u0322\u032c\u0332\u033a\u0345\u034e\u0355\u0357\u036c\u0374\u037b\u037f"+
		"\u0384\u0388\u0394\u0398\u03a0\u03a4\u03a6\u03ae\u03b9\u03be\u03c1\u03c4"+
		"\u03c8\u03ca\u03d2\u03d6\u03db\u03e8\u03ed\u03f0\u03fc\u0401\u0404\u0407"+
		"\u040a\u040e\u0410\u0413\u0417\u0421\u0424\u0428\u042b\u0432\u0439\u043d"+
		"\u0445\u0449\u0451\u0453\u0459\u0461\u046a\u0472\u047a\u0480\u0491\u0493"+
		"\u0498\u04aa\u04ac\u04b3\u04b5\u04bf\u04c1\u04c9\u04d1\u04d7\u04e2\u04e6"+
		"\u04e9\u04f2\u050d\u0518\u051f\u052b\u0530\u053a\u053e\u0546\u054b\u0555"+
		"\u056e\u0579\u0584\u058f\u059a\u05a0\u05ae\u05b5\u05b7\u05c0\u05c2\u05c9"+
		"\u05ce\u05d4\u05da\u05e4\u05ed\u05f7\u05fc\u05ff\u0605\u0614\u061c\u0626"+
		"\u062c\u0635\u063a\u0646\u0650\u0658\u0692\u069b\u069d\u06a8\u06b6\u06c4"+
		"\u06d0\u06d8\u06e1\u06e4\u06ed\u06f0\u06f4\u06f8\u06fb\u0700\u0704\u0707"+
		"\u070c\u070f\u0714\u0718\u071b\u0720\u0722\u0727\u072a\u0732\u0734\u0736"+
		"\u073a\u073d\u0745\u0747\u0749\u074d\u0750\u0757\u075a\u075e\u0762\u0765"+
		"\u0767\u076e\u0771\u0775\u0779\u077c\u077e\u0784\u0788\u078e\u0791\u0795"+
		"\u0799\u07a6\u07ab\u07af\u07b7\u07c0\u07c5\u07d5\u07d7\u07db\u07e6\u07ef"+
		"\u07f4\u0800\u0802\u0807\u0809\u0821\u0823\u0835\u083a\u0842\u084b\u0850"+
		"\u0856\u0865\u086a\u0872\u087b\u0880\u088d\u0893\u08a2\u08a7\u08b0\u08b8"+
		"\u08be\u08c0\u08c8\u08d6\u08d8\u08e6\u08eb\u08f1\u08f8\u08fe\u0902\u0904"+
		"\u0909\u090e\u0912\u0917\u091d\u0924\u0926\u092c\u093e\u0941\u0944\u0948"+
		"\u0953\u095e\u0964\u096a\u0970\u0977\u097b\u097e\u098d\u0991\u0996\u099d"+
		"\u09a1\u09a8\u09ae\u09c0\u09c7\u09cd\u09d3\u09d5\u09d9\u09dd\u09e2\u09e8"+
		"\u09ec\u09f9\u09fc\u0a02\u0a05\u0a0a\u0a0d\u0a11\u0a14\u0a1a\u0a1d\u0a21"+
		"\u0a24\u0a2d\u0a31\u0a34\u0a38\u0a3b\u0a52\u0a57\u0a6b\u0a6f\u0a72\u0a79"+
		"\u0a7f\u0a86\u0a8b\u0a8e\u0a95\u0a99\u0a9d\u0aa0\u0aa2\u0aae\u0ab7\u0abc"+
		"\u0ac8\u0acd\u0ad6\u0ad9\u0adb\u0ae8\u0aed\u0af5\u0af9\u0b09\u0b0b\u0b17"+
		"\u0b22\u0b26\u0b2a\u0b2f\u0b32\u0b39\u0b3c\u0b40\u0b42\u0b5b\u0b5d\u0b61"+
		"\u0b67\u0b69\u0b6d\u0b7b\u0b7e\u0b80\u0b8d\u0b94\u0b9c\u0ba4\u0ba9\u0bb1"+
		"\u0bb6\u0bc1\u0bc4\u0bcd\u0bd0\u0bd9\u0bdc\u0bde\u0be5\u0beb\u0bef\u0bf1"+
		"\u0bf4\u0bf7\u0c02\u0c05\u0c08\u0c0b\u0c11\u0c15\u0c18\u0c1e\u0c28\u0c2c"+
		"\u0c32\u0c36\u0c3d\u0c3f\u0c45\u0c4b\u0c50\u0c52\u0c55\u0c5b\u0c5e\u0c62"+
		"\u0c66\u0c6c\u0c70\u0c73\u0c75\u0c7a\u0c80\u0c85\u0c8b\u0c92\u0c9f\u0ca1"+
		"\u0ca5\u0cab\u0cb4\u0cbc\u0cc6\u0cc8\u0ccc\u0cd2\u0cd5\u0cdc\u0ce4\u0ce8"+
		"\u0cef\u0cf4\u0cfb\u0d01\u0d09\u0d12\u0d19\u0d1d\u0d2a\u0d2d\u0d36\u0d3b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}