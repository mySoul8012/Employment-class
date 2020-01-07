package com.ming5;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        // 创建输入流
        Scanner scanner = new Scanner(System.in);
        // 获取邮箱账号
        System.out.println("请输入邮箱账号");
        // 获取数据
        String data = scanner.nextLine();
        // 获取flag
        boolean flag = validationEmail(data);
        // 进行判断
        if(!flag){
            // 输出结果
            System.out.println("您输入的邮箱账号不合法");
        }else{
            System.out.println("您输入的邮箱账号不合法，请重新验证");
        }
    }

    private static boolean validationEmail(String data) {
        String regex = "\\w+@\\w+(.\\w+)+";
        // 返回匹配结果
        return data.matches(regex);
    }
}
