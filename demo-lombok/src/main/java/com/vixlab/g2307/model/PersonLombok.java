package com.vixlab.g2307.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonLombok {
  private String name;
  private int age;

  // public Person(){
  //   this.age = 100;
  // }

  // public int getAge(){
  //   return this.age + 10;
  // }

  public static void main(String[] args) {
    PersonLombok person = new PersonLombok("John", 23);
    PersonLombok person2 = new PersonLombok();
    person2.setAge(12);
    person2.setName("Peter");
    System.out.println(person2.getAge());
    System.out.println(person2.getName());
    System.out.println(person2);
    Map<Character, Integer> map = new HashMap<>();
    map.containsKey(map);


    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("hi")
    Collections.sort(null, null);;


    String str = "iamaboyandyouareagirl";
    String[] strings = {"boy", "girl", "and"};

    List<String> list2 = Arrays.stream(strings).filter(e -> str.contains(e)).collect(Collectors.toList());

    Predicate<Integer> isEven = n -> n % 2 == 0;

  }
}
