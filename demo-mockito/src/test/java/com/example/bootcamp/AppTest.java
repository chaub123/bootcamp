package com.example.bootcamp;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AppTest {

    @Mock
    Calculator calculator;

    @InjectMocks
    Checkout checkout;

    @Test
    void testSubstract(){
        Calculator selfCalculator = new Calculator(3);
        assertEquals(0, calculator.substract(10, 6));
    }

    @Test
    void testMultiply1(){
        when(calculator.substract(7, 9)).thenReturn(10000);
        when(calculator.multiply(7, 9)).thenReturn(10000);
        int result = checkout.multiply(7, 9);
        assertEquals(10009, result);

    }

    @Test
    void testMultiply2(){
        when(calculator.substract(3, 9)).thenReturn(10000);
        int result = checkout.multiply(7, 9);
        assertEquals(9, result);

    }

    @Test
    void testAdd1(){
        Mockito.when(calculator.substract(3, 4)).thenReturn(100);
        // Checkout checkout = new Checkout(calculator);
        // Test start
        int result = checkout.add(3, 4);
        assertEquals(104, result);
        verify(calculator, times(1)).substract(3, 4);
    }

    @Test
    void testAdd2(){
        Mockito.when(calculator.substract(1, 4)).thenReturn(1000);
        // Checkout checkout = new Checkout(calculator);
        // Test start
        int result = checkout.add(1, 4);
        assertEquals(5, result);
        verify(calculator, never()).substract(3, 4);
    }
}
