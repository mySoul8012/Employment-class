package com.ming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat03 {
    // 创建资源目录
    public static final String WEB_ROOT = System.getProperty("user.dir") + "\\day-21\\web";
    // 定义资源存放的url
    public static String url = null;
    public static void main(String[] args) throws IOException {
        // 进行打印
        System.out.println(WEB_ROOT);
        // 编写ServerSockt 监听8080端口
        ServerSocket serverSocket = new ServerSocket(8084);
        while(true){
            // 创建socket
            Socket socket = serverSocket.accept();
            // 获取输入流对象
            InputStream inputStream = socket.getInputStream();
            // 获取输出流对象
            OutputStream outputStream = socket.getOutputStream();
            // 浏览器携带数据信息，进行获取
            parse(inputStream);
            // 进行文件输出
            sendStaticResource(outputStream);
            // 进行关闭
            if(null != inputStream){
                inputStream.close();
            }

            if(null != outputStream){
                outputStream.close();
            }

            if(socket != null){
                socket.close();
            }
        }
    }

    private static void sendStaticResource(OutputStream outputStream) throws IOException {
        System.out.println(url);
        // 判断是否为空
        if(outputStream == null){
            return;
        }
        // 判断url是否为空
        if(url == null){
            url = "/index.html";
        }

        if(url.equals("/")){
            url = "/index.html";
        }
        // 此时输出url
        // 创建文件
        File file = new File(WEB_ROOT, url);
        // 进行判断
        if(file.exists()){
            // 响应头
            outputStream.write("HTTP/1.1 200 OK\n".getBytes());
            outputStream.flush();
            outputStream.write("Content-Type: text/html;charset=UTF-8\n".getBytes());
            outputStream.flush();
            outputStream.write("\n".getBytes());
            outputStream.flush();

            // 此时文件存在
            // 创建输入流
            InputStream inputStream = new FileInputStream(file);
            // 进行文件传输
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // 创建输出流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            // 进行文件传输
            while(true){
                String tmp = bufferedReader.readLine();
                if(tmp != null){
                    bufferedWriter.write(tmp);
                }else{
                    break;
                }
                bufferedWriter.flush();
            }
            // 文件传输完毕

        }else{
            // 此时文件不存在
            // 输出404
            String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                    + "Content-Type: text/html\r\n"
                    + "Content-Length: 23\r\n" + "\r\n"
                    + "<h1>File Not Found</h1>";
            outputStream.write(errorMessage.getBytes());
            outputStream.flush();
        }
    }

    // 从浏览器携带的数据信息中获取资源名称
    private static void parse(InputStream inputStream) throws IOException {
        // 创建StringBuffer
        StringBuffer stringBuffer = new StringBuffer(1024);
        // 进行循环添加
        byte[] buffer = new byte[1024];
       int i = inputStream.read(buffer);
       // 进行添加
        for(int j = 0; j < i; j++){
            stringBuffer.append((char)buffer[j]);
        }
        // 打印读取的内容
        System.out.println(stringBuffer.toString());

        parseUrl(stringBuffer.toString());
    }

    private static void parseUrl(String toString) {
        // 判断是否为空
        if(toString == null){
            return;
        }

        // 判断长度是否为0
        if(toString.length() <= 0){
            return;
        }

        // 进行赋值
        String[] tmp = toString.split(" ");
        // 判断是否为0
        if(tmp == null){
            return;
        }

        // 判断第1位是否为0
        if(tmp[1] == null){
            return;
        }
        // 获取值
        url = tmp[1];
    }


}
