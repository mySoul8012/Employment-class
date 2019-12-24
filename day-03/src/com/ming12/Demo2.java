package com.ming12;


/*
* 	请按标准格式定义一个“学生类”，
* 它有三个属性：姓名、性别、年龄
	请编写测试类，创建两个“学生对象”
	* 并为它们的属性赋值，并能比较两个对象的所有属性值是否完全相等。
*
*
* */
public class Demo2 {
    private String name;
    private String sex;
    private String age;

    public Demo2(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Demo2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Demo2 demo2 = (Demo2)obj;
        boolean res = true;
        if(demo2.getAge().equals(this.getAge())){

        }else{
            res = false;
        }

        if(demo2.getName().equals(this.getName())){

        }else{
            res = false;
        }

        if(demo2.getSex().equals(this.getSex())){

        }else{
            res = false;
        }
        return res;
    }
}
