package com.coding.IOStream;

import java.io.*;

public class 字节输入流 {
    public static void main(String[] args) {
        // 将桌面中的student.txt文本文档中的数据读取到Java中！
        // 第一步：获取student.txt文档的位置！（Java需要利用一个对象来表示student.txt文档！)
        File file = new File("D:\\Java教程\\IO流资料\\file.txt");
        // file对象：可以理解为根据地址获取到的指定文档对应的对象！
        // 第二步：建立流(什么方向？输入流！什么种类？字节流)-->字节输入流(InputStream)
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 第三步：开始传输数据(打开水龙头！)
        // read(): 表示一次读取一个字节的编码数字！(返回的是整数结果)！
        try {
            int t;
            while ((t = is.read()) != -1) {
                System.out.println((char)t);
            }
            // 第四步：关闭资源
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
