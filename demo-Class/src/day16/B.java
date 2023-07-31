package day16;

public class B extends A {
  String str;

  public void setStr(String str){
    this.str = str;
  }

  public void print(String anotherString){
    System.out.println(this.str + " " + anotherString);
  }
}
