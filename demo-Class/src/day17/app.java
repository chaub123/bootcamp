package day17;

public class app {
  public static void main(String[] args) {
    Circle circle = new Circle();
    Square square = new Square();

    circle.setRadius(5.0d);
    square.setLength(5.0d);

    System.out.println(Shape.area(new Shape[] {circle, square}));



    ObjectiveDemo objectiveDemo1 = new ObjectiveDemo();
    ObjectiveDemo objectiveDemo2 = new ObjectiveDemo();
    System.out.println(objectiveDemo1.hashCode());
    System.out.println(objectiveDemo2.hashCode());

    System.out.println(objectiveDemo1);
    objectiveDemo1.setName("Peter");
    System.out.println(objectiveDemo1);

    System.out.println(objectiveDemo2);
  }
  
}
