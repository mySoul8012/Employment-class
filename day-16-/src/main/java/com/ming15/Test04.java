package com.ming15;

import java.util.*;
import java.util.function.BiConsumer;

public class Test04 {
    public static void main(String[] args) {
        // 创建对象
        Map<Integer, String> map = new HashMap<>();
        // 进行数据添加
        int index = 0;
        // 进行添加
        map.put(index++, "大王");
        map.put(index++, "小王");
        // 创建花色数组
        String[] colors = {"♥","♠","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 进行遍历
        for (String color : colors) {
            for (String number : numbers) {
                // 进行遍历操作
                map.put(index++, color + number);
            }
        }
        // 打印数组
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + s);
            }
        });
        // 创建集合
        List<Integer> list = new ArrayList<>();
        // 添加数据
        for(int i = 0; i < map.size(); i++){
            // 进行添加
            list.add(i);
        }
        // 进行乱序
        Collections.shuffle(list);
        // 进行生成集合
        System.out.println(list.toArray());


    }
}
