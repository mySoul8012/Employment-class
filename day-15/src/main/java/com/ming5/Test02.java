package com.ming5;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 进行输入身份证号
        System.out.println("请输入身份证号");
        // 获取数据值
        String data = scanner.nextLine();
        // 进行匹配
        boolean flag = validationIDCard(data);
        // 进行匹配
        if(flag){
            // 输出结果
            System.out.println("您输入的身份证号码合法");
        }else{
            // 输出结果
            System.out.println("您输入的身份证号不合法");
        }
    }

    private static boolean validationIDCard(String data) {
        String regex = "(\\d{15}|\\d{18}|\\d{17}(\\d|x|x))";
        // 返回结果
        return data.matches(regex);
    }
}
