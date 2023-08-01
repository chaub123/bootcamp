package day17;

public class Square extends Shape {

  private double length;

  

  @Override
  public double area() {
    return Math.pow(this.length, 2);
  }



  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }
}
