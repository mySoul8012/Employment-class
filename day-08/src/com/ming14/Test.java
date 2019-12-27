package com.ming14;

// 使用 Volatile 关键字解决变量可见性问题
public class Test extends Thread{
    // 使用 volatile 关键字，使得副本内存刷新强制更新到主内存中
    private volatile boolean flag = true;

    @Override
    public void run() {
        // 线程睡
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 进行更新
        this.flag = false;
        // 输出结果
        System.out.println("输出结果" + this.flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
