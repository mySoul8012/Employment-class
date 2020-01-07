package com.ming3;

public class RegexDemo02 {
    public static void main(String[] args){
        // 输入字符串
        String str = "234234234ergregreg";
        // 进行替换
        String s2 = str.replaceAll("\\d", "*");
        // 进行打印
        System.out.println(s2);
    }
}
