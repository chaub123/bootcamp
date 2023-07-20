import java.util.Arrays;

public class Method2 {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 10, 3, 4, 20};
    System.out.println(Arrays.toString(products(nums)));
  }

  public static int[] products(int[] arr){
    int[] result = new int[arr.length];
    for(int i=0; i<arr.length -1;i++){
        result[i] = product(arr[i], arr[i+1]);
      }
    result[arr.length-1] = product(arr[arr.length-1], arr[0]);
    return result;
    }

  public static int product(int a, int b){
      return a * b;
    }
}
