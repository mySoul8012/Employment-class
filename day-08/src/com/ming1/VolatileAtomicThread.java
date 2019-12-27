package com.ming1;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomicThread implements Runnable{
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
        atomicInteger.getAndIncrement();
        System.out.println("count =====" + atomicInteger);
    }
}
