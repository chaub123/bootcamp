package arrayListDemo;
public class App {
    public static void main(String[] args) throws Exception {
        Ball ball1 = new Ball(Color.BLUE);
        Ball ball2 = new Ball(Color.RED);
        Ball ball3 = new Ball(Color.YELLOW);
        Ball ball4 = new Ball(Color.YELLOW);


        System.out.println(ball3 == ball4);
        System.out.println(ball3.equals(ball4));
        System.out.println(ball3.equals(ball3));
        System.out.println(ball3.hashCode());
        System.out.println(ball3.hashCode());
        System.out.println(ball4.hashCode());

        Person person = new Person();


    }
}
