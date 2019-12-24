package com.ming18;

public class MyUtil<T> {
    private T data;
    public void add(T t){
        this.data = t;
    }
    // 取出数据
    public T get(){
        return this.data;
    }
}
