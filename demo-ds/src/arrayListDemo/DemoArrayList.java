package arrayListDemo;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList{
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    Integer[] arr = new Integer[numbers.size()];
    numbers.toArray(arr);

    List<Integer> numbers2 = new ArrayList<>();
    numbers2.addAll(numbers);
    System.out.println(numbers2);


  }
}