package com.ming6;

public class Person {
    private String name;
    private String age;
    private double height;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person(String name, String age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
