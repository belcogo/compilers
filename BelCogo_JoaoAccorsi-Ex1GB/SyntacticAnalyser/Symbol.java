package SyntacticAnalyser;

public class Symbol {
  public String name;
  public String type;
  public String scope;

  public Symbol(String name, String type, String scope) {
      this.name = name;
      this.type = type;
      this.scope = scope;
  }

  @Override
  public String toString() {
      return name + " : " + type + " (" + scope + ")";
  }
}

