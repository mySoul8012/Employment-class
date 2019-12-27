package com.ming6;

// 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，
// 并且分别统计卖了多少。请用线程进行模拟并设置线程名称用来代表售出途径，再将信息打印出来。
// 比如（实体店卖出第1个，总共剩余n个..）
public class Test {
    public static void main(String[] args){
        Seller seller = new Seller();
        Seller seller1 = new Seller();
        Thread thread = new Thread(seller);
        Thread thread1 = new Thread(seller1);
        // 启动线程
        // 创建两个线程
        thread.start();
        thread1.start();
    }
}
