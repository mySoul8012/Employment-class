package com.继承;

// 电视类
public class Tv extends Electric {
    private String screenSize;  // 屏幕尺寸
    private String resolutionThe;   // 分辨率

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionThe() {
        return resolutionThe;
    }

    public void setResolutionThe(String resolutionThe) {
        this.resolutionThe = resolutionThe;
    }
}
