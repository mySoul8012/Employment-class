package com.包装类;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextInt() + "";
        //String 转换为 int
        int number01 = Integer.parseInt(number);
        // 分数 + 5
        System.out.println(number01 + 5);
    }
}
