package com.jspiders.section3.collection.set;

import java.util.TreeSet;

class Student1 implements Comparable<Student1>{
    private String name;
    private long phone;
    private int rollNo;
    private String email;

    public Student1(int rollNo,String name,String email, long phone) {
        this.name = name;
        this.phone = phone;
        this.rollNo = rollNo;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    @Override
//    public int compareTo(Student s1) {
//        return this.name.compareTo(s1.name);
//    }
    @Override
    public int compareTo(Student1 s1) {
        return this.rollNo-s1.rollNo;
    }
}

public class TreeSetStudent {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Student1 s1 = new Student1(4,"Yash","yash@gmail.com",9874561230l);
        Student1 s2 = new Student1(1,"Jhanvi","jhanvi@gmail.com",9877747555l);
        Student1 s3 = new Student1(3,"Rohit","yash@gmail.com",9874561230l);
        Student1 s4 = new Student1(2,"Virat","virat@gmail.com",9874561270l);

        TreeSet<Student1> ts = new TreeSet<Student1>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student1 s: ts){
            System.out.println(s.getRollNo()+" - "+s.getName());
        }


        System.out.println("Program ends...");
    }
}

