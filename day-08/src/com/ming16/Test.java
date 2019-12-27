package com.ming16;

public class Test{
    public static void main(String[] args){
        VolatileThread volatileThread = new VolatileThread();
        // 启动多个线程
        for(int i = 0; i < 1000; i++){
            new Thread(volatileThread).start();
        }
    }
}
