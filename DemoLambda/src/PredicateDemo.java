import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    System.out.println(isMale.test('F'));
    test(isMale, 'F', false);
    test(isMale, 'M', true);

    BiPredicate<String, String> equals = 
        (s1, s2) -> s1 != null && s1.equals(s2);

    test(equals, "Abc", "abc", false);
    test(equals, "BCD", "BCD", false);

    Predicate<LocalDate> coolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
    test(coolingOff, LocalDate.of(2023, 7,16), false);
    test(coolingOff, LocalDate.of(2023, 7, 17), true);

  }

  public static <T> void test(Predicate<T> testcase, T data, boolean expectedResult) throws Exception {
    if(testcase.test(data) != expectedResult) 
      throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2, boolean expectedResult) throws Exception {
    if(testcase.test(data, data2) == expectedResult)
      return;
    throw new Exception();
  }
}
