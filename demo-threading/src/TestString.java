public class TestString {
  String str = "";


  public static void main(String[] args) {
    TestString testString = new TestString();

    Runnable add = () -> {
      for(int i=0; i<500000; i++){
        testString.str += "@";
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
    System.out.println(testString.str.length());
    System.out.println("End of main.");
  }
}
