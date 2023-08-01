package day17;

public class Circle extends Shape{
  
  private double radius;

  @Override
  public double area(){
    return Math.pow(this.radius, 2) + Math.PI;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  
}
