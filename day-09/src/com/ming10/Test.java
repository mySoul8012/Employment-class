package com.ming10;

import java.util.concurrent.Callable;

public class Test implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        // 计算 1 - 100 的数字累加和
        for(int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
