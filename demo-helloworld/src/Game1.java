import java.util.Random;
import java.util.Scanner;

public class Game1 {
  public static void main(String[] args) {
    int bomb = new Random().nextInt(100) + 1;
    int min = 0;
    int max = 100;
    boolean isWin = false;

    Scanner sc = new Scanner(System.in);
    int input;

    do{
      System.out.println("Please input a number from " + min + " to " + max);
      input = sc.nextInt();
      if(input > max || input < min){
        System.out.println("Incorrect input!");
        continue;
      }

      if(input == bomb){
        isWin = true;
      }else if(input > bomb){
        max = input;
      }else{
        min = input;
      }
    }while(!isWin);

    sc.close();
    System.out.println("You win, the bomb is " + bomb);
  }
}
