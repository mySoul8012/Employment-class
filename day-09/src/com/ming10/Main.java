package com.ming10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交任务 提交任务
        executorService.submit(new Test());


    }
}
