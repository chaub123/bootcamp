package day19Poly;

public class Demo {
  public static void main(String[] args) {

    // Dynamic Polymorphism (Run time)
    Building building = new House();

    // Complie-time check
    // building.getCapacity(); >> compile error
    // building.print(); >> compile error
    building.print(); // Compile-time confirm you can call print() method only
    // run-time decide which print() ig going to call
    // so, "building" variable call House print() method instead of Building
    building.print2(); // still "i am house " intead of "i am building"

    // Static Polymorphism (compile time)
    // Method signature (method name + parameters)
    // Constrcutor signature


  }
}
