/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123456));// $123,456
    System.out.println(separator(1234567));// $1,234,567
    System.out.println(separator(12345678));// $12,345,678
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    StringBuilder sb = new StringBuilder(String.valueOf(n));    
    switch(sb.length()){
      case 4:
        sb.insert(1, ',');
        break;
      case 5:
        sb.insert(2, ',');
        break;
      case 6:
        sb.insert(3, ',');
        break;
      case 7:
        sb.insert(1, ',');
        sb.insert(5, ',');
        break;
      case 8:
        sb.insert(2, ',');
        sb.insert(6, ',');
        break;
      case 9:
        sb.insert(3, ',');
        sb.insert(7, ',');
    }
    
    return "$" + sb.toString();
    }
}
