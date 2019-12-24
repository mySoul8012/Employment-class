package com.ming4;

public class Rect extends Graph {
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rect() {
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getGirth() {
        return 2 * (length + width);
    }
}
