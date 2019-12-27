package com.ming26;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class TestDemo {
    public static void main(String[] args)throws InterruptedException{
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人都到了，，开始开会...");
            }
        });
        // 创建五个线程，模型五个员工
        MyThread myThread = new MyThread(cyclicBarrier);
        MyThread myThread1 = new MyThread(cyclicBarrier);
        MyThread myThread2 = new MyThread(cyclicBarrier);
        MyThread myThread3 = new MyThread(cyclicBarrier);
        MyThread myThread4 = new MyThread(cyclicBarrier);
        MyThread myThread5 = new MyThread(cyclicBarrier);

        myThread.setName("张三");
        myThread1.setName("李四");
        myThread2.setName("王五");
        myThread3.setName("赵六");
        myThread4.setName("前妻");
        myThread5.setName("小");
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
