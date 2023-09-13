package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CustomMatcherTest {
    @Test
    void CustomMatcherTest(){
        String str = "HELLOWORLD";
        String str2 = "HelloWorld";
        String str3 = "helloworld";
        assertThat(str, UppercaseMatcher.containUppercaseOnly());
        assertThat(str2, not(UppercaseMatcher.containUppercaseOnly()));
        assertThat(str3, not(UppercaseMatcher.containUppercaseOnly()));
    }
}
