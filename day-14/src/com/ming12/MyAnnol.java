package com.ming12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)   //此注解只能修饰类和接口
@Retention(RetentionPolicy.CLASS)   // 此注解一直存在
public @interface MyAnnol {
}
