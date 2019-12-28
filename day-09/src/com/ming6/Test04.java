package com.ming6;

import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args){
        Integer[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);
        for(Integer integer:arr){
            System.out.println(integer);
        }
        String[] arr1 = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(String[]::new);
        for(String string:arr1){
            System.out.println(string);
        }
    }
}
