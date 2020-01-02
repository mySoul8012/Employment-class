package com.ming13;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据报对象
        byte[] bytes = "Hello".getBytes();
        // 创建数据对象
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
        // 发送数据
        datagramSocket.send(datagramPacket);
        // 进行发送
        System.out.println("发送成功");
        // 进行资源释放
        datagramSocket.close();
    }
}
