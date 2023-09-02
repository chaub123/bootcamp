package arrayListDemo;
public class Person {

  private Pocket[] pockets;

  public Person(){
    pockets = new Pocket[2];
  }

  public Pocket getLefPocket(){
    return this.pockets[0];
  }

  public Pocket getRightPocket(){
    return this.pockets[1];
  }
  
}
