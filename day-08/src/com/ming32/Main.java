package com.ming32;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args){
        // 创建 CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(1);
        // 创建线程
        TestA testA = new TestA(countDownLatch);
        TestB testB = new TestB(countDownLatch);
        // 创建线程
        Thread thread = new Thread(testA);
        Thread thread1 = new Thread(testB);
        // 启动线程
        thread.start();
        thread1.start();
    }
}
