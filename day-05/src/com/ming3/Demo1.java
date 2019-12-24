package com.ming3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// 斗地主案例
public class Demo1 {
    public static void main(String[] args){
        // 斗地主牌
        ArrayList<String> arrayList = new ArrayList<>();
        // 增加牌
        arrayList.add("大王");
        arrayList.add("小王");
        // 花色数组
        String[] colers = {"♥","♠","♦","♣"};
        // 数字数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 进行添加
        for(int i = 0 ; i < colers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                arrayList.add(colers[i] + numbers[j]);
            }
        }
        // 打印牌
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // 进行洗牌
        Collections.shuffle(arrayList);

        // 再次打印出牌
        System.out.println(arrayList);

        // 进行发牌
        // 新建三个发牌的集合
        List<String> number1 = new ArrayList<>();
        List<String> number2 = new ArrayList<>();
        List<String> number3 = new ArrayList<>();
        // 底牌
        List<String> dipaiList = new ArrayList<>();
        // 进行发牌
        for(int i = 0; i < arrayList.size(); i++){
            // 底牌
            if(i >= arrayList.size() - 3){
                dipaiList.add(arrayList.get(i));
            }


            if(i % 3 == 0){
                number1.add(arrayList.get(i));
            }
            if(i % 3 == 1){
                number2.add(arrayList.get(i));
            }

            if(i % 3 == 2){
                number3.add(arrayList.get(i));
            }
        }
        // 输出牌
        System.out.println("ming1" + number1);
        System.out.println("ming2" + number2);
        System.out.println("ming3" + number3);
        System.out.println("底牌" + dipaiList);
    }
}
