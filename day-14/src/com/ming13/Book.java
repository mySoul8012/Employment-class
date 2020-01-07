package com.ming13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Book {
    String value();
    double price() default  100;
    String[] authors();

}
