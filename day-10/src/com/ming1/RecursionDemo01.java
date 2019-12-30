package com.ming1;

// 递归求积
public class RecursionDemo01 {
    public static void main(String[] args){
        System.out.println(getJi(6));
        System.out.println(getJi1(6));
    }

    private static int getJi1(int i) {
        // 使用循环进行求积
        int sum = 0;
        for(int j = 1; j <= i; j++){
            sum += i;
        }
        return sum;
    }

    private static int getJi(int i) {
        // 使用递归进行求积
        if(i == 1){
            return 1;
        }
        return getJi(i - 1) * i;
    }


}
