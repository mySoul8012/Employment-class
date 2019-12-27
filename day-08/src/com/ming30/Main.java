package com.ming30;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        // 创建
        Test test = new Test();
        test.setFlage(true);
        Thread thread = new Thread(test);
        test.setFlage(false);
        Thread thread1 = new Thread(test);
        // 启动线程
        thread.start();
        thread1.start();
        // 进行输出
        while(true){
            // 进行判断
            if(test.getCopyOnWriteArrayList().size() >= 20){
                Iterator iterator = test.getCopyOnWriteArrayList().iterator();
                // 进行遍历
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        }
    }
}
