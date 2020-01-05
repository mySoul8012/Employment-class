package com.ming2;

public class TestDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 通过类的静态成员获取
        Class clazz1 = Cat.class;
        // 获取全限定类名
        System.out.println("-------");
        System.out.println(clazz1.getName());
        // 获取类名
        System.out.println(clazz1.getSimpleName());
        // 创建对象
        Object object = clazz1.newInstance();
        // 进行打印
        System.out.println(object);
    }
}
