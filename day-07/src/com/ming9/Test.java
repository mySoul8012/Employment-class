package com.ming9;

public class Test {
    public static void main(String[] args){
        Student student = new Student();
        try {
            student.setAge(34);
            student.setName("ming");
            student.setSex("女生");
        }catch (AgeException | SexException e){
            System.out.println(e);
        }
    }
}
