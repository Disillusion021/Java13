package com.coding.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPFileCopyServer {
    public static void main(String[] args) throws IOException {
        // 监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听...");
        // 接收客户端连接
        Socket socket = serverSocket.accept();
        // 建立socket读取流
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream sockIn = new BufferedInputStream(inputStream);
        // 输出图片
        BufferedOutputStream picOut = new BufferedOutputStream(Files.newOutputStream(Paths.get("D:\\R-A.jpg")));
        int readNum;
        byte[] picBuff = new byte[1024];
        while ((readNum = sockIn.read(picBuff)) != -1) {
            picOut.write(picBuff, 0, readNum);
        }
        // 回复"收到图片"
        OutputStream sockReply = socket.getOutputStream();
        sockReply.write("服务端:收到图片".getBytes());
        socket.shutdownOutput();
        // 关闭资源
        sockReply.close();
        picOut.close();
        sockIn.close();
        socket.close();
        serverSocket.close();
    }
}
