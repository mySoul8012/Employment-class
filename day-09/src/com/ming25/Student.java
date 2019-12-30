package com.ming25;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(Object o) {
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
