package com.ming;

public class ProducerAndCustomerDemo {
    public static void main(String[] args){
        // 创建一个盘子
        PanZi panZi = new PanZi();
        Object obj = new Object();

        // 生产者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    // 加锁
                    synchronized (obj){
                        // 判断
                        if(panZi.flag == true){
                            // 进入等待状态
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        panZi.flag = true;
                        System.out.println("生产者的包子做好了...");

                        // 唤醒消费者
                        System.out.println("吃货来了");
                        obj.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    // 加锁
                    synchronized (obj){
                        // 判断
                        if(panZi.flag == false){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    // 吃包子
                    panZi.flag = false;
                    System.out.println("包子好吃");

                    // 唤醒生产者
                    System.out.println("再做一个");
                    obj.notify();
                }
            }
        }).start();
    }
}
