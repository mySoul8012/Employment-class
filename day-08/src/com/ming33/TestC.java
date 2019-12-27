package com.ming33;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

// 计算所有奇数累加和
public class TestC  implements  Runnable{
    private CountDownLatch countDownLatch = null;
    private volatile int sum = 0;

    public TestC(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }



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

    // 计算 1--10000 所有奇数累加和
    @Override
    public void run() {
        for(int i = 1; i < 10000; i++){
            // 判断奇数
            if(i % 2 == 1){
                // 输出奇数
                sum += i;
            }
        }
        // 打印数据
        System.out.println(this.sum);
        // 线程计数器减一
        this.countDownLatch.countDown();
    }

}
