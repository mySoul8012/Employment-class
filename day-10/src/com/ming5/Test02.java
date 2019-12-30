package com.ming5;

public class Test02 {
    public static void main(String[] args){
        // 计算斐波那契数列的值
        System.out.println(feiboNaqie(3));
    }

    private static int feiboNaqie(int i) {
        // 输出1 2 两项的值
        if(i == 1){
            // 输出第一项的值
            return 1;
        }

        // 输出第2项的值
        if(i == 2){
            return 1;
        }
        // 计算斐波那契数列的值
        return feiboNaqie(i - 1) + feiboNaqie(i - 2);
    }
}
