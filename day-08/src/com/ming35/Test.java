package com.ming35;

import java.util.concurrent.Semaphore;

public class Test implements Runnable {
    private Semaphore semaphore = null;

    public Test(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        // 获取线程执行许可
        try {
            this.semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 游客进行参观展览室
        System.out.println("游客参观展览室");

        // 线程等待
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 归还线程许可
        this.semaphore.release();
    }
}
