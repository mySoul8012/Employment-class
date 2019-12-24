package com.ming3;

public class Const {
    public static final double pi = 3.14;

    public static int getSum(int[] arr){
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum = Math.max(sum, arr[i]);
        }
        return sum;
    }
}
