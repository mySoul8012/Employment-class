package com.ming15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
    public static void main(String[] args){
        Set<String> setString = new HashSet<>();
        setString.add("刘备");
        setString.add("关羽");
        setString.add("张飞");
        setString.add("刘备");
        setString.add("张飞");
        System.out.println(setString.size());
        // 迭代器遍历集合
        Iterator iterator =  setString.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 增强for遍历集合
        for(String tmp:setString){
            System.out.println(tmp);
        }
    }
}
