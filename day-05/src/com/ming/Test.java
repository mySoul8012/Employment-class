package com.ming;

import java.util.ArrayList;

class Person {
}

class Teacher extends Person{

}

class JavaStudent extends Teacher {

}


public class Test{
    public static void main(String[] args){
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        ArrayList<JavaStudent> javaStudents = new ArrayList<>();

        fun(personArrayList);
        fun(teacherArrayList);
        fun(javaStudents);
    }

    private static void fun(ArrayList<? extends Person> list) {

    }
}
