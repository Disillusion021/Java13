package com.coding.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个DatagramSocket对象,准备在9999端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        // 2. 构建一个DataGramPacket对象,准备接收数据(UDP限制每个数据报最多64K)
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        // 3. 调用receive方法,将通过网络传输的DatagramPacket对象的数据接收到本地
        // 细节: 如果没有数据包,则会阻塞等待, 直到接收到数据包
        datagramSocket.receive(packet);
        System.out.println("A 等待接收数据...");
        // 4. 拆包,取出数据,并打印
        String receiveData = new String(packet.getData(), 0, packet.getLength());
        System.out.println("A 接收到的数据:" + receiveData);
        // 5. 发送数据
        byte[] bytes = "hello 明天吃烤鱼~".getBytes();
        DatagramPacket packet1 = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9998);
        datagramSocket.send(packet1);
        System.out.println("A 已经发送数据...");
        // 6. 关闭socket
        datagramSocket.close();
    }
}
