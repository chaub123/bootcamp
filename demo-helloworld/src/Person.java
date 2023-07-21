public class Person {
  // Describe the person by attributes
  int age;
  double height;
  double weight;
  char gender; 

  public void setAge(int age){
    this.age = age;
  }
  
  public int getAge(){
    return this.age;
  }

  public Person(){
    
  }

  public static void main(String[] args) {
    Person person1 = new Person();
    System.out.println(person1.getAge());
    person1.setAge(38);
    System.out.println(person1.getAge());
    Person person2 = new Person();
  }
}
