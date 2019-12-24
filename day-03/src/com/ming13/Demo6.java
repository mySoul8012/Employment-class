package com.ming13;

import java.util.Calendar;

/*
*
* 请编程，计算并打印“1949年10月1日”那天是星期几？
*
* */
public class Demo6 {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        // 设置日历时间
        calendar.set(Calendar.YEAR, 1949);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 1);
        // 获取星期
        System.out.println(calendar.get(Calendar.WEDNESDAY) + 1);
    }
}
