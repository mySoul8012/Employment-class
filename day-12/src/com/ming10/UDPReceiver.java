package com.ming10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// 进行数据接收
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        while(true) {
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            // 创建数据报对象
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 接收数据包
            System.out.println("等待发送端的信息");
            datagramSocket.receive(datagramPacket);
            // 进行数据输出
            System.out.println("发送端发送的信息");
            // 进行数据输出
            int len = datagramPacket.getLength();
            byte[] data = datagramPacket.getData();
            // 进行数据输出
            System.out.println("发送端发送信息" + new String(data, 0, len));
            // 进行关闭
            datagramSocket.close();
        }
    }
}
