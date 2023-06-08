package com.coding.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPFileCopyServer1 {
    public static void main(String[] args) throws IOException {
        // 监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        // 接收客户端连接
        Socket socket = serverSocket.accept();
        // 建立socket读取流,输出图片
        StreamUtils.BothStream bothStream = StreamUtils.inputToOut(socket.getInputStream(), Files.newOutputStream(Paths.get("D:\\R-A.jpg")));
        // 回复"收到图片"
        OutputStream sockReply = socket.getOutputStream();
        sockReply.write("服务端:收到图片".getBytes());
        socket.shutdownOutput();
        // 关闭资源
        sockReply.close();
        bothStream.outputStream.close();
        bothStream.inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
