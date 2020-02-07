package com.ming;

import java.sql.DriverManager;

public class NewDriver extends Driver {
    @Override
    protected void run() {
        System.out.println("双手紧握方向盘");
    }
}
