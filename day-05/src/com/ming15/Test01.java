package com.ming15;

public class Test01 {
    public static void main(String[] args){
        Integer[] number = new Integer[10];
        // 进行数据添加
        for(int i = 0; i < 10; i++){
            number[i] = i;
        }
        // 进行位置交换
        method(number, 0, 1);
        // 打印数组
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }

    }

    // 实现指定位置的元素交换
    public static <E> void method(E[] e, int a, int b){
        // 定义临时
        E tmp = null;
        // 进行数据交换
        tmp = e[a];
        e[a] = e[b];
        e[b] = tmp;
    }
}
