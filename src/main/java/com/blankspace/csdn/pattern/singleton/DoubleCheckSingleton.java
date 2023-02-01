package com.blankspace.csdn.pattern.singleton;

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
        System.out.println("Double Check Singleton has been created!");
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
