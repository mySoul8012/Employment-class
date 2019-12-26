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


        Thread thread = new Thread(new  Runnable() {
                    @Override
                    public void run() {
                        System.out.println("333");
                    }
                }, "ming");
        thread.start();
    }
}
