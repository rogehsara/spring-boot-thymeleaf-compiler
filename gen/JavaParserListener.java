// Generated from grammar/JavaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(JavaParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(JavaParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationArguments}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArguments(JavaParser.AnnotationArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationArguments}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArguments(JavaParser.AnnotationArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationPair}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationPair(JavaParser.AnnotationPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationPair}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationPair(JavaParser.AnnotationPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localVarStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarStatement(JavaParser.LocalVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localVarStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarStatement(JavaParser.LocalVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(JavaParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(JavaParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectExpr(JavaParser.NewObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectExpr(JavaParser.NewObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpr(JavaParser.InstanceofExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceofExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpr(JavaParser.InstanceofExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccessExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExpr(JavaParser.FieldAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccessExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExpr(JavaParser.FieldAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodRefExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodRefExpr(JavaParser.MethodRefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodRefExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodRefExpr(JavaParser.MethodRefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(JavaParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(JavaParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(JavaParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(JavaParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(JavaParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(JavaParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(JavaParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(JavaParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(JavaParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(JavaParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(JavaParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(JavaParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(JavaParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(JavaParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(JavaParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(JavaParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(JavaParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(JavaParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(JavaParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(JavaParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(JavaParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(JavaParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(JavaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(JavaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrimary(JavaParser.ParenPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrimary(JavaParser.ParenPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLambdaPrimary(JavaParser.LambdaPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLambdaPrimary(JavaParser.LambdaPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCallPrimary(JavaParser.CallPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCallPrimary(JavaParser.CallPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisPrimary(JavaParser.ThisPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisPrimary(JavaParser.ThisPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSuperPrimary(JavaParser.SuperPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSuperPrimary(JavaParser.SuperPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPrimary(JavaParser.LiteralPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPrimary(JavaParser.LiteralPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrimary(JavaParser.IdentifierPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierPrimary}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrimary(JavaParser.IdentifierPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(JavaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(JavaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
}