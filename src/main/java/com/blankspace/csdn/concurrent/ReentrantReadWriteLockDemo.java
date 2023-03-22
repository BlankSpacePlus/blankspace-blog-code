package com.blankspace.csdn.concurrent;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockDemo {

    private ReadWriteLock rwLock = new ReentrantReadWriteLock();

    private int count = 0;

    public void increment() {
        rwLock.writeLock().lock(); // 获取写锁
        try {
            count++; // 执行临界区代码
        } finally {
            rwLock.writeLock().unlock(); // 释放写锁
        }
    }

    public int getCount() {
        rwLock.readLock().lock(); // 获取读锁
        try {
            return count; // 执行临界区代码
        } finally {
            rwLock.readLock().unlock(); // 释放读锁
        }
    }

}
