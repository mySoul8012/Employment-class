package com.ming13;

// 原子性操作，++ 分为两步，第一步是 从主内存中读取，另外一步是进行++操作，第三步是刷新到主内存中，由于多个线程并发执行，出现线程的不安全特性。
public class TestVolatileAtomicThreadDemo {
    public static void main(String[] args){
        Test test = new Test();
        for(int x = 0; x < 100; x++){
            new Thread(test).start();
        }
    }
}
