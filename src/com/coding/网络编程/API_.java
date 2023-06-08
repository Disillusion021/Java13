package com.coding.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 演示INetAddress类的使用
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        // 1. 获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); // 输出计算机名和IP地址:LAPTOP-6MPCATAS/192.168.3.192

        // 2. 通过指定的主机名(域名)获取InetAddress对象,IP地址
        InetAddress host1 = InetAddress.getByName("www.baidu.com");
        System.out.println(host1);

        // 3. 通过InetAddress对象获取主机名和IP地址
        String hostAddress = host1.getHostAddress();
        String hostName = host1.getHostName();
        System.out.println("host1对象的域名为:[" + hostName + "],IP地址为:[" + hostAddress + "]");
    }
}
