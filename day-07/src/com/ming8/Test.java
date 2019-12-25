package com.ming8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        // 打印此数组所有元素
        System.out.println(Arrays.toString(arr));

        // 冒泡进行升序排序 外面是趟数
        for(int i = 0; i < arr.length; i++){
            // 进行交换
            ning(arr, i);
        }

        // 打印数组
        System.out.println(Arrays.toString(arr));


        // 选择排序
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i]  > arr[j]){
                    // 进行交换
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ning(int[] arr, int i) {
        for(int j = 0; j < arr.length - i - 1; j++){
            if(arr[j]  > arr[j + 1]){
                // 进行交换
                int tmp = 0;
                tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}
