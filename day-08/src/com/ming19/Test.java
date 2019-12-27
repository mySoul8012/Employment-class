package com.ming19;

// 多线程可见性
public class Test implements Runnable {
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        // 线程睡眠
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更改线程值
        this.flag = true;
        // 输出更改后的值
        System.out.println(this.flag);
    }
}
