package com.ming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 创建数据接收对象
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            // 创建数据接收对象
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 接收数据包
            System.out.println("等待发送端的信息");
            // 进行阻塞
            // 该方法具有阻塞功能，直到发送端发送信息
            datagramSocket.receive(datagramPacket);
            // 进行发送端发送信息
            System.out.println("发送端发送信息");
            // 进行输出
            int len = datagramPacket.getLength();
            // 进行输出
            byte[] bytes1 = datagramPacket.getData();
            // 进行数据接收
            System.out.println("发送端发来贺电 " + new String(bytes1, 0, len));
            // 进行释放
            datagramSocket.close();
        }
    }
}
