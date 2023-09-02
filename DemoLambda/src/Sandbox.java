public class Sandbox {

  public static int calculate(int i, int j, MathOperation formula){
    return formula.operate(i, j);
  }
  public static void main(String[] args) {
    MathOperation addition = (x, y) -> x + y;
    MathOperation substract = (x, y) -> x - y;
    MathOperation multply = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;

    System.out.println(addition.operate(10, 25));

    System.out.println(calculate(1, 3, addition));
    System.out.println(calculate(2, 3, multply));
  }
}
