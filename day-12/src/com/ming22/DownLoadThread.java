package com.ming22;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class DownLoadThread implements Runnable {
    private Socket socket = null;
    private volatile List<String> list = new ArrayList<>();

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
        // 获取读入流
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("C:\\ming\\ming.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 创建输出流
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 进行文件复制
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行复制
        while (true) {
            try {
                if((len = inputStream.read(bytes)) != -1){
                    // 进行复制
                    outputStream.write(bytes, 0, len);
                }else{
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 保存数据到集合
        list.add(socket.getInetAddress().getHostName() +  " " +socket.getInetAddress().getHostAddress());
        // 输出内容
        System.out.println("目前有 " + list.size() + "个人下载");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
