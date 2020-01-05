package com.ming4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 表明必须注册在成员方法上
@Retention(RetentionPolicy.RUNTIME) // 表示注解生命周期，一直存在
public @interface MyTest {

}
