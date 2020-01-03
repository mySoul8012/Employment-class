package com.ming24;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class Thread implements Runnable {
   private Socket socket;

    public Thread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 获取本地注册文件
        Properties properties = new Properties();
        InputStream inputStream = null;
        // 进行配置文件信息装载
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 反序列化对象
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 进行序列化读取
        Object object = null;
        try {
            object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 进行序列化
        User user = (User)object;
        // 本地注册文件序列化
        InputStream inputStream1 = null;
        try {
            inputStream1 = new FileInputStream(new File("222.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 进行配置文件信息装载
        try {
            properties.load(inputStream1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建输出流
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 进行查询
        if(properties.get(user.getName()).equals(user.getPassword())){
            // 此时相等
            // 输出内容
            try {
                outputStream.write("登录成功".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            // 此时不相等，输入登录失败
            try {
                outputStream.write("登录失败".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 关闭流
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
