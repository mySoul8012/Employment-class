package com.ming4;

public class Circle extends Graph {
    private static final double pi = 3.14;  // 圆周率
    private double r;   // 半径

    @Override
    public double getArea() {
        return pi * r * r;
    }

    @Override
    public double getGirth() {
        return 2 * pi * r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public static double getPi() {
        return pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
