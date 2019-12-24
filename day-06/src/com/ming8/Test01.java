package com.ming8;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        Map<Integer,String> pukerMap = new HashMap<>(); // 保存牌的map集合
        int index = 0;
        pukerMap.put(index++, "大王");
        pukerMap.put(index++, "小王");
        String[] colors = {"♥","♠","♦","♣"};//花色数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};//数字数组
        for(String n:numbers){
            for(String c:colors){
                pukerMap.put(index++, c + n);
            }
        }
        System.out.println(pukerMap);

        // 生成编号的ArrayList
        ArrayList<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < pukerMap.size(); i++){
            indexList.add(i);
        }
        Collections.shuffle(indexList);
        // 进行发牌
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        // 遍历序号
        for(int i = 0; i < indexList.size(); i++){
            if(i >= indexList.size() - 3){
                dipai.add(pukerMap.get(indexList.get(i)));
            }
            // 发牌
            if(i % 3 == 0){
                player1.add(pukerMap.get(indexList.get(i)));
            }

            if(i % 3 == 1){
                player2.add(pukerMap.get(indexList.get(i)));
            }

            if(i % 3 == 2){
                player3.add(pukerMap.get(indexList.get(i)));
            }
        }
        // 打印元素
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
