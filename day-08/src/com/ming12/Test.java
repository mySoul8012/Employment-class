package com.ming12;

// 副本线程更新了 flag 值，但是主线程中没有刷新到主线程，导致主线程读取的时候，数据仍然是一定的
public class Test {
    public static void main(String[] args){
        VolatileThread volatileThread = new VolatileThread();
        // 线程执行
        volatileThread.start();

        // 输出结果
        while(true) {
            if (volatileThread.isFlag()) {
                System.out.println("主内存中没有更新");
            }
        }
    }
}
