public class SwapText {
  public static void main(String[] args) {
    // hello! -> ehll!o
    // abcd -> bacd
    // aabb -> aabb
    //abcdef -> badcfe
    // abc -> bac
    // c ->c
    System.out.println(swapOddEvenChar("hello!"));
    System.out.println(swapOddEvenChar("abcd"));
    System.out.println(swapOddEvenChar("aabb"));
    System.out.println(swapOddEvenChar("abcdef"));
    System.out.println(swapOddEvenChar("abcdefg"));
    System.out.println(swapOddEvenChar("abc"));
    System.out.println(swapOddEvenChar("c"));
    System.out.println(swapOddEvenChar("HappyJavaProgramming"));
  }

  public static String swapOddEvenChar(String str){

    String result = "";

    for(int i=0; i<str.length(); i+=2){
      if(str.length() - i > 1){
        result += str.charAt(i + 1);
        result += str.charAt(i);
      }else{
        result += str.charAt(i);
      }
    }
    return result;
  }
}
