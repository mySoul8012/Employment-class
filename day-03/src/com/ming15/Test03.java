package com.ming15;

import java.util.ArrayList;
import java.util.List;

// 请定义一个集合：List<Integer>，并循环向集合中添加1千万个数字，请计算这个循环运行的时间，并打印。
public class Test03 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for(int i = 0; i <= 10000000; i++){
            list.add(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("程序运行 的时间"+  (endTime - startTime));

    }
}
