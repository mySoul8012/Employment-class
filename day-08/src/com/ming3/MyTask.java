package com.ming3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTask implements Runnable {
    private int count = 100;
    private Object obj = new Object();
    private Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while(true){
            synchronized (obj){
                lock.lock();

                while(true) {
                    if (count > 0) {
                        System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
                    }
                    count--;
                    lock.unlock();
                }

            }
        }
    }

    public synchronized void sellTicket(){
        if(count > 0){
            System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票..");
        }
    }
}
