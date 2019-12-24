package com.ming7;

public class Manager extends Employee {
    public Manager(String name, String workId, String dept) {
        super(name, workId, dept);
    }

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println(this.getName());
    }
}
