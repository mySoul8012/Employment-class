package com.ming;

import java.util.Date;

public class Test1 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        date.setTime(1000L);
        System.out.println(date);
    }
}
