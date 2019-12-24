package com.ming5;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 获取打印文件的第一个字符
        System.out.println("请输入文件名");
        String stringName = scanner.nextLine();
        // 获取并打印文件的第一个字符
        System.out.println(stringName.charAt(0));
        // 打印文件的后缀名
        System.out.println(stringName.substring(stringName.lastIndexOf(".") + 1));
    }
}
