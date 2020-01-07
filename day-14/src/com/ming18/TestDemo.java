package com.ming18;

public class TestDemo {
    public static void main(String[] args){
        // 创建实现类对象
        SchoolService schoolService = new SchoolServiceImpl();
        // 进行登录操作
        System.out.println(schoolService.login("xiaoxiao", "1111"));
        // 查询班级
        System.out.println(schoolService.getAllClazzs());

    }
}
