package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class CollectionTest {
    @Test
    void testList(){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        assertThat(list, hasItem("cherry"));
        assertThat(list, hasItems("apple", "cherry"));
        assertThat(list, hasSize(3));
        // assertThat(list, contains("apple", "cherry", "banana")); // Number and ordering must be same
        // assertThat(list, contains("apple", "banana")); // Number and ordering must be same
        //number of item is matter but ignore ordering
        assertThat(list, containsInAnyOrder("apple", "cherry", "banana"));
        assertThat(list, containsInAnyOrder("banana", "cherry", "apple"));


        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, empty());

    }
}
