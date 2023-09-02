package arrayListDemo;
import java.util.Objects;

public class Ball {
  int id;
  Color color;
  private static int IDcounter = 0;

  public Ball(Color color){
    this.id = ++IDcounter;
    this.color = color;
  }

  public boolean equals(Object o){
    if(this == o){
      return true;
    }
    if(!(o instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o;
    return ball.color == this.color && ball.id == this.id;

  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id, this.color);
  }
}
