package com.ming5;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 模拟junit测试执行
@Target(ElementType.METHOD) // 表明注解在成员方法上
@Retention(RetentionPolicy.RUNTIME) // 表明注解生命周期一直存在
public @interface MyTest {

}
