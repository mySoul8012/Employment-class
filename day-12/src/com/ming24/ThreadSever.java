package com.ming24;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.Callable;

// 查询用户线程
public class ThreadSever implements Callable<Boolean> {
    private Socket socket;
    private User user;

    public ThreadSever(Socket socket, User user) {
        this.socket = socket;
        this.user = user;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Boolean call() throws Exception {
        // 创建键值对保存文件
        Properties properties = new Properties();
        // 装载本地的文件
        InputStream inputStream = new FileInputStream(new File("222.properties"));
        properties.load(inputStream);
        // 获取键值对
        String password = properties.getProperty(user.getName());
        // 进行匹配
        if(password.equals(user.getPassword())){
            // 返回ture
            return true;
        }else{
            return false;
        }
    }
}
