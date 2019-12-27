package com.ming37;

public class Main {
    public static void main(String[] args){
        Thread1A thread1A = new Thread1A();
        Thread thread = new Thread(thread1A);
        // 启动线程
        thread.start();
    }
}
