import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate<String> startWithV = str1 -> str1.startsWith("V");
    Predicate<String> endWithE = str1 -> str1.endsWith("E");

    Predicate<String> combined = startWithV.and(endWithE);
    System.out.println(combined.test("VE"));
    System.out.println(combined.test("AE"));
    System.out.println(combined.test("VA"));

    Predicate<String> combined2 = startWithV.or(endWithE);
    System.out.println(combined2.test("VE"));
    System.out.println(combined2.test("AE"));
    System.out.println(combined2.test("VA"));
  }
  
}
