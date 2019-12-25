package com.ming8;

public class Person {
    private String name;
    private int age;
    private String gender;

    @Override
    public boolean equals(Object obj) {
        if(this.name.equals(((Person)obj).name)){
            if(this.gender.equals(((Person)obj).gender)){
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}