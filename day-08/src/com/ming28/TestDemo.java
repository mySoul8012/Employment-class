package com.ming28;

import java.util.concurrent.Exchanger;

public class TestDemo {
    public static void main(String[] args){
        Exchanger exchanger = new Exchanger();
        // 创建线程
        ThreadA threadA = new ThreadA(exchanger);
        ThreadB threadB = new ThreadB(exchanger);
        threadA.start();
        threadB.start();
    }
}
