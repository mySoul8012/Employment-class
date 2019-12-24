package com.ming4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();  // 多态
        map.put("001", "张三");
        map.put("002", "李四");
        map.put("003", "王五");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry: entries){
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
    }
}
