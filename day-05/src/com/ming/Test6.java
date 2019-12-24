package com.ming;

interface A<T>{
    public abstract void show(T t);
}
public class Test6 implements A{
    @Override
    public void show(Object o) {
        System.out.println(o);
    }
}

class Test7 implements A<String>{
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}

class Test8<T> implements A<T>{
    @Override
    public void show(T t) {
        System.out.println((T)t);
    }
}
