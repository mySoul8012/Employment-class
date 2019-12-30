package com.ming26;

import java.util.concurrent.Callable;

public class Test implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        // 计算
        for(int i = 1; i < 100; i++){
            sum += i;
        }
        return sum;
    }
}
