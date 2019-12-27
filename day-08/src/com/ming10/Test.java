package com.ming10;

import java.util.function.DoubleConsumer;

public class Test {
    public static void main(String[] args){
        // 创建线程对象
        LuckDraw luckDraw = new LuckDraw();
        // 创建线程
        Thread thread = new Thread(luckDraw, "前门");
        Thread thread1 = new Thread(luckDraw, "后门");
        thread.start();
        thread1.start();
    }
}
