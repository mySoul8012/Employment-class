package com.ming4;

import java.util.concurrent.CountDownLatch;

public class ThreadA extends Thread {
    private CountDownLatch countDownLatch;

    public ThreadA(CountDownLatch latch){
        this.countDownLatch = latch;
    }

    @Override
    public void run() {
        System.out.println("A");
        try{
            countDownLatch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
