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

         // 使用 二分查找获取元素
        int index = erfen(arr, 431);
        // 输出结果
        System.out.println(index);
    }

    private static int erfen(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        // 进行循环遍历
        while(left < right){
            // 获取中间值
            int center = (left + right) / 2;
            // 如果在左边
            if(arr[center] > target){
                // 移动右边指针
                right = center - 1;
            }
            // 如果在右边
            if(arr[center] < target){
                left = center;
            }
            // 如果相等
            if(arr[center] == target){
                return center;
            }
        }
        return -1;
    }
}
