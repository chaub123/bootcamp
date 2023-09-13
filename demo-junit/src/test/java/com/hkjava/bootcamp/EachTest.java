package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EachTest {
    private int x;
    
    @BeforeEach
    void beforeEach(){
        assertEquals(0, x);
        x += 3;
    }

    @AfterEach
    void endOfTest(){
        System.out.println("End of test start");
        this.x -= 2;
        System.out.println(x);
    }

    @Test
    void testAdd(){
        assertEquals(8, App.add(this.x, 5));
    }

    @Test
    void testAdd2(){
        assertEquals(8, App.add(this.x, 5));
    }
}
