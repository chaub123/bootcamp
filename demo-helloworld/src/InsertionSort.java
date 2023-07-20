import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = new int[] {5, 1, 4, 8, 2};
    System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
      for(int i = 1; i < arr.length; i++){
        for(int j = 0; j < i; j++){
          if(arr[i -j] < arr[i - j -1]){
            int temp = arr[i-j];
            arr[i-j] = arr[i -j -1];
            arr[i - j - 1] = temp;
          }
        }
      }
      return arr;
    }
}
