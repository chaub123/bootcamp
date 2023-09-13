package com.hkjava.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Assert test")
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
public class AppTest {

    private int x;


    @Test
    @DisplayName("Addition test")
    void testAssertEqual() {
        assertEquals(5, App.add(2, 3));
        assertEquals(0, App.add(0, 0));
        assertEquals(0, App.add(100, -100));
        assertEquals(5, App.add(2, 3));
        x++;
        assertEquals(1, x);
    }

    @Test
    void testAssertNotEqual(){
        assertNotEquals(4, App.add(2, 3));
    }

    @Test
    void testAssertTrue(){
        assertTrue(12 == App.add(7, 5)); // for example only, should use equal
    }

    @Test
    void testAssertNull(){
        String str = null;
        assertNull(str); // example only
    }

    @Test
    void testAssertNotNull(){
        Student student = new Student();
        assertNotNull(student.getSubjects());
    }
}
