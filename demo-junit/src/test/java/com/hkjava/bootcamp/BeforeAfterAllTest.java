package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllTest {
    private int x;

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll starts");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("afterAll starts");
    }

    @Test
    void test(){
        x++;
        assertTrue(x == 1);
    }

    @Test
    void tes2t(){
        x++;
        assertTrue(x == 2);
    }
}
