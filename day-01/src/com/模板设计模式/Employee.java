package com.模板设计模式;

// 员工类
public class Employee  extends Company{
    @Override
    public void inform() {
        System.out.println("员工发布通知");
    }
}
