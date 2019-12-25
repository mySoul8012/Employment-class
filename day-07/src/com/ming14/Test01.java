package com.ming14;

public class Test01 {
    public static void main(String[] args){
        new Thread(){
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 100; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        }.start();

        new Runnable(){
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 500; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
        }.run();
    }
}
