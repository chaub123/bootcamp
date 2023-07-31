import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);

    LocalDate specifiedDate = LocalDate.of(2023, 3, 24);
    System.out.println(specifiedDate);

    LocalDate d1 = LocalDate.parse("2023-05-26");
    System.out.println(d1.getYear());
    System.out.println(d1.getMonth());
    Month result = d1.getMonth();
    System.out.println(result.getValue());
    System.out.println(d1.getDayOfMonth());
    System.out.println(d1.getDayOfWeek());
    System.out.println(d1.getDayOfYear());

    d1 = d1.plusMonths(3);
    System.out.println(d1.getMonth());
  }
}
