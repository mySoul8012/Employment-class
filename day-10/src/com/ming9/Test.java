package com.ming9;

// 使用递归计算5的阶乘
public class Test {
    public static void main(String[] args){
        // 计算5的阶乘
        System.out.println(jieceng(5));
    }

    private static int jieceng(int i) {
        // 进行出口
        if(i == 1){
            return 1;
        }
        // 计算阶乘
        return jieceng(i - 1) * i;
    }
}
