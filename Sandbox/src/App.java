import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(100));

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(100, 99));
    }
}
