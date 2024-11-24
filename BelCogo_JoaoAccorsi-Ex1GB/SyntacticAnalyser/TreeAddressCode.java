package SyntacticAnalyser;

import java.util.concurrent.atomic.AtomicInteger;

public class TreeAddressCode {
  public static StringBuilder treeAddressCode = new StringBuilder();
  private AtomicInteger labelL = new AtomicInteger();
  private AtomicInteger labelT = new AtomicInteger(); 

  public String getLabelL() {
    return "L" + this.labelL.getAndIncrement();
  }

  public String getLabelT() {
    return "t" + this.labelT.getAndIncrement();
  }

  public String getTreeAddressCode() {
    return treeAddressCode.toString();
  }
}
