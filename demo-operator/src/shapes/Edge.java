package shapes;

public class Edge {

  private double length;
  private String color;

  public Edge(double length, String color){
    this.length = length;
    this.color = color;
  }

  public void getInfo(){
    System.out.println("Length is " + this.length + ", Color is " + color);
  }

  public void setLength(int length){
    this.length = length;
  }

  public void setAll(int length, String color){
    this.length = length;
    this.color = color;
  }
}
