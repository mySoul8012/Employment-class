package com.ming19;

// 线程可见性问题，，副本线程以及修改数据，由于主线程不停的读取内存，没有修改数据，导致结果没有输出，输出的结果为 true
public class Test01 {
    public static void main(String[] args){
        Test02 test = new Test02();
        Thread thread = new Thread(test);
        // 启动线程
        thread.start();
        // 持续不断读取
        while(true) {
            if (test.isFlag()) {
                System.out.println("输出结果");
            }
        }
    }
}
