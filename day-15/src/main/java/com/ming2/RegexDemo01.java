package com.ming2;

public class RegexDemo01 {
    public static void main(String[] args){
        // 序列号
        String str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        // 验证序列号
        System.out.println(str.matches("([A-Z0-9]{5}[4-Z0-9]{5})"));
        // 进行验证空格
        String str1 = "18 3 334 45 234";
        //进行分割
        String[] strings = str1.split(" ");
        // 进行验证
        for(String s:strings){
            // 进行输出
            System.out.println(s);
        }
        // 使用正则
        String[] strings1 = str.split(" +");
        // 进行循环
        String s2 = "3566.+.3577.+.45667..++..34667";
        // 进行输出
        String[] strings2 = s2.split("\\.+\\++\\.+");
        // 进行输出
        for(String string11:strings2){
            // 输出结果
            System.out.println(string11);
        }
    }
}
