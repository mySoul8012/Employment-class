package com.ming;

public class Test04 {
    public static void main(String[] args){
        for(int i = 0; i < 1000; i++){
            VolatileThread volatileThread = new VolatileThread();
            Thread thread = new Thread(volatileThread);
            thread.start();
        }
    }
}
