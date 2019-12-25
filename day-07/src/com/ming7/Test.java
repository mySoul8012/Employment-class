package com.ming7;

public class Test {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 此线程计算 10 ！
                int sum = 0;
                for(int i = 1; i <= 10; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // 计算 5！
                int sum = 0;
                for(int i = 1; i <= 5; i++){
                    sum += i;
                }
                // 输出
                System.out.println(sum);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 8; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        }).start();
    }
}
