package com.ming7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// 创建接收端
public class UDPreceiver {
    public static void main(String[] args) throws IOException {
        // 创建接收器对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        // 创建数据报对象
        byte[] bytes = new byte[1024];
        // 进行数据报封装
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 接收数据包
        System.out.println("等待发送端的信息");
        datagramSocket.receive(datagramPacket);
        // 进行输出
        System.out.println("发送端发送信息");
        // 进行输出
        int len = datagramPacket.getLength();
        // 进行数据接收
        byte[] data = datagramPacket.getData();
        // 进行输出
        System.out.println("发送端发送信息 " + new String(data, 0, len));
        // 进行释放
        datagramSocket.close();
    }
}
