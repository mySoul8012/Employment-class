package com.ming22;

public class Test02 {
    public static void main(String[] args){
        // 创建线程类
        Test test = new Test();
        // 创建线程
        for(int i  = 0; i < 10; i++){
            new Thread(test).start();
        }
    }
}
