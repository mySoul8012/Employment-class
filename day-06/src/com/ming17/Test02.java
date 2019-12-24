package com.ming17;

import java.util.HashMap;

// 编程统计每个字符串出行的次数
public class Test02 {
    public static void main(String[] args){
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        // 进行统计遍历
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            int countNumber = 0;
            // 获取当前字符
            char tmpChar = str.charAt(i);
            // 查看当前 HashMap 中是否有
            if(count.containsKey(tmpChar)){
                // 此时有字符串
                countNumber = count.get(tmpChar);
            }else{
                // 没有，新建
                count.put(tmpChar, 0);
            }
            // 进行加
            countNumber++;
            // 重新保存
            count.put(tmpChar, countNumber);
        }
        // 打印
        System.out.println(count);
    }
}
