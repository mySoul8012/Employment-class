package com.ming7.student;


import com.ming7.superclass.Person;

public class Student extends Person {
    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学生学习Java";
    }
}
