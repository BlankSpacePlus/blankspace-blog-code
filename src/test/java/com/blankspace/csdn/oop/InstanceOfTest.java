package com.blankspace.csdn.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {

    @Test
    public void classTypeTest() {
        Shape shape = new Rectangle(2, 3);
        Assertions.assertTrue(shape instanceof Shape);
        Assertions.assertTrue(shape instanceof Rectangle);
    }

}
