package com.ming1;

public class Student {
    String name;
    static String room = "314";

    public Student(String name) {
        this.name = name;
    }

    public static void study(){
        System.out.println("Student" + Student.room);
    }
}

