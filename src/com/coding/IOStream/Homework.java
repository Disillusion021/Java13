package com.coding.IOStream;

import java.io.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\mytemp");
        if (!(dir.exists() && dir.isDirectory())) {
            boolean mkdirs = dir.mkdirs();
            System.out.println(mkdirs ? "文件夹创建成功" : "文件夹创建失败");
        } else {
            System.out.println("文件夹已存在");
        }
        File file = new File("D:\\mytemp\\hello.txt");
        if (file.exists()) {
            System.out.println("文件已存在");
        } else {
            try {
                boolean newFile = file.createNewFile();
                System.out.println(newFile ? "文件创建成功" : "文件创建失败");
            } catch (IOException e) {
                System.out.println("文件创建失败");
                e.printStackTrace();
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("锄禾日当午");
            bufferedWriter.newLine();
            bufferedWriter.write("汗滴禾下土");
            bufferedWriter.newLine();
            bufferedWriter.write("谁知盘中餐");
            bufferedWriter.newLine();
            bufferedWriter.write("粒粒皆辛苦");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int idx = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(idx++ + " " + line);
            }
        }

    }
}
