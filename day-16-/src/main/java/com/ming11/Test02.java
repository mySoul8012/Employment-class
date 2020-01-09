package com.ming11;

import java.lang.reflect.Array;
import java.util.*;

// 进行二分查找
public class Test02 {
    public static void main(String[] args) {
        // 进行二分查找
        // 定义数组
        List<Integer> list = new ArrayList<>();
        // 进行添加操作
        for(int i = 0; i < 1024; i++){
            // 进行赋值操作
            list.add(i);
        }
        // 进行打印
        System.out.println(Arrays.toString(list.toArray()));
        // 进行查找
        // 生成数组
        int[] numbers = new int[1024];
        // 进行添加
        for (int i = 0; i < list.size(); i++) {
            // 进行赋值
            numbers[i] = list.get(i);
        }
        // 进行打印
        System.out.println(Arrays.toString(numbers));
        // 进行二分查找
        int left = 0;
        int right = numbers.length - 1;
        //生成数字
        int ramdon = new Random().nextInt(1024) + 1;
        // 打印随机生成的数字
        System.out.println(ramdon);
        // 进行查找
        while(left <= right){
            // 输出中间值
            int center = (left + right) / 2;
            // 进行输出
            if(ramdon > numbers[center]){
                // 如果大于center
                // 进行返回
                // 左指针移动
                left = center + 1;
            }else if(ramdon < numbers[center]){
                // 如果小于center
                // 进行返回
                // 右指针移动
                right = center - 1;
            }else{
                // 如果相同，直接返回
                System.out.println("已经找到" + center);
                break;
            }
        }
    }
}
