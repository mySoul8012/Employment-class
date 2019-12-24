package com.ming20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] arghs){
        Collection<String> collection = new ArrayList<String>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");

        // 使用迭代器遍历元素打印
        Iterator iterable = collection.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }
        // 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
        Iterator iterator = collection.iterator();
        while(iterable.hasNext()){
            String tmp = iterable.next().toString();
            if(tmp.length() < 10){
                System.out.println(tmp);
            }
        }

        // 使用迭代器遍历所有元素，筛选书名包含Java
        Iterator iterator1 = collection.iterator();
        while(iterable.hasNext()){
            String tmp = iterable.next().toString();
            if(tmp.contains("Java")){
                System.out.println(tmp);
            }
        }

        // 使用迭代器遍历所有元素，如果书名包含 Oracle 删掉此书，删掉后，再次遍历集合，打印书名
        Iterator iterator2 = collection.iterator();
        // 打印集合
        System.out.println(collection);
        while(iterator2.hasNext()){
           String res = iterator2.next().toString();
           if(res.contains("Oracle")){
               // 删除集合
               iterator2.remove();
           }
        }
        // 再次打印集合
        System.out.println(collection);
    }
}
