package com.example.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;


public class ToleranceTest {
    @Test
    void test(){
        double expected = 3.14;
        double tolerence = 0.01;
        assertThat(3.14159, closeTo(expected, tolerence));
        assertThat(3.14999, closeTo(expected, tolerence));
        assertThat(3.14001, closeTo(expected, tolerence));
        // assertThat(3.13000, closeTo(expected, tolerence)); fail
        assertThat(3.15000, closeTo(expected, tolerence));
        assertThat(3.14000, closeTo(expected, tolerence));
    }   
    
}
