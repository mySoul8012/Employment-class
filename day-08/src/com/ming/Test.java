package com.ming;

public class Test {
    public static void main(String[] args){
        MyTask myTask = new MyTask();
        // 创建线程
        Thread thread = new Thread(myTask);
        Thread thread1 = new Thread(myTask);
        Thread thread2 = new Thread(myTask);

        // 启动
        thread.start();
        thread1.start();
        thread2.start();
    }
}
