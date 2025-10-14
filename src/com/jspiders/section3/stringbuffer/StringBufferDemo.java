package com.jspiders.section3.stringbuffer;

// Demonstration of StringBuffer class in Java
public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text to the buffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at a specific index
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // Replace part of the text
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete part of the text
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        // Reverse the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Get length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}

