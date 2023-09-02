// Builder Pattern Demo
public class Phone {
  private String number;
  private Color color;
  private double weight;

  private Phone(Builder builder){
    this.number = builder.number;
    this.color = builder.color;
    this.weight = builder.weight;
  }

  public static Builder builder(){
    return new Builder();
  }

  @Override
  public String toString(){
    return "[Number=" + this.number //
            +", color=" + this.color //
            +", weight=" + this.weight //
            +"]";
  }

  public static class Builder{
    // With same attributes of outer class
      private String number;
      private Color color;
      private double weight;

      public Builder number(String number){ // setter
        this.number = number;
        return this;
      }

      public Builder color(Color color){ // setter
        this.color = color;
        return this;
      }

      public Builder weight(double weight){ // setter
        this.weight = weight;
        return this;
      }

      public Phone build() {
        return new Phone(this);
      }
  }



  public static void main(String[] args) {
    // Chain method :replace different number of args cnstrcutors.
    Phone phone = Phone.builder().color(Color.WHITE).number("1234567").weight(3.7d).build();
    System.out.println(phone); // [Number=1234567, color=WHITE, weight=3.7]
    Phone phone2 = new Phone.Builder().color(Color.GREY).number("2425425").weight(5.6d).build();
    System.out.println(phone2); // [Number=2425425, color=GREY, weight=5.6]

  }
}
