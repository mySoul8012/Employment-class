package com.ming15;

public class test02 {
    public static void main(String[] args){
        // 二分查找
        int[] arr = {1, 4, 6, 7, 8, 3, 5, 2, 9};
        // 进行二分查找
        System.out.println(erfencazao(arr, 5));
    }

    private static int erfencazao(int[] arr, int i) {
        // 进行二分查找
        // 定义左指针
        int left = 0;
        int right = arr.length - 1;
        // 进行查找
        while(left <= right){
            int center = (left + right) / 2;
            // 进行查找
            if(arr[center] < i){
                // 左指针移动
                left = center + 1;
            }
            if(arr[center] > i){
                right = center - 1;
            }

            if(arr[center] == i){
                return center;
            }
        }
        return -1;
    }
}
