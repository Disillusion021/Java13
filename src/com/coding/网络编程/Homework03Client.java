package com.coding.网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Homework03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入歌曲名:");
        String musicName = scanner.next();
        outputStream.write(musicName.getBytes());
        socket.shutdownOutput();
        StreamUtils.BothStream bothStream = StreamUtils.inputToOut(socket.getInputStream(), Files.newOutputStream(Paths.get("D:\\" + musicName)));
        // 关闭资源
        bothStream.outputStream.close();
        bothStream.inputStream.close();
        outputStream.close();
        socket.close();
    }
}
