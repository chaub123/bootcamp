package RecursionDemo;

public class RecursionDemo {
  public static void main(String[] args) {
    // question 1
    System.out.println(sum(1000));
    System.out.println(sum(6));
    printK(3);
  }


  // k + (k-1) + (k-2) + 0   >>> 10, 9, 8 ,7 ,6 ... 0
  public static int sum(int k){
    if(k == 0) return k;
    return k + sum(k-1);
  }

  // 0, 1, 1, 2, 3, 5 ,8 13
  // k= 7, return 8
  public static int sum2(int k) {
    if (k <= 1) 
      return k;
    return sum2(k - 1) + sum2(k - 2);
    }

    //Question 3:
    // print 3,2,1,1,2,3, k = 3

    public static void printK(int k){
      if(k < 1) return;
      System.out.print(k + " ");
      printK(k - 1);
      
      if(k > 3) return;
      printK(k + 1);
    }


}


