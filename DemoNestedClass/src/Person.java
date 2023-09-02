public class Person {
  Wallet wallet;

  public Person(){
    this.wallet = new Wallet();
  }

  public int getMoney(){
    return this.wallet.money;
  }
  
}
