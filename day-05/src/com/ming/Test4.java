package com.ming;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("123");

        MyClass<String, String, Integer> myClass = new MyClass();
        myClass.setT("123");
        myClass.setT1("342423");
        myClass.setT2(456456);
        System.out.println(myClass.getT());
        System.out.println(myClass.getT1());
        System.out.println(myClass.getT2());
    }
}
