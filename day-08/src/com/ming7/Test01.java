package com.ming7;


// 有100个限量版的水杯，
// 但是只能通过实体店和官网才能进行购买，
// 并且分别统计卖了多少。请用线程进行模拟并设置
// 线程名称用来代表售出途径，再将信息打印出来。
// 比如（实体店卖出第1个，总共剩余n个..）
public class Test01 {
    public static void main(String[] args){
        // 定义线程
        Sell sell = new Sell();
        // 创建线程售卖
        Thread thread = new Thread(sell, "实体店");
        Thread thread1 = new Thread(sell, "官网");
        // 启动线程
        thread.start();
        thread1.start();
    }
}
