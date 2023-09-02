public class TestSync {
  
  int number = 0;

  public synchronized void increment(){ // synchronized make it bcome 'like' a Atomic method
    this.number++; // non-atomic operation
  }
  
  public static void main(String[] args) {
    TestSync test = new TestSync();
    
    Runnable add = () -> {
      for(int i=0; i<1000000; i++){
        test.increment();
      }
    };

    Thread thread1 = new Thread(add);
    Thread thread2 = new Thread(add);
    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){
      System.out.println(e);
    }

    System.out.println(test.number);
  }
}
