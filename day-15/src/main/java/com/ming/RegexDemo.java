package com.ming;

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args){
        // 进行输出
        System.out.println("请输入您的qq号码");
        // 进行获取
        String qq = new Scanner(System.in).nextLine();
        // 进行判断
        if(qq.length() < 5 || qq.length() > 15){
            // 进行输出
            System.out.println("长度不满足");
            return;
        }
        // 进行遍历
        for(int i = 0; i < qq.length(); i++){
            // 进行输出
            char ch = qq.charAt(i);
            // 进行输出
            if(ch < '0' || ch > 9){
                // 进行输出
                System.out.println("不全是数字");
                return;
            }

            // 进行判断
            if(qq.charAt(0) == '0'){
                // 进行输出
                System.out.println("首位不能为0");
                // 进行返回
                return;
            }
            // 进行打印
            System.out.println("您的qq是合法的");


        }
    }
}
