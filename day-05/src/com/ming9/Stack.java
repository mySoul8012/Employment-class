package com.ming9;

import java.util.ArrayList;
import java.util.List;

// 模拟栈  入队，出队，获取队列长度
public interface Stack<T> {
    // 入队
    public void add(T t);
    // 出对
    public void pop();
    // 获取队列长度
    public int length();
}
