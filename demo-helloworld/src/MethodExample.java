import java.util.Arrays;

public class MethodExample {
  
  // A method to calculate item total price
  public static double totalPrice(int q, double p){
    return q * p;

  }  
  // A method to calculate total amount of invoice

  public static double totalAmount(double[] prices){
    double total = 0d;
    for(double i:prices){
      total += i;
    }
    return total;
  }

  public static void main(String[] args) {
    int[] quantities = new int[] {5, 10, 4 , 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3}; 

    // This part handles the array for total price
    double[] totalPriceItems = new double[quantities.length];
    for (int i =0; i<quantities.length;i++){
      totalPriceItems[i] = totalPrice(quantities[i], unitPrices[i]);
    }
    System.out.println(Arrays.toString(totalPriceItems));

    // This part uses method to sum up the price item array
    double invoiceTotalAmount = totalAmount(totalPriceItems);
    System.out.println(invoiceTotalAmount);
  }
}
