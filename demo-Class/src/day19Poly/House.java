package day19Poly;

public class House extends Building {
    private double capacity;

    public double getCapacity() {
      return this.capacity;
    }

    public void setCapacity(double capacity) {
      this.capacity = capacity;
    }    


    @Override
    public void print(){
      System.out.println("I am house.");
    }

    // overloading
    public void print(String s){
      System.out.println("Overloading");
    }
}
