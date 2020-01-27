package com.ming;

import java.util.*;

// 排序版
public class Ming1 {
    public static void main(String[] args) {
        Map<Integer, String> pukerMap = new HashMap<>();
        int index = 0;
        pukerMap.put(index++, "大王");
        pukerMap.put(index++, "小王");
        String[] colors = {"♥","♠","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String number : numbers) {
            for (String color : colors) {
                pukerMap.put(index++, number + color);
            }
        }
        // 进行打印
        System.out.println(pukerMap.toString());
        // 生成序号
        List<Integer> list = new ArrayList<>();
        // 进行序号添加
        for(int i = 0; i <= pukerMap.size(); i++){
            list.add(i);
        }
        // 进行洗牌洗编号
        Collections.shuffle(list);
        // 定义三个数组
        List<String> dipai = new ArrayList<>();
        List<String> wangjiaone = new ArrayList<>();
        List<String> wangjiatwo = new ArrayList<>();
        List<String> wangjiathree = new ArrayList<>();
        // 进行添加
        for (int i = 0; i < list.size(); i++) {
            // 进行判断
            if(i >= list.size() - 3){
                dipai.add(pukerMap.get(list.get(i)));
            }
            // 进行判断
            if(i % 3 == 0){
                wangjiaone.add(pukerMap.get(list.get(i)));
            }
            if(i % 3 == 1){
                wangjiatwo.add(pukerMap.get(list.get(i)));
            }
            if(i % 3 == 2){
                wangjiathree.add(pukerMap.get(list.get(i)));
            }
        }
        // 进行打印
        System.out.println(dipai.toString());
        System.out.println(wangjiaone.toString());
        System.out.println(wangjiathree.toString());


    }
}
