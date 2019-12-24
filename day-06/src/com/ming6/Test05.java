package com.ming6;

import java.util.TreeMap;

public class Test05 {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "003");
        treeMap.put(10, "001");
        treeMap.put(7, "004");
        System.out.println(treeMap);
        TreeMap<Student, String> studentStringTreeMap = new TreeMap<>();
        studentStringTreeMap.put(new Student("xiao", 20), "001");
        studentStringTreeMap.put(new Student("xiaom", 21), "003");
        studentStringTreeMap.put(new Student("mingxiao", 34), "003");
        System.out.println(studentStringTreeMap);
    }
}
