package com.ming9;

import java.util.*;
import java.util.function.BiConsumer;

public class Test01 {
    public static void main(String[] args) {
        // 保存牌的map集合
        Map<Integer, String> pukMap = new HashMap<>();
        // 定义index
        int index = 0;
        // 进行添加
        pukMap.put(index++, "大王");
        pukMap.put(index++, "小王");
        // 创建花色数组
        String[] colors = {"♥","♠","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 进行数据添加
        for(String n:numbers){
            for (String color : colors) {
                // 进行添加
                pukMap.put(index++, color + n);
            }
        }
        // 打印牌
        pukMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + " " + s);
            }
        });

        // 进行洗牌
        // 生成牌面序号
        List<Integer> paihao = new ArrayList<>();
        // 进行添加
        for(int i = 0; i < pukMap.size(); i++){
            // 进行添加
            paihao.add(i);
        }

        // 进行乱序
        Collections.shuffle(paihao);
        // 打印排好
        // 生成3个牌面
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        // 进行添加
        paihao.forEach((s) ->{
            // 进行输出
            // 进行判断，是否为0
            if(s >= paihao.size() - 3){
                // 进行添加
                list4.add(pukMap.get(s));
            }

            // 进行输出1
            if(s % 3 == 0){
                // 进行添加
                list1.add(pukMap.get(s));
            }

            if(s % 3 == 1){
                list2.add(pukMap.get(s));
            }

            if(s % 3 == 2){
                list3.add(pukMap.get(s));
            }
        });

        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(Arrays.toString(list3.toArray()));
        System.out.println(Arrays.toString(list4.toArray()));
    }
}
