package com.ming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args){
        int[] arr = {1,432,4,325,24,365,25,89,6,3,476,875,846};
        // 冒泡排序 外面趟
        for(int i = 0; i < arr.length - 1; i++){
            // 内层循环
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // 进行交换
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // 选择排序
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                // 判断比较
                if(arr[i] < arr[j]){
                    // 进行交换
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // 打印数组
        System.out.println(Arrays.toString(arr));
    }
}
