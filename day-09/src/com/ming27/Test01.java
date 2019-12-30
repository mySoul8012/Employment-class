package com.ming27;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        // 创建锁对象
        Object object = new Object();

        // 定义线程
        // 启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    // 进行循环
                    for(int i = 1; i < 1000; i++){
                        // 进行判断
                        if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                            // 此时该线程进入等待状态
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }).start();

        // 主线程休眠
        Thread.sleep(100);

        // 重新启动另外一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 获取到锁
                synchronized (object){
                    // 计数器+1
                    atomicInteger.addAndGet(1);
                    // 进入唤醒状态
                    object.notify();
                }
            }
        }).start();

        // 循环打印
        while(true){
            Thread.sleep(2000);
            System.out.println(atomicInteger);
        }
    }
}
