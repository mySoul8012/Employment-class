package com.ming6;

import java.util.Calendar;

public class Test {
    public static void main(String[] args){
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.DAY_OF_MONTH, 2);
        int week2 = calendar2.get(Calendar.DAY_OF_WEEK);
        System.out.println("2天之后是" + week2);
    }
}
