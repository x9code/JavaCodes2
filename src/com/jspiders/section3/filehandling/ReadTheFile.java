package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {
    static void main() throws IOException {
        File f1 = new File("D:\\Demo-folder\\sample1.txt");
        int size = (int)f1.length();
        FileReader fr1 = new FileReader(f1);
        char[] data = new char[size];
        fr1.read(data);
        String s = String.valueOf(data);
        System.out.println(s);
        System.out.println("reading the file 1");
        System.out.println("----------------------------");
        File f2 = new File("D:\\Demo-folder\\sample2.txt");
        int size1 = (int)f1.length();
        FileReader fr2 = new FileReader(f2);
        char[] data1 = new char[size1];
        fr2.read(data);
        String s1 = String.valueOf(data1);
        System.out.println(s1);
        System.out.println("reading the file 2");
    }
}
