package com.ming33;

import java.util.concurrent.CountDownLatch;

// 第二个线程
public class TestB implements Runnable {
    private CountDownLatch countDownLatch = null;
    private volatile int sum = 0;

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

    public TestB(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public TestB(int sum) {
        this.sum = sum;
    }

    public TestB(CountDownLatch countDownLatch, int sum) {
        this.countDownLatch = countDownLatch;
        this.sum = sum;
    }

    @Override
    public void run() {
        // 此线程计算 1--10000 的偶数和
        for(int i = 1; i < 10000; i++){
            // 判断是偶数
            if(i % 2 == 0){
                //此时是偶数
                sum += i;
            }
        }
        // 打印出sum
        System.out.println(this.getSum());
        // 线程计数器减1
        this.countDownLatch.countDown();
    }
}
