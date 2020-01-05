package com.ming6;

import java.util.Random;

public class SchoolServiceImpl implements SchoolService {
    @Override
    public String login(String longinName, String password) throws InterruptedException {
        // 进行睡
        Thread.sleep(new Random().nextInt(5000));
        // 返回登录成功
        return "恭喜您，登录成功";
    }

    @Override
    public String getAllClazzs() {
        try{
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 返回 1 2 3
        return "1班级，2班级，3班级";
    }
}
