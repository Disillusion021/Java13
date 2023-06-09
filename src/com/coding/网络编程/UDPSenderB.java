package com.coding.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个DatagramSocket对象,准备在9998端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        // 2. 构建一个DataGramPacket对象,写入要发送的数据(UDP限制每个数据报最多64K)
        byte[] bytes = "hello 明天吃火锅~".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9999);
        // 3. 调用send方法,通过网络传输发送DatagramPacket对象
        datagramSocket.send(packet);
        System.out.println("B 已经发送数据...");
        // 4. 接收数据
        byte[] buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(packet1);
        System.out.println("B 等待接收数据...");
        // 5. 拆包,取出数据,并打印
        String receiveData = new String(packet1.getData(), 0, packet1.getLength());
        System.out.println("B 接收到的数据:" + receiveData);
        // 6. 关闭socket
        datagramSocket.close();
    }
}
