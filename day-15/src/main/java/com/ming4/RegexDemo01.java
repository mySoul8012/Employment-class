package com.ming4;

public class RegexDemo01 {
    public static void main(String[] args){
        // 创建字符串
        String content = "mingxiaoxiao";
        // 进行过滤
        String s1 = content.replaceAll("m", "*");
        // 进行输出
        System.out.println(s1);

        // 进行数字替换
        String s2 = "sfevfe21323";
        // 进行数据输出
        String s3 = s2.replaceAll("\\d", "*");
        // 进行输出
        System.out.println(s3);
    }
}
