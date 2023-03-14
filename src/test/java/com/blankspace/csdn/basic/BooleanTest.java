package com.blankspace.csdn.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanTest {

    @Test
    public void andTest() {
        Assertions.assertTrue(true && true);
        Assertions.assertFalse(true && false);
        Assertions.assertFalse(false && true);
        Assertions.assertFalse(false && false);
    }

    @Test
    public void orTest() {
        Assertions.assertTrue(true || true);
        Assertions.assertTrue(true || false);
        Assertions.assertTrue(false || true);
        Assertions.assertFalse(false || false);
    }

    @Test
    public void notTest() {
        Assertions.assertTrue(!false);
        Assertions.assertFalse(!true);
    }

    @Test
    public void xorTest() {
        Assertions.assertFalse(true ^ true);
        Assertions.assertTrue(true ^ false);
        Assertions.assertTrue(false ^ true);
        Assertions.assertFalse(false ^ false);
    }

    @Test
    public void orSingleTest() {
        int x = 10;
        if (x > 9 || ((x = 11) == 11)) {
            // do sth.
        }
        Assertions.assertEquals(10, x);
        if (x > 9 | ((x = 11) == 11)) {
            // do sth.
        }
        Assertions.assertEquals(11, x);
    }

}
