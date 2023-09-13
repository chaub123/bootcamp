package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// @AllArgsConstructor
@EqualsAndHashCode
public class Staff extends Human{
    private double salary;

    public Staff(String name, double salary){
        super(name);
        this.salary = salary;
    }


    public static void main(String[] args) {
        Staff staff1 = new Staff("John", 3000);
        Staff staff2 = new Staff("Mary", 3000);
        System.out.println(staff1.equals(staff2));
    }
}
