package queueDemo;

import java.util.PriorityQueue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<>();
    //First in first out

    queue.add("hello");
    queue.add("world");

    System.out.println(queue.peek()); // hello
    System.out.println(queue.poll()); // hello
    System.out.println(queue.poll()); // world
    System.out.println(queue.peek()); // null

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");

    for(String str:queue){
      System.out.println(str);
    }

    System.out.println(queue.remove("def"));
    System.out.println(queue.poll()); //abc
    System.out.println(queue.poll()); // xyz
    System.out.println(queue.poll()); // null

    System.out.println(queue.offer("baby")); // add
    System.out.println(queue.offer("baby"));
    System.out.println(queue.offer("girl"));
    System.out.println(queue.size()); // 3
    System.out.println(queue.poll()); // baby
    System.out.println(queue.poll()); // baby
    System.out.println(queue.poll()); // girl
    System.out.println(queue.size()); // 0


    
    
  }
}
