package com.ming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread01 implements Runnable {
    private Lock lock;

    public Thread01(Lock lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        // run 进行调用
        // 进行加锁
        while(true) {
            lock.lock();
            // 进行输出我是线程1
            System.out.println("我是线程1");
            lock.unlock();
        }
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
