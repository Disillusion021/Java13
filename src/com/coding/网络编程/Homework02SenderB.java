package com.coding.网络编程;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();
        byte[] bytes = question.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
        datagramSocket.send(datagramPacket);
        byte[] buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(packet1);
        String receive = new String(packet1.getData(), 0, packet1.getLength());
        System.out.println(receive);
        datagramSocket.close();
    }
}
