package com.ming10;

public class LuckDraw implements Runnable {
    // 定义员工人数
    private int number = 100;

    @Override
    public void run() {
        // 获取线程名称
        String name = Thread.currentThread().getName();
        // 获取统计人数
        int count = 0;

        // 添加循环进行分发
        while(true){
            synchronized (this){
                // 如果员工人数小于0则停止
                if(number > 0) {
                    // 员工人数减少
                    number--;
                    // 统计人数增加
                    count++;
                    // 统计人数
                    System.out.println("第 " + number + "员工拿到的双色球号码为: " + DoubleColorBallUtil.create());
                }else{
                    break;
                }
            }
        }

    }
}
