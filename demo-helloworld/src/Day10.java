import java.util.Arrays;

public class Day10 {
  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void addOne(int[] nums){
    for(int i=0; i<nums.length; i++) {
      nums[i]++;
    }
  }
}
