public class LogicalOperators {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    boolean result = isExpensive && isWorthToBuy;
    boolean result2 = isExpensive || isWorthToBuy;


    int x =5;
    int y= 10;
    int result17 = (x++ + 2) * x++;

    // 5+2
    System.out.println(result17);
  }
}
