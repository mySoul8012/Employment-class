package com.ming15;

public class WaitAndNotifyDemo {
    public static void main(String[] args)throws InterruptedException{
        Object obj = new Object();
        // 创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1 立马获取到了锁obj");
                // 加锁
                synchronized (obj){
                    System.out.println("线程1获取到了锁 obj...");
                    System.out.println("线程1进入无限等待....");
                    // 进入等待，释放锁
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("从无限等待中醒来");
                }
            }
        }).start();

        for(int i = 0; i < 10; i++){
            Thread.sleep(500);
            System.out.println(i);
        }

        // 创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2来了...");
                synchronized (obj){
                    System.out.println("线程2获取到了obj锁");
                    System.out.println("线程2把线程1唤醒了");
                    obj.notify();
                    // 线程2唤醒线程1之后，不能立刻释放锁，此时线程1醒来，由于没有锁对象，进入阻塞状态
                    for(int i = 0; i < 10; i++){
                        // 线程睡眠
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(i);
                    }
                }
            }
        }).start();
    }
}
