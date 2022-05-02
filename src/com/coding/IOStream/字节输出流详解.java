package com.coding.IOStream;

import com.sun.media.sound.SoftTuning;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class 字节输出流详解 {
    public static void main(String[] args) throws Exception {
        // 将"teacher"单词写入到student.txt中!
        // 第一步：获取位置！
        File file = new File("D:\\Java教程\\IO流资料\\file.txt");
        // 第二步：建立管道(流向？输出！种类？字节)-->字节输出流
        // 参数true代表追加写入不覆盖
        OutputStream os = new FileOutputStream(file, true);
        // 第三步：传输数据！
        // write(char c): 一次向文档中写入一个字节的数据!
        String t = "teacher and student";
//        char[] ts = t.toCharArray();
//        for (char i : ts){
//            os.write(i);
//        }
        for (int i = 0; i < t.length(); i++) {
            os.write(t.charAt(i));
        }
        os.close();
        // 总结：输出流有两大特点
        // (1).输出流哪怕指定路径没有文档，也可以在指定路径下先创建文档，再写入数据！
        // (2).输出流写入时默认会覆盖原有文档中的数据！
    }
}
