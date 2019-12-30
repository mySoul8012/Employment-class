package com.ming23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){
        Stream<String> stringStream = Stream.of("黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏");
        // 进行过滤
        String[] arrs = stringStream.filter(s -> s.startsWith("黄")).toArray(String[]::new);
        for(String str:arrs){
            System.out.println(str);
        }
    }
}
