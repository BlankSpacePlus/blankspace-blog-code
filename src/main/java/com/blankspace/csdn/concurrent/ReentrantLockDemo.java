package com.blankspace.csdn.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private Lock lock = new ReentrantLock();

    private int count = 0;

    public void increment() {
        lock.lock(); // 获取锁
        try {
            count++; // 执行临界区代码
        } finally {
            lock.unlock(); // 释放锁
        }
    }

}
