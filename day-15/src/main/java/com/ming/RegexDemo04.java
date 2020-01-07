package com.ming;

import java.util.Scanner;

public class RegexDemo04 {
    public static void main(String[] args){
        // 进行输入
        System.out.println("请输入您的号码");
        String qq = new Scanner(System.in).nextLine();
        // 进行判断
        if(qq.length() < 5 || qq.length() > 15){
            // 进行输出
            System.out.println("长度不满足...");
            return;
        }

        // 进行输出
        for(int i = 0; i < qq.length(); i++){
            // 进行判断
            char ch = qq.charAt(i);
            // 进行判断
            if(ch < '0' || ch > '9'){
                // 进行输出
                System.out.println("不全是数字");
                return;
            }
            // 进行判断
            if(qq.charAt(0) == '0'){
                // 进行判断
                System.out.println("首位不能为0");
                return;
            }
            // 进行输出
            System.out.println("您的qq是合法的");

            // 正则表达式，进行判断
            boolean boolean1 = qq.matches("[1-9][0-9]{4,14}");
            // 进行判断
            if(boolean1){
                // 进行判断
                System.out.println("您的qq是合法的");
            }else{
                System.out.println("您的是不合法的");
            }
        }

    }
}
