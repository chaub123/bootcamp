package day17;

import java.util.Objects;

public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.x, this.y);
  }

  @Override
  public boolean equals(Object o){
    if(this == o) 
      return true;
    if(!(o instanceof Point)) 
      return false;

    Point point = (Point) o;
    return point.x == this.x && point.y == this.y;
  }

  public static void main(String[] args) {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(2, 2);
    Point p3 = new Point(2, 3);

    System.out.println(p1 == p2);
    System.out.println(p1.equals(p1));
    System.out.println(p1.equals(p2)); // why this is false?
    System.out.println(p1.equals(p3));
  }
}