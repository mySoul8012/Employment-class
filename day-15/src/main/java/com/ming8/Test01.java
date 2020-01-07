package com.ming8;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        // 获取手机号码
        Scanner scanner = new Scanner(System.in);
        // 获取结果
        String res = scanner.nextLine();
        // 输出第一个正则
        String zhenze1 = "^[0-9]*";
        // 输出匹配结果
        System.out.println(res.matches(zhenze1));
        // 定义第二位是 3,5,6,7,8中的一位
        String zhenze02 = "^1[3578][0-9]+";
        // 输出匹配结果
        System.out.println(res.matches(zhenze02));
    }
}
