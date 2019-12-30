package com.ming28;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张小小");

        // 使用 Stream 流ForEach进行打印
        list.stream().forEach((res) -> {
            System.out.println(res);
        });

        list.stream().filter((s) -> {
            return s.startsWith("张");
        }).forEach((res) -> {System.out.println(res);});

        long count = list.stream().count();
        // 输出数据
        System.out.println(count);

    }
}
