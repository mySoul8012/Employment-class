package com.ming;

import java.util.concurrent.locks.Lock;

public class Thread03 implements Runnable {
    private Lock lock = null;

    public Thread03(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // 进行加锁操作
        while(true) {
            lock.lock();
            System.out.println("我是线程3");
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
