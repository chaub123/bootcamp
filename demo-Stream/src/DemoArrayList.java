import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    for(String s : strings){
      System.out.println(s);
    }


    // old type
    Stream<String> streamString = strings.stream();
    // Stream.Filtering
    streamString = streamString.filter(s -> s.startsWith("a"));
    // Stream.forEach
    streamString.forEach(s -> System.out.println(s)); // abc

    //new type
    strings.stream() //
           .filter(s -> s.endsWith("i")) //
           .forEach(s -> System.out.println(s)); // ghi


    List<String> strings2 = strings.stream() //
      .filter(s -> s.length() == 3) //
      .collect(Collectors.toList());

      System.out.println(strings2);

      List<Integer> lengths = strings2.stream() //
      .filter(s -> s.startsWith("a") || s.startsWith("d"))
      .map(e -> e.length()) // become Stream<Integer>
      .collect(Collectors.toList());

      lengths.forEach(e -> System.out.println(e));


      strings2.stream() //
      .sorted((s1, s2) -> s2.compareTo(s1)) // descending order
      .forEach(e -> System.out.println(e));

      System.out.println(strings.stream().anyMatch(e -> e.startsWith("a")));

      if(strings.stream().anyMatch(e -> e.startsWith("a"))){
        System.out.println("One of the elements starts with a.");
      }
      
      // interminate operations:
      // filter(), map(). sorted(), anyMatch(), distinct()
      
      // terminated operations
      // collect(), forEach(), count()
      // one stream can terminate once, but it may have multiple interminate operation

      //List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));

      //List<String> names = persons.stream().map(e -> e.getName()).collect(Collectors.toList());
      System.out.println(Stream.of("abc", "def", "ghi", "abc")
        .filter(e -> e.length() == 3)
        .distinct()
        .count());

  List<String> animals = Arrays.asList("lion", "tiger", "bear");
  Map<String, Integer> map = animals.stream().collect(Collectors.toMap(str -> str, str -> str.length()));

  for(Map.Entry<String,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + entry.getValue());
  }

   Stream.iterate(1, n -> n + 2)
   .limit(10)
   .forEach(e -> System.out.println(e));

   Stream.iterate(1, n -> n + 2)
   .filter(e -> e != 5) // why stopped??
   .limit(10)
   .forEach(e -> System.out.println(e));

    Stream.limit(10)
    .iterate(1, n -> n + 2) // why stopped??
    .forEach(e -> System.out.println(e));
  }   

  public static boolean find(List<Person> persons){
    return persons.stream() //
        .filter(e -> e.isElderly())
        .findFirst()
        .isPresent();
  }
}
