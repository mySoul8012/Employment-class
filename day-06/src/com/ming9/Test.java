package com.ming9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> arrList = new ArrayList<>();
        arrList.add("a");
        arrList.add("f");
        arrList.add("b");
        arrList.add("c");
        arrList.add("a");
        arrList.add("d");
        // 使用 HashSet 对集合进行去重
        HashSet<String> hashSet = new HashSet<>();
        for(String s:arrList){
            hashSet.add(s);
        }
        // 输出
        System.out.println(hashSet);
    }
}
