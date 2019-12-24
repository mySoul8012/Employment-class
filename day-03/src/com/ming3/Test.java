package com.ming3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("请输入生日日期(yyy-MM-dd)");
        String dataStr = scanner.next();

        Date date = new Date();
        long nowTime = date.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = simpleDateFormat.parse(dataStr);
        long birthdayDateTime = birthdayDate.getTime();

        if(nowTime - birthdayDateTime < 0){
            System.out.println("你还木有出生");
        }else {
            System.out.println("");
        }
    }
}
