package com.ming5;

// 使用递归计算 1 -100 的和
public class Test {
    public static void main(String[] args){
        // 使用递归计算 1 -100 的和
        System.out.println(sum(100));
    }

    private static int sum(int j) {
        // 递归出口
        if(j == 1){
            return 1;
        }
        // 计算 1- 100的和
        return sum(j - 1) + j;
    }
}
