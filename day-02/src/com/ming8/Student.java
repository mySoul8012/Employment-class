package com.ming8;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, String sex, int age) {
        super(name, sex, age);
    }

    public void eat(){
        System.out.println("学生吃饭");
    }
}
