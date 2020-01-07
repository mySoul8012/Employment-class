package com.ming5;

public class Test01 {
    public static void main(String[] args){
        // 定义变量保存字符串
        String str = "斯蒂芬斯的粉丝";
        // 定义变量保存正则表达式字符串
        String regex = "[\\\\u4e00-\\\\u9fa5]";
        // 进行匹配
        boolean flag = str.matches(regex);
        // 进行输出结果
        System.out.println(flag);
    }
}
