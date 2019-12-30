package com.ming24;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(1,-2,-3,4,-5);

        // 进行取绝对值
        stream.map(Math::abs).forEach(System.out::print);
    }
}
