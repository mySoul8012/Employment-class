package com.ming9;

import java.util.HashSet;

public class Test02 {
    public static void main(String[] args){
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("xiao", 20, "男"));
        hashSet.add(new Person("xiao", 20, "男"));
        System.out.println(hashSet);
    }
}
