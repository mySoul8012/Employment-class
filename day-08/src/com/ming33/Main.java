package com.ming33;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args){
        CountDownLatch countDownLatch = null;

        countDownLatch = new CountDownLatch(3);

        // 定义线程
        TestA testA = new TestA(countDownLatch);
        TestB testB = new TestB(countDownLatch);
        TestC testC = new TestC(countDownLatch);
        TestD testD = new TestD(countDownLatch);

        // 创建线程
        Thread thread = new Thread(testA);
        Thread thread1 = new Thread(testB);
        Thread thread2 = new Thread(testC);
        Thread thread3 = new Thread(testD);

        // 启动线程
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
