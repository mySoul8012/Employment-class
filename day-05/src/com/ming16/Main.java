package com.ming16;

public class Main {
    public static void main(String[] args){
        System.out.println("反转数组中的所有元素");
        // 定义数组
        Integer[] number = new Integer[11];
        // 数据添加
        for(int i = 0; i < number.length; i++){
            number[i] = i;
        }
        // 进行数据反转
        method(number);

        // 输出
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }

    public static <E> void method(E[] e){
        // 定义俩指针
        int left = 0;
        int right = e.length - 1;
        // 进行交换

        while(left <= right){
            // 进行交换
            method(e, left, right);
            // 指针相减
            left++;
            right--;
        }


    }

    // 定义交换方法
    public static <E> void method(E[] e, int a, int b){
        E tmp = null;
        // 进行交换
        tmp = e[a];
        e[a] = e[b];
        e[b] = tmp;
    }
}
