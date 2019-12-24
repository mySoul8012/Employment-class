package com.ming19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
* 提供一个函数，可以向保存任意类型数
* 据的集合容器中添加一个相应类型的数据；
* */
public class Test01 {
    public static void main(String[] args){

        Collection<String> collection = new ArrayList<>();
        add(collection, "344");
        System.out.println(collection);

        Collection<int[]> collection1 = new ArrayList<>();
        add(collection1,new int[]{1,2,3});
        System.out.println(collection1.size());
    }
    public static <T> void add(Collection<T> collections, T data){
        collections.add(data);
    }
}
