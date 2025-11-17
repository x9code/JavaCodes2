package com.jspiders.section3.filehandling;

import java.io.*;

public class CountWords {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\intelijProject\\M80\\src\\com\\jspiders\\section3\\filehandling\\data.txt"))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                count += words.length;
            }

            System.out.println("Total Words: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

