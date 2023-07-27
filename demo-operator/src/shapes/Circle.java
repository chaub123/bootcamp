package shapes;

public class Circle {
  
  private int id;
  private double radius;
  private static int circleCounter;

  public Circle(double radius){
    this.radius = radius;
    this.id = circleCounter;
    AddCounter();
  }

  public static void AddCounter(){
    circleCounter++;
  }

  public int getID(){
    return this.id;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double area(){
    return Math.pow(this.radius, 2) * Math.PI; 
  }

  public double circumference(){
    return this.radius * 2 * Math.PI;
  }
  
}
