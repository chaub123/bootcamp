package com.example.bootcamp;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

    @Spy
    Calculator calculator;

    @InjectMocks
    Checkout checkout;

    @Test
    void testAdd1() {
        when(calculator.substract(3, 4)).thenReturn(100);
        int result = checkout.add(3, 4);
        assertEquals(104, result);
        verify(calculator, times(1)).substract(3, 4);
    }
    
}
