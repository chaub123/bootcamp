package day19Poly;

public class Demo2 {
  public static void main(String[] args) {
    System.out.println(Direction.EAST);

    Direction east = Direction.EAST;
    System.out.println(east == Direction.NORTH);
    System.out.println(east == Direction.EAST);
    System.out.println(east != Direction.WEST);
    // == and != are checking the object reference

    System.out.println(east.getDegree());
    System.out.println(east.getDirection());

  }
}
