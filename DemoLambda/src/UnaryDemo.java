import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  public static void main(String[] args) {
    UnaryOperator<String> upcase = str -> str.toUpperCase();
    System.out.println(upcase.apply("Hello"));

    BinaryOperator<String> concat = (str1, str2) -> str1.concat(str2);
    System.out.println(concat.apply("Hello", "World"));
  }
  
}
