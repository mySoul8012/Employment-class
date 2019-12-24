package com.ming13;

import java.util.Calendar;

public class Demo1 {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        // 获取年月日
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        // 输出
        System.out.println(year +  "    " + month +  "   "  + date);
    }
}
