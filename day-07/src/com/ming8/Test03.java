package com.ming8;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        Scanner scanner = new Scanner(System.in);
        // 输入一个整数值
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        // 取出相应的星期名称
        try {
            String xingqi = arr[number];
            System.out.println(xingqi);
        }catch (Exception e){
            System.out.println("输入错误!");
        }
    }
}
