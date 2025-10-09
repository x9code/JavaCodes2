package com.jspiders.section3.filehandling;

import java.io.File;

public class CreateFolder {
    static void main() {
        File f1 = new File("D:\\folder1");
        f1.mkdir();
        System.out.println("Folder is created");
    }
}
