// Generated from grammar/HTMLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thymeleafAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thymeleafAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#thAttribute}.
	 * @param ctx the parse tree
	 */
	void enterThAttribute(HTMLParser.ThAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#thAttribute}.
	 * @param ctx the parse tree
	 */
	void exitThAttribute(HTMLParser.ThAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#thValue}.
	 * @param ctx the parse tree
	 */
	void enterThValue(HTMLParser.ThValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#thValue}.
	 * @param ctx the parse tree
	 */
	void exitThValue(HTMLParser.ThValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#eachExpression}.
	 * @param ctx the parse tree
	 */
	void enterEachExpression(HTMLParser.EachExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#eachExpression}.
	 * @param ctx the parse tree
	 */
	void exitEachExpression(HTMLParser.EachExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thUnaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThUnaryExpr(HTMLParser.ThUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thUnaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThUnaryExpr(HTMLParser.ThUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thAndExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThAndExpr(HTMLParser.ThAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thAndExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThAndExpr(HTMLParser.ThAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thRelExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThRelExpr(HTMLParser.ThRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thRelExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThRelExpr(HTMLParser.ThRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thMulExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThMulExpr(HTMLParser.ThMulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thMulExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThMulExpr(HTMLParser.ThMulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThPrimaryExpr(HTMLParser.ThPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThPrimaryExpr(HTMLParser.ThPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thTernaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThTernaryExpr(HTMLParser.ThTernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thTernaryExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThTernaryExpr(HTMLParser.ThTernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thAddExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThAddExpr(HTMLParser.ThAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thAddExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThAddExpr(HTMLParser.ThAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thOrExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThOrExpr(HTMLParser.ThOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thOrExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThOrExpr(HTMLParser.ThOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thEqExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void enterThEqExpr(HTMLParser.ThEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thEqExpr}
	 * labeled alternative in {@link HTMLParser#thExpression}.
	 * @param ctx the parse tree
	 */
	void exitThEqExpr(HTMLParser.ThEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#thPrimary}.
	 * @param ctx the parse tree
	 */
	void enterThPrimary(HTMLParser.ThPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#thPrimary}.
	 * @param ctx the parse tree
	 */
	void exitThPrimary(HTMLParser.ThPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(HTMLParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(HTMLParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selectionExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectionExpression(HTMLParser.SelectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selectionExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectionExpression(HTMLParser.SelectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpression(HTMLParser.MessageExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#messageExpression}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpression(HTMLParser.MessageExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#linkExpression}.
	 * @param ctx the parse tree
	 */
	void enterLinkExpression(HTMLParser.LinkExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#linkExpression}.
	 * @param ctx the parse tree
	 */
	void exitLinkExpression(HTMLParser.LinkExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#linkUrl}.
	 * @param ctx the parse tree
	 */
	void enterLinkUrl(HTMLParser.LinkUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#linkUrl}.
	 * @param ctx the parse tree
	 */
	void exitLinkUrl(HTMLParser.LinkUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#urlPart}.
	 * @param ctx the parse tree
	 */
	void enterUrlPart(HTMLParser.UrlPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#urlPart}.
	 * @param ctx the parse tree
	 */
	void exitUrlPart(HTMLParser.UrlPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#linkParameters}.
	 * @param ctx the parse tree
	 */
	void enterLinkParameters(HTMLParser.LinkParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#linkParameters}.
	 * @param ctx the parse tree
	 */
	void exitLinkParameters(HTMLParser.LinkParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#linkParameter}.
	 * @param ctx the parse tree
	 */
	void enterLinkParameter(HTMLParser.LinkParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#linkParameter}.
	 * @param ctx the parse tree
	 */
	void exitLinkParameter(HTMLParser.LinkParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlRelExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlRelExpr(HTMLParser.OgnlRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlRelExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlRelExpr(HTMLParser.OgnlRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlMulExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlMulExpr(HTMLParser.OgnlMulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlMulExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlMulExpr(HTMLParser.OgnlMulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlOrExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlOrExpr(HTMLParser.OgnlOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlOrExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlOrExpr(HTMLParser.OgnlOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlAddExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlAddExpr(HTMLParser.OgnlAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlAddExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlAddExpr(HTMLParser.OgnlAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlPrimaryExpr(HTMLParser.OgnlPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlPrimaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlPrimaryExpr(HTMLParser.OgnlPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlUnaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlUnaryExpr(HTMLParser.OgnlUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlUnaryExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlUnaryExpr(HTMLParser.OgnlUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlEqExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlEqExpr(HTMLParser.OgnlEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlEqExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlEqExpr(HTMLParser.OgnlEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ognlAndExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void enterOgnlAndExpr(HTMLParser.OgnlAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ognlAndExpr}
	 * labeled alternative in {@link HTMLParser#ognlExpression}.
	 * @param ctx the parse tree
	 */
	void exitOgnlAndExpr(HTMLParser.OgnlAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ognlPrimary}.
	 * @param ctx the parse tree
	 */
	void enterOgnlPrimary(HTMLParser.OgnlPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ognlPrimary}.
	 * @param ctx the parse tree
	 */
	void exitOgnlPrimary(HTMLParser.OgnlPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(HTMLParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(HTMLParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#memberSuffix}.
	 * @param ctx the parse tree
	 */
	void enterMemberSuffix(HTMLParser.MemberSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#memberSuffix}.
	 * @param ctx the parse tree
	 */
	void exitMemberSuffix(HTMLParser.MemberSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#thLiteral}.
	 * @param ctx the parse tree
	 */
	void enterThLiteral(HTMLParser.ThLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#thLiteral}.
	 * @param ctx the parse tree
	 */
	void exitThLiteral(HTMLParser.ThLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(HTMLParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(HTMLParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(HTMLParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(HTMLParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(HTMLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(HTMLParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selectorSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSelectorSuffix(HTMLParser.SelectorSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selectorSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSelectorSuffix(HTMLParser.SelectorSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(HTMLParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(HTMLParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(HTMLParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(HTMLParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(HTMLParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(HTMLParser.CssFunctionContext ctx);
}