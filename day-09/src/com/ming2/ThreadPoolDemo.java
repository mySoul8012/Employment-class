package com.ming2;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交无返回值的任务
        for(int i = 0; i < 10; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了...");
                }
            });
        }

        // 提交有返回值的任务
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
        System.out.println("future 对象得到了");
        Integer res = future.get();
        System.out.println("从future对象中获取到任务");
        // 打印结果
        System.out.println("执行结果: " + res);
    }
}
