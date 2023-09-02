public class Student {
  String name;
  Bag bag;

  // Can access static nested class attirbute
  public Student(String name){
    this.name = name;
    bag = new Student.Bag();
  }

  public int getBagSize(){
    return this.bag.size;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return "Student [name=" + this.name //
           + ", Bag["+ this.bag + "]" //
           + "]";
  }

  // static nested class
  public static class Bag{
    private int size;

    public Bag(){
    }

    public Bag(int size){
      this.size = size;
    }

    public int getSize(){
      return this.size;
    }

    @Override
    public String toString(){
      return "Bag[size=" + size + "]";
    }
  }
  
  // Inner class (non-static nested class)
  public class Grade{
    private int score;

    public char getGrade(){
      switch(this.score){
        case 90:
          return 'A';
        case 80:
          return 'B';
        case 70:
          return 'C';
        default:
          return 'F';
      }
    }

    public Grade(int score){
      this.score = score;
    }

    public void printStudentName(){
      System.out.println(Student.this.getName());
    }
  }

  public static void main(String[] args) {
    Student student = new Student("Peter"); // student's constrcutor
    Student.Bag bag = new Student.Bag(5); // bag constructor
    System.out.println(student.getBagSize());
    System.out.println(student.toString());

    Student.Grade grade = student.new Grade(90);
    grade.printStudentName();
  
  }
}
