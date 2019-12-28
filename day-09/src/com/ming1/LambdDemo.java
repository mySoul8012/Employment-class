package com.ming1;

public class LambdDemo {
    public static void main(String[] args){
        // 使用传统的面相对象思想，开启线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 执行了...");
            }
        });
        new Thread(() -> {System.out.println(Thread.currentThread().getName() + "执行了...");}).start();
    }
}
