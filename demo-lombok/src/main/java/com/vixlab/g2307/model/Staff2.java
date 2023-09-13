package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// @AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Staff2 extends Human{
    private double salary;

    public Staff2(String name, double salary){
        super(name);
        this.salary = salary;
    }


    public static void main(String[] args) {
        Staff2 staff1 = new Staff2("John", 3000);
        Staff2 staff2 = new Staff2("Mary", 3000);
        System.out.println(staff1.equals(staff2));
    }
}
