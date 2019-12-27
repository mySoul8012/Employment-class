package com.ming20;

// 线程的原子性
public class Test implements Runnable{
    private int count = 0;

    // 引入 run 方法
    @Override
    public void run() {
        // 进行加加操作
        for(int i = 0; i < 100; i++) {
            count++;
            // 输出结果值
            System.out.println(count);
        }
    }
}
