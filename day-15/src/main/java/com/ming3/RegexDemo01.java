package com.ming3;

public class RegexDemo01 {
    public static void main(String[] args){
        // 创建字符串
        String content = "mingming";
        // 敏感词过滤
        String s1 = content.replace("m", "*");
        // 进行打印
        System.out.println(s1);
    }
}
