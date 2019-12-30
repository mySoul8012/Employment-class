package com.ming15;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交无返回的任务
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("提交线程池执行");
            }
        });

        // 提交有返回值的任务
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        // 获取结果
        Integer res = future.get();
        // 输出结果
        System.out.println(res);
    }
}
