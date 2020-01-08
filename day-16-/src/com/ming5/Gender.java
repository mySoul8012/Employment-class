package com.ming5;

public enum Gender {
    MALE("男"),
    FEMALE("女");
    // 给枚举添加自定义成员变量
    private String detail;

    private Gender(){

    }

    // 给枚举添加自定义构造
    private Gender(String detail){
        // 进行赋值
        this.detail = detail;
    }

    // 给枚举添加自定义成员方法
    public void show(){
        System.out.println("描述的内容是 " + detail);
    }
}
