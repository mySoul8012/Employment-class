package com.ming1;

import java.awt.*;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args){
        // 创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交任务
        for(int i = 0; i < 10; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了");
                }
            });
        }

        // 提交返回值的任务
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 1; i < 101; i++){
                    Thread.sleep(50);
                    sum += i;
                }
                return sum;
            }
        });
    }
}
