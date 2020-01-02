package com.ming16;

import java.io.IOException;
import java.net.*;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        // 创建发送端对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据报
        byte[] bytes = "你好哈".getBytes();
        while(true){
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 54321);
            // 进行数据发送
            datagramSocket.send(datagramPacket);
            // 进行数据接收
            datagramSocket.receive(datagramPacket);
            // 进行数据打印
            int len = datagramPacket.getLength();
            byte[] bytes1 = datagramPacket.getData();
            // 进行数据输出
            System.out.println(new String(bytes1, len));
        }
    }
}
