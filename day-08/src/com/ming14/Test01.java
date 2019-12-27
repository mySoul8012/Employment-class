package com.ming14;

public class Test01 {
    public static void main(String[] args){
        // 创建线程
        Test test = new Test();
        Thread thread = new Thread(test);
        // 启动线程
        thread.start();
        // 进行不断读取内存
        while(true){
            if(test.isFlag()){
                System.out.println("主内存中已经更新");
            }
        }
    }
}
