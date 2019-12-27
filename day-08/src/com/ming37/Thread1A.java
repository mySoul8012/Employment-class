package com.ming37;

public class Thread1A extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 50000; i++){
            Const.map.put(this.getName() + (i + 1) , this.getName() + i + 1);
        }
        long end = System.currentTimeMillis();
        // 打印结果
        System.out.println(this.getName() + "结束时间" + (end - start));
    }
}
