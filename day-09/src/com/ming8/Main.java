package com.ming8;

public class Main {
    public static void main(String[] args){
        Test test = new Test();
        // 循环创建10个线程对象
        for(int i = 0; i < 10; i++){
            new Thread(test, "线程test" + i + "过").start();
        }

        // 循环读取已经过的人数
        while(true){
            System.out.println(test.getCount());
        }
    }
}
