package day19Poly;
// public enum Direction extends Enum
public enum Direction {
  EAST('E', 90),
  SOUTH('S', 180),
  WEST('W', 270),
  NORTH('N', 360);

  private char direction;
  private int degree;

  private Direction(char direction, int degree){
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
    return this.degree;
  }
}
