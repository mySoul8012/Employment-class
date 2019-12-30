package com.ming28;

public class Test03 {
    public static void main(String[] args){
        new Thread(() -> {
           // 线程打印计算 1 - 100
           int sum = 0;
            for(int i = 1; i < 100; i++){
               sum += i;
           }
            System.out.println(sum);
        }).start();

    }
}
