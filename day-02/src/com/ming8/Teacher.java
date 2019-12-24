package com.ming8;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    public void eat(){
        System.out.println("Teach吃饭");
    }
}
