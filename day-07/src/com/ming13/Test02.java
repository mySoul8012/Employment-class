package com.ming13;

import java.util.TreeMap;

public class Test02 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
