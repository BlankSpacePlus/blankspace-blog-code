package com.blankspace.csdn.pattern.singleton;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Eager Singleton has been created!");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
