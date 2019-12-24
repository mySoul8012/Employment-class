package com.ming11;


import java.util.Calendar;

/*
*
* 需求：用程序判断2018年2月14日是星期几。
*
* */
public class Demo3 {
    public static void main(String[] args){
        // 创建Calendar 对象
        Calendar calendar = Calendar.getInstance();
        // 设置相应的日期
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DATE, 14);
        // 获取年
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        // 获取星期
        String resWeek = getWeek(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(resWeek);
    }

    public static String getWeek(int a){
        String[] week = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期七"};
        return week[a - 1];
    }
}
