package com.ming2;

import java.util.*;

public class Test {
    public static void main(String[] args){
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("xiao", 23));
        catList.add(new Cat("ming", 34));
        catList.add(new Cat("lll", 33));
        // 调用 sort进行排序
        Collections.sort(catList, new Comparator<Cat>() {
            @Override
            public int compare(Cat cat, Cat t1) {
                return cat.getAge() - t1.getAge();
            }
        });
        // 输出
        System.out.println(catList);

        // 进行降序排序
        Collections.sort(catList, new Comparator<Cat>() {
            @Override
            public int compare(Cat cat, Cat t1) {
                return t1.getAge() - cat.getAge();
            }
        });

        // 输出
        System.out.println(catList);
    }
}
