package setDemo;

import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("def");
    boolean result = strings.add("abc");
    System.out.println(strings);
    System.out.println(result);

    if(strings.add("def")){
      System.out.println("def is added.");
    }else{
      System.out.println("def is not added.");
    }
  }
}
