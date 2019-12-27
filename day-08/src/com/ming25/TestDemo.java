package com.ming25;

import java.util.concurrent.CountDownLatch;

public class TestDemo {
    public static void main(String[] args) {
        //1.创建一个CountDownLatch
        CountDownLatch latch = new CountDownLatch(1);

        ThreadA a = new ThreadA(latch);
        ThreadB b = new ThreadB(latch);
        a.start();
        b.start();
    }
}
