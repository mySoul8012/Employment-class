package com.ming2;

public class Test02 {
    public static void main(String[] args){

    }

    public static int getMax(int[] arr){
        if(arr == null){
            throw new NullPointerException("参数为NULL");
        }

        if(arr.length == 0){
            throw  new NullPointerException("数组长度为0");
        }

        int max = arr[0];
        if(arr.length == 1){
            return max;
        }

        for(int i = 1; i < arr.length; i++){
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }
}
