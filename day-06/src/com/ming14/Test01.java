package com.ming14;

import java.util.*;

public class Test01 {
    public static void main(String[] args){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        // 获取输入字符串
        String string = scanner.nextLine();
        // 进行字符串分割
        String[] strings = string.split(",");
        // 遍历字符串
        // 定义List 进行遍历
        List<Integer> list = null;
        for(String str:strings){
            if(map.containsKey(Integer.parseInt(str))){
                list = map.get(Integer.parseInt(str));
            }else{
                list = new ArrayList<>();
            }
            //元素添加
            list.add(Integer.parseInt(str));
            // 保存到 map
            map.put(Integer.parseInt(str), list);
        }
        System.out.println(map);
    }
}
