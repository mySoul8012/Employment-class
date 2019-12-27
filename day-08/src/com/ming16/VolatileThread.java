package com.ming16;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileThread extends Thread {
    private boolean flag = false;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atomicInteger.addAndGet(1);
        }
        System.out.println(atomicInteger);
    }
}
