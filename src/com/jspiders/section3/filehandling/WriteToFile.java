package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    static void main() throws IOException {
        File f1 = new File("D:\\folder1\\sample.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fw.write("this file is created by using programs");
        fw.flush();
        System.out.println("writing to file");
    }
}
