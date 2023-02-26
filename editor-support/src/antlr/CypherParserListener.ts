// Generated from src/antlr/CypherParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { StatementsContext } from "./CypherParser";
import { StatementContext } from "./CypherParser";
import { SingleQueryOrCommandContext } from "./CypherParser";
import { SingleQueryOrCommandWithUseClauseContext } from "./CypherParser";
import { PeriodicCommitQueryHintFailureContext } from "./CypherParser";
import { RegularQueryContext } from "./CypherParser";
import { UnionContext } from "./CypherParser";
import { SingleQueryContext } from "./CypherParser";
import { SingleQueryWithUseClauseContext } from "./CypherParser";
import { ClauseContext } from "./CypherParser";
import { UseClauseContext } from "./CypherParser";
import { ReturnClauseContext } from "./CypherParser";
import { ReturnBodyContext } from "./CypherParser";
import { ReturnItemContext } from "./CypherParser";
import { ReturnItemsContext } from "./CypherParser";
import { OrderItemContext } from "./CypherParser";
import { SkipContext } from "./CypherParser";
import { LimitContext } from "./CypherParser";
import { WhereClauseContext } from "./CypherParser";
import { WithClauseContext } from "./CypherParser";
import { CreateClauseContext } from "./CypherParser";
import { SetClauseContext } from "./CypherParser";
import { SetItemContext } from "./CypherParser";
import { RemoveClauseContext } from "./CypherParser";
import { RemoveItemContext } from "./CypherParser";
import { DeleteClauseContext } from "./CypherParser";
import { MatchClauseContext } from "./CypherParser";
import { HintsContext } from "./CypherParser";
import { IndexHintBodyContext } from "./CypherParser";
import { MergeClauseContext } from "./CypherParser";
import { UnwindClauseContext } from "./CypherParser";
import { CallClauseContext } from "./CypherParser";
import { ProcedureNameContext } from "./CypherParser";
import { ProcedureArgumentContext } from "./CypherParser";
import { ProcedureResultItemContext } from "./CypherParser";
import { LoadCSVClauseContext } from "./CypherParser";
import { ForeachClauseContext } from "./CypherParser";
import { SubqueryClauseContext } from "./CypherParser";
import { SubqueryInTransactionsParametersContext } from "./CypherParser";
import { SubqueryInTransactionsBatchParametersContext } from "./CypherParser";
import { SubqueryInTransactionsErrorParametersContext } from "./CypherParser";
import { SubqueryInTransactionsReportParametersContext } from "./CypherParser";
import { PatternListContext } from "./CypherParser";
import { PatternContext } from "./CypherParser";
import { QuantifierContext } from "./CypherParser";
import { AnonymousPatternContext } from "./CypherParser";
import { ShortestPathPatternContext } from "./CypherParser";
import { MaybeQuantifiedRelationshipPatternContext } from "./CypherParser";
import { EveryPathPatternContext } from "./CypherParser";
import { EveryPathPatternNonEmptyContext } from "./CypherParser";
import { NodePatternContext } from "./CypherParser";
import { ParenthesizedPathContext } from "./CypherParser";
import { NodeLabelsContext } from "./CypherParser";
import { LabelExpressionPredicateContext } from "./CypherParser";
import { LabelOrRelTypeContext } from "./CypherParser";
import { LabelOrRelTypesContext } from "./CypherParser";
import { PropertiesContext } from "./CypherParser";
import { RelationshipPatternContext } from "./CypherParser";
import { LeftArrowContext } from "./CypherParser";
import { ArrowLineContext } from "./CypherParser";
import { RightArrowContext } from "./CypherParser";
import { PathLengthContext } from "./CypherParser";
import { PathLengthLiteralContext } from "./CypherParser";
import { LabelExpressionContext } from "./CypherParser";
import { LabelExpressionNameContext } from "./CypherParser";
import { LabelExpression4Context } from "./CypherParser";
import { LabelExpression4ExpectingBarContext } from "./CypherParser";
import { LabelExpression3Context } from "./CypherParser";
import { LabelExpression2Context } from "./CypherParser";
import { LabelExpression1Context } from "./CypherParser";
import { ExpressionContext } from "./CypherParser";
import { Expression12Context } from "./CypherParser";
import { Expression11Context } from "./CypherParser";
import { Expression10Context } from "./CypherParser";
import { Expression9Context } from "./CypherParser";
import { Expression8Context } from "./CypherParser";
import { Expression7Context } from "./CypherParser";
import { ComparisonExpression6Context } from "./CypherParser";
import { Expression6Context } from "./CypherParser";
import { Expression5Context } from "./CypherParser";
import { Expression4Context } from "./CypherParser";
import { Expression3Context } from "./CypherParser";
import { Expression2Context } from "./CypherParser";
import { PostFix1Context } from "./CypherParser";
import { PropertyContext } from "./CypherParser";
import { PropertyExpressionContext } from "./CypherParser";
import { Expression1Context } from "./CypherParser";
import { LiteralContext } from "./CypherParser";
import { CaseExpressionContext } from "./CypherParser";
import { ListComprehensionContext } from "./CypherParser";
import { PatternComprehensionContext } from "./CypherParser";
import { PatternComprehensionPrefixContext } from "./CypherParser";
import { ReduceExpressionContext } from "./CypherParser";
import { AllExpressionContext } from "./CypherParser";
import { AnyExpressionContext } from "./CypherParser";
import { NoneExpressionContext } from "./CypherParser";
import { SingleExpressionContext } from "./CypherParser";
import { PatternExpressionContext } from "./CypherParser";
import { ShortestPathExpressionContext } from "./CypherParser";
import { MapProjectionContext } from "./CypherParser";
import { MapProjectionItemContext } from "./CypherParser";
import { ExistsExpressionContext } from "./CypherParser";
import { CountExpressionContext } from "./CypherParser";
import { StringLiteralContext } from "./CypherParser";
import { NumberLiteralContext } from "./CypherParser";
import { SignedIntegerLiteralContext } from "./CypherParser";
import { ListLiteralContext } from "./CypherParser";
import { MapLiteralContext } from "./CypherParser";
import { PropertyKeyNameContext } from "./CypherParser";
import { ParameterContext } from "./CypherParser";
import { FunctionInvocationContext } from "./CypherParser";
import { FunctionNameContext } from "./CypherParser";
import { FunctionArgumentContext } from "./CypherParser";
import { NamespaceContext } from "./CypherParser";
import { VariableList1Context } from "./CypherParser";
import { VariableContext } from "./CypherParser";
import { SymbolicNameList1Context } from "./CypherParser";
import { CreateCommandContext } from "./CypherParser";
import { CommandContext } from "./CypherParser";
import { CommandWithUseGraphContext } from "./CypherParser";
import { DropCommandContext } from "./CypherParser";
import { AlterCommandContext } from "./CypherParser";
import { ShowCommandContext } from "./CypherParser";
import { TerminateCommandContext } from "./CypherParser";
import { ShowAllCommandContext } from "./CypherParser";
import { ShowNodeCommandContext } from "./CypherParser";
import { ShowRelationshipCommandContext } from "./CypherParser";
import { ShowRelCommandContext } from "./CypherParser";
import { ShowPropertyCommandContext } from "./CypherParser";
import { YieldItemContext } from "./CypherParser";
import { YieldClauseContext } from "./CypherParser";
import { ShowIndexesAllowBriefContext } from "./CypherParser";
import { ShowIndexesNoBriefContext } from "./CypherParser";
import { ShowConstraintsAllowBriefAndYieldContext } from "./CypherParser";
import { ShowConstraintsAllowBriefContext } from "./CypherParser";
import { ShowConstraintsAllowYieldContext } from "./CypherParser";
import { ShowProceduresContext } from "./CypherParser";
import { ShowFunctionsContext } from "./CypherParser";
import { ShowTransactionsContext } from "./CypherParser";
import { TerminateTransactionsContext } from "./CypherParser";
import { ShowOrTerminateTransactionsContext } from "./CypherParser";
import { StringsOrExpressionContext } from "./CypherParser";
import { ShowSettingsContext } from "./CypherParser";
import { CreateConstraintContext } from "./CypherParser";
import { DropConstraintContext } from "./CypherParser";
import { CreateIndexContext } from "./CypherParser";
import { OldCreateIndexContext } from "./CypherParser";
import { CreateIndex_Context } from "./CypherParser";
import { CreateFulltextIndexContext } from "./CypherParser";
import { CreateLookupIndexContext } from "./CypherParser";
import { DropIndexContext } from "./CypherParser";
import { PropertyListContext } from "./CypherParser";
import { RenameCommandContext } from "./CypherParser";
import { GrantCommandContext } from "./CypherParser";
import { RevokeCommandContext } from "./CypherParser";
import { EnableServerCommandContext } from "./CypherParser";
import { AlterServerContext } from "./CypherParser";
import { RenameServerContext } from "./CypherParser";
import { DropServerContext } from "./CypherParser";
import { ShowServersContext } from "./CypherParser";
import { AllocationCommandContext } from "./CypherParser";
import { DeallocateDatabaseFromServersContext } from "./CypherParser";
import { ReallocateDatabasesContext } from "./CypherParser";
import { CreateRoleContext } from "./CypherParser";
import { DropRoleContext } from "./CypherParser";
import { RenameRoleContext } from "./CypherParser";
import { ShowRolesContext } from "./CypherParser";
import { GrantRoleContext } from "./CypherParser";
import { RevokeRoleContext } from "./CypherParser";
import { CreateUserContext } from "./CypherParser";
import { DropUserContext } from "./CypherParser";
import { RenameUserContext } from "./CypherParser";
import { AlterCurrentUserContext } from "./CypherParser";
import { AlterUserContext } from "./CypherParser";
import { SetPasswordContext } from "./CypherParser";
import { PasswordExpressionContext } from "./CypherParser";
import { PasswordChangeRequiredContext } from "./CypherParser";
import { UserStatusContext } from "./CypherParser";
import { HomeDatabaseContext } from "./CypherParser";
import { ShowUsersContext } from "./CypherParser";
import { ShowCurrentUserContext } from "./CypherParser";
import { ShowPrivilegesContext } from "./CypherParser";
import { ShowRolePrivilegesContext } from "./CypherParser";
import { ShowUserPrivilegesContext } from "./CypherParser";
import { GrantRoleManagementContext } from "./CypherParser";
import { RevokeRoleManagementContext } from "./CypherParser";
import { RoleManagementPrivilegeContext } from "./CypherParser";
import { GrantPrivilegeContext } from "./CypherParser";
import { DenyPrivilegeContext } from "./CypherParser";
import { RevokePrivilegeContext } from "./CypherParser";
import { PrivilegeContext } from "./CypherParser";
import { AllPrivilegeContext } from "./CypherParser";
import { CreatePrivilegeContext } from "./CypherParser";
import { DropPrivilegeContext } from "./CypherParser";
import { ShowPrivilegeContext } from "./CypherParser";
import { SetPrivilegeContext } from "./CypherParser";
import { RemovePrivilegeContext } from "./CypherParser";
import { WritePrivilegeContext } from "./CypherParser";
import { DatabasePrivilegeContext } from "./CypherParser";
import { DbmsPrivilegeContext } from "./CypherParser";
import { ExecuteFunctionQualifierContext } from "./CypherParser";
import { ExecuteProcedureQualifierContext } from "./CypherParser";
import { SettingQualifierContext } from "./CypherParser";
import { GlobsContext } from "./CypherParser";
import { QualifiedGraphPrivilegesWithPropertyContext } from "./CypherParser";
import { QualifiedGraphPrivilegesContext } from "./CypherParser";
import { LabelResourceContext } from "./CypherParser";
import { PropertyResourceContext } from "./CypherParser";
import { GraphQualifierContext } from "./CypherParser";
import { CreateDatabaseContext } from "./CypherParser";
import { Options_Context } from "./CypherParser";
import { CreateCompositeDatabaseContext } from "./CypherParser";
import { DropDatabaseContext } from "./CypherParser";
import { AlterDatabaseContext } from "./CypherParser";
import { StartDatabaseContext } from "./CypherParser";
import { StopDatabaseContext } from "./CypherParser";
import { WaitClauseContext } from "./CypherParser";
import { ShowDatabaseContext } from "./CypherParser";
import { DatabaseScopeListContext } from "./CypherParser";
import { GraphScopeListContext } from "./CypherParser";
import { CreateAliasContext } from "./CypherParser";
import { DropAliasContext } from "./CypherParser";
import { AlterAliasContext } from "./CypherParser";
import { ShowAliasesContext } from "./CypherParser";
import { SymbolicAliasNameListContext } from "./CypherParser";
import { SymbolicAliasNameContext } from "./CypherParser";
import { SymbolicNameOrStringParameterListContext } from "./CypherParser";
import { SymbolicNameOrStringParameterContext } from "./CypherParser";
import { GlobContext } from "./CypherParser";
import { GlobRecursiveContext } from "./CypherParser";
import { GlobPartContext } from "./CypherParser";
import { StringImageContext } from "./CypherParser";
import { StringListContext } from "./CypherParser";
import { StringTokenContext } from "./CypherParser";
import { StringOrParameterContext } from "./CypherParser";
import { MapOrParameterContext } from "./CypherParser";
import { MapContext } from "./CypherParser";
import { SymbolicNamePositionsContext } from "./CypherParser";
import { SymbolicNameStringContext } from "./CypherParser";
import { EscapedSymbolicNameStringContext } from "./CypherParser";
import { UnescapedSymbolicNameStringContext } from "./CypherParser";
import { EndOfFileContext } from "./CypherParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `CypherParser`.
 */
