package com.ming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ming3 {
    public static void main(String[] args) {
        // 创建锁
        Lock lock;
        lock = new ReentrantLock();
        // 创建三个线程对象
        Thread01 thread01 = new Thread01(lock);
        Thread02 thread02 = new Thread02(lock);
        Thread03 thread03 = new Thread03(lock);
        // 创建线程
        new Thread(thread01).start();
        new Thread(thread02).start();
        new Thread(thread03).start();
    }
}
