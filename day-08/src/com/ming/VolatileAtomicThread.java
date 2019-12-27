package com.ming;

public class VolatileAtomicThread implements Runnable{
    private volatile int  count = 0;

    @Override
    public void run() {
        for(int x = 0; x < 1000; x++){
            count++;
            System.out.println("=====" + count);
        }
    }
}
