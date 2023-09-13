package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ArrayTest {
    @Test
    void testArray(){
        String[] strings = new String[] {"apple", "cherry", "banana"};

        assertThat(strings, arrayContaining("apple", "cherry", "banana")); // size + ordering are matter
        assertThat(strings, not(arrayContaining("apple", "cherry", "grape")));
        assertThat(strings, not(arrayContaining("apple", "grape")));

        assertThat(strings, arrayContainingInAnyOrder("banana", "cherry", "apple"));
        assertThat(strings, not(arrayContainingInAnyOrder("banana", "cherry")));
    }
}
