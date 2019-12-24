package com.ming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args)throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = new Date();
        System.out.println(date.toString());
        String s = simpleDateFormat.format(date);
        String str = "2008-08-08";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat1.parse(str);
        System.out.println(date1);
    }
}
