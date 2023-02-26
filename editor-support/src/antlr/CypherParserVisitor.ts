// Generated from src/antlr/CypherParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

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
 * This interface defines a complete generic visitor for a parse tree produced
 * by `CypherParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface CypherParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `CypherParser.statements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatements?: (ctx: StatementsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.singleQueryOrCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleQueryOrCommand?: (ctx: SingleQueryOrCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.singleQueryOrCommandWithUseClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleQueryOrCommandWithUseClause?: (ctx: SingleQueryOrCommandWithUseClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.periodicCommitQueryHintFailure`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPeriodicCommitQueryHintFailure?: (ctx: PeriodicCommitQueryHintFailureContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.regularQuery`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRegularQuery?: (ctx: RegularQueryContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.union`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnion?: (ctx: UnionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.singleQuery`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleQuery?: (ctx: SingleQueryContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.singleQueryWithUseClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleQueryWithUseClause?: (ctx: SingleQueryWithUseClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClause?: (ctx: ClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.useClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUseClause?: (ctx: UseClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.returnClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnClause?: (ctx: ReturnClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.returnBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnBody?: (ctx: ReturnBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.returnItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnItem?: (ctx: ReturnItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.returnItems`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReturnItems?: (ctx: ReturnItemsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.orderItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrderItem?: (ctx: OrderItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.skip`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSkip?: (ctx: SkipContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.limit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLimit?: (ctx: LimitContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.whereClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhereClause?: (ctx: WhereClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.withClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWithClause?: (ctx: WithClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateClause?: (ctx: CreateClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.setClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetClause?: (ctx: SetClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.setItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetItem?: (ctx: SetItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.removeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemoveClause?: (ctx: RemoveClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.removeItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemoveItem?: (ctx: RemoveItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.deleteClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeleteClause?: (ctx: DeleteClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.matchClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMatchClause?: (ctx: MatchClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.hints`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHints?: (ctx: HintsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.indexHintBody`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIndexHintBody?: (ctx: IndexHintBodyContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.mergeClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMergeClause?: (ctx: MergeClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.unwindClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnwindClause?: (ctx: UnwindClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.callClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCallClause?: (ctx: CallClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.procedureName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureName?: (ctx: ProcedureNameContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.procedureArgument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureArgument?: (ctx: ProcedureArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.procedureResultItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedureResultItem?: (ctx: ProcedureResultItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.loadCSVClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLoadCSVClause?: (ctx: LoadCSVClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.foreachClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitForeachClause?: (ctx: ForeachClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.subqueryClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubqueryClause?: (ctx: SubqueryClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.subqueryInTransactionsParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubqueryInTransactionsParameters?: (ctx: SubqueryInTransactionsParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.subqueryInTransactionsBatchParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubqueryInTransactionsBatchParameters?: (ctx: SubqueryInTransactionsBatchParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.subqueryInTransactionsErrorParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubqueryInTransactionsErrorParameters?: (ctx: SubqueryInTransactionsErrorParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.subqueryInTransactionsReportParameters`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubqueryInTransactionsReportParameters?: (ctx: SubqueryInTransactionsReportParametersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.patternList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPatternList?: (ctx: PatternListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.pattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPattern?: (ctx: PatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.quantifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQuantifier?: (ctx: QuantifierContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.anonymousPattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnonymousPattern?: (ctx: AnonymousPatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.shortestPathPattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShortestPathPattern?: (ctx: ShortestPathPatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.maybeQuantifiedRelationshipPattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMaybeQuantifiedRelationshipPattern?: (ctx: MaybeQuantifiedRelationshipPatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.everyPathPattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEveryPathPattern?: (ctx: EveryPathPatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.everyPathPatternNonEmpty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEveryPathPatternNonEmpty?: (ctx: EveryPathPatternNonEmptyContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.nodePattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNodePattern?: (ctx: NodePatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.parenthesizedPath`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParenthesizedPath?: (ctx: ParenthesizedPathContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.nodeLabels`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNodeLabels?: (ctx: NodeLabelsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpressionPredicate`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpressionPredicate?: (ctx: LabelExpressionPredicateContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelOrRelType`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelOrRelType?: (ctx: LabelOrRelTypeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelOrRelTypes`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelOrRelTypes?: (ctx: LabelOrRelTypesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.properties`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProperties?: (ctx: PropertiesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.relationshipPattern`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelationshipPattern?: (ctx: RelationshipPatternContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.leftArrow`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLeftArrow?: (ctx: LeftArrowContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.arrowLine`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArrowLine?: (ctx: ArrowLineContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.rightArrow`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRightArrow?: (ctx: RightArrowContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.pathLength`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPathLength?: (ctx: PathLengthContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.pathLengthLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPathLengthLiteral?: (ctx: PathLengthLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression?: (ctx: LabelExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpressionName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpressionName?: (ctx: LabelExpressionNameContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression4`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression4?: (ctx: LabelExpression4Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression4ExpectingBar`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression4ExpectingBar?: (ctx: LabelExpression4ExpectingBarContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression3`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression3?: (ctx: LabelExpression3Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression2?: (ctx: LabelExpression2Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelExpression1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelExpression1?: (ctx: LabelExpression1Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression12`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression12?: (ctx: Expression12Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression11`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression11?: (ctx: Expression11Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression10`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression10?: (ctx: Expression10Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression9`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression9?: (ctx: Expression9Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression8`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression8?: (ctx: Expression8Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression7`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression7?: (ctx: Expression7Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.comparisonExpression6`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComparisonExpression6?: (ctx: ComparisonExpression6Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression6`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression6?: (ctx: Expression6Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression5`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression5?: (ctx: Expression5Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression4`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression4?: (ctx: Expression4Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression3`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression3?: (ctx: Expression3Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression2?: (ctx: Expression2Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.postFix1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPostFix1?: (ctx: PostFix1Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.property`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProperty?: (ctx: PropertyContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.propertyExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPropertyExpression?: (ctx: PropertyExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.expression1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression1?: (ctx: Expression1Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteral?: (ctx: LiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.caseExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCaseExpression?: (ctx: CaseExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.listComprehension`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitListComprehension?: (ctx: ListComprehensionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.patternComprehension`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPatternComprehension?: (ctx: PatternComprehensionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.patternComprehensionPrefix`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPatternComprehensionPrefix?: (ctx: PatternComprehensionPrefixContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.reduceExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReduceExpression?: (ctx: ReduceExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.allExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllExpression?: (ctx: AllExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.anyExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnyExpression?: (ctx: AnyExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.noneExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNoneExpression?: (ctx: NoneExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.singleExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingleExpression?: (ctx: SingleExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.patternExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPatternExpression?: (ctx: PatternExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.shortestPathExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShortestPathExpression?: (ctx: ShortestPathExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.mapProjection`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapProjection?: (ctx: MapProjectionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.mapProjectionItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapProjectionItem?: (ctx: MapProjectionItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.existsExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExistsExpression?: (ctx: ExistsExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.countExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCountExpression?: (ctx: CountExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringLiteral?: (ctx: StringLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.numberLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumberLiteral?: (ctx: NumberLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.signedIntegerLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSignedIntegerLiteral?: (ctx: SignedIntegerLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.listLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitListLiteral?: (ctx: ListLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.mapLiteral`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapLiteral?: (ctx: MapLiteralContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.propertyKeyName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPropertyKeyName?: (ctx: PropertyKeyNameContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.parameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParameter?: (ctx: ParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.functionInvocation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionInvocation?: (ctx: FunctionInvocationContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.functionName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionName?: (ctx: FunctionNameContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.functionArgument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctionArgument?: (ctx: FunctionArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.namespace`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamespace?: (ctx: NamespaceContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.variableList1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariableList1?: (ctx: VariableList1Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.variable`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariable?: (ctx: VariableContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicNameList1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicNameList1?: (ctx: SymbolicNameList1Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateCommand?: (ctx: CreateCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.command`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommand?: (ctx: CommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.commandWithUseGraph`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCommandWithUseGraph?: (ctx: CommandWithUseGraphContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropCommand?: (ctx: DropCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterCommand?: (ctx: AlterCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowCommand?: (ctx: ShowCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.terminateCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTerminateCommand?: (ctx: TerminateCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showAllCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowAllCommand?: (ctx: ShowAllCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showNodeCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowNodeCommand?: (ctx: ShowNodeCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showRelationshipCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowRelationshipCommand?: (ctx: ShowRelationshipCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showRelCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowRelCommand?: (ctx: ShowRelCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showPropertyCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowPropertyCommand?: (ctx: ShowPropertyCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.yieldItem`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitYieldItem?: (ctx: YieldItemContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.yieldClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitYieldClause?: (ctx: YieldClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showIndexesAllowBrief`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowIndexesAllowBrief?: (ctx: ShowIndexesAllowBriefContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showIndexesNoBrief`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowIndexesNoBrief?: (ctx: ShowIndexesNoBriefContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showConstraintsAllowBriefAndYield`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowConstraintsAllowBriefAndYield?: (ctx: ShowConstraintsAllowBriefAndYieldContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showConstraintsAllowBrief`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowConstraintsAllowBrief?: (ctx: ShowConstraintsAllowBriefContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showConstraintsAllowYield`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowConstraintsAllowYield?: (ctx: ShowConstraintsAllowYieldContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showProcedures`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowProcedures?: (ctx: ShowProceduresContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showFunctions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowFunctions?: (ctx: ShowFunctionsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showTransactions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowTransactions?: (ctx: ShowTransactionsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.terminateTransactions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTerminateTransactions?: (ctx: TerminateTransactionsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showOrTerminateTransactions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowOrTerminateTransactions?: (ctx: ShowOrTerminateTransactionsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringsOrExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringsOrExpression?: (ctx: StringsOrExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showSettings`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowSettings?: (ctx: ShowSettingsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createConstraint`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateConstraint?: (ctx: CreateConstraintContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropConstraint`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropConstraint?: (ctx: DropConstraintContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createIndex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateIndex?: (ctx: CreateIndexContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.oldCreateIndex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOldCreateIndex?: (ctx: OldCreateIndexContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createIndex_`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateIndex_?: (ctx: CreateIndex_Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createFulltextIndex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateFulltextIndex?: (ctx: CreateFulltextIndexContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createLookupIndex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateLookupIndex?: (ctx: CreateLookupIndexContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropIndex`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropIndex?: (ctx: DropIndexContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.propertyList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPropertyList?: (ctx: PropertyListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.renameCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenameCommand?: (ctx: RenameCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.grantCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGrantCommand?: (ctx: GrantCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.revokeCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRevokeCommand?: (ctx: RevokeCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.enableServerCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnableServerCommand?: (ctx: EnableServerCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterServer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterServer?: (ctx: AlterServerContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.renameServer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenameServer?: (ctx: RenameServerContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropServer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropServer?: (ctx: DropServerContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showServers`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowServers?: (ctx: ShowServersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.allocationCommand`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllocationCommand?: (ctx: AllocationCommandContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.deallocateDatabaseFromServers`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeallocateDatabaseFromServers?: (ctx: DeallocateDatabaseFromServersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.reallocateDatabases`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReallocateDatabases?: (ctx: ReallocateDatabasesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createRole`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateRole?: (ctx: CreateRoleContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropRole`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropRole?: (ctx: DropRoleContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.renameRole`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenameRole?: (ctx: RenameRoleContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showRoles`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowRoles?: (ctx: ShowRolesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.grantRole`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGrantRole?: (ctx: GrantRoleContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.revokeRole`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRevokeRole?: (ctx: RevokeRoleContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateUser?: (ctx: CreateUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropUser?: (ctx: DropUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.renameUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenameUser?: (ctx: RenameUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterCurrentUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterCurrentUser?: (ctx: AlterCurrentUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterUser?: (ctx: AlterUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.setPassword`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetPassword?: (ctx: SetPasswordContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.passwordExpression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPasswordExpression?: (ctx: PasswordExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.passwordChangeRequired`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPasswordChangeRequired?: (ctx: PasswordChangeRequiredContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.userStatus`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUserStatus?: (ctx: UserStatusContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.homeDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHomeDatabase?: (ctx: HomeDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showUsers`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowUsers?: (ctx: ShowUsersContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showCurrentUser`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowCurrentUser?: (ctx: ShowCurrentUserContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showPrivileges`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowPrivileges?: (ctx: ShowPrivilegesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showRolePrivileges`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowRolePrivileges?: (ctx: ShowRolePrivilegesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showUserPrivileges`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowUserPrivileges?: (ctx: ShowUserPrivilegesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.grantRoleManagement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGrantRoleManagement?: (ctx: GrantRoleManagementContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.revokeRoleManagement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRevokeRoleManagement?: (ctx: RevokeRoleManagementContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.roleManagementPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRoleManagementPrivilege?: (ctx: RoleManagementPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.grantPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGrantPrivilege?: (ctx: GrantPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.denyPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDenyPrivilege?: (ctx: DenyPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.revokePrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRevokePrivilege?: (ctx: RevokePrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.privilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrivilege?: (ctx: PrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.allPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAllPrivilege?: (ctx: AllPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreatePrivilege?: (ctx: CreatePrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropPrivilege?: (ctx: DropPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowPrivilege?: (ctx: ShowPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.setPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSetPrivilege?: (ctx: SetPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.removePrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemovePrivilege?: (ctx: RemovePrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.writePrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWritePrivilege?: (ctx: WritePrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.databasePrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDatabasePrivilege?: (ctx: DatabasePrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dbmsPrivilege`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDbmsPrivilege?: (ctx: DbmsPrivilegeContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.executeFunctionQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExecuteFunctionQualifier?: (ctx: ExecuteFunctionQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.executeProcedureQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExecuteProcedureQualifier?: (ctx: ExecuteProcedureQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.settingQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSettingQualifier?: (ctx: SettingQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.globs`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGlobs?: (ctx: GlobsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.qualifiedGraphPrivilegesWithProperty`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifiedGraphPrivilegesWithProperty?: (ctx: QualifiedGraphPrivilegesWithPropertyContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.qualifiedGraphPrivileges`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualifiedGraphPrivileges?: (ctx: QualifiedGraphPrivilegesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.labelResource`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabelResource?: (ctx: LabelResourceContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.propertyResource`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPropertyResource?: (ctx: PropertyResourceContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.graphQualifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGraphQualifier?: (ctx: GraphQualifierContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateDatabase?: (ctx: CreateDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.options_`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptions_?: (ctx: Options_Context) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createCompositeDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateCompositeDatabase?: (ctx: CreateCompositeDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropDatabase?: (ctx: DropDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterDatabase?: (ctx: AlterDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.startDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStartDatabase?: (ctx: StartDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stopDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStopDatabase?: (ctx: StopDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.waitClause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWaitClause?: (ctx: WaitClauseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showDatabase`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowDatabase?: (ctx: ShowDatabaseContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.databaseScopeList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDatabaseScopeList?: (ctx: DatabaseScopeListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.graphScopeList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGraphScopeList?: (ctx: GraphScopeListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.createAlias`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateAlias?: (ctx: CreateAliasContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.dropAlias`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDropAlias?: (ctx: DropAliasContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.alterAlias`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlterAlias?: (ctx: AlterAliasContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.showAliases`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShowAliases?: (ctx: ShowAliasesContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicAliasNameList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicAliasNameList?: (ctx: SymbolicAliasNameListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicAliasName`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicAliasName?: (ctx: SymbolicAliasNameContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicNameOrStringParameterList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicNameOrStringParameterList?: (ctx: SymbolicNameOrStringParameterListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicNameOrStringParameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicNameOrStringParameter?: (ctx: SymbolicNameOrStringParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.glob`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGlob?: (ctx: GlobContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.globRecursive`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGlobRecursive?: (ctx: GlobRecursiveContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.globPart`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGlobPart?: (ctx: GlobPartContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringImage`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringImage?: (ctx: StringImageContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringList`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringList?: (ctx: StringListContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringToken`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringToken?: (ctx: StringTokenContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.stringOrParameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStringOrParameter?: (ctx: StringOrParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.mapOrParameter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMapOrParameter?: (ctx: MapOrParameterContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.map`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMap?: (ctx: MapContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicNamePositions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicNamePositions?: (ctx: SymbolicNamePositionsContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.symbolicNameString`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolicNameString?: (ctx: SymbolicNameStringContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.escapedSymbolicNameString`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEscapedSymbolicNameString?: (ctx: EscapedSymbolicNameStringContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.unescapedSymbolicNameString`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnescapedSymbolicNameString?: (ctx: UnescapedSymbolicNameStringContext) => Result;

	/**
	 * Visit a parse tree produced by `CypherParser.endOfFile`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEndOfFile?: (ctx: EndOfFileContext) => Result;
}

