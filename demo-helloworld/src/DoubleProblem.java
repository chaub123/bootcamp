import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.30000000000000004

    if(result == 0.3){
      System.out.println("Equal.");
    }else{
      System.out.println("Not equal.");
    }

    System.out.println(0.3 / 0.1);
    System.out.println(0.2 * 0.1);

    BigDecimal b1 = new BigDecimal(5.0);
    BigDecimal b2 = BigDecimal.valueOf(5);
    System.out.println(b1.compareTo(b2));
    b2 = b2.multiply(b2);
    System.out.println(b2);
    b2 = b2.divide(BigDecimal.valueOf(0.1));
    System.out.println(b2);
    

    BigDecimal b3 = BigDecimal.valueOf(3.456);
    b3.setScale(2, RoundingMode.FLOOR);
    System.out.println(b3);
    
    
  }
}
