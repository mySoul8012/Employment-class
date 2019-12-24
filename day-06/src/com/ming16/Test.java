package com.ming16;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add(new Student("张三", "男", 20));
        hashSet.add(new Student("李四", "女", 21));
        hashSet.add(new Student("张三", "男", 20));
        System.out.println(hashSet.size());
        // 增强for遍历集合
        for(Object student:hashSet){
            System.out.println((Student)student);
        }
    }
}
