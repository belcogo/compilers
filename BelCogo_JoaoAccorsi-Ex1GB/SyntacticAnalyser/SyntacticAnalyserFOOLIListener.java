package SyntacticAnalyser;

import SyntacticAnalyser.SyntacticAnalyserParser.*;

public class SyntacticAnalyserFOOLIListener extends SyntacticAnalyserBaseListener {
  private SymbolTable st = new SymbolTable();
  private TreeAddressCode tac = new TreeAddressCode();

  public String getTreeAddressCode() {
    return tac.getTreeAddressCode();
  }

  public String getSymbolTable() {
    return st.toString();
  }

  @Override
  public void enterArguments(ArgumentsContext ctx) {
    // TODO Auto-generated method stub
    super.enterArguments(ctx);
  }
  @Override
  public void enterAritmetic_op(Aritmetic_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterAritmetic_op(ctx);
  }
  @Override
  public void enterAttr_declaration(Attr_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.enterAttr_declaration(ctx);
  }
  @Override
  public void enterBoolean_constants(Boolean_constantsContext ctx) {
    // TODO Auto-generated method stub
    super.enterBoolean_constants(ctx);
  }
  @Override
  public void enterClass(ClassContext ctx) {
    // TODO Auto-generated method stub
    super.enterClass(ctx);
  }
  @Override
  public void enterCommands(CommandsContext ctx) {
    // TODO Auto-generated method stub
    super.enterCommands(ctx);
  }
  @Override
  public void enterElse(ElseContext ctx) {
    // TODO Auto-generated method stub
    super.enterElse(ctx);
  }
  @Override
  public void enterEveryRule(ParserRuleContext ctx) {
    // TODO Auto-generated method stub
    super.enterEveryRule(ctx);
  }
  @Override
  public void enterExp_four(Exp_fourContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_four(ctx);
  }
  @Override
  public void enterExp_one(Exp_oneContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_one(ctx);
  }
  @Override
  public void enterExp_three(Exp_threeContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_three(ctx);
  }
  @Override
  public void enterExp_two(Exp_twoContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_two(ctx);
  }
  @Override
  public void enterIf(IfContext ctx) {
    // TODO Auto-generated method stub
    super.enterIf(ctx);
  }
  @Override
  public void enterIfelse(IfelseContext ctx) {
    // TODO Auto-generated method stub
    super.enterIfelse(ctx);
  }
  @Override
  public void enterLogic_op(Logic_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterLogic_op(ctx);
  }
  @Override
  public void enterMain_function(Main_functionContext ctx) {
    // TODO Auto-generated method stub
    super.enterMain_function(ctx);
  }
  @Override
  public void enterMethod_declaration(Method_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.enterMethod_declaration(ctx);
  }
  @Override
  public void enterMethod_type(Method_typeContext ctx) {
    // TODO Auto-generated method stub
    super.enterMethod_type(ctx);
  }
  @Override
  public void enterProg(ProgContext ctx) {
    // TODO Auto-generated method stub
    super.enterProg(ctx);
  }
  @Override
  public void enterRelational_op(Relational_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterRelational_op(ctx);
  }
  @Override
  public void enterType(TypeContext ctx) {
    // TODO Auto-generated method stub
    super.enterType(ctx);
  }
  @Override
  public void enterWhile_command(While_commandContext ctx) {
    // TODO Auto-generated method stub
    super.enterWhile_command(ctx);
  }
  @Override
  public void exitArguments(ArgumentsContext ctx) {
    // TODO Auto-generated method stub
    super.exitArguments(ctx);
  }
  @Override
  public void exitAritmetic_op(Aritmetic_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitAritmetic_op(ctx);
  }
  @Override
  public void exitAttr_declaration(Attr_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.exitAttr_declaration(ctx);
  }
  @Override
  public void exitBoolean_constants(Boolean_constantsContext ctx) {
    // TODO Auto-generated method stub
    super.exitBoolean_constants(ctx);
  }
  @Override
  public void exitClass(ClassContext ctx) {
    // TODO Auto-generated method stub
    super.exitClass(ctx);
  }
  @Override
  public void exitCommands(CommandsContext ctx) {
    // TODO Auto-generated method stub
    super.exitCommands(ctx);
  }
  @Override
  public void exitElse(ElseContext ctx) {
    // TODO Auto-generated method stub
    super.exitElse(ctx);
  }
  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    // TODO Auto-generated method stub
    super.exitEveryRule(ctx);
  }
  @Override
  public void exitExp_four(Exp_fourContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_four(ctx);
  }
  @Override
  public void exitExp_one(Exp_oneContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_one(ctx);
  }
  @Override
  public void exitExp_three(Exp_threeContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_three(ctx);
  }
  @Override
  public void exitExp_two(Exp_twoContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_two(ctx);
  }
  @Override
  public void exitIf(IfContext ctx) {
    // TODO Auto-generated method stub
    super.exitIf(ctx);
  }
  @Override
  public void exitIfelse(IfelseContext ctx) {
    // TODO Auto-generated method stub
    super.exitIfelse(ctx);
  }
  @Override
  public void exitLogic_op(Logic_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitLogic_op(ctx);
  }
  @Override
  public void exitMain_function(Main_functionContext ctx) {
    // TODO Auto-generated method stub
    super.exitMain_function(ctx);
  }
  @Override
  public void exitMethod_declaration(Method_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.exitMethod_declaration(ctx);
  }
  @Override
  public void exitMethod_type(Method_typeContext ctx) {
    // TODO Auto-generated method stub
    super.exitMethod_type(ctx);
  }
  @Override
  public void exitProg(ProgContext ctx) {
    // TODO Auto-generated method stub
    super.exitProg(ctx);
  }
  @Override
  public void exitRelational_op(Relational_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitRelational_op(ctx);
  }
  @Override
  public void exitType(TypeContext ctx) {
    // TODO Auto-generated method stub
    super.exitType(ctx);
  }
  @Override
  public void exitWhile_command(While_commandContext ctx) {
    // TODO Auto-generated method stub
    super.exitWhile_command(ctx);
  }
  @Override
  public void visitErrorNode(ErrorNode node) {
    // TODO Auto-generated method stub
    super.visitErrorNode(node);
  }
  @Override
  public void visitTerminal(TerminalNode node) {
    // TODO Auto-generated method stub
    super.visitTerminal(node);
  }
}
