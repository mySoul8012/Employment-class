package com.ming23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args){
        // 输出数据
        List<String> list = new ArrayList<String>();
        // 加入数据
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        Stream<String> stringStream = list.stream();
        // 取前两个数据
        //stringStream = list.stream().limit(2);
        // 输出数据
        //String[] arrs = stringStream.toArray(String[]::new);
        // 遍历输出
        //for(String tmp:arrs){
       //     System.out.println(tmp);
        //}

        // 取出后两个数据
        stringStream = list.stream().skip(list.size() - 2);
        // 遍历输出
        String[] arrs = stringStream.toArray(String[]::new);
        // 输出
        for(String tmp:arrs){
            System.out.println(tmp);
        }
    }
}
