package com.ming28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test07 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张丽颖");
        list.add("王敏");
        // 筛选出张姓成员
        Stream stream = list.stream().filter((s) -> {
            // 进行筛选
            return s.startsWith("张");
        });
        // 打印
        stream.forEach(s -> System.out.println(s));

    }
}
