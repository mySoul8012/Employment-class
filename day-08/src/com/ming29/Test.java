package com.ming29;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;

public class Test implements Runnable{
    // 使用 volatile 关键字强制刷新主内存
    private volatile CopyOnWriteArrayList<Integer> copyOnWriteArrayList = null;
    private volatile  boolean flage = true;

    public Test(boolean flage) {
        this.copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.flage = flage;

    }

    public CopyOnWriteArrayList<Integer> getCopyOnWriteArrayList() {
        return copyOnWriteArrayList;
    }

    public void setCopyOnWriteArrayList(CopyOnWriteArrayList<Integer> copyOnWriteArrayList) {
        this.copyOnWriteArrayList = copyOnWriteArrayList;
    }

    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    @Override
    public void run() {
        // 进行数据添加
        if(this.isFlage()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 循环添加 1 - 10000
            for(int i = 1; i <= 10000; i++){
                this.getCopyOnWriteArrayList().add(i);
            }
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 10001; i <= 20000; i++){
                this.getCopyOnWriteArrayList().add(i);
            }
        }
    }
}
