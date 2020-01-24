package com.tomcat;

import java.io.*;
import java.lang.reflect.Constructor;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.*;

public class MyTomcat {
    // 创建集合保存数据
    private static Map<String, String> strings = new HashMap<String, String>();
    // 创建Servlet实现类集合
    private static Map<String, Servlet> stringServletMap = new HashMap<String, Servlet>();
    // 保存请求路径
    public static String urlString = null;

    // 定义静态类，获取配置文件，保存信息
    static{
        try{
            Properties properties = new Properties();
            // 创建输入流
            InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-22-2\\src\\com\\web.properties"));
            // 进行装载
            properties.load(inputStream);
            // 遍历key保存进入 String Value
            Enumeration<Object> keys = properties.keys();
            // 进行遍历
            while(keys.hasMoreElements()){
                // 进行遍历
                String key = (String)keys.nextElement();
                String value = properties.getProperty(key);
                // 进行装入
                strings.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 创建启动类
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(80);
        while(true){
            Socket socket = null;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try{
                socket = serverSocket.accept();
                // 获取输入流
                inputStream = socket.getInputStream();
                outputStream = socket.getOutputStream();
                // 解析请求路径
                parse(inputStream);

                // 判断url是否为空
                if(urlString != null){
                    // 写回数据
                    outputStream.write("HTTP/1.1 200 OK\n".getBytes());
                    outputStream.write("Content-Type:text/html;charset=utf-8;\n\n".getBytes());
                    // 判断是否有实例
                    boolean b = stringServletMap.containsKey(urlString);
                    // 进行判断
                    if(b){
                        // 进行判断
                        // 获取路径
                        String classPath = strings.get(urlString);
                        // 利用反射技术创建实现类
                        // 获取构造方法
                        Constructor constructor = Class.forName(classPath).getConstructor();
                        // 创建实现类
                        Servlet servlet = (Servlet) constructor.newInstance();
                        // 调用方法
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
                    // 返回给浏览器404
                    String errorMessage = "HTTP/1.1 404 File Not Found\r\n"
                            + "Content-Type: text/html\r\n"
                            + "Content-Length: 23\r\n" + "\r\n"
                            + "<h1>File Not Found</h1>";
                    outputStream.write(errorMessage.getBytes());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void parse(InputStream inputStream) throws IOException {
        // 定义保存的信息
        StringBuffer stringBuffer = new StringBuffer(1024);
        // 进行浏览器解析
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行解析
        while((len = inputStream.read(bytes)) != -1){
            // 进行解析
            stringBuffer.append(new String(bytes, 0, len));
        }
        System.out.println(stringBuffer.toString());
        String url = parseUri(stringBuffer.toString());
        urlString = url;
        System.out.println(url);
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
