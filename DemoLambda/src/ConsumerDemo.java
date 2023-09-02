import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("I love java!");

    BiConsumer<String, String> biConsumer = 
      (str1, str2) -> System.out.println(str1 + str2);
      biConsumer.accept("I love", "Yanb");


      List<String> strings = new ArrayList<>();
      strings.add("dog");
      strings.add("cat");
      strings.add("cow");
      strings.forEach(s ->System.out.println(s));

      Map<String, Integer> map = new HashMap<>();
      map.put("Orange", 3);
      map.put("Lemon", 2);
      map.put("watermelon", 10);
      map.forEach((key, value) -> {
        if("Lemon".equals(key)){
          System.out.println(value);
        }
      });
      
  }
}
