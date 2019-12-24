package com.ming12;

public interface MyConTainer<T> {
    // 添加数据
    public boolean add(T t);
    // 获取数据
    public int length();
}
