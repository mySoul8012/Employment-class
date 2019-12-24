package ming.student;


import ming.superclass.Person;

/**
 * 学生类
 */
public class Student extends Person {
    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习Java";
    }
}
