package com.ming;

public class TestVolatileDemo {
    public static void main(String[] args){
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.start();

        while(true){
            if(volatileThread.isFlag()){
                System.out.println("执行了====");
            }
        }
    }
}
