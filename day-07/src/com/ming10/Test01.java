package com.ming10;

public class Test01 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){

        new Test01().run();
        for(int j = 0; j < 1000; j++){
            System.out.println(j);
        }
    }
}
