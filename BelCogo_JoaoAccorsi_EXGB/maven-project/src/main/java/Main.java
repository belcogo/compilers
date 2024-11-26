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
    // Lê o arquivo de entrada
    String inputFile = args[0];
    String outputFile = args[1];
    try {

      String source = Files.readString(Paths.get(inputFile));
      CharStream charStreamInputFile = CharStreams.fromString(source);
  
  
      // Inicializa o Lexer e o Parser
      SyntacticAnalyserLexer lexer = new SyntacticAnalyserLexer(charStreamInputFile);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      SyntacticAnalyserParser parser = new SyntacticAnalyserParser(tokens);
  
      // Gera a árvore sintática
      ParseTree tree = parser.prog();
  
      // Constrói a tabela de símbolos
      SyntacticAnalyserFOOLIListener listener = new SyntacticAnalyserFOOLIListener();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(listener, tree);
  
      // Recupera e imprime a tabela de símbolos
      String st = listener.getSymbolTable();
      System.out.println("Tabela de Símbolos:");
      // System.out.println(symbolTable);
  
      String tac = listener.getTreeAddressCode();
      System.out.println("TAC:");
      // System.out.println(treeAddressCode);
  
      writeFile(outputFile, st, tac);
    } catch (Exception e) {}
  }

  private static void writeFile(String outputFile, String st, String tac) throws IOException {
    try (FileWriter writer = new FileWriter(outputFile)) {
      // Escreve tabela de símbolos
      writer.write("==============================\n");
      writer.write("Tabela de Símbolos:\n");
      writer.write("==============================\n");
      writer.write(st);

      // Escreve TAC
      writer.write("\n==============================\n");
      writer.write("Código Intermediário (TAC):\n");
      writer.write("==============================\n");
      writer.write(tac);
    } catch (Exception e) {}
  }
}
