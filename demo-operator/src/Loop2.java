public class Loop2 {
  public static void main(String[] args) {
    
    String str = "I love programming. I love java.";
    char target = 'o';
    String output = "No";

    for(int i=0, j=0; i<str.length();i++){
      if(str.charAt(i) == target) j++;
      
      if(j >= 3){
        output = "Yes";
        break;
      }    
    }
    System.out.println(output);
  }
}
