package com.coding.网络编程;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        Scanner sc = new Scanner(System.in);
        BufferedReader br;
        while (true) {
            System.out.println("请输入你的问题");
            String question = sc.next();
            bw.write(question);
            bw.newLine();
            bw.flush();
            InputStream inputStream = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(inputStream));
            String reply = br.readLine();
            System.out.println("客户端收到回复:" + reply);
            if (":q".equals(question)) {
                break;
            }
        }
        // 关闭资源
        sc.close();
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端已退出...");
    }
}
