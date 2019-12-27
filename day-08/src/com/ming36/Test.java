package com.ming36;

import java.util.concurrent.Exchanger;

public class Test implements Runnable {
    private Exchanger exception;

    public Test(Exchanger exception) {
        this.exception = exception;
    }

    public Exchanger getException() {
        return exception;
    }

    public void setException(Exchanger exception) {
        this.exception = exception;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "给另外一个线程 " + " 一条娱乐新闻");
        Object res = null;
        try {
            res = this.exception.exchange("给另外一条线程娱乐新闻");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 输出获取的结果
        System.out.println(Thread.currentThread().getName() + "从另外一个线程获取的数据 " + res);
    }
}
