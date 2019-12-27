package com.ming4;

import java.util.concurrent.CountDownLatch;

public class ThreadB extends Thread {
    private CountDownLatch latch;

    public ThreadB(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("B");
        // 线程计数器减一
        latch.countDown();

        System.out.println("C");
    }
}
