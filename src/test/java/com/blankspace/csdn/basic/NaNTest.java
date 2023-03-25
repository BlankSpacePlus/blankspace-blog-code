package com.blankspace.csdn.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NaNTest {

    @Test
    public void nanTest() {
        Assertions.assertDoesNotThrow(() -> {
            double result = 0.0 / 0.0;
            Assertions.assertTrue(Double.isNaN(result));
        });
    }

    @Test
    public void divideZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
            System.out.println(result);
        });
    }

    @Test
    public void operateWithNaNTest() {
        Assertions.assertTrue(Double.isNaN(1.0 + Double.NaN));
        Assertions.assertTrue(Double.isNaN(2.0 * Double.NaN));
        Assertions.assertTrue(Double.isNaN(-3.0 - Double.NaN));
    }

    @Test
    public void compareWithNaNTest() {
        Assertions.assertFalse(Double.NaN > 8.0);
        Assertions.assertFalse(Double.NaN < -3.0);
        Assertions.assertFalse(Double.NaN == 5.0);
        Assertions.assertTrue(Double.NaN != 10.0);
        Assertions.assertFalse(Double.NaN > Double.NaN);
        Assertions.assertFalse(Double.NaN < Double.NaN);
        Assertions.assertFalse(Double.NaN == Double.NaN);
        Assertions.assertTrue(Double.NaN != Double.NaN);
    }

}
