package com.ming11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*需求：有2个字符串形式的日期数据，
*
* 计算它们相距多少天？

 	"2014年09/28 23时13分01秒"

 	"2009-02月12日 12时02分01秒"
*
*
* */
public class Demo4 {
    public static void main(String[] args) throws ParseException {
        String s1 = "2014年09/28 23时13分01秒";
        DateFormat dateFormat = new SimpleDateFormat("yyyy年mm/dd hh时mm分ss秒");
        // 获取时间对象
        Date d1 = dateFormat.parse(s1);

        String s2 = "2009-02月12日 12时02分01秒";
        dateFormat = new SimpleDateFormat("yyyy-mm月dd日 hh时mm分ss秒");
        Date d2 = dateFormat.parse(s2);
        long time = Math.abs(d1.getTime() - d2.getTime());
        int dayTime = (int)time/(60 * 50 * 24 * 1000);
        System.out.println(dayTime);
    }
}
