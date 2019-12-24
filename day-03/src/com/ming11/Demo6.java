package com.ming11;

import java.util.Calendar;

public class Demo6 {
    public static void main(String[] args){
        // 获取当前日历对象
        Calendar calendar = Calendar.getInstance();
        // 日历后移500天
        calendar.add(Calendar.DATE, 500);
        // 获取年月日
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // 输出几年几月几日
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
