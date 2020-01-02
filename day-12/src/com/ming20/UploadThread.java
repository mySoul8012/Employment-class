package com.ming20;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class UploadThread implements Runnable {
    private Socket socket = null;

    public UploadThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 获取socket 输入对象
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建目录
        File fil = new File("C:\\ming");
        // 判断目录是否创建
        if(fil.exists()){
            // 创建
            fil.mkdirs();
        }
        // 生成文件名
        String fileName = System.currentTimeMillis() + new Random().nextInt(100) + ".png";
        // 获取对应的输出流
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File(fil.getPath(), fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 进行文件复制
        int len = 0;
        byte[] bytes = new byte[1024 * 10];
        // 进行复制
        while (true) {
            try {
                if ((len = inputStream.read(bytes)) != -1){
                    // 进行文件复制
                    outputStream.write(bytes, 0, len);
                }else{
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 给客户端写，输入成功
        try {
            socket.getOutputStream().write("文件上传成功".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭
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
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
