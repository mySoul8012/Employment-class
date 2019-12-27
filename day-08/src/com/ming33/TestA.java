package com.ming33;

import java.util.concurrent.CountDownLatch;

// 第一个线程
public class TestA implements Runnable {
    private CountDownLatch countDownLatch;
    private volatile  int sum = 0;

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public TestA(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        // 计算 1 - 10000
        for(int i = 1; i <= 10000; i++){
            // 计算累加和
            this.sum += i;
        }
        // 打印出sum
        System.out.println(this.sum);
        // 线程计数器减1
        this.getCountDownLatch().countDown();
    }
}
