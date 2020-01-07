package com.ming15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 表明注解一直存在
@Target(ElementType.METHOD) // 必须类上或者接口上
public @interface Book {
    String value();
    double price();
    String[] author();
}
