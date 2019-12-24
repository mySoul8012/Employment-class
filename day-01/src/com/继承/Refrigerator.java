package com.继承;

// 冰箱类
public class Refrigerator extends Electric {
    private String doorModel;   // 门款式
    private String coolingMode; // 制冷方式

    public String getDoorModel() {
        return doorModel;
    }

    public void setDoorModel(String doorModel) {
        this.doorModel = doorModel;
    }

    public String getCoolingMode() {
        return coolingMode;
    }

    public void setCoolingMode(String coolingMode) {
        this.coolingMode = coolingMode;
    }
}
