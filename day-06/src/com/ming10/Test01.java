package com.ming10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("黄晓明", "Baby");
        hashMap.put("谢霆锋", "张柏芝");

        // 获取到所有键
        Set<String> keySet = hashMap.keySet();

        // 获取到迭代器
        Iterator<String> iterator = keySet.iterator();

        // 对键进行迭代
        while(iterator.hasNext()){
            System.out.println(hashMap.get(iterator.next()));
        }
    }
}
