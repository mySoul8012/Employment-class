package com.ming18;

import java.util.Random;

public class SchoolServiceImpl implements SchoolService {
    // 登录服务
    @Override
    public String login(String loginName, String password) {
            try {
                Thread.sleep(new Random().nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return "登录成功...";
    }

    @Override
    public String getAllClazzs() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 返回结果
        return "1班级，2班级，3班级";
    }
}
