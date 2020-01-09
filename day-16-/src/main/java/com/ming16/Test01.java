package com.ming16;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 创建一个发送器对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据报对象
        byte[] bytes = "mingming".getBytes();
        // 创建数据包
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 12345);
        // 进行数据发送
        datagramSocket.send(datagramPacket1);
        // 进行资源释放
        datagramSocket.close();
        
    }
}
