package com.ming5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        // 创建接收器对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        // 创建一个数据报对象
        byte[] bytes = new byte[1024];
        // 进行数据封装
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 接收数据包
        System.out.println("等待发送端的信息");
        // 进行阻塞
        datagramSocket.receive(datagramPacket);
        // 进行打印
        System.out.println("发送端发送信息");
        // 进行输出
        int len = datagramPacket.getLength();
        // 进行输出
        byte[] bytes1 = datagramPacket.getData();
        // 进行输出结果
        System.out.println("发送端发来信息" + new String(bytes1, 0, len));
        // 进行释放
        datagramSocket.close();
    }
}
