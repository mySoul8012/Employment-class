package com.ming1;

public class RegexDemo04 {
    public static void main(String[] args){
        // 验证字符串
        String str = "";
        // 进行验证
        str = "012";
        // 进行判断
        System.out.println(str.matches("\\d{3}"));
        // 验证str是否多位数
        str = "82345678987432345689943234578";
        // 进行验证
        System.out.println(str.matches("\\d{2,}"));
        // 进行验证str是否是手机号
        str = "232424234";
        // 进行输出验证
        System.out.println(str.matches("[0-9]+\\.[0-9]+"));

        // 验证小数
        str = "3.0";
        // 进行输出
        System.out.println(str.matches("[0-9]+\\.?[0-9]"));
        // 进行匹配
        str = "3.14";
        // 进行判断
        System.out.println(str.matches("[+-]?3\\.?1?4?"));
        // 验证号码
        str = "89796";
        // 进行验证
        System.out.println(str.matches("[1-9]\\d{4,14}"));
    }
}
