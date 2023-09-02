public record Person1 (String name, int age) implements TestInterface {
  // immutable objects
  // final class, support Generic
  // support interface, but 
  // private final String name;
  // private final int age;
  // all-args constrcutor only
  // att getters
  // no setters (final instance variable)
  // can add custom static method
  // can add custom instance methods
  // custom constant 
  // no other instance variable
  // already override equals and hashcode and tostring

  static final int MAX_VALUE = 100;

  public boolean check(String name, int age){
    return true;
  }

  public void read(){
    System.out.println("hi");
  }
}
