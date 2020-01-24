package com.tomcat;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MyTomcat01 {
    // 创建集合保存数据
    private static Map<String, String> hashMap = new HashMap<>();
    // 创建Servlet 集合
    private static Map<String, String> servletMap = new HashMap<>();
    // 创建保存的请求路径
    private static String urlString = null;
    // 创建静态类保存配置文件信息
    static {
        Properties properties = new Properties();
        // 创建输入流
        try {
            InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-22-2\\src\\com\\web.properties"));
            // 进行装载
            properties.load(inputStream);
            // 进行遍历
            Enumeration enumeration;
            enumeration = properties.keys();
            // 进行遍历
            while(enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String value = properties.getProperty(key);
                // 进行装载
                hashMap.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 创建启动类
    public static void main(String[] args) throws Exception {
        // 创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(80);
        // 进行阻塞
        while(true){
            Socket socket = serverSocket.accept();
            // 创建输入流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            // 解析请求路径
            parse(inputStream);

            // 判断是否为空
            if(urlString != null){
                // 写回数据
                outputStream.write("HTTP/1.1 200 OK\n".getBytes());
                outputStream.write("Content-Type:text/html;charset=utf-8;\n\n".getBytes());
                // 判断是否有实例
                if(servletMap.containsKey(urlString)){
                    // 获取路径
                    String classPath = servletMap.get(urlString);
                    // 通过反射进行读取
                    Constructor constructor = Class.forName(classPath).getConstructor();
                    // 创建对象
                    Servlet servlet = (Servlet) constructor.newInstance();
                    // 进行调用
                    servlet.service(inputStream, outputStream);
                }else{
                    // 如果没有返回给浏览器404
                    String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                            + "Content-Type: text/html\r\n"
                            + "Content-Length: 23\r\n" + "\r\n"
                            + "<h1>File Not Found</h1>";
                    outputStream.write(errorMessage.getBytes());
                }
            }else{
                // 返回404
                String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                        + "Content-Type: text/html\r\n"
                        + "Content-Length: 23\r\n" + "\r\n"
                        + "<h1>File Not Found</h1>";
                outputStream.write(errorMessage.getBytes());
            }
        }
    }

    private static void parse(InputStream inputStream) throws IOException {
        // 定义保存的信息
        StringBuffer stringBuffer = new StringBuffer();
        // 创建长度
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行循环读取
        while((len = inputStream.read(bytes)) != -1){
            stringBuffer.append(new String(bytes, 0, len));
        }
        // 进行打印
        System.out.println(stringBuffer.toString());
        // 进行拆分
        urlString = parseUri(stringBuffer.toString());
        // 进行打印
        System.out.println(urlString);
    }

    private static String parseUri(String toString) {
        if(toString == null){
            return null;
        }
        String[] strings = toString.split(" ");
        // 进行判断
        if(strings == null){
            return null;
        }
        if(strings.length <= 10){
            return null;
        }
        String urls = strings[1];
        if(urls == null){
            return null;
        }
        // 进行返回
        return urls.substring(1, urls.length());
    }
}
