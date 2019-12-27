package com.ming25;

import java.util.concurrent.CountDownLatch;

public class ThreadA extends Thread {
    private CountDownLatch latch;

    public ThreadA(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("A");
        //让线程等待
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
