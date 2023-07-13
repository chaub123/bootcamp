public class Conditionals {
  public static void main(String[] args) {
      String str = "I am a boy!";
      switch (str.charAt(2)){
        case 'a':
          System.out.println("A");
          break;
        case 'b':
          System.out.println("B");
          break;
        default:
          System.out.println("No match.");
      }
  }
}
