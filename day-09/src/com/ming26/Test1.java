package com.ming26;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池
        ExecutorService service = Executors.newFixedThreadPool(3);
        // 提交有返回的任务
        Future<Integer> future = service.submit(new Test());
        // 获取结果
        Integer integer = future.get();
        // 输出结果
        System.out.println("获取的结果是 " + integer);

    }
}
