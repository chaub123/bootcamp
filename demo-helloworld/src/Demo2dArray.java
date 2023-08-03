import java.util.Arrays;
import java.util.Random;

public class Demo2dArray {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[][] matrix = new int[3][4];

    Random random = new Random();

    for(int i=0; i < matrix.length; i++ ){
      for(int j=0; j < matrix[i].length; j++){
        matrix[i][j] = nums[random.nextInt(10)];
      }
    }

    for(int[] i : matrix){
        System.err.println(Arrays.toString(i));
    }
  }
}
