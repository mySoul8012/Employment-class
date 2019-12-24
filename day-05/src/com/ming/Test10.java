package com.ming;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        fun(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        fun(list2);

        ArrayList<Object> list3 = new ArrayList<>();
        fun(list3);

    }

    private static void fun(ArrayList<?> list1) {
    }
}
