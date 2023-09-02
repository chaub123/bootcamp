import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {

    //Not allowed
    // var age;

  public static void main(String[] args) {
    var s = "Hello";
    var i = 2;
    var c = 'a';

    // var = null; not allowed

    //not allowed
    //var[] arr = new int[3];


    // Loop 
    List<String> strings = Arrays.asList("abc", "def");
    for(var str : strings){
      System.out.println(str);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);
    for(var entry : map.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    var result = getString();
  }

  public static List<List<String>> getString(){
    return Arrays.asList(Arrays.asList("abc"));
  }

  // not ok
  // public static var add(int x, int y){
  //   return x + y;
  // }

  // not ok
  // public static int add(var x, var y){
  //   return x + y;
  // }
}
