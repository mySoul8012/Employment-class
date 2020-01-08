package com.ming6;

public class Test {
    public static void main(String[] args) {
        // 进行结果输出
        Car car = CarFactory.getCar(1);
        // 进行打印
        Car car1 = CarFactory.getCar(2);
        // 进行调用
        car.run();
        car1.run();
        // 进行打印
    }
}
