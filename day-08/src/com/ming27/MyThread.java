package com.ming27;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
    private Semaphore semaphore;

    public MyThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        // 获取线程执行的许可
        try{
            semaphore.acquire();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + "即将执行");

        try{
            // 线程随机睡眠
            Thread.sleep(new Random().nextInt(3000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // 线程即将结束
        System.out.println(getName() + "即将结束");
        // 归还线程的许可
        semaphore.release();
    }
}
