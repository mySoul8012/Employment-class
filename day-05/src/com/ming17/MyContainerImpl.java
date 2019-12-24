package com.ming17;

import com.ming12.MyConTainer;

public class MyContainerImpl<T> implements MyConTainer<T> {
    // 长度
    private int size = 0;
    // 头部节点
    private Note<T> head = null;

    @Override
    public boolean add(T t) {
        // 创建对象
        Note<T> note = new Note<>(t);
        // 判断非空,如果为空，创建头部节点
        if(this.head == null){
            this.head = note;
        }else{
            // 定义俩指针
            Note<T> temp1 = this.head;
            Note<T> temp2 = this.head.getNext();
            // 进行循环遍历，直到下一个节点为空
            while(temp2 != null){
                temp1 = temp2.getNext();
                temp2 = temp1.getNext();
            }
            // 此时temp2为空，temp1为单向链表尾部,进行赋值操作
            temp1.setNext(note);
        }
        // 长度加
        this.size++;
        return true;
    }

    @Override
    public int length() {
        return this.size;

    }
}
