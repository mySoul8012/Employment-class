package com.ming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat02 {
    // 资源目录
    public static final String WEB_ROOT = System.getProperty("user.dir") + "\\web_day01_homework\\web";
    // 创建存放资源名称的url
    public static String url = null;
    // 创建启动函数
    public static void main(String[] args)throws IOException{
        System.out.println(WEB_ROOT);
        // 编写 ServerSocket监听8080端口
        ServerSocket serverSocket = new ServerSocket(8082);
        // 进行无限循环
        while(true){
            Socket socket = null;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try{
                // 接收浏览器的请求
                socket = serverSocket.accept();
                // 进行打印
                System.out.println("服务器端接收到请求了...");
                // 获取输入流对象
                inputStream = socket.getInputStream();
                // 获取输出流对象
                outputStream = socket.getOutputStream();
                // 获取浏览器携带的数据信息
                parse(inputStream);
                // 进行浏览器返回数据
                sendStaticResource(outputStream);

                // 关闭
                inputStream.close();
                outputStream.close();
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    // 返回浏览器的信息
    private static void sendStaticResource(OutputStream outputStream) throws IOException {
        System.out.println(url);
        // 读取url地址
        // 判断url是否为空
        if(url == null){
            // 不为空
            return;
        }else{
            // 创建404信息
            String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                    + "Content-Type: text/html\r\n"
                    + "Content-Length: 23\r\n" + "\r\n"
                    + "<h1>File Not Found</h1>";
            outputStream.write(errorMessage.getBytes());
        }
        // 再次判断输入流是否为空
        if(outputStream == null){
            return;
        }
        // 创建文件
        File file = new File(url);
        // 再次创建输入流
        // 判断是否存在
        if(file.exists()){
            // 判断是否为空
            // 此时不为空
            // 进行输出
            // 创建输入流
            InputStream inputStream = new FileInputStream(file);
            // 进行文件输出
            outputStream.write("HTTP/1.1 200 OK\n".getBytes());
            outputStream.write("Content-Type: text/html;charset=UTF-8\n".getBytes());
            outputStream.write("\n".getBytes());
            // 写回响应信息
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行读取
            while((len = inputStream.read(bytes)) != -1){
                // 进行读取
                outputStream.write(bytes, 0, len);
            }
            // 进行输出
            // 进行刷新
            outputStream.flush();
        }else{
            // 创建404信息
            String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                    + "Content-Type: text/html\r\n"
                    + "Content-Length: 23\r\n" + "\r\n"
                    + "<h1>File Not Found</h1>";
            outputStream.write(errorMessage.getBytes());
        }
    }

    // 获取浏览器的携带的数据信息
    private static void parse(InputStream inputStream) throws IOException {
        int len = 0;
        byte[] bytes = new byte[1024];
        StringBuffer stringBuffer = new StringBuffer(1024);
        // 进行循环读取
        while((len = inputStream.read(bytes)) != -1){
            // 进行循环读取
            stringBuffer.append(new String(bytes, 0, len));
        }
        // 进行切割字符串
        parseUrl(stringBuffer.toString());
    }

    private static void parseUrl(String toString) {
        // 进行判断
        if(toString == null){
            // 如果此时为空，进行退出
            return;
        }
        // 再次判断长度是否为0
        if(toString.length() <= 0){
            // 如果此时长度为0，进行退出
            return;
        }

        // 进行字符串分割
        String[] str = toString.split(" ");
        // 获取第一个字符串
        url = str[1];
    }
}
