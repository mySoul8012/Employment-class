package com.ming33;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

// 定义第四个线程 打印完毕
public class TestD implements Runnable{
    private CountDownLatch countDownLatch = null;

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public TestD(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // 该线程开始进行等待
        try {
            this.countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 输出计算完毕
        System.out.println("输出打印计算完毕");
    }
}
