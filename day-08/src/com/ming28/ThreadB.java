package com.ming28;

import java.util.concurrent.Exchanger;

public class ThreadB  extends Thread{
    private Exchanger exchanger;

    public ThreadB(Exchanger exchanger){
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("线程B，给线程A送礼物");
        System.out.println("同时等待线程A的回礼");
        Object res = null;
        try{
            res = exchanger.exchange("BBBBB");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("收到了线程A的回礼" + res);
    }
}
