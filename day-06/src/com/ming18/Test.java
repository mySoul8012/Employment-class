package com.ming18;

import java.util.*;

// 编写斗地主 洗牌程序  排序版
public class Test {
    public static void main(String[] args){
        Map<Integer, String> pukerMap = new HashMap<>();
        int index = 0;
        pukerMap.put(index++, "大王");
        pukerMap.put(index++, "小王");
        String[] colors = {"♥","♠","♦","♣"};//花色数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for(String s:numbers){
            for(String c:colors){
                pukerMap.put(index++, s + c);
            }
        }
        System.out.println(pukerMap);
        // 生成编号 List
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < pukerMap.size(); i++){
            list.add(i);
        }
        // 打印编号
        System.out.println(list);
        // 洗编号
        Collections.shuffle(list);
        System.out.println(list);
        // 发牌
        List<String> number1 = new ArrayList<>();
        List<String> number2 = new ArrayList<>();
        List<String> number3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        // 发牌
        for(int i = 0; i < pukerMap.size(); i++){
            if(i >= pukerMap.size() - 3){
                dipai.add(pukerMap.get(list.get(i)));
            }
            // 发牌
            if(i % 3 == 0){
                number1.add(pukerMap.get(list.get(i)));
            }

            if(i % 3 == 1){
                number2.add(pukerMap.get(list.get(i)));
            }

            if(i % 3 == 2){
                number3.add(pukerMap.get(list.get(i)));
            }
        }
        // 打印
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(dipai);
    }
}
