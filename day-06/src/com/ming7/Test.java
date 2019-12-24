package com.ming7;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "003");
        treeMap.put(10, "004");
        treeMap.put(11, "005");
        treeMap.put(23, "007");
        System.out.println(treeMap);

        TreeMap<Student, String> studentStringTreeMap = new TreeMap<>();
        studentStringTreeMap.put(new Student("xiao", 19), "001");
        studentStringTreeMap.put(new Student("xiaoming", 20), "002");
        studentStringTreeMap.put(new Student("xiaomingd", 18), "004");
        System.out.println(studentStringTreeMap);
    }
}
