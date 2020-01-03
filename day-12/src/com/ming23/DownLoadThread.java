package com.ming23;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class DownLoadThread implements Runnable {
    private Socket socket;

    public DownLoadThread(Socket socket) {
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
        // 获得输入流对象
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获得输出流对象
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("C:\\ming\\ming.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 进行数据复制
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行文件复制
        while(true){
            try {
                if (((len = inputStream.read(bytes)) != -1)){
                    outputStream.write(bytes, 0, len);
                }else{
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // 进行流关闭
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
