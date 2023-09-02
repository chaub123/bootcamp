public class TestStringBuilder {
  public static void main(String[] args) {
    // StringBuilder builder = new StringBuilder("");
    StringBuffer buffer = new StringBuffer();

    Runnable increment = () -> {
      for(int i=0; i< 100000; i++){
        buffer.append("a");
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){

    }

    System.out.println(buffer.length());
  }
}
