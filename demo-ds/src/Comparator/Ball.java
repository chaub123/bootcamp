package Comparator;

public class Ball implements Comparable<Ball> {
  int id;

  public Ball(int id){
    this.id = id;
  }

  @Override
  public int compareTo(Ball ball) {
    return ball.id > this.id ? 1 : -1;
  }

  @Override
  public String toString(){
    return "Ball ID = " + this.id; 
  }
}
