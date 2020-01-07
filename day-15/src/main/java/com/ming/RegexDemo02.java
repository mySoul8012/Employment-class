package com.ming;

import java.util.Scanner;

public class RegexDemo02 {
    public static void main(String[] args){
        System.out.println("请输入您的qq号码");
        // 获取qq号码
        String qq = new Scanner(System.in).nextLine();
        // 进行判断
        if(qq.length() < 5 || qq.length() > 15){
            // 如果长度不满足
            System.out.println("长度不满足");
            return;
        }

        // 进行判断
        // 进行判断
        for(int i = 0; i < qq.length(); i++){
            char ch = qq.charAt(i);
            // 进行判断
            if(ch < '0' || ch > '9'){
                // 进行打印
                System.out.println("不全是数字");
                return;
            }
        }

        // 进行判断
        if(qq.charAt(0) == '0'){
            // 进行输出
            System.out.println("首位不能为0");
            // 进行返回
            return;
        }
        // 进行输出
        System.out.println("您的qq是合法的");

        // 正则表达式
        boolean boolean1 = qq.matches("[1-9][0-9]{4,14}");
        // 进行判断
        if(boolean1){
            // 进行输出
            System.out.println("您的qq是合法的");
        }else{
            // 进行输出
            System.out.println("您的qq是不合法的");
        }

    }
}
