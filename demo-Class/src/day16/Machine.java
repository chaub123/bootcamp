package day16;

public class Machine {

  private double weight;

  public Machine(){

  }


  public Machine(double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void start(){
    System.out.println("Machine start....");
  }

  public void stop(){
    System.out.println("Machine stop....");
  }

  public static final String staticMethod(String x, String y){
    return x + y;
  }
}
