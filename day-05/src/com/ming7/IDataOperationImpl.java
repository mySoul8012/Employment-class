package com.ming7;

import java.util.ArrayList;
import java.util.List;

public class IDataOperationImpl implements IDataOperation<Student>{
    private List<Student> studentList = new ArrayList<>();

    @Override
    public boolean add(Student student) {
        return studentList.add(student);
    }

    @Override
    public boolean delete(Student student) {
        return studentList.remove(student);
    }

    @Override
    public void update(Student student) {
        // 获取原先的id
        int index = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getId().equals(student.getId())){
                index = i;
            }
        }
        // 对Student 对象进行更新
        studentList.set(index, student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i < studentList.size(); i++){
            studentList.add(this.studentList.get(i));
        }
        return studentList;
    }

    @Override
    public List<Student> getArrayList() {
        return this.studentList;
    }

    @Override
    public Student getStudent(String id) {
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getId().equals(id)){
                return studentList.get(i);
            }
        }
        return null;
    }
}
