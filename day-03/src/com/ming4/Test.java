package com.ming4;

import java.util.Calendar;

public class Test {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);   // 0-11 表示 12 个月

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.HOUR_OF_DAY);
        int second = calendar.get(Calendar.SECOND);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");
        System.out.println(getWeek(week));

    }

    private static String getWeek(int week) {
        String[] str = {"星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return str[week - 1];
    }
}
