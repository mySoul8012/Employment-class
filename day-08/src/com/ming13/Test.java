package com.ming13;

// 多线程原子性问题
public class Test implements Runnable{
    private int count = 0;

    @Override
    public void run() {
        // 对变量进行++操作
        for(int x = 0; x < 1000; x++){
            count++;
            System.out.println(count);
        }
    }
}
