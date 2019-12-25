package com.ming13;

public class Test01 extends Thread{
    @Override
    public void run() {
        // 计算1 - 100 的所有数字累加和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
