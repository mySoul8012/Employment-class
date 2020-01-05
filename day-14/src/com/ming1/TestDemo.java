package com.ming1;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过类的静态成员获取
        Class clazz1 = Cat.class;
        // 进行打印
        System.out.println(clazz1);
        // 通过类的某个对象，获取class对象
        Cat cc = new Cat();
        // 获取class
        Class clazz2 = cc.getClass();
        // 通过静态方法
        Class classzz3 = Class.forName("com.ming1.Cat");
        // 进行打印
        System.out.println(classzz3);
        // 进行比较
        System.out.println(classzz3 == clazz1);
        System.out.println(clazz2 == clazz2);
        System.out.println(clazz1 == classzz3);
    }
}
