package com.ming6;

public class CarFactory {
    public static Car getCar(int id){
        // 进行判断
        if(id == 1){
            // 输出结果
            return new AoTuo();
        }else if(id == 2){
            return new FaLaLi();
        }
        return null;
    }
}
