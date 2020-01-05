package com.ming6;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个类的实现对象
        SchoolService service = new SchoolServiceImpl();
        // 登录
        String res = service.login("xiaoxiao", "xiaoxiao");
        // 进行输出
        System.out.println(res);
        // 查询班级
        String allclazzs = service.getAllClazzs();
        // 进行输出
        System.out.println(allclazzs);
    }
}
