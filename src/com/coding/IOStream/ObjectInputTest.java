package com.coding.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputTest {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ICG-DL-JXC\\Desktop\\character.txt");
        try (FileInputStream fs = new FileInputStream(file);
                ObjectInputStream os = new ObjectInputStream(fs)) {
            Character c1 = (Character) os.readObject();
            Character c2 = (Character) os.readObject();
            System.out.println(c1);
            System.out.println(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
