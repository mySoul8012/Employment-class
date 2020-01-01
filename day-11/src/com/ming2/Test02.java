package com.ming2;

public class Test02 {
    public static void main(String[] args){
        // 创建类
        SingInteger singInteger = new SingIntegerNumber();
        // 进行对象传入
        SingInteger singInteger1 = new SingIntegerNumber02(singInteger);
        // 进行调用
        singInteger1.number01();
        singInteger1.number();
    }
}
