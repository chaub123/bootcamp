public class Operators {
  public static void main(String[] args) {
    int a = 1;
    a = a +1; //2
    a = a - 2; // 0
    int b = 10 / 5; //2
    b = b * 3 + 5; //1
    System.out.println("a+b=" + a + b); // 011

    int x =1;
    x = x +1;
    x++;
    ++x;
    x +=1;

    int tmp = 5;
    tmp++; // tmp = 6
    System.out.println(tmp); //tmp ==6
    int tmp2 = tmp--;
    System.out.println(tmp); //tmp = 5
    System.out.println(tmp2); //tmp2 =6
    int tmp3 = --tmp; // 5- 1 first before assign
    System.out.println(tmp3); //4
  
  }
}
