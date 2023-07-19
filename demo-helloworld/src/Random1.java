import java.util.Random;

public class Random1 {
  public static void main(String[] args) {
    System.out.println(swap("Disappointment", 5, 8));
  }

  public static String swap(String str, int idx1, int idx2){
    char[] chars = str.toCharArray();
    chars[idx1] = str.charAt(idx2);
    chars[idx2] = str.charAt(idx1);
    return String.valueOf(chars);
  }
}
