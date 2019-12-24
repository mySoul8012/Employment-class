package com.ming5;

import java.util.Calendar;

public class Test {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 3 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        int week1 = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("2020-03-03是:" + (week1 - 1));
    }
}
