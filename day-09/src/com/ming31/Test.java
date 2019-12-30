package com.ming31;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
       // 创建一个锁对象
        Object object = new Object();

        // 创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    // 如果发现能被 2 3  5 7 整除
                    for(int i = 1; i < 1000; i++){
                        if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                            synchronized (object){
                                try {
                                    object.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }).start();

        // 创建另外一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    while(true) {
                        // 进行计数器 + 1
                        atomicInteger.addAndGet(1);
                        // 进行唤醒其他线程
                        object.notify();
                        // 进行循环等待
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        while(true) {
            // 主线程
            Thread.sleep(1000);
            // 打印结果
            System.out.println(atomicInteger);
        }
    }
}
