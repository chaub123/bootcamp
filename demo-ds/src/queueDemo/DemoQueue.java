package queueDemo;

import java.util.LinkedList;
import java.util.Stack;

public class DemoQueue {

  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();
    //First in first out
    queue.add("hihi");
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



    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0); 
    queueNum.add(-3);
    queueNum.add(100);
    //remove the 2nd even number

    Stack<Integer> stack = new Stack<>();
    int countEven = 0;

    while(countEven < 2){
      if(queueNum.peek() % 2 == 0) countEven++;
      stack.push(queueNum.poll());

      if(countEven == 2){
        stack.pop();
        while(!stack.isEmpty()){
          queueNum.add(0, stack.pop());
        }
      }
    }
    System.out.println(queueNum); // [10, 9, -3, 100]
  }
}
