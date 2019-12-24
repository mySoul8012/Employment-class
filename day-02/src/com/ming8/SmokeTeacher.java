package com.ming8;

public class SmokeTeacher extends Teacher implements smoking {
    @Override
    public void smoke() {
        System.out.println("老师抽烟");
    }
}
