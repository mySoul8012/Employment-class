package com.ming13;

import java.util.HashMap;
import java.util.UUID;

public class Test02 {
    public static void main(String[] args){
        HashMap<String, Student> hashMap = new HashMap<>();
        for(int i = 0; i < 10; i++){
            String uuid = UUID.randomUUID() + "";
            Student student = new Student();
            student.setName("ming" + uuid);
            student.setNum(uuid);
            student.setScore(34.2 + i);
            hashMap.put(uuid, student);
        }
        // 输出
        System.out.println(hashMap);
    }
}
