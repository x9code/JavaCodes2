package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main() throws IOException {
        File f1 = new File("D:\\Demo-folder\\sample1.txt");
        File f2 = new File("D:\\Demo-folder\\sample2.txt");

        f1.createNewFile();
        System.out.println("file 1 is created");
        f2.createNewFile();
        System.out.println("file 2 is created");
    }
}
