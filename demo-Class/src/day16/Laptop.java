package day16;

public class Laptop extends Machine {
  Keyboard keyboard;
  Monitor monitor;

  public Laptop(){
    // implicitly call superclass empty contructor
  }

  public Laptop(Keyboard keyboard, Monitor monitor){
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width){
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor){
    super(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  
  }

  @Override
  public void start(){
    System.out.println("Laptop starts....");
  }

  @Override
  public void stop(){
    System.out.println("Laptop stops....");
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    System.out.println(laptop.getWeight());
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(5.0);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();

    Laptop laptop2 = new Laptop(5.3d, new Keyboard("DEF", 26), new Monitor(11d, 11d));
    System.out.println(laptop2.getWeight());

    System.out.println(Machine.staticMethod("Abcd", "EDFD"));
    System.out.println(staticMethod("AAA", "BBB"));

  }
  
}
