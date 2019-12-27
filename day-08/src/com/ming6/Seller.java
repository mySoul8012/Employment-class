package com.ming6;

public class Seller implements Runnable {
    // 设置一共限量的水杯为 100 个 此变量为所有的线程所共享的。
    private  Integer  count = 100;
    @Override
    public void run() {
        // 获取线程名字
        String name = Thread.currentThread().getName();

        // 定义卖出的
        int sellCount = 0;
        // 定义变量统计卖出去的个数
        // 加锁，进行统计
        while(true) {
            synchronized (count){
                    // 当 count 大于 0 的时候，进行卖出
                    if (count > 0) {
                        count--;
                        sellCount++;
                        // 输出统计
                        System.out.println("以及卖出的还剩余" + count + "以及卖出的" + count);
                    }else{
                        break;
                    }
                    // 小睡一会
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
