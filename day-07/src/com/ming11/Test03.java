package com.ming11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 extends Thread {
    @Override
    public void run() {
        while(true) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String dateString = simpleDateFormat.format(date);
            System.out.println(dateString);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
