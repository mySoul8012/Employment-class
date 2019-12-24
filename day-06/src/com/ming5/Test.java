package com.ming5;

import com.ming4.Student;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "003");
        treeMap.put(10, "001");
        treeMap.put(12, "002");
        treeMap.put(7, "004");
        System.out.println(treeMap);

        TreeMap<Student, String> studentStringTreeMap = new TreeMap<>();
        studentStringTreeMap.put(new Student("xiao", 19), "001");
        studentStringTreeMap.put(new Student("ming", 20), "003");
        studentStringTreeMap.put(new Student("xiaoxiao", 12), "004");
        System.out.println(studentStringTreeMap);
    }
}
