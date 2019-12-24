package com.ming23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 斗地主洗牌，发牌程序
public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("大王");
        list.add("小王");
        // 花色数组
        String[] colers = {"♥","♠","♦","♣"};
        // 数字数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 进行添加
        for(int i = 0; i < colers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                list.add(colers[i] + numbers[j]);
            }
        }
        // 输出
        System.out.println(list);
        // 进行洗牌
        Collections.shuffle(list);
        // 再次打印
        System.out.println(list);
        // 进行发牌
        List<String> number1 = new ArrayList<>();
        List<String> number2 = new ArrayList<>();
        List<String> number3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        // 进行发牌
        for(int i = 0; i < list.size(); i++){
            // 发底牌
            if(i >= list.size() - 3){
                dipai.add(list.get(i));
            }


            if( i % 3 == 0){
                number1.add(list.get(i));
            }

            if(i % 3 == 1){
                number2.add(list.get(i));
            }

            if(i % 3 == 2){
                number3.add(list.get(i));
            }
        }
        // 输出
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(dipai);
    }
}
