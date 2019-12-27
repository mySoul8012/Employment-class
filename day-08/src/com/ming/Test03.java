package com.ming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test03 {
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        lock.lock();
        System.out.println("进行同步");
        lock.unlock();
    }
}
