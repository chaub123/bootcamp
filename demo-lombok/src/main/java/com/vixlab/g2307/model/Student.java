package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private int age;

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 10;
        System.out.println(student.age);
    }
}
