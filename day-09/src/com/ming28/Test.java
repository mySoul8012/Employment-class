package com.ming28;

import java.util.concurrent.Callable;

public class Test implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 计算 1 - 100 的所有数字累加和
        int sum = 0;
        for(int i = 1; i < 100; i++){
            sum += i;
        }
        return sum;
    }
}
