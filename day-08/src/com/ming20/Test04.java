package com.ming20;

// 线程的原子性，通过加锁的方式，使得++操作变成原子性操作
public class Test04 {
    public static void main(String[] args){
        Test02 test02 = new Test02();
        // 创建线程
        for(int i = 0; i < 100; i++){
            new Thread(test02).start();
        }
    }
}
