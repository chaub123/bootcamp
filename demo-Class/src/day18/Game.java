package day18;

import day17.app;

public abstract class Game {

  int score;

  public int getScore(){
    return this.score;
  }

  public abstract void up();
  public abstract void down();
  public abstract void left();
  public abstract void right();

  public static void countUp(Move[] moves){
    for(Move move : moves){
      move.up();
    }
  }
}
