package com.ming9;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 创建接收器对象
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            // 创建数据报对象
            byte[] bytes = new byte[1024];
            // 创建数据包
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 接收数据包
            System.out.println("获取接收的信息");
            // 进行阻塞
            datagramSocket.receive(datagramPacket);
            // 进行输出
            System.out.println("发送端发送信息");
            // 进行输出
            int len = datagramPacket.getLength();
            byte[] data = datagramPacket.getData();
            // 进行数据输出
            System.out.println("发送端发送信息 " + new String(data, 0, len));
            // 进行释放
            datagramSocket.close();
        }
    }
}
