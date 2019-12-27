package com.ming7;

public class Sell implements Runnable {
    // 定义水杯
    private int suibei = 100;
    @Override
    public void run() {
        // 获取线程名字
        String name = Thread.currentThread().getName();
        // 还剩余的杯子数量
            // 进行售卖
            while(true){
                synchronized (this) {
                    if (suibei > 0) {
                        // 进行售卖
                        suibei--;
                    } else {
                        // 此时已经不进行售卖
                        break;
                    }
                    // 打印售卖的结果
                    System.out.println("线程名称 " + name +  "还剩余 " + suibei);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
