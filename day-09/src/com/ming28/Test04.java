package com.ming28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {
    public static void main(String[] args){
        List<String> res = new ArrayList<>();
        // 添加数据
        res.add("cba");
        res.add("bac");
        res.add("acb");
        res.add("bca");
        res.add("abc");
        // 调用sort方法
        Collections.sort(res, (String t2, String t1) -> t1.compareTo(t2));
        // 输出数据
        for(String tmp:res){
            System.out.println(tmp);
        }


    }
}
