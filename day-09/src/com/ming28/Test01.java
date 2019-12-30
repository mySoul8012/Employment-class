package com.ming28;

import com.ming26.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交任务
        Future<Integer> future = executorService.submit(new Test());
        // 获取结果
        Integer res = future.get();
        // 输出结果
        System.out.println("输出结果" + res);
    }
}
