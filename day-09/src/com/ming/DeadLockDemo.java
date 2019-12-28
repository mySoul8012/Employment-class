package com.ming;

// 死锁演示
public class DeadLockDemo {
    public static void main(String[] args){
        Object object1 = new Object();
        Object object2 = new Object();
        // 创建线程池
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (object1){
                        System.out.println("线程1获取锁对象obj1，等待获取锁对象 obj2");
                        synchronized (object2){
                            System.out.println("线程1的任务执行了");
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (object2){
                        System.out.println("线程2获取锁对象obj2，等待获取锁对象 obj1");
                        synchronized (object1){
                            System.out.println("线程2的任务执行了...");
                        }
                    }
                }
            }
        }).start();
    }
}
