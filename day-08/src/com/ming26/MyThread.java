package com.ming26;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class MyThread extends Thread {
    private CyclicBarrier cyclicBarrier;

    public MyThread(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try{
            // 模拟随机等待
            Thread.sleep(new Random().nextInt(5000) + 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
