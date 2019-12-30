package com.ming18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Integer> stringList = new ArrayList<>();
        // 输出
        for(int i = 0; i < 10; i++){
            stringList.add(i);
        }
        // 进行降序排序
        stringList.sort((t1, t2) -> {
            return t2 -t1;
        });
        // 输出
        for(int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

    }
}
