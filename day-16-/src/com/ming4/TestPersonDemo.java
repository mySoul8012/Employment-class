package com.ming4;

public class TestPersonDemo {
    public static void main(String[] args){
        // 创建Person对象
        Person person = new Person();
        // 创建对象
        person.setName("xiaoxiao");
        person.setAge(18);
        person.setGender(Gender.FEMALE);
        System.out.println(person);

        // 创建Person对象
        Person person1 = new Person(20, "xiaoxiao", Gender.MALE);
        // 进行打印
        System.out.println(person1);
    }
}
