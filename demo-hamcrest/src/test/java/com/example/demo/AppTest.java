package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AppTest {
    @Test // from junit5
    void testInt(){
        int value = 40;
        assertThat(value, is(equalTo(40)));
        assertThat(value, equalTo(40));
        assertThat(value, greaterThan(30));
        assertThat(value, lessThan(50));
        assertThat(value, is(lessThanOrEqualTo(40)));
    }

    @Test
    void testString(){
        String str = "Hello world";
        assertThat(str, containsString("world"));
        assertThat(str, not(containsString("world!")));

        String str2 = new String("Hello world");
        assertThat(str, equalTo(str2));
        assertThat(str, is(not(sameInstance(str2))));
        assertThat(str2, is(notNullValue()));

        String str3 = null;
        assertThat(str3, is(nullValue()));

        assertThat(str2, startsWith("Hello"));
        assertThat(str2, startsWith("H"));
    }

    @Test
    void testLogicalMatcher(){
        int val = 42;
        assertThat(val, allOf(
            greaterThan(39),
            lessThan(43),
            greaterThanOrEqualTo(42),
            lessThanOrEqualTo(42)
        ));

        assertThat(val, anyOf(
            greaterThan(50),
            lessThan(40),
            equalTo(42)
        ));

    }
}
