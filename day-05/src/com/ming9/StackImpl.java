package com.ming9;

import java.util.ArrayList;
import java.util.List;

// 栈
public class StackImpl<T> implements Stack<T>{
    private List<T> list = new ArrayList<T>();
    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void pop() {
        // 获取长度
        int length = list.size();
        // 出队
        list.remove(length - 1);
    }

    @Override
    public int length() {
        return list.size();
    }
}
