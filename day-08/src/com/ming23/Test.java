package com.ming23;


import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test implements  Runnable {
    private AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(1000);

    @Override
    public void run() {
        // 创建循环，数组加
        for(int i = 0; i < 1000; i++){
                atomicIntegerArray.incrementAndGet(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 输出数组
        System.out.println(atomicIntegerArray);
    }
}
