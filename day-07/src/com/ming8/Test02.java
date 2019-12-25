package com.ming8;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 接收两个整数
        System.out.println("请输入两个整数");
        int number01 = scanner.nextInt();
        int number02 = scanner.nextInt();
        // 第一个数 / 第二个数
        try {
            int res = number01 / number02;
        }catch (java.lang.ArithmeticException e){
            System.out.println("输入的数不能为0");
        }
    }
}
