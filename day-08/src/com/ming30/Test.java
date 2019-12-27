package com.ming30;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Test implements Runnable{
    private volatile CopyOnWriteArraySet<Integer> copyOnWriteArrayList = new CopyOnWriteArraySet<>();
    private volatile boolean flage = true;


    public Test() {
    }

    public CopyOnWriteArraySet<Integer> getCopyOnWriteArrayList() {
        return copyOnWriteArrayList;
    }


    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    @Override
    public void run() {
        // 进行读取
        if(this.isFlage()){
            // 创建循环添加数据
            for(int i = 0; i < 1000; i++){
                // 添加数据
                this.copyOnWriteArrayList.add(i);
            }
        }else{
            // 创建循环
            for(int i = 1001; i< 2000; i++){
                this.copyOnWriteArrayList.add(i);
            }
        }
    }


}
