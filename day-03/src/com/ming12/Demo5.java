package com.ming12;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
*
* */
public class Demo5 {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}
