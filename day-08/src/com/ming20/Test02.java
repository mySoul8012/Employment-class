package com.ming20;

public class Test02 implements Runnable {
    private  int count = 0;

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            // 进行++操作
            synchronized (this) {
                count++;
                System.out.println(count);
            }
        }
    }
}
