public class DemoNumberFormatting {
  public static void main(String[] args) {
    try {
      Integer.valueOf("abc");
    }catch(NumberFormatException e){
      System.out.println("error");
    }
  }
  
}
