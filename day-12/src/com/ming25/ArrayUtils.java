package com.ming25;

public class ArrayUtils {
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            // 进行输出
            max = arr[i] > max ? arr[i]:max;
        }
        return max;
    }
}
