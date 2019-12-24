package com.ming4;

import com.ming.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args){
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student("张三", 19), "001");
        hashMap.put(new Student("李四", 20), "002");
        hashMap.put(new Student("王五", 21), "003");
        hashMap.put(new Student("小", 18), "004");
        System.out.println(hashMap);
        // 遍历方式
        Set<Student> keys = hashMap.keySet();
        for(Student key:keys){
            System.out.println(hashMap.get(key));
        }
        System.out.println("==============");
        // 遍历方式
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for(Map.Entry<Student, String> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
