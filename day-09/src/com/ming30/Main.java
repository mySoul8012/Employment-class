package com.ming30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        // 定义集合添加以下数据
        List<String> list = new ArrayList<>();
        // 添加数据
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        // 创建Stream 流的map方法
        Stream<Person> stream = list.stream().map(Person::new);
        // 提取List集合
        List<Person> res = stream.collect(Collectors.toList());
        // 打印集合
        for(Person tmp:res){
            System.out.println(tmp);
        }

    }
}
