package com.ming6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();  // 多态
        map.put("001", "xiao");
        map.put("002", "ming");
        map.put("003", "minge");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry: entries){
            System.out.println("key:" + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
        // 遍历方式 一
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(map.get(key));
        }

        System.out.println("====================");

        // 遍历方式二
        Set<Map.Entry<String, String>> entries1 = map.entrySet();
        for(Map.Entry<String, String> entry: entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }




    }
}
