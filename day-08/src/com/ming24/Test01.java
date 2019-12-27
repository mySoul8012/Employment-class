package com.ming24;

// 此时线程不安全
public class Test01 {
    public static void main(String[] args){
        Test024 test = new Test024();
        // 创建三个线程
        Thread thread = new Thread(test, "窗口1");
        Thread thread1 = new Thread(test, "窗口2");
        Thread thread2 = new Thread(test, "窗口3");
        // 启动
        thread.start();
        thread1.start();
        thread2.start();
    }
}
