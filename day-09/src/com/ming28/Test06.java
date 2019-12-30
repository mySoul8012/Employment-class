package com.ming28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        // 添加数据
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张小小");
        list.add("王敏");
        Stream stream = list.stream().filter((s) -> {
           return  s.startsWith("张");
        });
        // 筛选后，跳过前1个，打印剩余人员
        // 打印
        stream.forEach((s) -> {
            System.out.println(s);
        });
    }
}
