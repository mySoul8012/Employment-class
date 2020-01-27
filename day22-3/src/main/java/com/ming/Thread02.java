package com.ming;

import java.util.concurrent.locks.Lock;

public class Thread02 implements Runnable {
    private Lock lock = null;

    public Thread02(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // 进行加锁
        while(true) {
            lock.lock();
            // 输出加锁
            System.out.println("我是线程2");
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
