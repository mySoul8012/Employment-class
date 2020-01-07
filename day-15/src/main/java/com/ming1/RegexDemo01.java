package com.ming1;

public class RegexDemo01 {
    public static void main(String[] args){
        // 进行验证
        String str = "ead";
        // 进行验证
        System.out.println(str.matches("h[aeiou]d"));
        // 进行验证
        System.out.println(str.matches("h[^aeiou]d"));
        // 进行验证
        System.out.println(str.matches("[a-z]ad"));
        // 验证str是否以a-d或者m-p之间某个字符开头
        System.out.println(str.matches("[a-dm-p]ad"));
    }
}
