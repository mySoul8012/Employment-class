package com.ming6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(12, "001");
        linkedHashMap.put(10, "002");
        linkedHashMap.put(9, "003");
        linkedHashMap.put(7, "004");
        System.out.println(linkedHashMap);

        Set<Integer> keys = linkedHashMap.keySet();
        for(Integer key:keys){
            System.out.println(linkedHashMap.get(key));
        }

        // 遍历方式二
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
