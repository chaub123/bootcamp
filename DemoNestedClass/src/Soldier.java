public class Soldier {
  private String name;
  private int hp;
  private int mp;
  private int attack;
  private int defence;

  private Soldier(Builder builder){
    this.name = builder.name;
    this.hp = builder.hp;
    this.mp = builder.mp;
    this.attack = builder.attack;
    this.defence = builder.defence;
  }

  @Override
  public String toString() {
    return "[Name=" + this.name //
          + ", hp=" + this.hp //
          + ", mp=" + this.mp //
          + ", attack=" + this.attack //
          + ", denfece=" + this.defence
          + "]";
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder{
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int defence;

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder hp(int hp){
      this.hp = hp;
      return this;
    }

    public Builder mp(int mp){
      this.mp = mp;
      return this;
    }

    public Builder attack(int attack){
      this.attack = attack;
      return this;
    }

    public Builder defence(int defence){
      this.defence = defence;
      return this;
    }

    public Soldier build(){
      return new Soldier(this);
    }
  }


  public static void main(String[] args) {
    Soldier soldier = Soldier.builder().name("Ryan").hp(100).mp(50).attack(25).defence(20).build();
    System.out.println(soldier); // [Name=Ryan, hp=100, mp=50, attack=25, denfece=20]

    Soldier soldier2 = new Soldier.Builder().name("Peter").hp(120).mp(20).attack(20).defence(10).build();
    System.out.println(soldier2); // [Name=Peter, hp=120, mp=20, attack=20, denfece=10]
  }
}
