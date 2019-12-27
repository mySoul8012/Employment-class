package com.ming1;


public class Test {
    public static void main(String[] args){
        VolatileAtomicThread volatileAtomicThread = new VolatileAtomicThread();
        Thread thread = new Thread(volatileAtomicThread);
        thread.start();
    }
}
