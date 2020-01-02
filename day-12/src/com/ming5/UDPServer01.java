package com.ming5;

import java.io.IOException;
import java.net.*;

public class UDPServer01 {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 创建数据发送对象
            DatagramSocket datagramSocket = new DatagramSocket();
            // 创建数据发送对象
            byte[] bytes = "hello 我是服务器".getBytes();
            // 创建数据包
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
            // 进行数据发送
            datagramSocket.send(datagramPacket);
            // 进行关闭
            datagramSocket.close();
        }
    }
}
