package com.ming5;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        Random random = new Random();
        // 循环产生10个随机数
        for(int i = 0; i < 10; i++){
            sum += random.nextInt(100) + 1;
        }
        System.out.println("sum = " + sum);
    }
}
