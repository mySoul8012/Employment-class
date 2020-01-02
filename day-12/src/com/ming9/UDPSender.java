package com.ming9;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        // 创建发送器对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据报对象
        byte[] bytes = "Hello.进行数据发送".getBytes();
        // 创建数据报
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
        // 进行数据发送
        datagramSocket.send(datagramPacket);
        // 进行关闭
        datagramSocket.close();
    }
}
