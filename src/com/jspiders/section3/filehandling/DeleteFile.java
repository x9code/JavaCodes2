package com.jspiders.section3.filehandling;

import java.io.File;

public class DeleteFile {
    static void main() {
        File f1 = new File("D:\\folder1\\sample2.txt");
        f1.delete();
        System.out.println("file is deleted");
    }
}
