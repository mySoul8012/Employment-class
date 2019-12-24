package com.ming6;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三", "20", 1.66));
        list.add(new Person("杨玉环", "20", 1.72));
        list.add(new Person("aaaa", "22", 1.80));

        Iterator<Person> iterator = list.iterator();

        // 定义最高人
        Person maxHeightPerson = list.get(0);
        // 定义最低人
        Person minHeightPerson = list.get(0);

        // 创建迭代器进行循环迭代
        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            // 获取Person对象
            Person person = (Person) iterator1.next();
            if(maxHeightPerson.getHeight() < person.getHeight()){
                maxHeightPerson = person;
            }else if(minHeightPerson.getHeight() > person.getHeight()){
                minHeightPerson = person;
            }
        }
        // 按照格式进行打印
        System.out.println("最高的人是" + maxHeightPerson.getHeight());
        System.out.println("最低的人是" + minHeightPerson.getHeight());
    }
}
