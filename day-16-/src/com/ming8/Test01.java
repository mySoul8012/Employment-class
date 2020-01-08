package com.ming8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        // 用户键盘录入生日 进行格式化
        Scanner scanner = new Scanner(System.in);
        // 获取日期
        String tmpDate = scanner.nextLine();
        // 进行日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 进行日期格式化
        Date date = simpleDateFormat.parse(tmpDate);
        // 进行日期生成
        System.out.println(date);
        // 计算日期
        // 生成 日历类
        Calendar now = Calendar.getInstance();
        // 获取输入的日期类
        Calendar shuru = Calendar.getInstance();
        // 进行复制
        shuru.setTime(date);
        // 进行计算
        // 获取毫秒值进行计算
        System.out.println(((now.getTimeInMillis() - shuru.getTimeInMillis()) / (24 * 60 * 60  * 1000) )  + "天");
    }
}
