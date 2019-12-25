package com.ming9;

public class Student {
    private String name;
    private int age;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        throw new AgeException("年龄异常");
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男") || sex.equals("女")){
            throw new SexException("年龄异常");
        }
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
