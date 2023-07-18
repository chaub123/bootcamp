import java.util.Arrays;

public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};

    // Use method to swap
    System.out.println(Arrays.toString(swapArray(arr)));
  }

  // define a method to swap
  public static int[] swapArray(int[] arr){
    int tmp = arr[0];
    arr[0] = arr[arr.length -1];
    arr[arr.length -1] = tmp;

    return arr;
  }
}
