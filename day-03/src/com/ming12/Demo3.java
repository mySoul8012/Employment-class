package com.ming12;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*
* 请编写程序，从控制台接收一个“生日”，
* 格式：yyyy-MM-dd，
* 程序要能够计算并打印他来到世界xx天。
*
* */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        // 接收到日期
        String res = scanner.nextLine();
        // 进行日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 生成Date类
        Date date = simpleDateFormat.parse(res);
        // 获取当前日期
        Date now = new Date();

        // 进行比较是否早于当前日期
        if(date.getTime() >= now.getTime()){
            System.out.println("早于当前日期 请重新输入");
        }
        // 计算多少天
        // 计算差值
        long differenceValue = Math.abs(now.getTime() - date.getTime());
        System.out.println(differenceValue);
        // 转换成为日期
        int dateMing = (int) ((differenceValue)/(60*60*24*1000));
        // 输出日期
        System.out.println(dateMing);
    }
}
