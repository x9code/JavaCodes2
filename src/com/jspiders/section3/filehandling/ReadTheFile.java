package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {
    static void main() throws IOException {
        File f1 = new File("D:\\folder1\\sample.txt");
        int size = (int)f1.length();
        FileReader fr = new FileReader(f1);
        char[] data = new char[size];
        fr.read(data);
        String s = String.valueOf(data);
        System.out.println(s);
        System.out.println("reading the file");

    }
}
