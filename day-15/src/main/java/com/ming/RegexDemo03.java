package com.ming;

public class RegexDemo03 {
    public static void main(String[] args){
        // 进行输出
        String str = "ead";
        // 进行验证
        System.out.println(str.matches("h[aeiou]d"));
        // 进行验证
        System.out.println(str.matches("h[^aeiou]d"));
        // 进行验证
        System.out.println(str.matches("[a-z]ad"));
        // 进行验证
        System.out.println(str.matches("[a-dm-p]ad"));

    }
}
