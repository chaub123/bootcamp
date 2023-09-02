public class App1 {
    public static void main(String[] args) throws Exception {
        Person person = new Person("john", 30);
        Person1 person1 = new Person1("john", 30);
        Person1 another = new Person1("john", 30);

        System.out.println(person.getName());
        System.out.println(person1.name());
        System.out.println(person.getAge());
        System.out.println(person1.age());
        System.out.println(person1.check(null, 0));

        System.out.println(person1.equals(another));
    }
}
