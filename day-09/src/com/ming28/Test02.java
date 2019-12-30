package com.ming28;

import java.util.concurrent.atomic.AtomicInteger;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        // 创建锁
        Object object = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        // 创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 创建锁
                synchronized (object){
                    // 进行循环
                    for(int i = 1; i < 1000; i++){
                        // 进行判断
                        if(i % 2 == 0){
                            // 进入等待状态
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

        // 创建线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    // 线程计数器+1
                    atomicInteger.addAndGet(1);
                    // 唤醒其他线程
                    object.notify();
                }
            }
        }).start();

        // 休息两秒
        Thread.sleep(2000);
        // 循环打印计数器
        while(true){
            System.out.println(atomicInteger);
        }
    }
}
