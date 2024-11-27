// Generated from SyntacticAnalyser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntacticAnalyserParser}.
 */
public interface SyntacticAnalyserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SyntacticAnalyserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SyntacticAnalyserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(SyntacticAnalyserParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(SyntacticAnalyserParser.Method_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SyntacticAnalyserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SyntacticAnalyserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterB_term(SyntacticAnalyserParser.B_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitB_term(SyntacticAnalyserParser.B_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_op(SyntacticAnalyserParser.Boolean_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_op(SyntacticAnalyserParser.Boolean_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#a_term}.
	 * @param ctx the parse tree
	 */
	void enterA_term(SyntacticAnalyserParser.A_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#a_term}.
	 * @param ctx the parse tree
	 */
	void exitA_term(SyntacticAnalyserParser.A_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#aritmetic_op}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_op(SyntacticAnalyserParser.Aritmetic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#aritmetic_op}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_op(SyntacticAnalyserParser.Aritmetic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SyntacticAnalyserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SyntacticAnalyserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(SyntacticAnalyserParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(SyntacticAnalyserParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(SyntacticAnalyserParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(SyntacticAnalyserParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(SyntacticAnalyserParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(SyntacticAnalyserParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SyntacticAnalyserParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SyntacticAnalyserParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SyntacticAnalyserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SyntacticAnalyserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(SyntacticAnalyserParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(SyntacticAnalyserParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#attr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttr_declaration(SyntacticAnalyserParser.Attr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#attr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttr_declaration(SyntacticAnalyserParser.Attr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#attribuition_op}.
	 * @param ctx the parse tree
	 */
	void enterAttribuition_op(SyntacticAnalyserParser.Attribuition_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#attribuition_op}.
	 * @param ctx the parse tree
	 */
	void exitAttribuition_op(SyntacticAnalyserParser.Attribuition_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(SyntacticAnalyserParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(SyntacticAnalyserParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(SyntacticAnalyserParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(SyntacticAnalyserParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(SyntacticAnalyserParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(SyntacticAnalyserParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SyntacticAnalyserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SyntacticAnalyserParser.ProgContext ctx);
}