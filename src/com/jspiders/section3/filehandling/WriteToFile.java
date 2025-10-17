package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    static void main() throws IOException {
        File f1 = new File("D:\\Demo-folder\\sample1.txt");
        FileWriter fw1 = new FileWriter(f1);
        fw1.write("this file is created by using programs");
        fw1.flush();
        System.out.println("writing to file 1");
        File f2 = new File("D:\\Demo-folder\\sample2.txt");
        FileWriter fw2 = new FileWriter(f2);
        fw2.write("this file is created by using programs");
        fw2.flush();
        System.out.println("writing to file 2");
    }
}
