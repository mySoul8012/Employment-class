package com.ming8;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
    public static void main(String[] agrs) throws IOException {
        while(true) {
            // 创建一个接收器对象
            DatagramSocket datagramSocket = new DatagramSocket(12345);
            // 创建数据报对象
            byte[] bytes = new byte[1024];
            // 进行数据封装
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            // 进行数据报接收
            // 进行阻塞
            datagramSocket.receive(datagramPacket);
            // 进行数据输出
            /// 获取长度
            int len = datagramPacket.getLength();
            // 获取数组长度
            byte[] bytes1 = datagramPacket.getData();
            // 进行数据输出
            System.out.println("数据输出 " + new String(bytes1));
            // 进行关闭
            datagramSocket.close();
        }
    }
}
