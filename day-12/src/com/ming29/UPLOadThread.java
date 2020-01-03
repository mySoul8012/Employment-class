package com.ming29;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class UPLOadThread implements Runnable {
    private Socket socket;

    public UPLOadThread(Socket socket) {
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
        String name = System.currentTimeMillis() + new Random().nextInt(1024) + ".txt";
        OutputStream outputStream = null;
        // 生成文件输出流
        try {
            outputStream = new FileOutputStream(new File("C:\\ming", name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 获取socket 输入流
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 进行文件输入
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行文件复制
        while(true){
            try {
                if (((len = inputStream.read(bytes)) != -1)){
                    // 进行文件复制
                    outputStream.write(bytes, 0, len);
                }else{
                    break;
                };
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // 上传完毕，进行发送上传完成提示
        OutputStream outputStream1 = null;
        try {
            outputStream1 = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 上传完毕以后，进行文件上传提示
        try {
            outputStream1.write("文件上传完毕".getBytes());
            outputStream1.write("/n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 关闭流
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream1.close();
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
