package com.ming35;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){
        // 最多允许10个游客
        Semaphore semaphore = new Semaphore(3);

        // 创建10个线程
        for(int i = 0; i < 10; i++){
            new Thread(new Test(semaphore)).start();
        }
    }
}
