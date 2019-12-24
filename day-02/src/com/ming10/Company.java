package com.ming10;

public class Company implements Money{
    private double totalMoney;

    @Override
    public void paySalary(Employee employee) {
        totalMoney -= employee.getSalary();
        System.out.println("给" + employee.getName() + "发工资" + employee.getSalary() + "公司还剩余" + totalMoney + "元");
    }

    public Company(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Company() {
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }
}
