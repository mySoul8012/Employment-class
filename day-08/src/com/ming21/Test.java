package com.ming21;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Test implements Runnable {
    private AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    public AtomicBoolean getAtomicBoolean() {
        return atomicBoolean;
    }

    public void setAtomicBoolean(AtomicBoolean atomicBoolean) {
        this.atomicBoolean = atomicBoolean;
    }

    @Override
    public void run() {
        // 线程睡眠
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 更新值
        atomicBoolean.set(true);
        // 输出值
        if(atomicBoolean.get()){
            System.out.println("更新值完成" + atomicBoolean.get());
        }
    }
}
