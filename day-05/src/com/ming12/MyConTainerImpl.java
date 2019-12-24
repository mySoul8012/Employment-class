package com.ming12;

public class MyConTainerImpl<T> implements MyConTainer<T> {
    // 定义一个固定长度的数组
    private Object[] dataes = new Object[10];
    // 定义保存的游标
    private int index = 0;
    @Override
    public boolean add(T t) {
        // 先判断容量是否已到
        if(dataes.length == index){
            // 此时容量已到 进行扩容操作
            Object[] tmp = new Object[(int) (dataes.length * 1.5)];
            // 进行数组复制
            System.arraycopy(dataes, 0, tmp, 0, dataes.length);
            // 进行替换
            dataes = tmp;
        }

        // 判断完成以后进行数据添加
        dataes[index] = (Object)t;
        // 游标移动
        index++;
        return true;
    }

    @Override
    public int length() {
        return this.index;
    }
}
