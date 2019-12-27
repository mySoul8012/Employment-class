package com.ming15;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args){
        int[] nums = {1,4,6,7,8,3,5,2,9};

        mappao(nums);
    }

    // 冒泡排序
    private static void mappao(int[] nums) {
        // 冒泡排序
        // 外层趟数
        for(int i = 0; i < nums.length - 1; i++){
            // 内层次数
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] < nums[j + 1]){
                    // 进行交换
                    int tmp = 0;
                    tmp = nums[j];
                     nums[j] = nums[j + 1];
                     nums[j + 1] = tmp;
                }
            }
        }
        // 输出
        System.out.println(Arrays.toString(nums));
    }


}
