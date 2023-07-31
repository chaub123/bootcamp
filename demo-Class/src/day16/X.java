package day16;

public class X extends Y{
  private String name;


  public X(){

  }

  public X(String name){
    super("John");
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    X x = new X("Chaub123");
    System.out.println();

  }
}
