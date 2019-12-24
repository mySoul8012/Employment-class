package com.ming7;

import java.util.List;

// 数据操作接口
interface IDataOperation<T> {
    // 添加数据
    public boolean add(T t);
    // 根据唯一标识添加一个数据
    public boolean delete(T t);
    // 修改一个数据
    public void update(T t);
    // 查找所有数据
    public List<T> getAll();
    // 获取 arrayList
    public List<T> getArrayList();

    // 获取 Student
    public Student getStudent(String id);
}
