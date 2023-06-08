package com.coding.网络编程;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TCPFileCopyClient {
    public static void main(String[] args) throws IOException {
        // 向指定服务端发起连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 建立socket输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream sockOut = new BufferedOutputStream(outputStream);
        // 读取图片
        BufferedInputStream picIn = new BufferedInputStream(Files.newInputStream(Paths.get("D:\\R-C.jpg")));
        int readNum1;
        byte[] picBuff = new byte[1024];
        while ((readNum1 = picIn.read(picBuff)) != -1) {
            sockOut.write(picBuff, 0, readNum1);
        }
        // 刷新缓冲
        sockOut.flush();
        // 通知服务端写入结束
        socket.shutdownOutput();
        // 接收服务器端回复
        InputStream sockReceiveReply = socket.getInputStream();
        int readNum2;
        byte[] buf = new byte[1024];
        while ((readNum2 = sockReceiveReply.read(buf)) != -1) {
            System.out.print(new String(buf, 0, readNum2));
        }
        // 关闭资源
        sockReceiveReply.close();
        sockOut.close();
        picIn.close();
        socket.close();
    }
}
