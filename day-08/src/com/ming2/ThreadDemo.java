package com.ming2;

public class ThreadDemo {
    public static void main(String[] args){
        MyTask myTask = new MyTask();
        Thread t1 = new Thread(myTask);
        Thread t2 = new Thread(myTask);
        Thread t3 = new Thread(myTask);
        t1.start();
        t2.start();
        t3.start();
    }
}
