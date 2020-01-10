package com.ming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        // 获取当前日期对象
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-hh");
        // 获取日期
        String res = new Scanner(System.in).nextLine();
        // 进行格式化
        Date end = simpleDateFormat.parse(res);
        // 输出结果
        System.out.println(end);
    }
}
