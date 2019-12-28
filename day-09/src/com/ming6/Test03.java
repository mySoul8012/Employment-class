package com.ming6;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args){
        Stream<String> stringStream = Stream.of("jack", "rose", "bob", "james", "tom", "jerry");
        stringStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 使用Lambda遍历
        stringStream.forEach((String s)->{System.out.println(s);});
        // 进行遍历
        stringStream.forEach(s -> System.out.println(s));


        long count = stringStream.count();
        System.out.println("流中有 " + count + "个元素");


    }
}
