package com.ming27;

public class Test{
    public static void main(String[] args){
        // 创建锁
        Object object = new Object();
        Object object1 = new Object();
        // 创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 添加循环
                while(true){
                    // 创建线程
                    // 即将获得锁1
                    System.out.println("即将获得锁1");
                    synchronized (object){
                        System.out.println("即将获得锁2 此时已经获得了锁1");
                        // 即将获得锁2
                        synchronized (object1){
                            System.out.println("此时已经获得了锁2");
                            System.out.println("此时已经获得了锁");
                        }
                    }
                }
            }
        }).start();

        // 创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    // 创建线程
                    System.out.println("即将获得锁1");
                    synchronized (object1){
                        System.out.println("此时已经获得了锁1");
                        System.out.println("即将获得锁");
                        synchronized (object){
                            System.out.println("此时已经获得了锁");
                        }
                    }
                }
            }
        }).start();
    }
}
