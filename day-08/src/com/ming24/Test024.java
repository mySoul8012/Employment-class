package com.ming24;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test024 implements Runnable{
    private int piaoshuNumber = 100;
    private int yijinMaiCu = 0;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        // 获取线程名称
        String name = Thread.currentThread().getName();
        // 判断票数
        if(piaoshuNumber > 0){
            // 票数减少
            lock.lock();
                piaoshuNumber--;
                yijinMaiCu++;
                lock.unlock();
            }
            // 输出剩余的票数
            System.out.println("剩余的票数为 " + piaoshuNumber + " 已经卖出的 " + yijinMaiCu + "在窗口 " + name);
        }
    }
