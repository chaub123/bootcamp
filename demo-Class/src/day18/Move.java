package day18;

public interface Move {

  static final int SPEED = 10;

  void up();
  void down();
  void left();
  void right();

  default void print(){
    
  }
}
