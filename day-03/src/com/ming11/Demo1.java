package com.ming11;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
* 需求：请用代码实现:获取当前的日期,
* 并把这个日期转换为指定格式的字符串,
* 如2088-08-08 08:08:08。
*
*
* */
class Demo1 {
    public static void main(String[] args){
        // 获取当前日期
        Date now = new Date();
        // 日期转换
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        // 进行日期格式转换
        String res = simpleDateFormat.format(now);
        // 输出转换后的日期
        System.out.println(res);
    }
}
