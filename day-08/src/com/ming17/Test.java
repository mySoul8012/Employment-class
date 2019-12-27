package com.ming17;

import java.util.Arrays;

public class Test implements Runnable {
    private int[] number = new int[1000];

    @Override
    public void run() {
        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number.length; j++){
                synchronized (number){
                    number[j]++;
                }
            }
        }
        // 打印数组
        System.out.println(Arrays.toString(number));
    }
}
