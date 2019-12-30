package com.ming25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){
        String[] arr = {"郭靖", "杨康"};
        String[] arr1 = {"黄蓉", "穆念慈"};

        // 输出流
        Stream streamArr = Arrays.stream(arr);
        Stream streamArr1 = Arrays.stream(arr1);
        // 进行合并
        List<String> listString = (List<String>) Stream.concat(streamArr, streamArr1).collect(Collectors.toList());
        // 输出
        for(String str:listString){
            System.out.println(str);
        }
    }
}
