// Generated from grammar/HTMLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thymeleafAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#thAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThAttribute(HTMLParser.ThAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#thValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThValue(HTMLParser.ThValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#eachExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachExpression(HTMLParser.EachExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thUnaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThUnaryExpr(HTMLParser.ThUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thAndExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThAndExpr(HTMLParser.ThAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thRelExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThRelExpr(HTMLParser.ThRelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thMulExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThMulExpr(HTMLParser.ThMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThPrimaryExpr(HTMLParser.ThPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thTernaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThTernaryExpr(HTMLParser.ThTernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thAddExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThAddExpr(HTMLParser.ThAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thOrExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThOrExpr(HTMLParser.ThOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thEqExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThEqExpr(HTMLParser.ThEqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#thPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThPrimary(HTMLParser.ThPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(HTMLParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selectionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionExpression(HTMLParser.SelectionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(HTMLParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#linkExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkExpression(HTMLParser.LinkExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#linkUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkUrl(HTMLParser.LinkUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#urlPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlPart(HTMLParser.UrlPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#linkParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkParameters(HTMLParser.LinkParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#linkParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkParameter(HTMLParser.LinkParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlRelExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlRelExpr(HTMLParser.OgnlRelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlMulExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlMulExpr(HTMLParser.OgnlMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlOrExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlOrExpr(HTMLParser.OgnlOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlAddExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlAddExpr(HTMLParser.OgnlAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlPrimaryExpr(HTMLParser.OgnlPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlUnaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlUnaryExpr(HTMLParser.OgnlUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlEqExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlEqExpr(HTMLParser.OgnlEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ognlAndExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlAndExpr(HTMLParser.OgnlAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ognlPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOgnlPrimary(HTMLParser.OgnlPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(HTMLParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#memberSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSuffix(HTMLParser.MemberSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#thLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThLiteral(HTMLParser.ThLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(HTMLParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorList(HTMLParser.SelectorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selectorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorSuffix(HTMLParser.SelectorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(HTMLParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(HTMLParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(HTMLParser.CssFunctionContext ctx);
}