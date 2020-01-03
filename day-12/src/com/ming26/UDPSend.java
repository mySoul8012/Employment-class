package com.ming26;

import java.io.IOException;
import java.net.*;

// UDP 发送端
public class UDPSend {
    public static void main(String[] args) throws IOException {
        while(true) {
            // 定义UDP发送端
            DatagramSocket datagramSocket = new DatagramSocket();
            int len = "静态气温 - 12".length();
            byte[] bytes = "静态气温 - 12".getBytes();
            // 创建包
            DatagramPacket datagramPacket = new DatagramPacket(bytes, len, InetAddress.getByName("127.0.0.1"), 12345);

            // 进行数据发送
            datagramSocket.send(datagramPacket);
            // 关闭连接
            datagramSocket.close();
        }
    }
}
