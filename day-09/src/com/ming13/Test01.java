package com.ming13;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1111);
        list.add(222);
        list.add(333);
        list.add(4444);

        // 使用 lambda表达式进行排序
        list.sort((t1, t2) -> {
            return t2 - t1;
        });

        // 输出
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // 定义List<String> 集合
        List<String> list1 = new ArrayList<>();
        // 保存以下数据
        list1.add("cba");
        list1.add("ew");
        list1.add("eref");
        // 调用 Collections 的sort方法进行降序
        list1.sort((t1, t2) -> {
            return t1.compareTo(t2);
        });

        // 输出
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
}
