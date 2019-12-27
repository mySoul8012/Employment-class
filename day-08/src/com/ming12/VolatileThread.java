package com.ming12;

public class VolatileThread extends Thread {
    private boolean flag = false;

    @Override
    public void run() {
        // 线程睡眠
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更新值
        this.flag = true;
        // flag 更新 输出值
        System.out.println(this.flag);

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
