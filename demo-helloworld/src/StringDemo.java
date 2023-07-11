public class StringDemo {
  public static void main(String[] args) {
    String str = "I am happy, but raining";
    str = str + ".";
    System.out.println(str);

    // Method
    str.length();

    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abcd";
    boolean checkEqual1 = str1.equals(str2);
    boolean checkEqual2 = str2.equals(str3);
    System.out.println(checkEqual1);
    System.out.println(checkEqual2);

    // charAt()
    String str4 = "Hello World!";
    System.out.println(str4.charAt(2));
    String str5 = "hi";
    char result = str5.charAt(1);
    System.out.println(result);


  }
}
