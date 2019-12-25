package com.ming8;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args){
        int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
        // 使用冒泡进行排序 外面趟数
         for(int i = 0; i < arr.length - 1; i++){
            // 内层循环进行依次遍历
             for(int j = 0; j < arr.length - 1 -i ; j++){
                 // 进行交换
                 if(arr[j] > arr[j + 1]){
                     // 进行交换
                     int tmp = 0;
                     tmp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = tmp;
                 }
             }
        }
         System.out.println(Arrays.toString(arr));

         // 二分查找 查找元素

    }
}
