package day19Poly;

public abstract class Building {
    private double height;

    public void print(){
      System.out.println("I am building.");
    }

    public void print2(){
      this.print();
    }
}
