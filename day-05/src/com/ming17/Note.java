package com.ming17;

// 节点
public class Note<T> {
    // 数据域
    private T data;
    // 指针域
    private Note<T> next;

    public Note(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Note<T> getNext() {
        return next;
    }

    public void setNext(Note<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
