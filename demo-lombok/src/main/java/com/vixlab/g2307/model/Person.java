package com.vixlab.g2307.model;

public class Person {
  private int age;
  private String name;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Person person = new Person("John", 32);
  }
}
