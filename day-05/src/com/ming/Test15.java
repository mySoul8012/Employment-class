package com.ming;

import java.util.ArrayList;

public class Test15 {
    public static void main(String[] args){
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<Student1> student1s = new ArrayList<>();
        ArrayList<Teacher1> teacher1s = new ArrayList<>();
        ArrayList<JavaStudent1> javaStudent1s = new ArrayList<>();
    //    fun(personArrayList);
        fun(student1s);
    //    fun(teacher1s);
        fun(javaStudent1s);

    //    fun1(personArrayList);
        fun1(student1s);
     //   fun1(teacher1s);
        fun1(javaStudent1s);
    }

    public static void fun(ArrayList<? extends Student1> list){

    }

    public static void fun1(ArrayList<? super JavaStudent1> list){

    }
}

class Person1{

}

class Student1 extends Person1{

}

class Teacher1 extends Person1{

}

class JavaStudent1 extends Student1{

}

