package com.ming7;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args){
        // 思路 使用 Map 统计次数
        String str = "abcdch";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            // 判断原先是否为空
            if(map.get(str.charAt(i)) != null){
                // 取出原先的值进行加加
                int tmp = map.get(str.charAt(i));
                tmp++;
                // 值放回
                map.put(str.charAt(i), tmp);
            }else{
                // 原先不为空 放入值
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
