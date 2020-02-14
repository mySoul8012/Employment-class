package com.ming.service;

import com.ming.domain.User;

public class UserService {
    public User login(String username, String password){
        // 进行登录
        return new User(username, password);
    }
}
