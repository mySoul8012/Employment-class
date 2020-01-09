package com.ming11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        // 添加数据
        List<Integer> list = new ArrayList<>();
        // 进行遍历添加
        for(int i = 1; i <= 10; i++){
            // 进行添加
            list.add(i);
        }

        // 进行打乱顺序
        Collections.shuffle(list);
        // 输出集合
        System.out.println(Arrays.toString(list.toArray()));
        // 进行冒泡排序
        // 外面趟数
        for(int i = 0; i < 10; i++){
            // 里面遍历次数
            for(int j = 0; j < 10 - i - 1; j++){
                // 进行判断
                int tmp = 0;
                // 进行判断
                if(list.get(j + 1) > list.get(j)){
                    // 进行交换
                    // 进行交换
                    tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
        // 输出
        System.out.println(Arrays.toString(list.toArray()));

    }
}
