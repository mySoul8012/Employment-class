package com.ming11;

public class Test implements Runnable{
    // 创建锁对象
    private Object obj = new Object();
    private Object obj1 = new Object();
    @Override
    public void run() {
        // 创建锁
        while(true){
            // 创建锁 即将进入一
            System.out.println("即将进入锁1");
            synchronized (obj){
                System.out.println("即将进入锁2");
                synchronized (obj1){
                    System.out.println("已经进入了Test");
                }
            }
        }
    }
}
