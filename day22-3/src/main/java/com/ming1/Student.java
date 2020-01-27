package com.ming1;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
    private String id;
    private String name;
    private String age;
    private String score;

    public void setId(String id) {
        this.id = id;
    }

    public Student() {
    }

    public String getId() {
        return id;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Student(String id, String name, String age, String score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
