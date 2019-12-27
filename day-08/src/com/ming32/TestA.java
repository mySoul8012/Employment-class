package com.ming32;

import java.util.concurrent.CountDownLatch;

public class TestA implements Runnable {
    private CountDownLatch countDownLatch ;

    public TestA(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // 开始进行计算
        System.out.println("开始计算");
        // 该线程进入等待状态
        try {
            this.countDownLatch.await();    // 直到线程计数器为 0 开始结束等待
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 打印计算结束
        System.out.println("计算结束");
    }
}
