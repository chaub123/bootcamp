import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {1,2,3,4,5};
        System.out.println(arr);

        int[] arr2 = arr;
        arr2[0] = 100;
        System.out.println(Arrays.toString(arr));
    }
}
