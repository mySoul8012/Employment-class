package com.ming8;

public class Test implements Runnable {
    private volatile int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        // 通过添加锁，模拟一个人过山洞
        synchronized (this){
            // 进行过山洞
            count++;
            // 线程睡眠
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 打印出谁过隧道
            System.out.println(Thread.currentThread().getName() + "线程过隧道");
        }
    }
}
