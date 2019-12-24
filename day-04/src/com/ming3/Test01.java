package com.ming3;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        System.out.println("请输入文件名");
        Scanner scanner = new Scanner(System.in);
        // 判断文件是否以.java结尾
        String number = scanner.next();
        // 判断是否以.java结尾
        if(!number.endsWith(".java")){
            System.out.println("此文件不以Java结尾");
        }

        // 获取此文件中.的符号的位置
        System.out.println(number.indexOf('.'));
    }
}
