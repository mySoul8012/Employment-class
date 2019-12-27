package com.ming;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args){
        int[] nums = {1, 4, 6, 7, 8, 3, 5, 2, 9};
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i -1; j++){
                if(nums[j] >= nums[j + 1]){
                    // 进行交换
                    int tmp = nums[j];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
