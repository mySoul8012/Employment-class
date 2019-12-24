package com.ming11;

import java.util.Calendar;

public class Demo5 {
    public static void main(String[] args)throws Exception{
        Calendar c1 = Calendar.getInstance();
        // 通过日历对象获取今年的第几天
        int day = c1.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);
    }
}
