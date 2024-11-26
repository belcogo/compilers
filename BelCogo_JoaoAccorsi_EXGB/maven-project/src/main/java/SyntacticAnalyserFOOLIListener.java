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
  public void enterArguments(SyntacticAnalyserParser.ArgumentsContext ctx) {
    // TODO Auto-generated method stub
    super.enterArguments(ctx);
  }

  @Override
  public void enterAritmetic_op(SyntacticAnalyserParser.Aritmetic_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterAritmetic_op(ctx);
  }

  @Override
  public void enterAttr_declaration(SyntacticAnalyserParser.Attr_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.enterAttr_declaration(ctx);
  }

  @Override
  public void enterBoolean_constants(SyntacticAnalyserParser.Boolean_constantsContext ctx) {
    // TODO Auto-generated method stub
    super.enterBoolean_constants(ctx);
  }

  @Override
  public void enterClass(SyntacticAnalyserParser.ClassContext ctx) {
    // TODO Auto-generated method stub
    super.enterClass(ctx);
  }

  @Override
  public void enterCommands(SyntacticAnalyserParser.CommandsContext ctx) {
    // TODO Auto-generated method stub
    super.enterCommands(ctx);
  }

  @Override
  public void enterElse(SyntacticAnalyserParser.ElseContext ctx) {
    // TODO Auto-generated method stub
    super.enterElse(ctx);
  }

  @Override
  public void enterExp_four(SyntacticAnalyserParser.Exp_fourContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_four(ctx);
  }

  @Override
  public void enterExp_one(SyntacticAnalyserParser.Exp_oneContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_one(ctx);
  }

  @Override
  public void enterExp_three(SyntacticAnalyserParser.Exp_threeContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_three(ctx);
  }

  @Override
  public void enterExp_two(SyntacticAnalyserParser.Exp_twoContext ctx) {
    // TODO Auto-generated method stub
    super.enterExp_two(ctx);
  }

  @Override
  public void enterIf(SyntacticAnalyserParser.IfContext ctx) {
    // TODO Auto-generated method stub
    super.enterIf(ctx);
  }

  @Override
  public void enterIfelse(SyntacticAnalyserParser.IfelseContext ctx) {
    // TODO Auto-generated method stub
    super.enterIfelse(ctx);
  }

  @Override
  public void enterLogic_op(SyntacticAnalyserParser.Logic_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterLogic_op(ctx);
  }

  @Override
  public void enterMain_function(SyntacticAnalyserParser.Main_functionContext ctx) {
    // TODO Auto-generated method stub
    super.enterMain_function(ctx);
  }

  @Override
  public void enterMethod_declaration(SyntacticAnalyserParser.Method_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.enterMethod_declaration(ctx);
  }

  @Override
  public void enterMethod_type(SyntacticAnalyserParser.Method_typeContext ctx) {
    // TODO Auto-generated method stub
    super.enterMethod_type(ctx);
  }

  @Override
  public void enterProg(SyntacticAnalyserParser.ProgContext ctx) {
    // TODO Auto-generated method stub
    super.enterProg(ctx);
  }

  @Override
  public void enterRelational_op(SyntacticAnalyserParser.Relational_opContext ctx) {
    // TODO Auto-generated method stub
    super.enterRelational_op(ctx);
  }

  @Override
  public void enterType(SyntacticAnalyserParser.TypeContext ctx) {
    // TODO Auto-generated method stub
    super.enterType(ctx);
  }

  @Override
  public void enterWhile_command(SyntacticAnalyserParser.While_commandContext ctx) {
    // TODO Auto-generated method stub
    super.enterWhile_command(ctx);
  }

  @Override
  public void exitArguments(SyntacticAnalyserParser.ArgumentsContext ctx) {
    // TODO Auto-generated method stub
    super.exitArguments(ctx);
  }

  @Override
  public void exitAritmetic_op(SyntacticAnalyserParser.Aritmetic_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitAritmetic_op(ctx);
  }

  @Override
  public void exitAttr_declaration(SyntacticAnalyserParser.Attr_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.exitAttr_declaration(ctx);
  }

  @Override
  public void exitBoolean_constants(SyntacticAnalyserParser.Boolean_constantsContext ctx) {
    // TODO Auto-generated method stub
    super.exitBoolean_constants(ctx);
  }

  @Override
  public void exitClass(SyntacticAnalyserParser.ClassContext ctx) {
    // TODO Auto-generated method stub
    super.exitClass(ctx);
  }

  @Override
  public void exitCommands(SyntacticAnalyserParser.CommandsContext ctx) {
    // TODO Auto-generated method stub
    super.exitCommands(ctx);
  }

  @Override
  public void exitElse(SyntacticAnalyserParser.ElseContext ctx) {
    // TODO Auto-generated method stub
    super.exitElse(ctx);
  }

  @Override
  public void exitExp_four(SyntacticAnalyserParser.Exp_fourContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_four(ctx);
  }

  @Override
  public void exitExp_one(SyntacticAnalyserParser.Exp_oneContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_one(ctx);
  }

  @Override
  public void exitExp_three(SyntacticAnalyserParser.Exp_threeContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_three(ctx);
  }

  @Override
  public void exitExp_two(SyntacticAnalyserParser.Exp_twoContext ctx) {
    // TODO Auto-generated method stub
    super.exitExp_two(ctx);
  }

  @Override
  public void exitIf(SyntacticAnalyserParser.IfContext ctx) {
    // TODO Auto-generated method stub
    super.exitIf(ctx);
  }

  @Override
  public void exitIfelse(SyntacticAnalyserParser.IfelseContext ctx) {
    // TODO Auto-generated method stub
    super.exitIfelse(ctx);
  }

  @Override
  public void exitLogic_op(SyntacticAnalyserParser.Logic_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitLogic_op(ctx);
  }

  @Override
  public void exitMain_function(SyntacticAnalyserParser.Main_functionContext ctx) {
    // TODO Auto-generated method stub
    super.exitMain_function(ctx);
  }

  @Override
  public void exitMethod_declaration(SyntacticAnalyserParser.Method_declarationContext ctx) {
    // TODO Auto-generated method stub
    super.exitMethod_declaration(ctx);
  }

  @Override
  public void exitMethod_type(SyntacticAnalyserParser.Method_typeContext ctx) {
    // TODO Auto-generated method stub
    super.exitMethod_type(ctx);
  }

  @Override
  public void exitProg(SyntacticAnalyserParser.ProgContext ctx) {
    // TODO Auto-generated method stub
    super.exitProg(ctx);
  }

  @Override
  public void exitRelational_op(SyntacticAnalyserParser.Relational_opContext ctx) {
    // TODO Auto-generated method stub
    super.exitRelational_op(ctx);
  }

  @Override
  public void exitType(SyntacticAnalyserParser.TypeContext ctx) {
    // TODO Auto-generated method stub
    super.exitType(ctx);
  }

  @Override
  public void exitWhile_command(SyntacticAnalyserParser.While_commandContext ctx) {
    // TODO Auto-generated method stub
    super.exitWhile_command(ctx);
  }
}
