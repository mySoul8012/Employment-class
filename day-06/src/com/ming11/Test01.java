package com.ming11;

import java.util.HashMap;
import java.util.Set;

public class Test01 {
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("柳岩", 2100);
        hashMap.put("ming", 233);
        hashMap.put("xiao", 555);
        // 获取柳岩的工资
        Integer integer = hashMap.get("柳岩");
        // 修改柳岩的工资，加上300；
        integer += 300;
        // 重新赋值
        hashMap.put("柳岩", integer);
        // 增强 for 循环 使用 keySet 获取键
        Set<String> set = hashMap.keySet();
        // 使用for循环
        for(String setHashMap:set){
            System.out.println(hashMap.get(setHashMap));
        }
    }
}
