package com.ming3;

public class Thread1A extends Thread {
    long start = System.currentTimeMillis();
    @Override
    public void run() {
        for(int i = 0; i < 50000; i++){
            Const.map.put(this.getName() + (i + 1), this.getName() + i + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println(this.getName() + "结束" + (end - start));
    }
}
