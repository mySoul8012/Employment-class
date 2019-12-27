package com.ming25;

import java.util.concurrent.CountDownLatch;

public class ThreadB extends Thread {
    private CountDownLatch latch;

    public ThreadB(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("B");
        //让线程计数器-1
        latch.countDown();
    }
}
