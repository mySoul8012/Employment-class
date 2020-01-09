package com.ming15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        // 创建日历类
        Calendar calendar = Calendar.getInstance();
        // 创建日期
        Calendar calendar1 = Calendar.getInstance();
        // 读取字符串
        Scanner scanner = new Scanner(System.in);
        // 进行读取字符串
        String tmp = scanner.nextLine();
        // 进行日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        // 进行日期格式化
        Date date = simpleDateFormat.parse(tmp);

        calendar1.setTime(date);
        // 生成日期
        System.out.println(date);
        // 进行计算天数
        System.out.println((calendar.getTimeInMillis() - calendar1.getTimeInMillis()) / 24 * 60 * 60 * 1000);

    }
}
