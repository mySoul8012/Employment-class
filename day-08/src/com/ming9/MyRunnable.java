package com.ming9;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 打印需求
        System.out.println("我需要一个老师");
        // 暂停两秒
        try {
            // 该线程睡眠两秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 老师过来指导学生
        String name = Thread.currentThread().getName();
        // 进行指导学生
        System.out.println("老师教授 " + name + "  教授 Java");

    }
}
