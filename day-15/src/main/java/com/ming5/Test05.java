package com.ming5;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args){
        // 获取字符串
        Scanner scanner = new Scanner(System.in);
        // 输入字符串
        String data = scanner.nextLine();
        // 进行匹配结果
        String res = replaceRepeat(data);
    }

    private static String replaceRepeat(String data) {
        // 获取结果
        // 进行规则匹配
        String regex = "\\.+";
        // 使用规则，进行匹配
        String newStr = data.replaceAll(regex, "");
        // 把多个重复的子，保留一个
        String regex2 = "(.)\\1+";
        // 使用规则，去掉重复的子，保留一个
        String res = newStr.replaceAll(regex2, "$1");
        // 返回结果
        return res;
    }
}
