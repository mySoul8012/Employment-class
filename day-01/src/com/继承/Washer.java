package com.继承;

// 洗衣机类
public class Washer extends Electric {
    private String theMotorType;    // 电机类型
    private String washingCapacity; // 洗涤容量

    public String getTheMotorType() {
        return theMotorType;
    }

    public void setTheMotorType(String theMotorType) {
        this.theMotorType = theMotorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}
