package com.ming4;

public class Test {
    public static void main(String[] args){
        try {
            login("admin", "admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static void login(String name, String pwd)throws LoginException{
        // 判断用户名
        if(!"admin".equals(name)){
            throw new LoginException("用户名" + name + "不存在");
        }

        // 判断密码
        if(!"admin".equals(pwd)){
            throw new LoginException("密码" + pwd);
        }

        System.out.println("欢迎用户登录");
    }
}
