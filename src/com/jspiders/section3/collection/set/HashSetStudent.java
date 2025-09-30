package com.jspiders.section3.collection.set;

import java.util.HashSet;

class Student {
    private String name;

    public long getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    private long phone;
    private int rollNo;
    private String email;



    public Student(int rollNo, String name, String email, long phone) {
        this.name = name;
        this.phone = phone;
        this.rollNo = rollNo;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return this.rollNo == student.rollNo;
    }
}

public class HashSetStudent {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Student s1 = new Student(1,"Yash","yash@gmail.com",9874561230l);
        Student s2 = new Student(2,"Jhanvi","jhanvi@gmail.com",9877747555l);
        Student s3 = new Student(3,"Yash","yash@gmail.com",9874561230l);
        Student s4 = new Student(4,"Virat","virat@gmail.com",9874561270l);

        HashSet<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for(Student s : set) {
            System.out.println(s.getRollNo()+" - "+s.getName()+" - "+s.getEmail()+" - "+s.getPhone());
        }
//        System.out.println("s1 : "+s1.hashCode());
//        System.out.println("s3 : "+s3.hashCode());
//
//        System.out.println(set.size());


        System.out.println("Program ends...");
    }
}
