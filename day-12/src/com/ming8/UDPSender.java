package com.ming8;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 创建一个发送器对象
            DatagramSocket datagramSocket = new DatagramSocket();
            // 创建一个数据报对象
            byte[] bytes = "HelloWOrld".getBytes();
            // 进行数据封装
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
            // 进行数据发送
            datagramSocket.send(datagramPacket);
            // 进行关闭
            datagramSocket.close();
        }
    }
}
