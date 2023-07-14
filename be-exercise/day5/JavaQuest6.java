/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    
    // use 3 varilables, i = loop, j = n, k = n-1, l=n-2
    for(int i=0, j=1, k=1, l=1; i < 19; i++){
      if(i < 2){
        System.out.print(j + " ");
        continue;
      }
        j = k + l; // update n
        System.out.print(j + " ");

        l = k; // n-1 becomes n-2
        k = j; // n becomes n-1
    }
  }
}
