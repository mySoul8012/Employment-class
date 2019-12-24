package com.ming13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
*
* 请编程，计算并打印当前系统时间的“100天后”及“100天前”的日期及星期几？
*
* */
public class Demo7 {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String beforeDate = simpleDateFormat.format(getDateBefore(date, 100));
        System.out.println(beforeDate);
        String afterDate = simpleDateFormat.format(getDateAfter(date, 100));
        System.out.println(afterDate);

    }

    // 得到几天后的时间
    public static Date getDateAfter(Date date, int i) {
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + i);
        return now.getTime();
    }

    // 得到几天前的时间
    public static Date getDateBefore(Date d, int day){
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }
}
