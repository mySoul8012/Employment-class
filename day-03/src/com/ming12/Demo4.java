package com.ming12;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*
* 请编写程序，从控制台分别接收两个“生日”，
*
* 格式：yyyy年MM月dd日，程序要能够计算并打印：
* 第一个生日大于/小于第二个生日。
*
*
* */
public class Demo4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        // 获取当前生日
        String dateString = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1  = simpleDateFormat.parse(dateString);
        // 获取第二个生日
        String dateString2 = scanner.nextLine();
        Date date2 = simpleDateFormat.parse(dateString2);
        // 进行日期比较
        if(date1.getTime() > date2.getTime()){
            System.out.println("第一个生日大于第二个生日");
        }else{
            System.out.println("第一个生日小于第二个生日");
        }
    }
}
