package com.jspiders.section3.collection;

import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class SortStudents {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Deepak", 90));
        list.add(new Student(2, "Aman", 75));
        list.add(new Student(3, "Kunal", 85));

        // Sort by marks descending
        list.sort((a, b) -> b.marks - a.marks);

        list.forEach(System.out::println);
    }
}

