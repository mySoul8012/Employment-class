package com.ming3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("001", "小");
        map.put("004", "xiaoxiao");
        map.put("005", "dsfef");
        map.put("007", "referf");

        map.remove("003");
        System.out.println(map);

        System.out.println(map.get("002"));
        System.out.println(map.containsKey("001"));
    }
}
