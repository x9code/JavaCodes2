package com.jspiders.section3.object;

public class GarBage {
    @Override
    protected void finalize() throws Throwable{
        System.out.println("gc called");
    }
    static void main() {
        GarBage g = new GarBage();
        g = null;
        System.gc();
    }
}
