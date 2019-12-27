package com.ming18;

import java.util.Arrays;

public class Test implements Runnable{
    private int[] numbers = new int[10000];

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                for (int j = 0; j < 1000; j++) {
                    numbers[j]++;
                }
            }
        }
        // 打印元素
        System.out.println(Arrays.toString(numbers));
    }
}