export interface CypherParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `CypherParser.statements`.
	 * @param ctx the parse tree
	 */
	enterStatements?: (ctx: StatementsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.statements`.
	 * @param ctx the parse tree
	 */
	exitStatements?: (ctx: StatementsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.singleQueryOrCommand`.
	 * @param ctx the parse tree
	 */
	enterSingleQueryOrCommand?: (ctx: SingleQueryOrCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.singleQueryOrCommand`.
	 * @param ctx the parse tree
	 */
	exitSingleQueryOrCommand?: (ctx: SingleQueryOrCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.singleQueryOrCommandWithUseClause`.
	 * @param ctx the parse tree
	 */
	enterSingleQueryOrCommandWithUseClause?: (ctx: SingleQueryOrCommandWithUseClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.singleQueryOrCommandWithUseClause`.
	 * @param ctx the parse tree
	 */
	exitSingleQueryOrCommandWithUseClause?: (ctx: SingleQueryOrCommandWithUseClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.periodicCommitQueryHintFailure`.
	 * @param ctx the parse tree
	 */
	enterPeriodicCommitQueryHintFailure?: (ctx: PeriodicCommitQueryHintFailureContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.periodicCommitQueryHintFailure`.
	 * @param ctx the parse tree
	 */
	exitPeriodicCommitQueryHintFailure?: (ctx: PeriodicCommitQueryHintFailureContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.regularQuery`.
	 * @param ctx the parse tree
	 */
	enterRegularQuery?: (ctx: RegularQueryContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.regularQuery`.
	 * @param ctx the parse tree
	 */
	exitRegularQuery?: (ctx: RegularQueryContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.union`.
	 * @param ctx the parse tree
	 */
	enterUnion?: (ctx: UnionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.union`.
	 * @param ctx the parse tree
	 */
	exitUnion?: (ctx: UnionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.singleQuery`.
	 * @param ctx the parse tree
	 */
	enterSingleQuery?: (ctx: SingleQueryContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.singleQuery`.
	 * @param ctx the parse tree
	 */
	exitSingleQuery?: (ctx: SingleQueryContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.singleQueryWithUseClause`.
	 * @param ctx the parse tree
	 */
	enterSingleQueryWithUseClause?: (ctx: SingleQueryWithUseClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.singleQueryWithUseClause`.
	 * @param ctx the parse tree
	 */
	exitSingleQueryWithUseClause?: (ctx: SingleQueryWithUseClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.clause`.
	 * @param ctx the parse tree
	 */
	enterClause?: (ctx: ClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.clause`.
	 * @param ctx the parse tree
	 */
	exitClause?: (ctx: ClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.useClause`.
	 * @param ctx the parse tree
	 */
	enterUseClause?: (ctx: UseClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.useClause`.
	 * @param ctx the parse tree
	 */
	exitUseClause?: (ctx: UseClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.returnClause`.
	 * @param ctx the parse tree
	 */
	enterReturnClause?: (ctx: ReturnClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.returnClause`.
	 * @param ctx the parse tree
	 */
	exitReturnClause?: (ctx: ReturnClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.returnBody`.
	 * @param ctx the parse tree
	 */
	enterReturnBody?: (ctx: ReturnBodyContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.returnBody`.
	 * @param ctx the parse tree
	 */
	exitReturnBody?: (ctx: ReturnBodyContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.returnItem`.
	 * @param ctx the parse tree
	 */
	enterReturnItem?: (ctx: ReturnItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.returnItem`.
	 * @param ctx the parse tree
	 */
	exitReturnItem?: (ctx: ReturnItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.returnItems`.
	 * @param ctx the parse tree
	 */
	enterReturnItems?: (ctx: ReturnItemsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.returnItems`.
	 * @param ctx the parse tree
	 */
	exitReturnItems?: (ctx: ReturnItemsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.orderItem`.
	 * @param ctx the parse tree
	 */
	enterOrderItem?: (ctx: OrderItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.orderItem`.
	 * @param ctx the parse tree
	 */
	exitOrderItem?: (ctx: OrderItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.skip`.
	 * @param ctx the parse tree
	 */
	enterSkip?: (ctx: SkipContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.skip`.
	 * @param ctx the parse tree
	 */
	exitSkip?: (ctx: SkipContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.limit`.
	 * @param ctx the parse tree
	 */
	enterLimit?: (ctx: LimitContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.limit`.
	 * @param ctx the parse tree
	 */
	exitLimit?: (ctx: LimitContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.whereClause`.
	 * @param ctx the parse tree
	 */
	enterWhereClause?: (ctx: WhereClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.whereClause`.
	 * @param ctx the parse tree
	 */
	exitWhereClause?: (ctx: WhereClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.withClause`.
	 * @param ctx the parse tree
	 */
	enterWithClause?: (ctx: WithClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.withClause`.
	 * @param ctx the parse tree
	 */
	exitWithClause?: (ctx: WithClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createClause`.
	 * @param ctx the parse tree
	 */
	enterCreateClause?: (ctx: CreateClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createClause`.
	 * @param ctx the parse tree
	 */
	exitCreateClause?: (ctx: CreateClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.setClause`.
	 * @param ctx the parse tree
	 */
	enterSetClause?: (ctx: SetClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.setClause`.
	 * @param ctx the parse tree
	 */
	exitSetClause?: (ctx: SetClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.setItem`.
	 * @param ctx the parse tree
	 */
	enterSetItem?: (ctx: SetItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.setItem`.
	 * @param ctx the parse tree
	 */
	exitSetItem?: (ctx: SetItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.removeClause`.
	 * @param ctx the parse tree
	 */
	enterRemoveClause?: (ctx: RemoveClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.removeClause`.
	 * @param ctx the parse tree
	 */
	exitRemoveClause?: (ctx: RemoveClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.removeItem`.
	 * @param ctx the parse tree
	 */
	enterRemoveItem?: (ctx: RemoveItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.removeItem`.
	 * @param ctx the parse tree
	 */
	exitRemoveItem?: (ctx: RemoveItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.deleteClause`.
	 * @param ctx the parse tree
	 */
	enterDeleteClause?: (ctx: DeleteClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.deleteClause`.
	 * @param ctx the parse tree
	 */
	exitDeleteClause?: (ctx: DeleteClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.matchClause`.
	 * @param ctx the parse tree
	 */
	enterMatchClause?: (ctx: MatchClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.matchClause`.
	 * @param ctx the parse tree
	 */
	exitMatchClause?: (ctx: MatchClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.hints`.
	 * @param ctx the parse tree
	 */
	enterHints?: (ctx: HintsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.hints`.
	 * @param ctx the parse tree
	 */
	exitHints?: (ctx: HintsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.indexHintBody`.
	 * @param ctx the parse tree
	 */
	enterIndexHintBody?: (ctx: IndexHintBodyContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.indexHintBody`.
	 * @param ctx the parse tree
	 */
	exitIndexHintBody?: (ctx: IndexHintBodyContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.mergeClause`.
	 * @param ctx the parse tree
	 */
	enterMergeClause?: (ctx: MergeClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.mergeClause`.
	 * @param ctx the parse tree
	 */
	exitMergeClause?: (ctx: MergeClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.unwindClause`.
	 * @param ctx the parse tree
	 */
	enterUnwindClause?: (ctx: UnwindClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.unwindClause`.
	 * @param ctx the parse tree
	 */
	exitUnwindClause?: (ctx: UnwindClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.callClause`.
	 * @param ctx the parse tree
	 */
	enterCallClause?: (ctx: CallClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.callClause`.
	 * @param ctx the parse tree
	 */
	exitCallClause?: (ctx: CallClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.procedureName`.
	 * @param ctx the parse tree
	 */
	enterProcedureName?: (ctx: ProcedureNameContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.procedureName`.
	 * @param ctx the parse tree
	 */
	exitProcedureName?: (ctx: ProcedureNameContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.procedureArgument`.
	 * @param ctx the parse tree
	 */
	enterProcedureArgument?: (ctx: ProcedureArgumentContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.procedureArgument`.
	 * @param ctx the parse tree
	 */
	exitProcedureArgument?: (ctx: ProcedureArgumentContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.procedureResultItem`.
	 * @param ctx the parse tree
	 */
	enterProcedureResultItem?: (ctx: ProcedureResultItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.procedureResultItem`.
	 * @param ctx the parse tree
	 */
	exitProcedureResultItem?: (ctx: ProcedureResultItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.loadCSVClause`.
	 * @param ctx the parse tree
	 */
	enterLoadCSVClause?: (ctx: LoadCSVClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.loadCSVClause`.
	 * @param ctx the parse tree
	 */
	exitLoadCSVClause?: (ctx: LoadCSVClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.foreachClause`.
	 * @param ctx the parse tree
	 */
	enterForeachClause?: (ctx: ForeachClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.foreachClause`.
	 * @param ctx the parse tree
	 */
	exitForeachClause?: (ctx: ForeachClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.subqueryClause`.
	 * @param ctx the parse tree
	 */
	enterSubqueryClause?: (ctx: SubqueryClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.subqueryClause`.
	 * @param ctx the parse tree
	 */
	exitSubqueryClause?: (ctx: SubqueryClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.subqueryInTransactionsParameters`.
	 * @param ctx the parse tree
	 */
	enterSubqueryInTransactionsParameters?: (ctx: SubqueryInTransactionsParametersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.subqueryInTransactionsParameters`.
	 * @param ctx the parse tree
	 */
	exitSubqueryInTransactionsParameters?: (ctx: SubqueryInTransactionsParametersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.subqueryInTransactionsBatchParameters`.
	 * @param ctx the parse tree
	 */
	enterSubqueryInTransactionsBatchParameters?: (ctx: SubqueryInTransactionsBatchParametersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.subqueryInTransactionsBatchParameters`.
	 * @param ctx the parse tree
	 */
	exitSubqueryInTransactionsBatchParameters?: (ctx: SubqueryInTransactionsBatchParametersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.subqueryInTransactionsErrorParameters`.
	 * @param ctx the parse tree
	 */
	enterSubqueryInTransactionsErrorParameters?: (ctx: SubqueryInTransactionsErrorParametersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.subqueryInTransactionsErrorParameters`.
	 * @param ctx the parse tree
	 */
	exitSubqueryInTransactionsErrorParameters?: (ctx: SubqueryInTransactionsErrorParametersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.subqueryInTransactionsReportParameters`.
	 * @param ctx the parse tree
	 */
	enterSubqueryInTransactionsReportParameters?: (ctx: SubqueryInTransactionsReportParametersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.subqueryInTransactionsReportParameters`.
	 * @param ctx the parse tree
	 */
	exitSubqueryInTransactionsReportParameters?: (ctx: SubqueryInTransactionsReportParametersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.patternList`.
	 * @param ctx the parse tree
	 */
	enterPatternList?: (ctx: PatternListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.patternList`.
	 * @param ctx the parse tree
	 */
	exitPatternList?: (ctx: PatternListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.pattern`.
	 * @param ctx the parse tree
	 */
	enterPattern?: (ctx: PatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.pattern`.
	 * @param ctx the parse tree
	 */
	exitPattern?: (ctx: PatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.quantifier`.
	 * @param ctx the parse tree
	 */
	enterQuantifier?: (ctx: QuantifierContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.quantifier`.
	 * @param ctx the parse tree
	 */
	exitQuantifier?: (ctx: QuantifierContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.anonymousPattern`.
	 * @param ctx the parse tree
	 */
	enterAnonymousPattern?: (ctx: AnonymousPatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.anonymousPattern`.
	 * @param ctx the parse tree
	 */
	exitAnonymousPattern?: (ctx: AnonymousPatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.shortestPathPattern`.
	 * @param ctx the parse tree
	 */
	enterShortestPathPattern?: (ctx: ShortestPathPatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.shortestPathPattern`.
	 * @param ctx the parse tree
	 */
	exitShortestPathPattern?: (ctx: ShortestPathPatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.maybeQuantifiedRelationshipPattern`.
	 * @param ctx the parse tree
	 */
	enterMaybeQuantifiedRelationshipPattern?: (ctx: MaybeQuantifiedRelationshipPatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.maybeQuantifiedRelationshipPattern`.
	 * @param ctx the parse tree
	 */
	exitMaybeQuantifiedRelationshipPattern?: (ctx: MaybeQuantifiedRelationshipPatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.everyPathPattern`.
	 * @param ctx the parse tree
	 */
	enterEveryPathPattern?: (ctx: EveryPathPatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.everyPathPattern`.
	 * @param ctx the parse tree
	 */
	exitEveryPathPattern?: (ctx: EveryPathPatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.everyPathPatternNonEmpty`.
	 * @param ctx the parse tree
	 */
	enterEveryPathPatternNonEmpty?: (ctx: EveryPathPatternNonEmptyContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.everyPathPatternNonEmpty`.
	 * @param ctx the parse tree
	 */
	exitEveryPathPatternNonEmpty?: (ctx: EveryPathPatternNonEmptyContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.nodePattern`.
	 * @param ctx the parse tree
	 */
	enterNodePattern?: (ctx: NodePatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.nodePattern`.
	 * @param ctx the parse tree
	 */
	exitNodePattern?: (ctx: NodePatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.parenthesizedPath`.
	 * @param ctx the parse tree
	 */
	enterParenthesizedPath?: (ctx: ParenthesizedPathContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.parenthesizedPath`.
	 * @param ctx the parse tree
	 */
	exitParenthesizedPath?: (ctx: ParenthesizedPathContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.nodeLabels`.
	 * @param ctx the parse tree
	 */
	enterNodeLabels?: (ctx: NodeLabelsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.nodeLabels`.
	 * @param ctx the parse tree
	 */
	exitNodeLabels?: (ctx: NodeLabelsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpressionPredicate`.
	 * @param ctx the parse tree
	 */
	enterLabelExpressionPredicate?: (ctx: LabelExpressionPredicateContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpressionPredicate`.
	 * @param ctx the parse tree
	 */
	exitLabelExpressionPredicate?: (ctx: LabelExpressionPredicateContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelOrRelType`.
	 * @param ctx the parse tree
	 */
	enterLabelOrRelType?: (ctx: LabelOrRelTypeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelOrRelType`.
	 * @param ctx the parse tree
	 */
	exitLabelOrRelType?: (ctx: LabelOrRelTypeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelOrRelTypes`.
	 * @param ctx the parse tree
	 */
	enterLabelOrRelTypes?: (ctx: LabelOrRelTypesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelOrRelTypes`.
	 * @param ctx the parse tree
	 */
	exitLabelOrRelTypes?: (ctx: LabelOrRelTypesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.properties`.
	 * @param ctx the parse tree
	 */
	enterProperties?: (ctx: PropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.properties`.
	 * @param ctx the parse tree
	 */
	exitProperties?: (ctx: PropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.relationshipPattern`.
	 * @param ctx the parse tree
	 */
	enterRelationshipPattern?: (ctx: RelationshipPatternContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.relationshipPattern`.
	 * @param ctx the parse tree
	 */
	exitRelationshipPattern?: (ctx: RelationshipPatternContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.leftArrow`.
	 * @param ctx the parse tree
	 */
	enterLeftArrow?: (ctx: LeftArrowContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.leftArrow`.
	 * @param ctx the parse tree
	 */
	exitLeftArrow?: (ctx: LeftArrowContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.arrowLine`.
	 * @param ctx the parse tree
	 */
	enterArrowLine?: (ctx: ArrowLineContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.arrowLine`.
	 * @param ctx the parse tree
	 */
	exitArrowLine?: (ctx: ArrowLineContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.rightArrow`.
	 * @param ctx the parse tree
	 */
	enterRightArrow?: (ctx: RightArrowContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.rightArrow`.
	 * @param ctx the parse tree
	 */
	exitRightArrow?: (ctx: RightArrowContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.pathLength`.
	 * @param ctx the parse tree
	 */
	enterPathLength?: (ctx: PathLengthContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.pathLength`.
	 * @param ctx the parse tree
	 */
	exitPathLength?: (ctx: PathLengthContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.pathLengthLiteral`.
	 * @param ctx the parse tree
	 */
	enterPathLengthLiteral?: (ctx: PathLengthLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.pathLengthLiteral`.
	 * @param ctx the parse tree
	 */
	exitPathLengthLiteral?: (ctx: PathLengthLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression?: (ctx: LabelExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression?: (ctx: LabelExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpressionName`.
	 * @param ctx the parse tree
	 */
	enterLabelExpressionName?: (ctx: LabelExpressionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpressionName`.
	 * @param ctx the parse tree
	 */
	exitLabelExpressionName?: (ctx: LabelExpressionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression4`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression4?: (ctx: LabelExpression4Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression4`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression4?: (ctx: LabelExpression4Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression4ExpectingBar`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression4ExpectingBar?: (ctx: LabelExpression4ExpectingBarContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression4ExpectingBar`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression4ExpectingBar?: (ctx: LabelExpression4ExpectingBarContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression3`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression3?: (ctx: LabelExpression3Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression3`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression3?: (ctx: LabelExpression3Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression2`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression2?: (ctx: LabelExpression2Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression2`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression2?: (ctx: LabelExpression2Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelExpression1`.
	 * @param ctx the parse tree
	 */
	enterLabelExpression1?: (ctx: LabelExpression1Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelExpression1`.
	 * @param ctx the parse tree
	 */
	exitLabelExpression1?: (ctx: LabelExpression1Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression12`.
	 * @param ctx the parse tree
	 */
	enterExpression12?: (ctx: Expression12Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression12`.
	 * @param ctx the parse tree
	 */
	exitExpression12?: (ctx: Expression12Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression11`.
	 * @param ctx the parse tree
	 */
	enterExpression11?: (ctx: Expression11Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression11`.
	 * @param ctx the parse tree
	 */
	exitExpression11?: (ctx: Expression11Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression10`.
	 * @param ctx the parse tree
	 */
	enterExpression10?: (ctx: Expression10Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression10`.
	 * @param ctx the parse tree
	 */
	exitExpression10?: (ctx: Expression10Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression9`.
	 * @param ctx the parse tree
	 */
	enterExpression9?: (ctx: Expression9Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression9`.
	 * @param ctx the parse tree
	 */
	exitExpression9?: (ctx: Expression9Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression8`.
	 * @param ctx the parse tree
	 */
	enterExpression8?: (ctx: Expression8Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression8`.
	 * @param ctx the parse tree
	 */
	exitExpression8?: (ctx: Expression8Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression7`.
	 * @param ctx the parse tree
	 */
	enterExpression7?: (ctx: Expression7Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression7`.
	 * @param ctx the parse tree
	 */
	exitExpression7?: (ctx: Expression7Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.comparisonExpression6`.
	 * @param ctx the parse tree
	 */
	enterComparisonExpression6?: (ctx: ComparisonExpression6Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.comparisonExpression6`.
	 * @param ctx the parse tree
	 */
	exitComparisonExpression6?: (ctx: ComparisonExpression6Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression6`.
	 * @param ctx the parse tree
	 */
	enterExpression6?: (ctx: Expression6Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression6`.
	 * @param ctx the parse tree
	 */
	exitExpression6?: (ctx: Expression6Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression5`.
	 * @param ctx the parse tree
	 */
	enterExpression5?: (ctx: Expression5Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression5`.
	 * @param ctx the parse tree
	 */
	exitExpression5?: (ctx: Expression5Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression4`.
	 * @param ctx the parse tree
	 */
	enterExpression4?: (ctx: Expression4Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression4`.
	 * @param ctx the parse tree
	 */
	exitExpression4?: (ctx: Expression4Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression3`.
	 * @param ctx the parse tree
	 */
	enterExpression3?: (ctx: Expression3Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression3`.
	 * @param ctx the parse tree
	 */
	exitExpression3?: (ctx: Expression3Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression2`.
	 * @param ctx the parse tree
	 */
	enterExpression2?: (ctx: Expression2Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression2`.
	 * @param ctx the parse tree
	 */
	exitExpression2?: (ctx: Expression2Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.postFix1`.
	 * @param ctx the parse tree
	 */
	enterPostFix1?: (ctx: PostFix1Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.postFix1`.
	 * @param ctx the parse tree
	 */
	exitPostFix1?: (ctx: PostFix1Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.property`.
	 * @param ctx the parse tree
	 */
	enterProperty?: (ctx: PropertyContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.property`.
	 * @param ctx the parse tree
	 */
	exitProperty?: (ctx: PropertyContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.propertyExpression`.
	 * @param ctx the parse tree
	 */
	enterPropertyExpression?: (ctx: PropertyExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.propertyExpression`.
	 * @param ctx the parse tree
	 */
	exitPropertyExpression?: (ctx: PropertyExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.expression1`.
	 * @param ctx the parse tree
	 */
	enterExpression1?: (ctx: Expression1Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.expression1`.
	 * @param ctx the parse tree
	 */
	exitExpression1?: (ctx: Expression1Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.literal`.
	 * @param ctx the parse tree
	 */
	enterLiteral?: (ctx: LiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.literal`.
	 * @param ctx the parse tree
	 */
	exitLiteral?: (ctx: LiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.caseExpression`.
	 * @param ctx the parse tree
	 */
	enterCaseExpression?: (ctx: CaseExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.caseExpression`.
	 * @param ctx the parse tree
	 */
	exitCaseExpression?: (ctx: CaseExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.listComprehension`.
	 * @param ctx the parse tree
	 */
	enterListComprehension?: (ctx: ListComprehensionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.listComprehension`.
	 * @param ctx the parse tree
	 */
	exitListComprehension?: (ctx: ListComprehensionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.patternComprehension`.
	 * @param ctx the parse tree
	 */
	enterPatternComprehension?: (ctx: PatternComprehensionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.patternComprehension`.
	 * @param ctx the parse tree
	 */
	exitPatternComprehension?: (ctx: PatternComprehensionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.patternComprehensionPrefix`.
	 * @param ctx the parse tree
	 */
	enterPatternComprehensionPrefix?: (ctx: PatternComprehensionPrefixContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.patternComprehensionPrefix`.
	 * @param ctx the parse tree
	 */
	exitPatternComprehensionPrefix?: (ctx: PatternComprehensionPrefixContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.reduceExpression`.
	 * @param ctx the parse tree
	 */
	enterReduceExpression?: (ctx: ReduceExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.reduceExpression`.
	 * @param ctx the parse tree
	 */
	exitReduceExpression?: (ctx: ReduceExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.allExpression`.
	 * @param ctx the parse tree
	 */
	enterAllExpression?: (ctx: AllExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.allExpression`.
	 * @param ctx the parse tree
	 */
	exitAllExpression?: (ctx: AllExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.anyExpression`.
	 * @param ctx the parse tree
	 */
	enterAnyExpression?: (ctx: AnyExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.anyExpression`.
	 * @param ctx the parse tree
	 */
	exitAnyExpression?: (ctx: AnyExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.noneExpression`.
	 * @param ctx the parse tree
	 */
	enterNoneExpression?: (ctx: NoneExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.noneExpression`.
	 * @param ctx the parse tree
	 */
	exitNoneExpression?: (ctx: NoneExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.singleExpression`.
	 * @param ctx the parse tree
	 */
	enterSingleExpression?: (ctx: SingleExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.singleExpression`.
	 * @param ctx the parse tree
	 */
	exitSingleExpression?: (ctx: SingleExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.patternExpression`.
	 * @param ctx the parse tree
	 */
	enterPatternExpression?: (ctx: PatternExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.patternExpression`.
	 * @param ctx the parse tree
	 */
	exitPatternExpression?: (ctx: PatternExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.shortestPathExpression`.
	 * @param ctx the parse tree
	 */
	enterShortestPathExpression?: (ctx: ShortestPathExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.shortestPathExpression`.
	 * @param ctx the parse tree
	 */
	exitShortestPathExpression?: (ctx: ShortestPathExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.mapProjection`.
	 * @param ctx the parse tree
	 */
	enterMapProjection?: (ctx: MapProjectionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.mapProjection`.
	 * @param ctx the parse tree
	 */
	exitMapProjection?: (ctx: MapProjectionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.mapProjectionItem`.
	 * @param ctx the parse tree
	 */
	enterMapProjectionItem?: (ctx: MapProjectionItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.mapProjectionItem`.
	 * @param ctx the parse tree
	 */
	exitMapProjectionItem?: (ctx: MapProjectionItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.existsExpression`.
	 * @param ctx the parse tree
	 */
	enterExistsExpression?: (ctx: ExistsExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.existsExpression`.
	 * @param ctx the parse tree
	 */
	exitExistsExpression?: (ctx: ExistsExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.countExpression`.
	 * @param ctx the parse tree
	 */
	enterCountExpression?: (ctx: CountExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.countExpression`.
	 * @param ctx the parse tree
	 */
	exitCountExpression?: (ctx: CountExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringLiteral`.
	 * @param ctx the parse tree
	 */
	enterStringLiteral?: (ctx: StringLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringLiteral`.
	 * @param ctx the parse tree
	 */
	exitStringLiteral?: (ctx: StringLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.numberLiteral`.
	 * @param ctx the parse tree
	 */
	enterNumberLiteral?: (ctx: NumberLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.numberLiteral`.
	 * @param ctx the parse tree
	 */
	exitNumberLiteral?: (ctx: NumberLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.signedIntegerLiteral`.
	 * @param ctx the parse tree
	 */
	enterSignedIntegerLiteral?: (ctx: SignedIntegerLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.signedIntegerLiteral`.
	 * @param ctx the parse tree
	 */
	exitSignedIntegerLiteral?: (ctx: SignedIntegerLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.listLiteral`.
	 * @param ctx the parse tree
	 */
	enterListLiteral?: (ctx: ListLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.listLiteral`.
	 * @param ctx the parse tree
	 */
	exitListLiteral?: (ctx: ListLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.mapLiteral`.
	 * @param ctx the parse tree
	 */
	enterMapLiteral?: (ctx: MapLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.mapLiteral`.
	 * @param ctx the parse tree
	 */
	exitMapLiteral?: (ctx: MapLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.propertyKeyName`.
	 * @param ctx the parse tree
	 */
	enterPropertyKeyName?: (ctx: PropertyKeyNameContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.propertyKeyName`.
	 * @param ctx the parse tree
	 */
	exitPropertyKeyName?: (ctx: PropertyKeyNameContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.parameter`.
	 * @param ctx the parse tree
	 */
	enterParameter?: (ctx: ParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.parameter`.
	 * @param ctx the parse tree
	 */
	exitParameter?: (ctx: ParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.functionInvocation`.
	 * @param ctx the parse tree
	 */
	enterFunctionInvocation?: (ctx: FunctionInvocationContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.functionInvocation`.
	 * @param ctx the parse tree
	 */
	exitFunctionInvocation?: (ctx: FunctionInvocationContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.functionName`.
	 * @param ctx the parse tree
	 */
	enterFunctionName?: (ctx: FunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.functionName`.
	 * @param ctx the parse tree
	 */
	exitFunctionName?: (ctx: FunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.functionArgument`.
	 * @param ctx the parse tree
	 */
	enterFunctionArgument?: (ctx: FunctionArgumentContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.functionArgument`.
	 * @param ctx the parse tree
	 */
	exitFunctionArgument?: (ctx: FunctionArgumentContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.namespace`.
	 * @param ctx the parse tree
	 */
	enterNamespace?: (ctx: NamespaceContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.namespace`.
	 * @param ctx the parse tree
	 */
	exitNamespace?: (ctx: NamespaceContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.variableList1`.
	 * @param ctx the parse tree
	 */
	enterVariableList1?: (ctx: VariableList1Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.variableList1`.
	 * @param ctx the parse tree
	 */
	exitVariableList1?: (ctx: VariableList1Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.variable`.
	 * @param ctx the parse tree
	 */
	enterVariable?: (ctx: VariableContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.variable`.
	 * @param ctx the parse tree
	 */
	exitVariable?: (ctx: VariableContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicNameList1`.
	 * @param ctx the parse tree
	 */
	enterSymbolicNameList1?: (ctx: SymbolicNameList1Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicNameList1`.
	 * @param ctx the parse tree
	 */
	exitSymbolicNameList1?: (ctx: SymbolicNameList1Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createCommand`.
	 * @param ctx the parse tree
	 */
	enterCreateCommand?: (ctx: CreateCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createCommand`.
	 * @param ctx the parse tree
	 */
	exitCreateCommand?: (ctx: CreateCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.command`.
	 * @param ctx the parse tree
	 */
	enterCommand?: (ctx: CommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.command`.
	 * @param ctx the parse tree
	 */
	exitCommand?: (ctx: CommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.commandWithUseGraph`.
	 * @param ctx the parse tree
	 */
	enterCommandWithUseGraph?: (ctx: CommandWithUseGraphContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.commandWithUseGraph`.
	 * @param ctx the parse tree
	 */
	exitCommandWithUseGraph?: (ctx: CommandWithUseGraphContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropCommand`.
	 * @param ctx the parse tree
	 */
	enterDropCommand?: (ctx: DropCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropCommand`.
	 * @param ctx the parse tree
	 */
	exitDropCommand?: (ctx: DropCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterCommand`.
	 * @param ctx the parse tree
	 */
	enterAlterCommand?: (ctx: AlterCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterCommand`.
	 * @param ctx the parse tree
	 */
	exitAlterCommand?: (ctx: AlterCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showCommand`.
	 * @param ctx the parse tree
	 */
	enterShowCommand?: (ctx: ShowCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showCommand`.
	 * @param ctx the parse tree
	 */
	exitShowCommand?: (ctx: ShowCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.terminateCommand`.
	 * @param ctx the parse tree
	 */
	enterTerminateCommand?: (ctx: TerminateCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.terminateCommand`.
	 * @param ctx the parse tree
	 */
	exitTerminateCommand?: (ctx: TerminateCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showAllCommand`.
	 * @param ctx the parse tree
	 */
	enterShowAllCommand?: (ctx: ShowAllCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showAllCommand`.
	 * @param ctx the parse tree
	 */
	exitShowAllCommand?: (ctx: ShowAllCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showNodeCommand`.
	 * @param ctx the parse tree
	 */
	enterShowNodeCommand?: (ctx: ShowNodeCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showNodeCommand`.
	 * @param ctx the parse tree
	 */
	exitShowNodeCommand?: (ctx: ShowNodeCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showRelationshipCommand`.
	 * @param ctx the parse tree
	 */
	enterShowRelationshipCommand?: (ctx: ShowRelationshipCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showRelationshipCommand`.
	 * @param ctx the parse tree
	 */
	exitShowRelationshipCommand?: (ctx: ShowRelationshipCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showRelCommand`.
	 * @param ctx the parse tree
	 */
	enterShowRelCommand?: (ctx: ShowRelCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showRelCommand`.
	 * @param ctx the parse tree
	 */
	exitShowRelCommand?: (ctx: ShowRelCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showPropertyCommand`.
	 * @param ctx the parse tree
	 */
	enterShowPropertyCommand?: (ctx: ShowPropertyCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showPropertyCommand`.
	 * @param ctx the parse tree
	 */
	exitShowPropertyCommand?: (ctx: ShowPropertyCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.yieldItem`.
	 * @param ctx the parse tree
	 */
	enterYieldItem?: (ctx: YieldItemContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.yieldItem`.
	 * @param ctx the parse tree
	 */
	exitYieldItem?: (ctx: YieldItemContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.yieldClause`.
	 * @param ctx the parse tree
	 */
	enterYieldClause?: (ctx: YieldClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.yieldClause`.
	 * @param ctx the parse tree
	 */
	exitYieldClause?: (ctx: YieldClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showIndexesAllowBrief`.
	 * @param ctx the parse tree
	 */
	enterShowIndexesAllowBrief?: (ctx: ShowIndexesAllowBriefContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showIndexesAllowBrief`.
	 * @param ctx the parse tree
	 */
	exitShowIndexesAllowBrief?: (ctx: ShowIndexesAllowBriefContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showIndexesNoBrief`.
	 * @param ctx the parse tree
	 */
	enterShowIndexesNoBrief?: (ctx: ShowIndexesNoBriefContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showIndexesNoBrief`.
	 * @param ctx the parse tree
	 */
	exitShowIndexesNoBrief?: (ctx: ShowIndexesNoBriefContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showConstraintsAllowBriefAndYield`.
	 * @param ctx the parse tree
	 */
	enterShowConstraintsAllowBriefAndYield?: (ctx: ShowConstraintsAllowBriefAndYieldContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showConstraintsAllowBriefAndYield`.
	 * @param ctx the parse tree
	 */
	exitShowConstraintsAllowBriefAndYield?: (ctx: ShowConstraintsAllowBriefAndYieldContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showConstraintsAllowBrief`.
	 * @param ctx the parse tree
	 */
	enterShowConstraintsAllowBrief?: (ctx: ShowConstraintsAllowBriefContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showConstraintsAllowBrief`.
	 * @param ctx the parse tree
	 */
	exitShowConstraintsAllowBrief?: (ctx: ShowConstraintsAllowBriefContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showConstraintsAllowYield`.
	 * @param ctx the parse tree
	 */
	enterShowConstraintsAllowYield?: (ctx: ShowConstraintsAllowYieldContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showConstraintsAllowYield`.
	 * @param ctx the parse tree
	 */
	exitShowConstraintsAllowYield?: (ctx: ShowConstraintsAllowYieldContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showProcedures`.
	 * @param ctx the parse tree
	 */
	enterShowProcedures?: (ctx: ShowProceduresContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showProcedures`.
	 * @param ctx the parse tree
	 */
	exitShowProcedures?: (ctx: ShowProceduresContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showFunctions`.
	 * @param ctx the parse tree
	 */
	enterShowFunctions?: (ctx: ShowFunctionsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showFunctions`.
	 * @param ctx the parse tree
	 */
	exitShowFunctions?: (ctx: ShowFunctionsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showTransactions`.
	 * @param ctx the parse tree
	 */
	enterShowTransactions?: (ctx: ShowTransactionsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showTransactions`.
	 * @param ctx the parse tree
	 */
	exitShowTransactions?: (ctx: ShowTransactionsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.terminateTransactions`.
	 * @param ctx the parse tree
	 */
	enterTerminateTransactions?: (ctx: TerminateTransactionsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.terminateTransactions`.
	 * @param ctx the parse tree
	 */
	exitTerminateTransactions?: (ctx: TerminateTransactionsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showOrTerminateTransactions`.
	 * @param ctx the parse tree
	 */
	enterShowOrTerminateTransactions?: (ctx: ShowOrTerminateTransactionsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showOrTerminateTransactions`.
	 * @param ctx the parse tree
	 */
	exitShowOrTerminateTransactions?: (ctx: ShowOrTerminateTransactionsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringsOrExpression`.
	 * @param ctx the parse tree
	 */
	enterStringsOrExpression?: (ctx: StringsOrExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringsOrExpression`.
	 * @param ctx the parse tree
	 */
	exitStringsOrExpression?: (ctx: StringsOrExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showSettings`.
	 * @param ctx the parse tree
	 */
	enterShowSettings?: (ctx: ShowSettingsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showSettings`.
	 * @param ctx the parse tree
	 */
	exitShowSettings?: (ctx: ShowSettingsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createConstraint`.
	 * @param ctx the parse tree
	 */
	enterCreateConstraint?: (ctx: CreateConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createConstraint`.
	 * @param ctx the parse tree
	 */
	exitCreateConstraint?: (ctx: CreateConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropConstraint`.
	 * @param ctx the parse tree
	 */
	enterDropConstraint?: (ctx: DropConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropConstraint`.
	 * @param ctx the parse tree
	 */
	exitDropConstraint?: (ctx: DropConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createIndex`.
	 * @param ctx the parse tree
	 */
	enterCreateIndex?: (ctx: CreateIndexContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createIndex`.
	 * @param ctx the parse tree
	 */
	exitCreateIndex?: (ctx: CreateIndexContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.oldCreateIndex`.
	 * @param ctx the parse tree
	 */
	enterOldCreateIndex?: (ctx: OldCreateIndexContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.oldCreateIndex`.
	 * @param ctx the parse tree
	 */
	exitOldCreateIndex?: (ctx: OldCreateIndexContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createIndex_`.
	 * @param ctx the parse tree
	 */
	enterCreateIndex_?: (ctx: CreateIndex_Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createIndex_`.
	 * @param ctx the parse tree
	 */
	exitCreateIndex_?: (ctx: CreateIndex_Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createFulltextIndex`.
	 * @param ctx the parse tree
	 */
	enterCreateFulltextIndex?: (ctx: CreateFulltextIndexContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createFulltextIndex`.
	 * @param ctx the parse tree
	 */
	exitCreateFulltextIndex?: (ctx: CreateFulltextIndexContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createLookupIndex`.
	 * @param ctx the parse tree
	 */
	enterCreateLookupIndex?: (ctx: CreateLookupIndexContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createLookupIndex`.
	 * @param ctx the parse tree
	 */
	exitCreateLookupIndex?: (ctx: CreateLookupIndexContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropIndex`.
	 * @param ctx the parse tree
	 */
	enterDropIndex?: (ctx: DropIndexContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropIndex`.
	 * @param ctx the parse tree
	 */
	exitDropIndex?: (ctx: DropIndexContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.propertyList`.
	 * @param ctx the parse tree
	 */
	enterPropertyList?: (ctx: PropertyListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.propertyList`.
	 * @param ctx the parse tree
	 */
	exitPropertyList?: (ctx: PropertyListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.renameCommand`.
	 * @param ctx the parse tree
	 */
	enterRenameCommand?: (ctx: RenameCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.renameCommand`.
	 * @param ctx the parse tree
	 */
	exitRenameCommand?: (ctx: RenameCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.grantCommand`.
	 * @param ctx the parse tree
	 */
	enterGrantCommand?: (ctx: GrantCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.grantCommand`.
	 * @param ctx the parse tree
	 */
	exitGrantCommand?: (ctx: GrantCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.revokeCommand`.
	 * @param ctx the parse tree
	 */
	enterRevokeCommand?: (ctx: RevokeCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.revokeCommand`.
	 * @param ctx the parse tree
	 */
	exitRevokeCommand?: (ctx: RevokeCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.enableServerCommand`.
	 * @param ctx the parse tree
	 */
	enterEnableServerCommand?: (ctx: EnableServerCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.enableServerCommand`.
	 * @param ctx the parse tree
	 */
	exitEnableServerCommand?: (ctx: EnableServerCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterServer`.
	 * @param ctx the parse tree
	 */
	enterAlterServer?: (ctx: AlterServerContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterServer`.
	 * @param ctx the parse tree
	 */
	exitAlterServer?: (ctx: AlterServerContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.renameServer`.
	 * @param ctx the parse tree
	 */
	enterRenameServer?: (ctx: RenameServerContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.renameServer`.
	 * @param ctx the parse tree
	 */
	exitRenameServer?: (ctx: RenameServerContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropServer`.
	 * @param ctx the parse tree
	 */
	enterDropServer?: (ctx: DropServerContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropServer`.
	 * @param ctx the parse tree
	 */
	exitDropServer?: (ctx: DropServerContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showServers`.
	 * @param ctx the parse tree
	 */
	enterShowServers?: (ctx: ShowServersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showServers`.
	 * @param ctx the parse tree
	 */
	exitShowServers?: (ctx: ShowServersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.allocationCommand`.
	 * @param ctx the parse tree
	 */
	enterAllocationCommand?: (ctx: AllocationCommandContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.allocationCommand`.
	 * @param ctx the parse tree
	 */
	exitAllocationCommand?: (ctx: AllocationCommandContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.deallocateDatabaseFromServers`.
	 * @param ctx the parse tree
	 */
	enterDeallocateDatabaseFromServers?: (ctx: DeallocateDatabaseFromServersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.deallocateDatabaseFromServers`.
	 * @param ctx the parse tree
	 */
	exitDeallocateDatabaseFromServers?: (ctx: DeallocateDatabaseFromServersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.reallocateDatabases`.
	 * @param ctx the parse tree
	 */
	enterReallocateDatabases?: (ctx: ReallocateDatabasesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.reallocateDatabases`.
	 * @param ctx the parse tree
	 */
	exitReallocateDatabases?: (ctx: ReallocateDatabasesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createRole`.
	 * @param ctx the parse tree
	 */
	enterCreateRole?: (ctx: CreateRoleContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createRole`.
	 * @param ctx the parse tree
	 */
	exitCreateRole?: (ctx: CreateRoleContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropRole`.
	 * @param ctx the parse tree
	 */
	enterDropRole?: (ctx: DropRoleContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropRole`.
	 * @param ctx the parse tree
	 */
	exitDropRole?: (ctx: DropRoleContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.renameRole`.
	 * @param ctx the parse tree
	 */
	enterRenameRole?: (ctx: RenameRoleContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.renameRole`.
	 * @param ctx the parse tree
	 */
	exitRenameRole?: (ctx: RenameRoleContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showRoles`.
	 * @param ctx the parse tree
	 */
	enterShowRoles?: (ctx: ShowRolesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showRoles`.
	 * @param ctx the parse tree
	 */
	exitShowRoles?: (ctx: ShowRolesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.grantRole`.
	 * @param ctx the parse tree
	 */
	enterGrantRole?: (ctx: GrantRoleContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.grantRole`.
	 * @param ctx the parse tree
	 */
	exitGrantRole?: (ctx: GrantRoleContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.revokeRole`.
	 * @param ctx the parse tree
	 */
	enterRevokeRole?: (ctx: RevokeRoleContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.revokeRole`.
	 * @param ctx the parse tree
	 */
	exitRevokeRole?: (ctx: RevokeRoleContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createUser`.
	 * @param ctx the parse tree
	 */
	enterCreateUser?: (ctx: CreateUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createUser`.
	 * @param ctx the parse tree
	 */
	exitCreateUser?: (ctx: CreateUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropUser`.
	 * @param ctx the parse tree
	 */
	enterDropUser?: (ctx: DropUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropUser`.
	 * @param ctx the parse tree
	 */
	exitDropUser?: (ctx: DropUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.renameUser`.
	 * @param ctx the parse tree
	 */
	enterRenameUser?: (ctx: RenameUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.renameUser`.
	 * @param ctx the parse tree
	 */
	exitRenameUser?: (ctx: RenameUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterCurrentUser`.
	 * @param ctx the parse tree
	 */
	enterAlterCurrentUser?: (ctx: AlterCurrentUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterCurrentUser`.
	 * @param ctx the parse tree
	 */
	exitAlterCurrentUser?: (ctx: AlterCurrentUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterUser`.
	 * @param ctx the parse tree
	 */
	enterAlterUser?: (ctx: AlterUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterUser`.
	 * @param ctx the parse tree
	 */
	exitAlterUser?: (ctx: AlterUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.setPassword`.
	 * @param ctx the parse tree
	 */
	enterSetPassword?: (ctx: SetPasswordContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.setPassword`.
	 * @param ctx the parse tree
	 */
	exitSetPassword?: (ctx: SetPasswordContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.passwordExpression`.
	 * @param ctx the parse tree
	 */
	enterPasswordExpression?: (ctx: PasswordExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.passwordExpression`.
	 * @param ctx the parse tree
	 */
	exitPasswordExpression?: (ctx: PasswordExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.passwordChangeRequired`.
	 * @param ctx the parse tree
	 */
	enterPasswordChangeRequired?: (ctx: PasswordChangeRequiredContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.passwordChangeRequired`.
	 * @param ctx the parse tree
	 */
	exitPasswordChangeRequired?: (ctx: PasswordChangeRequiredContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.userStatus`.
	 * @param ctx the parse tree
	 */
	enterUserStatus?: (ctx: UserStatusContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.userStatus`.
	 * @param ctx the parse tree
	 */
	exitUserStatus?: (ctx: UserStatusContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.homeDatabase`.
	 * @param ctx the parse tree
	 */
	enterHomeDatabase?: (ctx: HomeDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.homeDatabase`.
	 * @param ctx the parse tree
	 */
	exitHomeDatabase?: (ctx: HomeDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showUsers`.
	 * @param ctx the parse tree
	 */
	enterShowUsers?: (ctx: ShowUsersContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showUsers`.
	 * @param ctx the parse tree
	 */
	exitShowUsers?: (ctx: ShowUsersContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showCurrentUser`.
	 * @param ctx the parse tree
	 */
	enterShowCurrentUser?: (ctx: ShowCurrentUserContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showCurrentUser`.
	 * @param ctx the parse tree
	 */
	exitShowCurrentUser?: (ctx: ShowCurrentUserContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showPrivileges`.
	 * @param ctx the parse tree
	 */
	enterShowPrivileges?: (ctx: ShowPrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showPrivileges`.
	 * @param ctx the parse tree
	 */
	exitShowPrivileges?: (ctx: ShowPrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showRolePrivileges`.
	 * @param ctx the parse tree
	 */
	enterShowRolePrivileges?: (ctx: ShowRolePrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showRolePrivileges`.
	 * @param ctx the parse tree
	 */
	exitShowRolePrivileges?: (ctx: ShowRolePrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showUserPrivileges`.
	 * @param ctx the parse tree
	 */
	enterShowUserPrivileges?: (ctx: ShowUserPrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showUserPrivileges`.
	 * @param ctx the parse tree
	 */
	exitShowUserPrivileges?: (ctx: ShowUserPrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.grantRoleManagement`.
	 * @param ctx the parse tree
	 */
	enterGrantRoleManagement?: (ctx: GrantRoleManagementContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.grantRoleManagement`.
	 * @param ctx the parse tree
	 */
	exitGrantRoleManagement?: (ctx: GrantRoleManagementContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.revokeRoleManagement`.
	 * @param ctx the parse tree
	 */
	enterRevokeRoleManagement?: (ctx: RevokeRoleManagementContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.revokeRoleManagement`.
	 * @param ctx the parse tree
	 */
	exitRevokeRoleManagement?: (ctx: RevokeRoleManagementContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.roleManagementPrivilege`.
	 * @param ctx the parse tree
	 */
	enterRoleManagementPrivilege?: (ctx: RoleManagementPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.roleManagementPrivilege`.
	 * @param ctx the parse tree
	 */
	exitRoleManagementPrivilege?: (ctx: RoleManagementPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.grantPrivilege`.
	 * @param ctx the parse tree
	 */
	enterGrantPrivilege?: (ctx: GrantPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.grantPrivilege`.
	 * @param ctx the parse tree
	 */
	exitGrantPrivilege?: (ctx: GrantPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.denyPrivilege`.
	 * @param ctx the parse tree
	 */
	enterDenyPrivilege?: (ctx: DenyPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.denyPrivilege`.
	 * @param ctx the parse tree
	 */
	exitDenyPrivilege?: (ctx: DenyPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.revokePrivilege`.
	 * @param ctx the parse tree
	 */
	enterRevokePrivilege?: (ctx: RevokePrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.revokePrivilege`.
	 * @param ctx the parse tree
	 */
	exitRevokePrivilege?: (ctx: RevokePrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.privilege`.
	 * @param ctx the parse tree
	 */
	enterPrivilege?: (ctx: PrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.privilege`.
	 * @param ctx the parse tree
	 */
	exitPrivilege?: (ctx: PrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.allPrivilege`.
	 * @param ctx the parse tree
	 */
	enterAllPrivilege?: (ctx: AllPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.allPrivilege`.
	 * @param ctx the parse tree
	 */
	exitAllPrivilege?: (ctx: AllPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createPrivilege`.
	 * @param ctx the parse tree
	 */
	enterCreatePrivilege?: (ctx: CreatePrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createPrivilege`.
	 * @param ctx the parse tree
	 */
	exitCreatePrivilege?: (ctx: CreatePrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropPrivilege`.
	 * @param ctx the parse tree
	 */
	enterDropPrivilege?: (ctx: DropPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropPrivilege`.
	 * @param ctx the parse tree
	 */
	exitDropPrivilege?: (ctx: DropPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showPrivilege`.
	 * @param ctx the parse tree
	 */
	enterShowPrivilege?: (ctx: ShowPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showPrivilege`.
	 * @param ctx the parse tree
	 */
	exitShowPrivilege?: (ctx: ShowPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.setPrivilege`.
	 * @param ctx the parse tree
	 */
	enterSetPrivilege?: (ctx: SetPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.setPrivilege`.
	 * @param ctx the parse tree
	 */
	exitSetPrivilege?: (ctx: SetPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.removePrivilege`.
	 * @param ctx the parse tree
	 */
	enterRemovePrivilege?: (ctx: RemovePrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.removePrivilege`.
	 * @param ctx the parse tree
	 */
	exitRemovePrivilege?: (ctx: RemovePrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.writePrivilege`.
	 * @param ctx the parse tree
	 */
	enterWritePrivilege?: (ctx: WritePrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.writePrivilege`.
	 * @param ctx the parse tree
	 */
	exitWritePrivilege?: (ctx: WritePrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.databasePrivilege`.
	 * @param ctx the parse tree
	 */
	enterDatabasePrivilege?: (ctx: DatabasePrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.databasePrivilege`.
	 * @param ctx the parse tree
	 */
	exitDatabasePrivilege?: (ctx: DatabasePrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dbmsPrivilege`.
	 * @param ctx the parse tree
	 */
	enterDbmsPrivilege?: (ctx: DbmsPrivilegeContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dbmsPrivilege`.
	 * @param ctx the parse tree
	 */
	exitDbmsPrivilege?: (ctx: DbmsPrivilegeContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.executeFunctionQualifier`.
	 * @param ctx the parse tree
	 */
	enterExecuteFunctionQualifier?: (ctx: ExecuteFunctionQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.executeFunctionQualifier`.
	 * @param ctx the parse tree
	 */
	exitExecuteFunctionQualifier?: (ctx: ExecuteFunctionQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.executeProcedureQualifier`.
	 * @param ctx the parse tree
	 */
	enterExecuteProcedureQualifier?: (ctx: ExecuteProcedureQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.executeProcedureQualifier`.
	 * @param ctx the parse tree
	 */
	exitExecuteProcedureQualifier?: (ctx: ExecuteProcedureQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.settingQualifier`.
	 * @param ctx the parse tree
	 */
	enterSettingQualifier?: (ctx: SettingQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.settingQualifier`.
	 * @param ctx the parse tree
	 */
	exitSettingQualifier?: (ctx: SettingQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.globs`.
	 * @param ctx the parse tree
	 */
	enterGlobs?: (ctx: GlobsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.globs`.
	 * @param ctx the parse tree
	 */
	exitGlobs?: (ctx: GlobsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.qualifiedGraphPrivilegesWithProperty`.
	 * @param ctx the parse tree
	 */
	enterQualifiedGraphPrivilegesWithProperty?: (ctx: QualifiedGraphPrivilegesWithPropertyContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.qualifiedGraphPrivilegesWithProperty`.
	 * @param ctx the parse tree
	 */
	exitQualifiedGraphPrivilegesWithProperty?: (ctx: QualifiedGraphPrivilegesWithPropertyContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.qualifiedGraphPrivileges`.
	 * @param ctx the parse tree
	 */
	enterQualifiedGraphPrivileges?: (ctx: QualifiedGraphPrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.qualifiedGraphPrivileges`.
	 * @param ctx the parse tree
	 */
	exitQualifiedGraphPrivileges?: (ctx: QualifiedGraphPrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.labelResource`.
	 * @param ctx the parse tree
	 */
	enterLabelResource?: (ctx: LabelResourceContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.labelResource`.
	 * @param ctx the parse tree
	 */
	exitLabelResource?: (ctx: LabelResourceContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.propertyResource`.
	 * @param ctx the parse tree
	 */
	enterPropertyResource?: (ctx: PropertyResourceContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.propertyResource`.
	 * @param ctx the parse tree
	 */
	exitPropertyResource?: (ctx: PropertyResourceContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.graphQualifier`.
	 * @param ctx the parse tree
	 */
	enterGraphQualifier?: (ctx: GraphQualifierContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.graphQualifier`.
	 * @param ctx the parse tree
	 */
	exitGraphQualifier?: (ctx: GraphQualifierContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createDatabase`.
	 * @param ctx the parse tree
	 */
	enterCreateDatabase?: (ctx: CreateDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createDatabase`.
	 * @param ctx the parse tree
	 */
	exitCreateDatabase?: (ctx: CreateDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.options_`.
	 * @param ctx the parse tree
	 */
	enterOptions_?: (ctx: Options_Context) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.options_`.
	 * @param ctx the parse tree
	 */
	exitOptions_?: (ctx: Options_Context) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createCompositeDatabase`.
	 * @param ctx the parse tree
	 */
	enterCreateCompositeDatabase?: (ctx: CreateCompositeDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createCompositeDatabase`.
	 * @param ctx the parse tree
	 */
	exitCreateCompositeDatabase?: (ctx: CreateCompositeDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropDatabase`.
	 * @param ctx the parse tree
	 */
	enterDropDatabase?: (ctx: DropDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropDatabase`.
	 * @param ctx the parse tree
	 */
	exitDropDatabase?: (ctx: DropDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterDatabase`.
	 * @param ctx the parse tree
	 */
	enterAlterDatabase?: (ctx: AlterDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterDatabase`.
	 * @param ctx the parse tree
	 */
	exitAlterDatabase?: (ctx: AlterDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.startDatabase`.
	 * @param ctx the parse tree
	 */
	enterStartDatabase?: (ctx: StartDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.startDatabase`.
	 * @param ctx the parse tree
	 */
	exitStartDatabase?: (ctx: StartDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stopDatabase`.
	 * @param ctx the parse tree
	 */
	enterStopDatabase?: (ctx: StopDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stopDatabase`.
	 * @param ctx the parse tree
	 */
	exitStopDatabase?: (ctx: StopDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.waitClause`.
	 * @param ctx the parse tree
	 */
	enterWaitClause?: (ctx: WaitClauseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.waitClause`.
	 * @param ctx the parse tree
	 */
	exitWaitClause?: (ctx: WaitClauseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showDatabase`.
	 * @param ctx the parse tree
	 */
	enterShowDatabase?: (ctx: ShowDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showDatabase`.
	 * @param ctx the parse tree
	 */
	exitShowDatabase?: (ctx: ShowDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.databaseScopeList`.
	 * @param ctx the parse tree
	 */
	enterDatabaseScopeList?: (ctx: DatabaseScopeListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.databaseScopeList`.
	 * @param ctx the parse tree
	 */
	exitDatabaseScopeList?: (ctx: DatabaseScopeListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.graphScopeList`.
	 * @param ctx the parse tree
	 */
	enterGraphScopeList?: (ctx: GraphScopeListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.graphScopeList`.
	 * @param ctx the parse tree
	 */
	exitGraphScopeList?: (ctx: GraphScopeListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.createAlias`.
	 * @param ctx the parse tree
	 */
	enterCreateAlias?: (ctx: CreateAliasContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.createAlias`.
	 * @param ctx the parse tree
	 */
	exitCreateAlias?: (ctx: CreateAliasContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.dropAlias`.
	 * @param ctx the parse tree
	 */
	enterDropAlias?: (ctx: DropAliasContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.dropAlias`.
	 * @param ctx the parse tree
	 */
	exitDropAlias?: (ctx: DropAliasContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.alterAlias`.
	 * @param ctx the parse tree
	 */
	enterAlterAlias?: (ctx: AlterAliasContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.alterAlias`.
	 * @param ctx the parse tree
	 */
	exitAlterAlias?: (ctx: AlterAliasContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.showAliases`.
	 * @param ctx the parse tree
	 */
	enterShowAliases?: (ctx: ShowAliasesContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.showAliases`.
	 * @param ctx the parse tree
	 */
	exitShowAliases?: (ctx: ShowAliasesContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicAliasNameList`.
	 * @param ctx the parse tree
	 */
	enterSymbolicAliasNameList?: (ctx: SymbolicAliasNameListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicAliasNameList`.
	 * @param ctx the parse tree
	 */
	exitSymbolicAliasNameList?: (ctx: SymbolicAliasNameListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicAliasName`.
	 * @param ctx the parse tree
	 */
	enterSymbolicAliasName?: (ctx: SymbolicAliasNameContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicAliasName`.
	 * @param ctx the parse tree
	 */
	exitSymbolicAliasName?: (ctx: SymbolicAliasNameContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicNameOrStringParameterList`.
	 * @param ctx the parse tree
	 */
	enterSymbolicNameOrStringParameterList?: (ctx: SymbolicNameOrStringParameterListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicNameOrStringParameterList`.
	 * @param ctx the parse tree
	 */
	exitSymbolicNameOrStringParameterList?: (ctx: SymbolicNameOrStringParameterListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicNameOrStringParameter`.
	 * @param ctx the parse tree
	 */
	enterSymbolicNameOrStringParameter?: (ctx: SymbolicNameOrStringParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicNameOrStringParameter`.
	 * @param ctx the parse tree
	 */
	exitSymbolicNameOrStringParameter?: (ctx: SymbolicNameOrStringParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.glob`.
	 * @param ctx the parse tree
	 */
	enterGlob?: (ctx: GlobContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.glob`.
	 * @param ctx the parse tree
	 */
	exitGlob?: (ctx: GlobContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.globRecursive`.
	 * @param ctx the parse tree
	 */
	enterGlobRecursive?: (ctx: GlobRecursiveContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.globRecursive`.
	 * @param ctx the parse tree
	 */
	exitGlobRecursive?: (ctx: GlobRecursiveContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.globPart`.
	 * @param ctx the parse tree
	 */
	enterGlobPart?: (ctx: GlobPartContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.globPart`.
	 * @param ctx the parse tree
	 */
	exitGlobPart?: (ctx: GlobPartContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringImage`.
	 * @param ctx the parse tree
	 */
	enterStringImage?: (ctx: StringImageContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringImage`.
	 * @param ctx the parse tree
	 */
	exitStringImage?: (ctx: StringImageContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringList`.
	 * @param ctx the parse tree
	 */
	enterStringList?: (ctx: StringListContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringList`.
	 * @param ctx the parse tree
	 */
	exitStringList?: (ctx: StringListContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringToken`.
	 * @param ctx the parse tree
	 */
	enterStringToken?: (ctx: StringTokenContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringToken`.
	 * @param ctx the parse tree
	 */
	exitStringToken?: (ctx: StringTokenContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.stringOrParameter`.
	 * @param ctx the parse tree
	 */
	enterStringOrParameter?: (ctx: StringOrParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.stringOrParameter`.
	 * @param ctx the parse tree
	 */
	exitStringOrParameter?: (ctx: StringOrParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.mapOrParameter`.
	 * @param ctx the parse tree
	 */
	enterMapOrParameter?: (ctx: MapOrParameterContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.mapOrParameter`.
	 * @param ctx the parse tree
	 */
	exitMapOrParameter?: (ctx: MapOrParameterContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.map`.
	 * @param ctx the parse tree
	 */
	enterMap?: (ctx: MapContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.map`.
	 * @param ctx the parse tree
	 */
	exitMap?: (ctx: MapContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicNamePositions`.
	 * @param ctx the parse tree
	 */
	enterSymbolicNamePositions?: (ctx: SymbolicNamePositionsContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicNamePositions`.
	 * @param ctx the parse tree
	 */
	exitSymbolicNamePositions?: (ctx: SymbolicNamePositionsContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.symbolicNameString`.
	 * @param ctx the parse tree
	 */
	enterSymbolicNameString?: (ctx: SymbolicNameStringContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.symbolicNameString`.
	 * @param ctx the parse tree
	 */
	exitSymbolicNameString?: (ctx: SymbolicNameStringContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.escapedSymbolicNameString`.
	 * @param ctx the parse tree
	 */
	enterEscapedSymbolicNameString?: (ctx: EscapedSymbolicNameStringContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.escapedSymbolicNameString`.
	 * @param ctx the parse tree
	 */
	exitEscapedSymbolicNameString?: (ctx: EscapedSymbolicNameStringContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.unescapedSymbolicNameString`.
	 * @param ctx the parse tree
	 */
	enterUnescapedSymbolicNameString?: (ctx: UnescapedSymbolicNameStringContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.unescapedSymbolicNameString`.
	 * @param ctx the parse tree
	 */
	exitUnescapedSymbolicNameString?: (ctx: UnescapedSymbolicNameStringContext) => void;

	/**
	 * Enter a parse tree produced by `CypherParser.endOfFile`.
	 * @param ctx the parse tree
	 */
	enterEndOfFile?: (ctx: EndOfFileContext) => void;
	/**
	 * Exit a parse tree produced by `CypherParser.endOfFile`.
	 * @param ctx the parse tree
	 */
	exitEndOfFile?: (ctx: EndOfFileContext) => void;
}

