import java.util.List;
import java.util.Objects;

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
  public void enterMain_function(SyntacticAnalyserParser.Main_functionContext ctx) {
    tac.treeAddressCode.append("main").append(":").append("\n");
    crawlCommands(ctx.commands());
    tac.treeAddressCode.append("\n");
    super.enterMain_function(ctx);
  }

  @Override
  public void enterMethod_declaration(SyntacticAnalyserParser.Method_declarationContext ctx) {
    super.enterMethod_declaration(ctx);
  }

  @Override
  public void exitParam(SyntacticAnalyserParser.ParamContext ctx) {
    super.exitParam(ctx);
  }

  @Override
  public void exitAttr_declaration(SyntacticAnalyserParser.Attr_declarationContext ctx) {
    String type = ctx.type().getText();
    String declaration = ctx.IDENTIFIER().getText();

    if (st.alreadyExists(declaration)) {
      throw new RuntimeException("Erro semântico: variável " + declaration + " já declarada.");
    }

    st.addSymbol(declaration, type);
    super.exitAttr_declaration(ctx);
  }

  private void crawlCommands(List<SyntacticAnalyserParser.CommandsContext> commands) {
    commands.forEach(this::visitCommand);
  }

  private void visitCommand(SyntacticAnalyserParser.CommandsContext ctx) {
    if (ctx.attribuition_op() != null) {
      visitAttribuitionOp(ctx.attribuition_op());
    }
    if (ctx.attr_declaration() != null) {
      visitAttrDeclaration(ctx.attr_declaration());
    }
    if (ctx.while_() != null) {
      visitWhile(ctx.while_());
    }
    if (ctx.ifelse() != null) {
      visitIfelse(ctx.ifelse());
    }
    if (ctx.method_call() != null) {
      visitMethodCall(ctx.method_call());
    }
    if (ctx.expression() != null) {
      String exp = visitExpression(ctx.expression(), " ");
      tac.treeAddressCode.append("RETURN ").append(exp);
    }
  }

  private void visitAttrDeclaration(SyntacticAnalyserParser.Attr_declarationContext ctx) {
    String left = visitExpression(ctx.expression(), ctx.IDENTIFIER().getText());
    String attribution = left + " = " + ctx.IDENTIFIER().getText();
    System.out.println(attribution);
    tac.treeAddressCode.append(attribution).append("\n");
  }

  private void visitAttribuitionOp(SyntacticAnalyserParser.Attribuition_opContext ctx) {
    String left = visitExpression(ctx.expression(), ctx.IDENTIFIER().getText());
    String attribution = left + " = " + ctx.IDENTIFIER().getText();
    tac.treeAddressCode.append(attribution).append("\n");
  }

  private void visitWhile(SyntacticAnalyserParser.WhileContext ctx) {

  }

  private void visitIfelse(SyntacticAnalyserParser.IfelseContext ctx) {

  }

  private void visitMethodCall(SyntacticAnalyserParser.Method_callContext ctx) {

  }

  private String visitExpression(SyntacticAnalyserParser.ExpressionContext ctx, String variable) {
    String expression = "";
    if (ctx.aritmetic_op() != null) {
      expression = handleAritmeticOp(ctx.aritmetic_op(), variable);
    }

    if (ctx.boolean_op() != null) {
      expression = handleBooleanOp(ctx.boolean_op());
    }
    return expression;
  }

  private String handleAritmeticOp(SyntacticAnalyserParser.Aritmetic_opContext ctx, String variable) {
    String left = extractAExpValue(ctx.a_term(0));
    String variableLabel = "";
    for (int i = 0; i < ctx.a_term().size(); i++) {
      String expression = "";
      if (!Objects.equals(variable, "")) {
        expression = variable + " = ";
      }
      expression += left;
      String tLabel = tac.getLabelT();
      if (ctx.getChild(2 * i - 1) != null) {
        String operation = ctx.getChild(2 * i - 1).getText();
        String right = extractAExpValue(ctx.a_term(i));

        expression += operation + right;
      }

      tac.treeAddressCode.append(expression).append("\n");
      variableLabel = tLabel;
    }

    return variableLabel;
  }

  private String handleBooleanOp(SyntacticAnalyserParser.Boolean_opContext ctx) {
    String left = extractBExpValue(ctx.b_term(0));
    String variableLabel = "";
    for (int i = 0; i < ctx.b_term().size(); i++) {
      String tLabel = tac.getLabelT();
      String operation = ctx.getChild(2 * i - 1).getText();
      String right = extractBExpValue(ctx.b_term(i));

      String expression = left + operation + right;
      tac.treeAddressCode.append(expression).append("\n");
      variableLabel = tLabel;
    }

    return variableLabel;
  }

  private String extractAExpValue(SyntacticAnalyserParser.A_termContext ctx) {
    System.out.println(ctx.getText());
    if (ctx.IDENTIFIER() != null) return ctx.IDENTIFIER().getText();
    if (ctx.NUMBER() != null) return ctx.NUMBER().getText();
    return ctx.getText();
  }

  private String extractBExpValue(SyntacticAnalyserParser.B_termContext ctx) {
    String left = visitTerm(ctx.term(0));
    String variableLabel = "";
    for (int i = 0; i < ctx.term().size(); i++) {
      String tLabel = tac.getLabelT();
      String operation = ctx.getChild(2 * i - 1).getText();
      String right = visitTerm(ctx.term(i));

      String expression = left + operation + right;
      tac.treeAddressCode.append(expression).append("\n");
      variableLabel = tLabel;
    }

    return variableLabel;
  }

  private String visitTerm(SyntacticAnalyserParser.TermContext ctx) {
    if (ctx.boolean_op() != null) return handleBooleanOp(ctx.boolean_op());

    if (ctx.TRUE() != null) return ctx.TRUE().getText();
    if (ctx.FALSE() != null) return ctx.FALSE().getText();
    if (ctx.IDENTIFIER() != null) return ctx.IDENTIFIER().getText();

    return ctx.NOT().getText() + visitTerm(ctx.term());
  }

}
