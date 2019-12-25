package com.ming3;

public class Student {
    private String number;
    private String name;
    private String fenshu;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFenshu() {
        return fenshu;
    }

    public void setFenshu(String fenshu) {
        // 进行判断分数是否为负数
        if(Integer.parseInt(fenshu) < 0){
            throw new NoScoreException("分数不能为负数");
        }

        this.fenshu = fenshu;
    }

    public Student() {
    }

    public Student(String number, String name, String fenshu) {
        this.number = number;
        this.name = name;
        this.fenshu = fenshu;
    }
}
