package com.ming7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日， hh点mm分ss秒");
        // 线程睡眠
        while(true){
            // 线程睡眠
            Thread.sleep(1000);
            // 打印时间
            System.out.println(simpleDateFormat.format(new Date()));
        }

    }
}
