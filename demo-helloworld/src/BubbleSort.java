import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // target [1, 2, 4 , 5, 8]
    int[] arr = new int[] {5, 1, 4, 8, 2};
    System.out.println(Arrays.toString(sort(arr)));
  }

  public static int[] sort(int[] arr){
    for(int i=0; i<arr.length - 1;i++){
      for(int j=0; j<arr.length - 1 -i; j++){
        if(arr[j] > arr[j+1]){
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
      }
    }
  }
    return arr;
  }
}
