// import java.util.Arrays;

// @FunctionalInterface // Annotation: check if this interface has one abstract method only
// public interface Swimable {
//   void swim();

//   public static void main(String[] args) {
//     Swimable person1 = () -> System.out.println("Person1 am swimming");
//     person1.swim();

//     Swimable person2 = () -> {
//       System.out.println("Person2 starts swimming");
//       System.out.println("Person2 stops swimming");
//     };
//     person2.swim();

//     Comparator<Person> sortByNameDesc = (Person p1, Person p2) ->{
//       return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
//     };
//     List<Person> persons = Arrays.asList(new Person("Alison"), new Person("Bob"));

//   }
// }
