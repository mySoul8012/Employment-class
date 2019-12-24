package com.ming8;

public class SmokeStudent extends Student implements smoking {
    @Override
    public void smoke() {
        System.out.println("学生抽烟");
    }
}
