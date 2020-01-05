package com.ming;

public class TestDemo {
    public static void main(String[] args){
        Class clazz1 = Cat.class;
        System.out.println(clazz1);
        // 通过该类的对象，获取class对象
        Cat cc = new Cat();
        Class class2 = cc.getClass();
        // 打印
        System.out.println(class2);
        // 通过forName动态加载
        System.out.println(clazz1 == class2);
        System.out.println(clazz1 == class2);

    }
}
