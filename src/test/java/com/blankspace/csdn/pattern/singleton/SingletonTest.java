package com.blankspace.csdn.pattern.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void lazySingletonTest() {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void eagerSingletonTest() {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    public void doubleCheckSingletonTest() {
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton singleton2 = DoubleCheckSingleton.getInstance();
        Assertions.assertEquals(singleton1, singleton2);
    }

}
