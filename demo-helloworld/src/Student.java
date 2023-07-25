public class Student {

    String firstName;
    String lastName;
    int age;

    public Student(){

    }

    public Student(String firstName, String lastName, int age){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }

    public String getFullName(){
      return this.firstName.concat(" ").concat(this.lastName);
    }

    public boolean isAdult(){
      return this.age >= 18 ? true : false;
    }

    public String getFirstName(){
      return this.firstName;
    }
  
    public String getLastName(){
      return this.lastName;
    }

    public int getAge(){
      return this.age;
    }

    public void setFirstName(String firstName){
      this.firstName = firstName;
    }

    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    public void setAge(int age){
      this.age = age;
    }
}
