import java.util.ArrayList;
import java.util.List;

public class Demo {
  static final List<Character> characters;
  private static final char[] chars = {'J', 'a', 'c', 'k', 'y'};

  static{
    System.out.println("I am the first");
    characters = new ArrayList<>();
  }

  {
    System.out.println("I am initialization.");
  }

  public static void main(String[] args) {
    System.out.println("Start of main");
    // Demo demo = new Demo();
  }
}
