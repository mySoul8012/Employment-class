package com.模板设计模式;

// 公司类
public abstract class Company {
    private String jobNumber;   // 工号
    private String name;    // 姓名
    private String age; // 年龄
    // 抽象方法 发布通知
    public abstract void inform();
}
