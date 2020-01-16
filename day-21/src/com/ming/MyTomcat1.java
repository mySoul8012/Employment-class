package com.ming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat1 {
    public static final String WEB_ROOT = System.getProperty("user.dir") + "\\day-21\\web\\WEB_INF";
    // 定义一个存放访问资源名称的url
    public static String url = null;

    public static void main(String[] args) throws IOException {
        //打印出WEB_ROOT
        System.out.println(WEB_ROOT);
        // 编写ServerSocket
        ServerSocket serverSocket = new ServerSocket(8084);
        while(true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            // 获取浏览器携带的数据信息
            parse(inputStream);
            // 读取被访问的资源
            sendStaticResource(outputStream);
            inputStream.close();
            outputStream.close();
        }
    }

    private static void sendStaticResource(OutputStream outputStream) throws IOException {
        // 判断是否为空
        if(url == null){
            return;
        }

        if(outputStream == null){
            return;
        }
        // 进行获取输出
        // 获取文件地址
       // System.out.println(url);
        // 获取文件对象
        File file = new File(WEB_ROOT, url);
        System.out.println(WEB_ROOT);
        // 判断文件是否存在
        if(file.exists()){
            // 写会相应行信息
            outputStream.write("HTTP/1.1 200 OK\n".getBytes());
            outputStream.write("\n".getBytes());
            // 创建输入流
            FileInputStream fileInputStream = new FileInputStream(file);
            // 进行输入
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行读取
            while((len = fileInputStream.read(bytes)) != -1){
                // 此时进行输入
                outputStream.write(bytes, 0, len);
            }
        }else{
            // 此时文件不存在
            // 返回404信息
            outputStream.write("HTTP/1.1 404 File Not Found\r\n".getBytes());
            outputStream.write("Content-Type: text/html\r\n".getBytes());
            outputStream.write("Content-Length: 23\r\n".getBytes());
            outputStream.write("<h1>File Not Found</h1>".getBytes());
        }
    }

    // 读取浏览器发送的信息
    private static void parse(InputStream inputStream) throws IOException {
        // 创建StringBuffer
        StringBuffer stringBuffer = new StringBuffer(2048);
        // 进行读取
        int len = 0;
        byte[] bytes = new byte[2048];
        // 进行读取
        while((len = inputStream.read(bytes)) != -1){
            stringBuffer.append(new String(bytes, 0, len));
        }
        // 输出长度
        parseUri(stringBuffer.toString());
    }

    // 解析请求参数中的资源名称
    private static void parseUri(String toString) {
        // 判断是否为空
        if(toString.length() <= 0 || toString == null){
            return;
        }
        // 进行分割
        String[] strings = toString.split(" ");
        // 判断是否为空
        if(strings.length <= 0){
            return;
        }
        // 如果不为空，继续进行
        url = strings[1];
    }
}
