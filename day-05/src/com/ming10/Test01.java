package com.ming10;

import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        // 定义集合
        List<String> list = new ArrayList<>();
        // 添加数据
        list.add("3333");
        list.add("44444");
        list.add("555555");
        list.add("66666");
        // 判断集合是否包含
        if(contains(list, "666")){
            System.out.println("集合包含");
        }else{
            System.out.println("集合不包含");
        }
    }

    public static boolean contains(List<String> list, String s){
        // 判断是否包含s
        for (String value : list) {
            // 判断是否包含
            if (value.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
