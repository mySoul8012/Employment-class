package com.ming7.teacher;

import com.ming7.superclass.Person;

public class Teacher extends Person {
    @Override
    public String getType() {
        return "教师";
    }

    @Override
    public String getWork() {
        return "教授Java";
    }
}
