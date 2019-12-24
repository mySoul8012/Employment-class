package com.ming13;

import java.util.Objects;

public class Student {
    private String num;
    private String name;
    private double score;

    public Student(String num, String name, double score) {
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }



    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getScore(), getScore()) == 0 &&
                getNum().equals(student.getNum()) &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getName(), getScore());
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
