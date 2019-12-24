package com.ming15;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args){
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        // 打印数组所有元素
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // 数组进行升序排列
        Arrays.sort(arr);
        // 打印
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
