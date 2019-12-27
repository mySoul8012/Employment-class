package com.ming27;

import java.util.concurrent.Semaphore;

public class TestDemo {
    public static void main(String[] args){
        // 最多允许线程的并发数量为 1
        Semaphore semaphore = new Semaphore(1);
        // 创建五个线程
        for(int i = 0; i < 50; i++){
            MyThread thread = new MyThread(semaphore);
            thread.start();
        }
    }
}
