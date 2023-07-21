public class Number2 {
  int number1;
  int number2;
  
  public void setNumber1(int num){
    this.number1 = num;
  }

  public int getNumber1(){
    return this.number1;
  }

  public void setNumber2(int num){
    this.number2 = num;
  }

  public int getNumber2(){
    return this.number2;
  }

  public int divide(){
    return this.number2 / this.number1;
  }

  public static void main(String[] args) {
    Number2 num1 = new Number2();
    num1.setNumber1(13);
    num1.setNumber2(26);

    Number2 num2 = new Number2();
    num2.setNumber1(10);
    num2.setNumber2(100);

    System.out.println(num2.divide());
  }
}
