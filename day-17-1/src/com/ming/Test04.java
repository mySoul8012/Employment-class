package com.ming;

public class Test04 {
    public static void main(String[] args) {
        String data = "我要.......我";
        // 进行替换
        String regex = "(.)\\1+";
        // 进行替换
        String newStr = data.replaceAll(regex, "");
        System.out.println(newStr);
    }
}
