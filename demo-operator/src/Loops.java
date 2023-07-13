public class Loops {
  public static void main(String[] args) {
 
    
    int loop = 10;
    
    for(int i=1; i<=loop;i++){
      String star = "";
      for(int j=0; j<i; j++){
          star += "*";
        }
      System.out.println(star);
    }
    

    int level = 10;
    for(int i = 1; i <= level; i++){
      String star = "*".repeat(i);
      System.out.println(star);
    }

  }
}
