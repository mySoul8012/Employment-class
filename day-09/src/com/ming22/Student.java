package com.ming22;

public class Student{
    private String name;
    private int color;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Student(String name, int color) {
        this.name = name;
        this.color = color;
    }
}
