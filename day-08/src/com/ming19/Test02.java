package com.ming19;

// 使用 volatile 关键字，使得副本内存修改以后，直接更新到主内存
public class Test02 implements Runnable {
    private volatile boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更改线程的值，
        this.flag = true;
        // 输出结果
        System.out.println(this.flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
