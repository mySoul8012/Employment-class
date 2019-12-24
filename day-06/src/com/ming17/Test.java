package com.ming17;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        System.out.println(linkedHashSet.size());   // 集合大小和保存的数据不同的原因：去重
        
        for(Integer integer:linkedHashSet){
            System.out.println(integer);
        }
    }
}
