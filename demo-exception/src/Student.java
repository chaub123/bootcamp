public class Student {
  String name;

  public Student(String name){
    this.name = name;
  }

  public void setName(String name) throws NameNotMatch {
    if(name.length() > 10){
      throw new NameNotMatch("Name is too long (>10)");
    }
    this.name = name;
  }
  
  public static void main(String[] args) {
    Student student = new Student("John");
    try{
      student.setName("Peter abc abc abc abc");
    }catch(NameNotMatch e){
      System.out.println("error");
    }
  }
}
