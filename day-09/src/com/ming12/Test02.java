package com.ming12;

public class Test02 implements Runnable{
    private Object object = new Object();
    private volatile  int count = 0;

    @Override
    public void run() {
        // 创建计数器进行 + 1
        count++;
        // 进行唤醒其他线程
        object.notify();
    }
}
