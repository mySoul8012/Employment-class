package com.ming;

public class WaitAndNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个锁对象
        Object obj = new Object();
        // 创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1即将获取到锁 " + obj);
                synchronized (obj){
                    System.out.println("线程1获取到了锁obj..");
                    System.out.println("线程1进入了无限等待...");
                    try{
                        obj.wait(); // 进入无限等待状态，自动释放锁对象
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("线程1从无限等待中醒来了...");
                }
            }
        }).start();

        for(int i = 0; i < 10; i++){
            Thread.sleep(500);
            System.out.println(i);
        }

        // 再次创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2来了...");
                synchronized (obj){
                    System.out.println("线程2获取到了obj锁");
                    System.out.println("线程2把线程1唤醒了..");
                    obj.notify();
                    for(int i = 0; i < 10; i++){
                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}
