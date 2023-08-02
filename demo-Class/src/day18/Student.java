package day18;

public class Student extends Person implements Runnable, Swimable, Move{
  private String name;

  @Override
  public void up(){
  }

  @Override
  public void down(){
    
  }

  @Override
  public void left(){
    
  }

  @Override
  public void right(){
    
  }

  @Override
  public void breath(){
    System.out.println("Student is breathing.");
  }

  @Override
  public void run(){
    System.out.println("Student is running!");
  }

  @Override
  public void swim(){
    System.out.println("Student is swimming!");
  }

  public static void main(String[] args) {
    Move move = new Student();

    Dog dog = new Dog();
    dog.up();
    dog.down();
    dog.left();
    dog.right();
  }
}
