package com.ming8;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        // 输入号码，定义正则表达式
        Scanner scanner = new Scanner(System.in);
        // 获取号码
        String res = scanner.nextLine();
        // 进行判断
        if(res.length() > 5 || res.length() < 12){
            System.out.println("此号码符合要求");
        }else{
            System.out.println("此号码长度不符合要求");
        }

        // 进行判断
        if(StringUtils.isNumeric(res)){
            System.out.println("全部都是数字");
        }else{
            System.out.println("全部都不是数字");
        }

        // 判断首位是否是0
        if("0".equals(res.charAt(0))){
            // 进行判断
            System.out.println("首位是0");
        }else{
            System.out.println("首位不是0");
        }
    }
}
