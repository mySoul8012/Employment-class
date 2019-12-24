package com.ming15;

import java.util.*;

/*
* 请定义一个可以保存整数的集合，并保存一些数据
* 对集合中的数据打乱顺序；
打印集合
对集合中的数据进行升序排序
打印集合
对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
打印集合
*
* */
public class Test {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            integerList.add(random.nextInt(100) + 1);
        }
        System.out.println(integerList);
        // 打乱顺序
        Collections.shuffle(integerList);
        System.out.println(integerList);

        // 集合中数据升序排序
        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;    // 进行升序排序
            }
        });
        System.out.println(integerList);

        // 集合中数据倒序排序
        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.println(integerList);

    }
}
