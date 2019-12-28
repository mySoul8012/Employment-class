package com.ming6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args){
        // 集合获取流
        ArrayList<String> arrayList = new ArrayList<String>();
        Stream<String> stringStream = arrayList.stream();

        HashSet<String> set = new HashSet<String>();
        Stream<String> stringStream1 = set.stream();

        // 数组获取流
        Integer[] arr = new Integer[10];
        Stream<Integer> stream = Stream.of(arr);

    }
}
