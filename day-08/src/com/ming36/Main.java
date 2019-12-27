package com.ming36;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args){
        // 创建线程数据交换器
        Exchanger exchanger = new Exchanger();
        // 创建两个线程
        Test test = new Test(exchanger);
        TestA testA = new TestA(exchanger);

        // 启动线程
        Thread thread = new Thread(test);
        Thread thread1 = new Thread(testA);
        thread.start();
        thread1.start();
    }
}
