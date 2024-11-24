package SyntacticAnalyser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Lê o arquivo de entrada
    String inputFile = args[0];
    String outputFile = args[1];

    // Inicializa o Lexer e o Parser
    SyntacticAnalyserLexer lexer = new SyntacticAnalyserLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    SyntacticAnalyserParser parser = new SyntacticAnalyserParser(tokens);

    // Gera a árvore sintática
    ParseTree tree = parser.program();

    // Constrói a tabela de símbolos
    SyntacticAnalyserListener listener = new SyntacticAnalyserListener();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(listener, tree);

    // Recupera e imprime a tabela de símbolos
    SymbolTable symbolTable = listener.getSymbolTable();
    System.out.println("Tabela de Símbolos:");
    // System.out.println(symbolTable);

    SymbolTable treeAddressCode = listener.getTreeAddressCode();
    System.out.println("TAC:");
    // System.out.println(treeAddressCode);

    writeFile(outputFile, symbolTable, treeAddressCode);
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
