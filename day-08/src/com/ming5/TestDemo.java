package com.ming5;

import java.util.concurrent.CyclicBarrier;

public class TestDemo {
    public static void main(String[] args)throws InterruptedException{
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人都到了。该开会了");
            }
        });


    }
}
