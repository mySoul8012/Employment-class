package com.ming22;

import java.util.Arrays;

// 多线程访问数组
public class Test implements Runnable{
    // 定义一个一千长度的数组
    int[] number = new int[1000];

    @Override
    public void run() {
        for(int i = 0; i < number.length; i++){
            synchronized (this) {
                number[i]++;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 输出
        System.out.println(Arrays.toString(number));
    }
}
