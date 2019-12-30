package com.ming;

public class RecursionDemo02 {
    public static void main(String[] args){
        System.out.println(getSum(100));
        System.out.println(getSum1(100));
    }

    private static int getSum1(int i) {
        int sum = 0;
        for(int j = 1; j <= i; j++){
            sum += j;
        }
        return sum;
    }

    private static int getSum(int i) {
        // 出口
        if(i == 1){
            return 1;
        }
        return getSum(i - 1) + i;
    }



}
