package com.ming3;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String name();
    double price();
    int pages();
    String[] authors();
}
