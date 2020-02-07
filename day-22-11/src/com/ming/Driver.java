package com.ming;

public abstract class Driver {
    public void go(){
        System.out.println("开车门");
        System.out.println("启动");
        // 开车
        run();
        System.out.println("熄灭");
        System.out.println("熄火");
    }

    protected abstract void run();
}
