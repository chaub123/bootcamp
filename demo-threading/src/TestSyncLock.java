public class TestSyncLock {
  int x;
  Object lock = new Object();

  public int calculate(int amount){
    int total = amount;
    synchronized(this.lock){
      this.x++;
    }
    return total + this.x;
  }

  public synchronized void increment(){
    this.x++;
  }
  public static void main(String[] args) {
    TestSyncLock obj = new TestSyncLock();
    Runnable runnable = () ->{
      for(int i=0; i<10000000; i++){
        obj.calculate(0);
      }
    };

    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){

    }

    System.out.println(obj.x);


  }
}
