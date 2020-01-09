package com.ming16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 创建接收器对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        // 创建数据报对象
        byte[] bytes = new byte[104];
        // 创建数据报
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 进行数据阻塞
        datagramSocket.receive(datagramPacket);
        // 进行数据发送
        System.out.println("------");
        // 进行输出
        int len = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        // 进行数据发送
        System.out.println("数据发送成功 " + new String(data, 0, len));
        // 进行释放
        datagramSocket.close();
    }
}
