package com.ming6;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.stream().filter(s -> s.startsWith("m")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
