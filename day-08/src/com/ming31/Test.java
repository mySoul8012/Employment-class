package com.ming31;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Test implements Runnable {
    private volatile ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<Integer, Integer>();
    private volatile boolean flag = true;


    public ConcurrentMap<Integer, Integer> getConcurrentMap() {
        return concurrentMap;
    }

    public void setConcurrentMap(ConcurrentMap<Integer, Integer> concurrentMap) {
        this.concurrentMap = concurrentMap;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Test(boolean flag) {
        this.flag = flag;
    }

    public Test(ConcurrentMap<Integer, Integer> concurrentMap, boolean flag) {
        this.concurrentMap = concurrentMap;
        this.flag = flag;
    }

    @Override
    public void run() {
        if(this.isFlag()){
            // 进行循环添加
            for(int i = 1; i <= 1000; i++){
                // 输出结果
                this.getConcurrentMap().put(i, i);
            }
        }else{
            for(int i = 1000; i <= 2000; i++){
                // 进入put
                this.getConcurrentMap().put(i, i);
            }
        }
    }
}
