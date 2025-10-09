package com.jspiders.section3.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    final public static String folderName = "Sub-Folder";
    public static void createFolder(){
        File f1 = new File("D:\\folder1\\"+folderName);
        f1.mkdir();
        System.out.println(folderName+" is created");
    }
    public static void createFile(String filename) throws IOException {
        File f1 = new File("D:\\folder1\\"+folderName+"\\"+filename);
        f1.createNewFile();
        System.out.println(filename+" is created inside "+folderName);
    }
    public static void writeToFile(String fileName, String data) throws IOException {
        File f1 = new File("D:\\folder1\\"+folderName+"\\"+fileName);
        FileWriter fw = new FileWriter(f1);
        fw.write(data);
        fw.flush();
        System.out.println("data written to "+fileName);
    }
    public static void readTheFile(String fileName) throws IOException{
        File f1 = new File("D:\\folder1\\"+folderName+"\\"+fileName);
        int size = (int)f1.length();
        FileReader fr = new FileReader(f1);
        char[] data = new char[size];
        fr.read(data);
        String s = String.valueOf(data);
        System.out.println(s);
    }
    public static void deleteFile(String fileName){
        File f1 = new File("D:\\folder1\\"+folderName+"\\"+fileName);
        f1.delete();
        System.out.println(fileName+" is deleted");
    }

    static void main() throws IOException {
            createFolder();//create a folder
            createFile("surprise-mf.txt");//create a file inside the folder
            writeToFile("surprise-mf.txt","one of the most interesting thing about java is that it will feed your family for the next 30 years");
            readTheFile("surprise-mf.txt");
            deleteFile("surprise-mf.pdf");
    }
}
