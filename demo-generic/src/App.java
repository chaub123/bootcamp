public class App {
    public static void main(String[] args) {
        Printer<String> p1 = new Printer<>(); // Strong type checking
        Printer<Integer> p2 = new Printer<>();
        Printer<Double> p3 = new Printer<>();

        p1.setValue("ABC");
        System.out.println(p1.getValue());

        p2.setValue(100);
        System.out.println(p2.getValue());

        p3.setValue(100.0);
        System.out.println(p3.getValue());


        // Animal example
        // Zoo<Dog> z1 = new Zoo<>();
        // z1.setAnimal(new Dog());
        // Zoo<Cat> z2 = new Zoo<>();
        // z2.setAnimal(new Cat());

        // Zoo<Animal> z3 = new Zoo<>(); // both ok
        // z3.setAnimal(new Dog());
        // z3.setAnimal(new Cat());

        Zoo<Dog> z4 = new Zoo<Dog>(new Dog());
        System.out.println(z4.getAnimal());
    }
}
