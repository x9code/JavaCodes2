package com.jspiders.section3.exceptionclasses;

class InvalidMarksException extends RuntimeException {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Marks {
    static void checkMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }
    public static void main(String[] args) {
        checkMarks(160); // No try-catch, no compiler error
//        try{
//            checkMarks(160);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

