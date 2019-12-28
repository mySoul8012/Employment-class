package com.ming11;

public class Test01 implements Runnable {
    private Object object = new Object();
    private Object object1 = new Object();

    @Override
    public void run() {
        // 创建锁
        while(true) {
            System.out.println("即将进入锁1");
            synchronized (object) {
                System.out.println("立马进入锁2");
                synchronized (object1) {
                    System.out.println("已经进入Test01");
                }
            }
        }
    }
}
