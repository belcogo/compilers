import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
  protected Map<String, String> symbols = new HashMap<>();

  public void addSymbol(String name, String type) {
    symbols.put(name, type);
  }

  public String getSymbol(String name) {
    return symbols.get(name);
  }

  public Boolean alreadyExists(String name) {
    return symbols.containsKey(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, String> entry : symbols.entrySet()) {
        sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
    }
    return sb.toString();
  }
}
