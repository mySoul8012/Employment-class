package com.ming24;

public class Test implements Runnable {
    private int piaoshuNumber = 100;
    private int yijinMaiCu = 0;
    @Override
    public void run() {
        // 获取线程名称
        String name = Thread.currentThread().getName();
        // 判断票数
        if(piaoshuNumber > 0){
            // 票数减少
            synchronized (this) {
                piaoshuNumber--;
                yijinMaiCu++;
            }
            // 输出剩余的票数
            System.out.println("剩余的票数为 " + piaoshuNumber + " 已经卖出的 " + yijinMaiCu + "在窗口 " + name);
        }
    }
}
