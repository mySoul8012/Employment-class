package com.ming6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 创建接收器对象
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            // 创建数据报对象
            byte[] bytes = new byte[1024];
            // 进行数据包封装
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 接收数据包
            System.out.println("等待发送端的信息");
            // 进行阻塞
            datagramSocket.receive(datagramPacket);
            // 获取数据
            int len = datagramPacket.getLength();
            // 获取数据
            byte[] data = datagramPacket.getData();
            // 进行输出结果
            System.out.println("发送端发来信息 " + new String(data, 0, len));
            // 进行释放
            datagramSocket.close();
        }
    }
}
