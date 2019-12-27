package com.ming32;

import java.util.concurrent.CountDownLatch;

public class TestB implements Runnable {
    private CountDownLatch countDownLatch;

    private volatile int sum = 0;

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public TestB(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {

        // 此线程计算 1 - 100 的所有累加和
        for(int i = 1; i <= 100; i++){
            //计算累加和
            this.sum += i;
        }
        // 输出计算结果
        System.out.println(this.getSum());
        // 计数器减少
        // 计数器减少为1
        this.getCountDownLatch().countDown();
    }
}
