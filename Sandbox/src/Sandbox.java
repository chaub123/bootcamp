import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Sandbox {
    public static void main(String[] args) {
        
        int[] nums = {101,243,31,44,55,6,7,8,9,10};
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }
}
