package day17;

import java.util.Objects;

public class Ball {
  private String color;

  public Ball(String color){
    this.color = color;
  }

  @Override
  public int hashCode(){
    return Objects.hash(color);
  }

  public boolean equals(Object o){
    // if address same, values inside the object must be same
    if(this == o) 
      return true;
    if(!(o instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o; // downcast;
    return ball.color.equals(this.color);
  }

  public static void main(String[] args) {
    Ball ball1 = new Ball("Blue"); // address 1
    Ball ball2 = new Ball("Blue"); // address 2
    System.out.println(ball1.equals(ball2));
  }
}
