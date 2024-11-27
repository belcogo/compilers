import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
  public static void main(String[] args) {
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    try {
      // Lê o código-fonte de entrada
      String source = Files.readString(Paths.get(inputFile));
      CharStream input = CharStreams.fromString(source);

      // Lexer e Parser
      SyntacticAnalyserLexer lexer = new SyntacticAnalyserLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      SyntacticAnalyserParser parser = new SyntacticAnalyserParser(tokens);

      // Listener para análise semântica
      ParseTree tree = parser.prog();
      SyntacticAnalyserFOOLIListener listener = new SyntacticAnalyserFOOLIListener();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(listener, tree);

      // Obtém tabela de símbolos
      String symbolTable = listener.getSymbolTable();

      // Obtém tac
      String tac = listener.getTreeAddressCode();

      writeFile(outputFile, symbolTable, tac);

      System.out.println("Análise concluída com sucesso. Resultados salvos em: " + outputFile);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void writeFile(String outputFile, String symbolTable, String tac) throws IOException {
    try (FileWriter writer = new FileWriter(outputFile)) {
      // Escreve tabela de símbolos
      writer.write("==============================\n");
      writer.write("Tabela de Símbolos:\n");
      writer.write("==============================\n");
      writer.write(symbolTable);

      // Escreve TAC
      writer.write("\n==============================\n");
      writer.write("Código Intermediário (TAC):\n");
      writer.write("==============================\n");
      writer.write(tac);
    }
  }
}