import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sandbox{
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Peter", 40);
    map.put("Mary", 25);
    map.put("John", 33);
    
    for(Entry entry : map.entrySet()){
      System.out.println("Key:" + entry.getKey()+ ", value=" + entry.getValue());
    }
  }
}