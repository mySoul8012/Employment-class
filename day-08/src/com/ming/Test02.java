package com.ming;

public class Test02 implements Runnable {
    private int count = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(count > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
                    count--;
                }
            }
        }
    }
}
