package com.ming28;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {
    private Exchanger exchanger;

    public ThreadA(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("线程A,给线程B送礼");
        System.out.println("同时等待线程B的回礼");
        Object result = null;
        try{
            result = exchanger.exchange("AAAA");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("线程B回礼了" + result);
    }
}
