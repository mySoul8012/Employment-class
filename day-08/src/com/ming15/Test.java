package com.ming15;

public class Test implements Runnable {
    // 强制刷新到主内存中
    private volatile int count = 0;

    @Override
    public void run() {
        // 进行更新
        for(int i = 0; i < 1000; i++){
            count++;
            System.out.println(count);
        }
    }
}
