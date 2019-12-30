package com.ming16;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 10; i++){
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了。。。");
                }
            });
        }

        // 提交有返回值的任务
        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 0; i < 100; i++){
                    sum += i;
                }
                // 返回sum
                return sum;
            }
        });

        // 获取值
        Integer res = future.get();
        // 输出结果
        System.out.println("从future对象中获取结果任务");
        System.out.println("输出内容为" + res);
    }
}
