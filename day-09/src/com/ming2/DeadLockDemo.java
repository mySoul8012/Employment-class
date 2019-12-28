package com.ming2;

public class DeadLockDemo {
    public static void main(String[] args){
        // 1.2个锁对象
        Object obj1 = new Object();
        Object obj2 = new Object();
        // 创建线程池
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj1){
                        System.out.println("线程1获取了线程对象obj1，等待获取锁对象obj2");
                        synchronized (obj2){
                            System.out.println("线程1的任务执行了。。。");
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj2){
                        System.out.println("线程2获取了锁对象obj2，等待获取锁对象obj1");
                        synchronized (obj1){
                            System.out.println("线程2的任务执行了....");
                        }
                    }
                }
            }
        }).start();
    }
}
