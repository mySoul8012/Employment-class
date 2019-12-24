package com.ming6;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        String str = "abcdh";
        Map<Character, Integer> map = new HashMap<>();
        // 获取每一个字符
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
