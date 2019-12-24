package com.ming1;

public class Test {
    public static void main(String[] args){
        Student one = new Student("ming");
        Student.room = "00000";
        one.room = "ming";
        Student.study();
    }
}
