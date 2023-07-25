public class Sandbox{
  public static void main(String[] args) {
      Student student1 = new Student("Yuk Yin", "Chan", 35);
      Student student2 = new Student("Kin Chau", "Leung", 38);
      
      long start = System.currentTimeMillis();

      System.out.println(student1.getFirstName());
      System.out.println(student1.getLastName());
      System.out.println(student1.getAge());
      System.out.println(student1.getFullName());
      System.out.println(student1.isAdult());

      System.out.println(student2.getFirstName());
      System.out.println(student2.getLastName());
      System.out.println(student2.getAge());
      System.out.println(student2.getFullName());
      System.out.println(student2.isAdult());

      System.out.println(System.currentTimeMillis() - start);

  }
}