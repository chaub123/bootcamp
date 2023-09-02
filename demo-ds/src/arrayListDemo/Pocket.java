package arrayListDemo;
import java.util.ArrayList;

public class Pocket {
  ArrayList<Ball> balls;

  public Pocket(){
    this.balls = new ArrayList<>();
  }
  
  public void add(Ball ball){

    this.balls.add(ball);
  }

  public void remove(Ball ball){
    this.balls.remove(ball);
  }

  public void remove(int ballID){
    for(Ball b: this.balls){
      if(b.id == ballID){
        this.balls.remove(ballID);
      }
    }
  }
}
