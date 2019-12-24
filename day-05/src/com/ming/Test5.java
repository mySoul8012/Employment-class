package com.ming;

public class Test5 {
    public static void main(String[] args){
        System.out.println(Test5.<String>fun("1","2","3"));
    }

    public static <T> T fun(T o1, T o2, T o3){
        return o1;
    }
}
