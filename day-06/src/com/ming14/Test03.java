package com.ming14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        // 统计英文字母，空格，数字，其他字符数量
        Scanner scanner = new Scanner(System.in);

        // 获取用户字符串
        System.out.println("请录入一串字符串");
        String line = scanner.nextLine();
        // 定义 map 进行统计
        Map<String, Integer> integerListMap = new HashMap<String, Integer>();
        // 分别添加 其他，空格，字母，数字
        integerListMap.put("其他", 0);
        integerListMap.put("空格", 0);
        integerListMap.put("字母", 0);
        integerListMap.put("数字", 0);
        for(int i = 0; i < line.length(); i++){
            int res = 0;
            // 判断字母，空格，数字还是其他
            if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z' || line.charAt(i) >= 'a' && line.charAt(i) <= 'z'){
                // 字母
                res = integerListMap.get("字母");
                res++;
                integerListMap.put("字母", res);
            }else if(line.charAt(i) == ' '){
                res = integerListMap.get("空格");
                res++;
                integerListMap.put("空格", res);
            }else if(line.charAt(i) >= '0' && line.charAt(i) <= '9'){
                res = integerListMap.get("数字");
                res++;
                integerListMap.put("数字", res);
            }else{
                res = integerListMap.get("其他");
                res++;
                integerListMap.put("其他", res);
            }
        }
        System.out.println(integerListMap);
    }
}
