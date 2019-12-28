package com.ming6;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo01 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("ming");
        list.add("xiuaoi");
        List<String> one = new ArrayList<String>();
        for(String s:list){
            if(s.startsWith("m")){
                one.add(s);
            }
        }
        // 筛选名字有三个字的人
        List<String> two = new ArrayList<String>();
        for(String s:one){
            if(s.length() == 3){
                two.add(s);
            }
        }
        // 对结果进行打印输出
        for(String s:two){
            System.out.println(s);
        }
    }
}
