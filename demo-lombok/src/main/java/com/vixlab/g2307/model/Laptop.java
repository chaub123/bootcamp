package com.vixlab.g2307.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Laptop {
    private String os;

    @Setter
    private int memory;
    @Setter
    private int hdd;
  
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setMemory(128);
        laptop.getMemory();
        laptop.setHdd(0);
        
    }
}
