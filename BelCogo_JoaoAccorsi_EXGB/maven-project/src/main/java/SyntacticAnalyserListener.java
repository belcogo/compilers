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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#boolean_constants}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_constants(SyntacticAnalyserParser.Boolean_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#boolean_constants}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_constants(SyntacticAnalyserParser.Boolean_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#exp_two}.
	 * @param ctx the parse tree
	 */
	void enterExp_two(SyntacticAnalyserParser.Exp_twoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#exp_two}.
	 * @param ctx the parse tree
	 */
	void exitExp_two(SyntacticAnalyserParser.Exp_twoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#exp_one}.
	 * @param ctx the parse tree
	 */
	void enterExp_one(SyntacticAnalyserParser.Exp_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#exp_one}.
	 * @param ctx the parse tree
	 */
	void exitExp_one(SyntacticAnalyserParser.Exp_oneContext ctx);
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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SyntacticAnalyserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SyntacticAnalyserParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#while_command}.
	 * @param ctx the parse tree
	 */
	void enterWhile_command(SyntacticAnalyserParser.While_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#while_command}.
	 * @param ctx the parse tree
	 */
	void exitWhile_command(SyntacticAnalyserParser.While_commandContext ctx);
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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(SyntacticAnalyserParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(SyntacticAnalyserParser.IfContext ctx);
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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#exp_three}.
	 * @param ctx the parse tree
	 */
	void enterExp_three(SyntacticAnalyserParser.Exp_threeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#exp_three}.
	 * @param ctx the parse tree
	 */
	void exitExp_three(SyntacticAnalyserParser.Exp_threeContext ctx);
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
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#exp_four}.
	 * @param ctx the parse tree
	 */
	void enterExp_four(SyntacticAnalyserParser.Exp_fourContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#exp_four}.
	 * @param ctx the parse tree
	 */
	void exitExp_four(SyntacticAnalyserParser.Exp_fourContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void enterLogic_op(SyntacticAnalyserParser.Logic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void exitLogic_op(SyntacticAnalyserParser.Logic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalyserParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(SyntacticAnalyserParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalyserParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(SyntacticAnalyserParser.Relational_opContext ctx);
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