package com.blankspace.csdn.concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Queue<Integer> queue = new LinkedList<>();

    private int maxSize = 10;

    public void produce(int value) throws InterruptedException {
        lock.lock(); // 获取锁
        try {
            while (queue.size() == maxSize) {
                condition.await(); // 等待条件变量
            }
            queue.offer(value); // 执行临界区代码
            condition.signalAll(); // 唤醒等待线程
        } finally {
            lock.unlock(); // 释放锁
        }
    }

    public int consume() throws InterruptedException {
        lock.lock(); // 获取锁
        try {
            while (queue.isEmpty()) {
                condition.await(); // 等待条件变量
            }
            int value = queue.poll(); // 执行临界区代码
            condition.signalAll(); // 唤醒等待线程
            return value;
        } finally {
            lock.unlock(); // 释放锁
        }
    }

}
