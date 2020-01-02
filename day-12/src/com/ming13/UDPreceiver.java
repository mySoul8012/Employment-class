package com.ming13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPreceiver {
    public static void main(String[] args) throws IOException {
        // 创建一个接收器对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        // 创建一个数据报对象
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 接收数据包
        System.out.println("等待发送端的信息");
        // 进行数据阻塞
        datagramSocket.receive(datagramPacket);
        // 进行付出
        // 获取长度
        int len = datagramPacket.getLength();
        // 获取数组
        byte[] data = datagramPacket.getData();
        // 进行输出
        System.out.println("发送端发来贺电 " + new String(data, 0, len));
        // 进行释放
        datagramSocket.close();
    }
}
