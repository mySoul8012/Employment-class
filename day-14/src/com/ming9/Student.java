package com.ming9;

public class Student {
    private String ming;

    @Override
    public String toString() {
        return "Student{" +
                "ming='" + ming + '\'' +
                '}';
    }

    public String getMing() {
        return ming;
    }

    public void setMing(String ming) {
        this.ming = ming;
    }
}
