package com.模板设计模式;

// 经理类
public class Manager extends Company {
    private String AnnualBonusAmount;

    @Override
    public void inform() {
        System.out.println("经理发布通知");
    }
}
