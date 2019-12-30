package com.ming17;

public class ProducerAndCustomerDemo {
    public static void main(String[] args){
        // 创建盘子
        PanZi panZi = new PanZi(true);
        // 创建锁
        Object obj = new Object();
        // 创建生产者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    // 创建锁
                    synchronized (obj) {
                        // 判断盘子是否为空
                        if (!panZi.isFlag()) {

                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            // 此时盘子为空 开始做包子，进入等待状态
                            panZi.setFlag(false);
                            // 唤醒消费者
                            System.out.println("吃货过来");
                            obj.notify();

                        }
                    }
                }
            }
        }).start();

        // 创建消费者线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        // 判断此时包子是否还有
                        if (panZi.isFlag() == false) {
                            // 此时有包子
                            // 进行读取
                            // 此时没有包子，消费者线程进入等待状态
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            // 进行吃包子
                            panZi.setFlag(true);
                            // 唤醒生产者生产包子
                            obj.notify();
                        }
                    }
                }
            }
        }).start();
    }
}
