package com.blankspace.csdn.pattern.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Lazy Singleton has been created!");
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
