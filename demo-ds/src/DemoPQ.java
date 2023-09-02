import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  public static void main(String[] args) {
    // Natural order by default
    Queue<String> queue = new PriorityQueue<>();
    queue.add("BCD");
    queue.add("ABC");
    queue.add("DEF");
    System.out.println(queue.poll()); // ABC

    // custom by priority ALL THE TIME
    Queue<String> queue2 = new PriorityQueue<>(new SortByDescending());
    queue2.add("BCD");
    queue2.add("ABC");
    queue2.add("DEF");
    System.out.println(queue2.poll()); // DEF


  }
  
}
