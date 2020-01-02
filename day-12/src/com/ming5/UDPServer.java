package com.ming5;

import java.io.IOException;
import java.net.*;

// 创建 UDPServer
public class UDPServer {
    public static void main(String[] args) throws IOException {
        // 创建UDP
        // 创建发送器对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据发送包
        // 创建数据报对象
        byte[] bytes = "Hello,我是发送端".getBytes();
        // 进行数据发送
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
        // 进行数据发送
        datagramSocket.send(datagramPacket);
        // 关闭socket
        datagramSocket.close();
    }
}
