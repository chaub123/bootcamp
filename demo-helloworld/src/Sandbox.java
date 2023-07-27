import java.util.Arrays;

public class Sandbox{
  public static void main(String[] args) {
    StringBox sb = new StringBox("Chaub");
    System.out.println(sb.getString());
    sb.append("hihi");
    System.out.println(sb.getString());
    sb.append("Again");
    System.out.println(sb.getString());
    char[] result = sb.toCharArray();
    System.out.println(Arrays.toString(result));
  }
}