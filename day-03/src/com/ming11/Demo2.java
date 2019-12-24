package com.ming11;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
* 使用SimpleDateFormat类,
* 把2018-03-04转换为2018年03月04日。
 *
* */
public class Demo2 {

    Demo2(){

    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //获取当前字符串格式
        String now1 = "2018-03-04";
        // 进行格式化
        Date date1 = simpleDateFormat.parse(now1);
        // 输出当前格式化后的Date
        System.out.println(date1.toString());
        // 新建SimpleDateFormat 进行格式化转换
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        // 进行格式转化
        String res = simpleDateFormat1.format(date1);
        // 输出格式化后的结果
        System.out.println(res);
    }
}
