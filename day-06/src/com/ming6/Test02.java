package com.ming6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("001", "xiao");
        map.put("002", "xiaoi");

        // 获取 map 集合中的所有的键，保存到 set 集合中
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(map.get(key));
        }
    }
}
