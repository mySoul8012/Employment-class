package com.ming15;

public class Student {
    private String name;
    private String sex;
    private String age;
    private String grade;


    public Student() {
    }

    public Student(String name, String sex, String age, String grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
