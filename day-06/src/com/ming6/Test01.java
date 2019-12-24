package com.ming6;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("001", "张三");
        map.put("002", "李四");
        map.put("003", "王五");
        System.out.println(map);
        // 删除元素的值
        System.out.println(map.remove("003"));
        System.out.println(map.get("002"));
        System.out.println(map.containsKey("001"));
    }
}
