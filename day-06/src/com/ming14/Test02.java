package com.ming14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        // 创建结果集
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        // 输入字符串 统计字符串出现的数量
        String str = scanner.nextLine();
        // 进行统计
        for(int i = 0; i < str.length(); i++){
            int res = 0;
            // 判断结果是否存在
            if(map.containsKey(str.charAt(i) + "")){
                // 如果结果集存在
                res = map.get(str.charAt(i) + "");
            }else{
                // 如果结果不存在，创建map
                map.put(str.charAt(i) + "", 0);
                res = map.get(str.charAt(i) + "");
            }
            // 结果加加，并返回
            res++;
            map.put(str.charAt(i) + "", res);
        }
        System.out.println(map);
    }
}
