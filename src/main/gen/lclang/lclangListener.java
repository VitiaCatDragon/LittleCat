// Generated from D:/IdeaProjects/LittleCat/src/main/java/lclang\lclang.g4 by ANTLR 4.9.1
package lclang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lclangParser}.
 */
public interface lclangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lclangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(lclangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(lclangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lclangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lclangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(lclangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(lclangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(lclangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(lclangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(lclangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(lclangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(lclangParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(lclangParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(lclangParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(lclangParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(lclangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(lclangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(lclangParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(lclangParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(lclangParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(lclangParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lclangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lclangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lclangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lclangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(lclangParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(lclangParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#classExpr}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(lclangParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#classExpr}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(lclangParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(lclangParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(lclangParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(lclangParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(lclangParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(lclangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(lclangParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(lclangParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(lclangParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(lclangParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(lclangParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(lclangParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(lclangParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link lclangParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(lclangParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lclangParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(lclangParser.GlobalContext ctx);
}