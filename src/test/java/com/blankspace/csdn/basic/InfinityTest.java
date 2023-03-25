package com.blankspace.csdn.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InfinityTest {

    @Test
    public void infTest() {
        Assertions.assertDoesNotThrow(() -> {
            double result = 1.0 / 0.0;
            Assertions.assertTrue(Double.isInfinite(result));
        });
    }

    @Test
    public void numAddInfTest() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertTrue(Double.isInfinite(1 + Double.POSITIVE_INFINITY));
            Assertions.assertTrue(Double.isInfinite(1 - Double.POSITIVE_INFINITY));
        });
    }

    @Test
    public void numMultiplyInfTest() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertTrue(Double.isInfinite(1 * Double.POSITIVE_INFINITY));
            Assertions.assertTrue(Double.isNaN(0 * Double.POSITIVE_INFINITY));
            Assertions.assertTrue(Double.isNaN(0 * Double.NEGATIVE_INFINITY));
        });
    }

    @Test
    public void infDivideNumTest() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertTrue(Double.isInfinite(Double.POSITIVE_INFINITY / 1));
            Assertions.assertTrue(Double.isInfinite(Double.NEGATIVE_INFINITY / 1));
            Assertions.assertTrue(Double.isInfinite(Double.POSITIVE_INFINITY / 0));
        });
    }

    @Test
    public void numDivideInfTest() {
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertEquals(0, 1 / Double.POSITIVE_INFINITY);
            Assertions.assertEquals(-0.0, 1 / Double.NEGATIVE_INFINITY);
            Assertions.assertEquals(0, 0 / Double.POSITIVE_INFINITY);
            Assertions.assertEquals(-0.0, 0 / Double.NEGATIVE_INFINITY);
        });
    }

}
