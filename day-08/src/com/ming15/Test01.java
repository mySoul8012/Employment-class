package com.ming15;

public class Test01 {
    public static void main(String[] args){
        Test test = new Test();
        Thread thread = new Thread(test);
        // 不断启动线程
        for(int i = 0; i < 1000; i++){
            thread.start();
        }
    }
}
