package com.ming3;

import com.sun.jdi.InternalException;

public class TestDemo {
    public static void main(String[] args) throws InternalException, InterruptedException {
        Thread1A thread1A = new Thread1A();
        Thread1A thread1A1 = new Thread1A();
        thread1A.setName("线程1-");
        thread1A1.setName("线程2-");
        thread1A.start();
        thread1A1.start();
        for(int i = 0; i < 5; i++){
            Thread.sleep(10000);
            System.out.println(i);
        }
        System.out.println("Map大小" + Const.map.size());
    }
}
