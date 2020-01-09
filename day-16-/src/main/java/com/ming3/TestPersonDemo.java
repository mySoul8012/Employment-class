package com.ming3;

public class TestPersonDemo {
    public static void main(String[] args){
        // 创建对象
        Person person = new Person();
        // 进行添加对象
        person.setAge(23);
        person.setGender("ming");
        person.setName("xiaoxiao");

        // 创建Person对象
        Person person1 = new Person(20, "李四", "KO");
        // 进行打印
        System.out.println(person1);
    }
}
