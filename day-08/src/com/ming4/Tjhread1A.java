package com.ming4;

import com.ming3.Const;

public class Tjhread1A extends Thread {
    public void run(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++){
            Const.map.put(this.getName() + (i + 1), this.getName() + i + 2);
        }
        long end = System.currentTimeMillis();
        System.out.println(this.getName() + "结束!" + (end - start));
    }
}
