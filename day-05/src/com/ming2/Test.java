package com.ming2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("mingxiao");
        list.add("dfwefhuiwf");
        list.add("dsfferf");
        list.add("ejijiuhe");

        // 增
        list.add(1, "mingef");
        System.out.println(list);

        // 删
        System.out.println(list.remove(2));
        System.out.println(list);

        // 改
        System.out.println(list.set(2, "mingdf"));
        System.out.println(list);

        // 查
        System.out.println(list.get(0));


    }
}
