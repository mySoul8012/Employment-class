package com.ming18;

public class Test01 {
    public static void main(String[] args){
        Test test = new Test();
        // 创建线程
        Thread thread = new Thread(test);
        Thread thread1 = new Thread(test);
        // 启动线程
        thread.start();
        thread1.start();
    }
}
