package shapes;

public class app {

  public static void main(String[] args) {
    Circle circle1 = new Circle(5);
    System.out.println(circle1.area());
    System.out.println(circle1.circumference());
    System.out.println(circle1.getID());

    Circle circle2 = new Circle(6);
    circle2.setRadius(15);
    System.out.println(circle2.area());
    System.out.println(circle2.circumference());
    System.out.println(circle2.getID());

    Square square1 = new Square(4);
    square1.getInfo();
    square1.update(1, 10);
    square1.replaceEdge(0, 20, "Green");
    square1.getInfo();
  }
}
