package day16;

public abstract class Person {
  private int age;
  private double height;

  //may contain instance method with implmeentation

  public void run(){
    System.out.println("I am running");
  }

  public abstract void sleep();

}
