package com.ming25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args){
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");

        // 第一个队伍只要名字为3个字的姓名
        Stream stream = one.stream().filter(s -> s.length() == 3).limit(6);
        // 打印
        stream.forEach(System.out::print);

        // 第二个队伍筛选之后只要姓张的成员姓名
        Stream stream1 = two.stream().filter(s -> s.startsWith("张")).skip(1);
        // 打印
        stream1.forEach(System.out::print);


        // 重写获取流
        stream = one.stream();
        stream1 = two.stream();
        // 合并流
        Stream.concat(stream, stream1).forEach(System.out::print);
    }
}
