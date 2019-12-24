package com.ming2;

import java.util.Random;

public class Student {
    int age;
    static String room = "314教室";
    static int[] arr = new int[10]; // 静态变量

    static {
        System.out.println("静态代码块");
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
        }
    }

    // 为arr每一个元素初始化一个 1 -100 的随机数
    // 生成一个 1 -100的随机数 Random
    // 遍历 arr 数组，随机数赋值给 arr 数组中的每一个元素

}
