import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {
  public static void main(String[] args) {
    // left is input, right is output
    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc"));

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    Function<String, String> formula = str -> "Default"; 
    String result = map.computeIfAbsent("abc", formula);
    String result2 = map.computeIfAbsent("def", formula);
    System.out.println(result);
    System.out.println(result2);
    String result3 = map.computeIfAbsent("xyz", s -> "Default");
    System.out.println(result3);
    System.out.println(map);

    // bi function
    BiFunction<Integer, Integer, BigDecimal> addition = 
        (x, y) -> BigDecimal.valueOf(x+y);
    System.out.println(addition.apply(-4, 3).abs());

    

    Map<String, Integer> stock = new HashMap<>();
    stock.put("Clothes", 100);
    stock.compute("Clothes", (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    
    System.out.println(stock.get("Clothes"));
  }
  
}
