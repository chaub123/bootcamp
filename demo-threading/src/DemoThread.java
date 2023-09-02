public class DemoThread {
  
public static void main(String[] args) {
  // approach 1 : Runnable (Lambda), if older than 1.8, need to create class and implement runnable
  // Task logic
  Runnable printout = () -> {
    for(int i=0; i< 100; i++){
      System.out.println("i=" + i);
    }
  };

  // Task
  Thread thread = new Thread(printout); // task management
  System.out.println("Start Thread 1");
  thread.start();
  System.out.println("End Thread 1");



  //Approach 2 : create printout class implement runnable
  Thread thread2 = new Thread(new PrintOut());
  System.out.println("Start Thread 2");
  thread2.start();
  System.out.println("End Thread 2");

  //Approach 3: create a new class pinrtout2 extend Thread
  Thread thread3 = new PrintOut2();
  thread3.start();

  try{
    thread.join();
    thread2.join();
    thread3.join();
  }catch(InterruptedException e){

  }
  System.out.println("Main Thread Ends!");
  }
}
