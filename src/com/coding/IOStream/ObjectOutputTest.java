package com.coding.IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectOutputTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ICG-DL-JXC\\Desktop\\character.txt");
        try (FileOutputStream fo = new FileOutputStream(file);
                ObjectOutputStream os = new ObjectOutputStream(fo)) {
            os.writeObject(new Character("Alice", "elf", new ArrayList<String>(Arrays.asList("tit"))));
            os.writeObject(new Character("Lilian", "sister", new ArrayList<String>(Arrays.asList("tit"))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
