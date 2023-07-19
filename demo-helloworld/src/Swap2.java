import java.util.Arrays;

public class Swap2 {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 5, 11, 20};
    System.out.println(average(arr));
  }

  public static double average(int[] arr){
    double result = 0;
    for(int i:arr) result += i;
    return result / arr.length;
  }
}
