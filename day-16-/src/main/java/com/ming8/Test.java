package com.ming8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        // 请用户键盘录入生日，进行判断
        Scanner scanner = new Scanner(System.in);
        // 获取字符串
        String tmp = scanner.nextLine();
        // 输出结果
        // 进行格式化输出日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 进行格式化日期
        Date date = simpleDateFormat.parse(tmp);
        // 输出日期
        System.out.println(date);
    }
}
