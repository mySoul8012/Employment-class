package com.ming36;

import java.util.concurrent.Exchanger;

public class TestA implements Runnable {
    private Exchanger exchanger;

    public TestA(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    public Exchanger getExchanger() {
        return exchanger;
    }

    public void setExchanger(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("线程名称为 " + Thread.currentThread().getName() + "获取的内容为 体育新闻");
        Object res = null;
        try{
            res = this.exchanger.exchange("体育新闻");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 输出结果
        System.out.println(Thread.currentThread().getName() + res);
    }
}
