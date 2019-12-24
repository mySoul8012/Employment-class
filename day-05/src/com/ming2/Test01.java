package com.ming2;

import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        // 模拟栈
        list.push("aaaa");
        list.push("bbbbb");
        list.push("ccccc");

        while(list.size() != 0){
            System.out.println(list.pop());
        }

        // 模拟队列
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
        while(list.size() != 0){
            System.out.println(list.pop());
        }
    }
}
