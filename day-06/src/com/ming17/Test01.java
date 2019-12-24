package com.ming17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        System.out.println(map.size());

        // 获取所有的键
        Set<Integer> set = map.keySet();
        // 进行遍历
        for(Integer key:set){
            // 进行遍历
            System.out.println(map.get(key));
        }

        // 进行遍历 获取键值对
        Set<Map.Entry<Integer, String>> res = map.entrySet();
        // 进行遍历
        for(Map.Entry<Integer, String> mapRes: res){
            System.out.println(mapRes.getValue() + mapRes.getKey());
        }

        // 获取键为1
        System.out.println(map.get(1));

        // 获取键为10
        System.out.println(map.get(10));

        // 判断集合是否有键10
        if(map.containsKey(10)){
            System.out.println("有");
        }else{
            System.out.println(false);
        }

        // 删除键为1的
        map.remove(1);
        System.out.println(map);
    }
}
