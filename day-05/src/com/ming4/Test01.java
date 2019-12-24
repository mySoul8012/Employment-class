package com.ming4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test01 {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        // 循环添加数据
        for(int i = 0; i < 100; i++){
            arrayList.add(i);
        }
        // 使用迭代器遍历
        Iterator<Integer> integer = arrayList.iterator();
        while(integer.hasNext()){
            System.out.println(integer.next());
        }

        // for 循环遍历
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // 增强 For 循环
        for(Integer integer1:arrayList){
            System.out.println(integer1);
        }



    }
}
