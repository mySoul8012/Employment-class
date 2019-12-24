package com.ming12;


/*
* 请按标准格式定义一个“手机类”，
* 它有三个属性：品牌(String)、
* 颜色(String)、价格(double)
	请编写测试类，创建两个“手机对象”并为它们
	* 的属性赋值，并能直接打印手机对象
	* 的属性信息。
*
* */
public class Demo1 {
    private String brand;
    private String color;
    private double price;

    public Demo1() {
    }

    public Demo1(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
