package com.ming12;

import javafx.scene.control.skin.SliderSkin;

import java.util.LinkedHashMap;
import java.util.UUID;

public class Test01 {
    public static void main(String[] args){
        LinkedHashMap<String, Student> linkedHashMap = new LinkedHashMap<>();
        // 生成学生对象
        for(int i = 0; i < 3; i++){
            String uuid = UUID.randomUUID() + "";
            linkedHashMap.put(uuid, new Student(uuid, "ming" + i, 34.2 + i));
        }
        // 打印学生对象
        System.out.println(linkedHashMap);
    }
}
