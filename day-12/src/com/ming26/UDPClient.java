package com.ming26;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        // 创建数据包
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据接收对象
        int len = 0;
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
        while(true) {
            // 进行阻塞
            datagramSocket.receive(datagramPacket);
            // 获取长度
            len = datagramPacket.getLength();
            // 获取数据对象
            bytes = datagramPacket.getData();
            // 进行打印出结果
            System.out.println(new String(bytes, 0, len));
        }

    }
}
