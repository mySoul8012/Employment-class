package com.ming1;

public class RegexDemo03 {
    public static void main(String[] args){
        // 输入字符串
        String str = "2a8";
        // 验证str是否是3位数字
        System.out.println(str.matches("\\d\\d\\d"));
        // 验证手机号
        str = "12998877";
        // 验证
        System.out.println(str.matches("1[358]\\d{9}"));

        // 验证字符串是否以h开头，以d结尾
        str = "h d";
        // 进行验证
        System.out.println(str.matches("h.d"));

        // 进行验证str是否是had
        str = "had.";
        // 进行输出
        System.out.println(str.matches("had\\."));
    }
}
